package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class iPod {
    private static Scanner scanner;
    private boolean playing;
    private ArrayList<Album> albums;
    private LinkedList<Song> playlist;

    public iPod() {
        this.scanner = new Scanner(System.in);
        this.playing = false;
        this.albums = new ArrayList<>();
        this.playlist = new LinkedList<>();
    }


    public void powerOn() {
        boolean loop = true;
        int sel;

        while (loop) {
            System.out.println("\nPlease make your selection:");
            System.out.println("1: Play");
            System.out.println("2: View Playlist");
            System.out.println("3: Add Song To Playlist");
            System.out.println("4: Remove Song From Playlist");
            System.out.println("0: Quit");

            sel = scanner.nextInt();

            switch(sel) {
                case 0:
                    loop = false;
                    break;
                case 1:
                    if (playlist.isEmpty())  {
                        System.out.println("No songs in playlist");
                    } else {
                        playing = !playing;
                    }
                    break;
                case 2:
                    viewPlaylist();
                    break;
                case 3:
                    addSong();
                    break;
                case 4:
                    removeSongSelector();
                    break;
                default:
                    System.out.println("Bad Selection");
                    break;
            }

            if (playing) {
                nowPlaying();
            }
        }

        scanner.close();
    }

    private void viewPlaylist() {
        ListIterator<Song> viewer = playlist.listIterator();
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("\nYour current playlist:");
            while (viewer.hasNext()) {
                System.out.println("\t" + (int)(viewer.nextIndex() + 1) +
                        ": " + viewer.next().getFormattedSong());
            }
        }
    }

    private void printControls() {
        System.out.println("\niPod Controls:");
        System.out.println("0: Show iPod Controls");
        System.out.println("1: Next Song");
        System.out.println("2: Previous Song");
        System.out.println("3: Repeat Current Song");
        System.out.println("4: Remove Current Song From Playlist");
    }

    private void nowPlaying() {
        Song currentSong;
        int sel;
        boolean forward = true;
        ListIterator<Song> playlistIterator = playlist.listIterator();
        printControls();

        while (playing && playlistIterator.hasNext()) {
            currentSong = playlistIterator.next();
            System.out.println("\u001B[32mCurrent Song: " +
                    currentSong.getTitle() + " (" +
                    currentSong.getDuration() + ")\u001B[0m");
            sel = scanner.nextInt();

            switch(sel) {
                case 0:
                    printControls();
                    playlistIterator.previous();
                    break;
                case 1:
                    forward = true;
                    if (!playlistIterator.hasNext()) {
                        System.out.println("End of playlist.");
                        playing = false;
                    }
                    break;
                case 2:
                    playlistIterator.previous();
                    if (playlistIterator.hasPrevious()){
                        playlistIterator.previous();
                    } else {
                        System.out.println("\u001B[31mAlready at the start of the playlist!\u001B[0m");
                    }
                    break;
                case 3:
                    playlistIterator.previous();
                    break;
                case 4:
                    System.out.println("\u001B[31mRemoved: " + playlistIterator.previous().getTitle() + "\u001B[0m");
                    playlistIterator.remove();
                    viewPlaylist();
                    if (playlistIterator.hasPrevious()){
                        playlistIterator.previous();
                    }
                    break;
                case 5:
                    playing = false;
                    break;
                default:
                    System.out.println("Bad Selection");
                    playlistIterator.previous();
                    break;
            }
        }
    }

    private void removeSongSelector() {
        viewPlaylist();

        System.out.println("\nChoose your song to remove:");
        int selection = scanner.nextInt() - 1;

        if (0 <= selection && selection < playlist.size()) {
            Song removed = playlist.remove(selection);
            System.out.println(removed.getTitle() + "has been removed from the playlist.");
        } else System.out.println("Bad Selection");

    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    private void listAlbums() {
//        System.out.println("\nHere is a list of available albums:");
        for (int i = 0; i < albums.size(); i++) {
            System.out.println("\t" + (int)(i + 1) + ": " + albums.get(i).getAlbumTitle());
        }
    }

    private void addSong() {
        System.out.println("\nChoose your album to view song list:");
//        for (int i = 0; i < albums.size(); i++) {
//            System.out.println("\t" + (int)(i + 1) + ": " + albums.get(i).getAlbumTitle());
//        }
        listAlbums();
        int selection = scanner.nextInt() - 1;

        if (0 <= selection && selection < albums.size()) {
            Album selectedAlbum = albums.get(selection);
            System.out.println("\nThe song list for " + selectedAlbum.getAlbumTitle() + " is:");
            selectedAlbum.listSongs();
            selection = scanner.nextInt() - 1;
            if (0 <= selection && selection < selectedAlbum.getSongCount()) {
                playlist.add(selectedAlbum.getSong(selection));
            } else System.out.println("Bad Selection");
        } else System.out.println("Bad Selection");
    }

}
