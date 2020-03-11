package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Contact> myContacts = new ArrayList<>();

    public void usePhone() {
        int selection;
        boolean flag = true;

        while (flag) {
            System.out.println("\nHello! Welcome to BoobsMobile. Please select your function:");
            System.out.println("\t1: View Contact List");
            System.out.println("\t2: Add Contact");
            System.out.println("\t3: Edit Contact");
            System.out.println("\t4: Remove Contact");
            System.out.println("\t5: Contact Search");
            System.out.println("\t0: Power Off");

            selection = scanner.nextInt();
            scanner.nextLine();
            switch(selection) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    viewList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    contactSearch();
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }

    private void viewList() {
//        myContacts.forEach(contact -> {
//            System.out.println("Name: " + contact.getName());
//            System.out.println("Mobile: " + contact.getNumber());
//            System.out.println();
//        });

        for (Contact c : myContacts) {
            System.out.println("Name: " + c.getName());
            System.out.println("Mobile: " + c.getNumber());
            System.out.println();
        }
    }

    private void addContact() {
        String name = getContactName();
        String mobile = mobileValidation();
        myContacts.add(new Contact(name, mobile));
    }

    private ArrayList<Integer> searchContacts(String searchTerm) {
        ArrayList<Integer> searchResults = new ArrayList<>();
        Contact c;

        for(int i = 0; i < myContacts.size(); i++){
            c = myContacts.get(i);
            if (c.getName().contains(searchTerm)) searchResults.add(i);
        }
        return searchResults;
    }

    private String getContactName() {
        System.out.println("Please enter the contact's name:");
        return scanner.nextLine();

    }

    private String mobileValidation() {
        System.out.println("Please enter the contact's 10-digit mobile number:");
        String mobile = scanner.nextLine();
        while (true) {
            if (mobile.matches("[0-9]+") && mobile.length() == 10) break;
            System.out.println("The mobile number you have entered is invalid.");
            System.out.println("Please make sure your number is comprised of 10 numeric digits and re-enter.");
            mobile = scanner.nextLine();
        }
        return mobile;
    }

    private void displaySearchResults(ArrayList<Integer> searchResults) {
        Contact c;
        System.out.println("Your search results are as follows:");

        for (int i = 0; i < searchResults.size(); i++) {
            c = myContacts.get(searchResults.get(i));
            System.out.println("\t" + (int)(i + 1) + ":");
            System.out.println("\tName: " + c.getName());
            System.out.println("\tMobile Number: " + c.getNumber());
            System.out.println("---------------------------------------");
        }
    }

    private void contactSearch() {
        System.out.println("Enter the name for the contact you would like to remove:");
        String searchName = scanner.nextLine();
        ArrayList<Integer> searchResults = searchContacts(searchName);

        if (searchResults.isEmpty()) {
            System.out.println("No result found.");
        } else {
            for (int i = 0; i < searchResults.size(); i++) {
                displaySearchResults(searchResults);
            }
        }
    }

    private void removeContact() {
        System.out.println("Enter the name for the contact you would like to remove:");
        String searchName = scanner.nextLine();
        ArrayList<Integer> searchResults = searchContacts(searchName);
        int selection;

        if (searchResults.isEmpty()) {
            System.out.println("No result found.");
        } else {
            System.out.println("Which contact would you like to remove?");
            displaySearchResults(searchResults);
            System.out.print("Selection: ");
            selection = scanner.nextInt() - 1;
            scanner.nextLine();

            if (0 <= selection && selection < searchResults.size()) {
                myContacts.remove((int)searchResults.get(selection));
            } else {
                System.out.println("Invalid Selection");
            }
        }
    }

    private void editContact() {
        System.out.println("Enter the name for the contact you would like to edit:");
        String searchName = scanner.nextLine();
        ArrayList<Integer> searchResults = searchContacts(searchName);
        Contact c;
        int selection;

        if (searchResults.isEmpty()) {
            System.out.println("No result found.");
        } else {
            System.out.println("Which contact would you like to edit?");
            displaySearchResults(searchResults);
            System.out.print("Selection: ");
            selection = scanner.nextInt() - 1;
            scanner.nextLine();

            if (0 <= selection && selection < searchResults.size()) {
                c = myContacts.get(searchResults.get(selection));
                System.out.println("\nSelect your edit option:");
                System.out.println("\t1: Edit Name");
                System.out.println("\t2: Edit Mobile Number");
                int editOption = scanner.nextInt();
                scanner.nextLine();

                switch(editOption) {
                    case 1:
                        c.setName(getContactName());
                        break;
                    case 2:
                        c.setNumber(mobileValidation());
                        break;
                    default:
                        System.out.println("Invalid Option");
                        break;
                }
            } else {
                System.out.println("Invalid Selection");
            }
        }
    }
}
