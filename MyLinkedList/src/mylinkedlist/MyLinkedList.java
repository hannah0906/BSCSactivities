/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mylinkedlist;

/**
 * Paulino, Ma. Hannah Mae Z.
 * BSCS302
 * Data Structures and Algorithm
 */

import java.util.LinkedList;//implements the LinkedList class
public class MyLinkedList {

    public static void main(String[] args) {
        LinkedList<String> songs = new LinkedList<String>(); //first linked list named songs (1/3)
            //adds song titles to the 'songs' linked list
            songs.add("Vampire");
            songs.add("The Story of Us");
            songs.add("Oh Well, Oh Well");
            songs.add("Cancer");
            songs.add("Dear Maria, Count Me In");
         
        System.out.println(songs); //prints the 'songs' linked list

        LinkedList<String> artists = new LinkedList<>(); //second linked list named artists (2/3)
            //adds song artists to the 'artists' linked list
            artists.add("Olivia Rodrigo");
            artists.add("Taylor Swift");
            artists.add("Mayday Parade");
            artists.add("My Chemical Romance");
            artists.add("All Time Low");
        
        System.out.println(artists); //prints the 'artists' linked list

        LinkedList<String> playlist = new LinkedList<>(); //third linked list named playlist (3/3)
            
            //for ]loop that combines song title and song artists
            for(int i=0; i < 5; i++) {
                //combines the song from 'songs' linked list to its corresponding artist from 'artists' linke list
                String combine = songs.get(i) + " - " + artists.get(i);
                
                playlist.add(combine); //adds the combined title and artists to the 'playlist' linked list
            }     
            
            //for loop for converting the 'playlist' linked list to a string
            for (String playlists : playlist){
                System.out.println(playlists); //prints the string version of the 'playlist' linked list
            }
    }
}
