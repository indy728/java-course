package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age > 100 || age < 0 ? 0 : age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTeen() {
        return this.age >= 13 && this.age <= 19;
    }

    public String getFullName(){
        if (this.firstName.isEmpty()) {
            if (this.lastName.isEmpty()) return "";
            return this.lastName;
        } else if (this.lastName.isEmpty()) return this.firstName;
        return this.firstName + " " + this.lastName;
    }
}
