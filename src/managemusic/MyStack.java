/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managemusic;

import java.util.ArrayList;

/**
 *
 * @author murph
 */
public class MyStack implements MusicInterface{
    //declaring ArrayLists
    private ArrayList <LikedSongs> theStack;
    private ArrayList <LikedSongs> playListGenreA;
    private ArrayList <LikedSongs> playListGenreB;
    
    public MyStack(){
        //creaing the ArrayLists
        theStack = new ArrayList<>();
        playListGenreA = new ArrayList<>();
        playListGenreB = new ArrayList<>();
    }
    
    
    @Override
    public boolean isEmpty(){
        //checking if theStack ArrayList is empty and return the result
        return theStack.isEmpty();
    }
    
    @Override
    public boolean isFull(){
        //theStack is assumed to not be full, so we return false
        return false;
    }
    
    @Override
    public void add(Object newItem){
        //checking if newItem is an instance of LikedSongs
        if(newItem instanceof LikedSongs){
            //if newItem is an instance of LikedSongs, we add it to the end of theStack
            theStack.add(0, (LikedSongs) newItem);
        } else{
            System.out.println("Sorry, cannot add non-LikedSongs object to theStack");
        }
    }
    
    @Override
    public Object remove(){
        //checking if theStack ArrayList is empty
        if(theStack.isEmpty()){
            //if theStack is empty, return a message
            return "The STACK is empty\n";
        }else{
            //if theStack isn't empty, remove and return the last Object added to theStack
            return theStack.remove(0);
        }
    }
    
    @Override
    public int size(){
        //retruning the size of theStack
        return theStack.size();
    }
    
    @Override
    public void emptyStack(){
        //removing all Objects from theStack until theStack is empty
        while(!theStack.isEmpty()){
            remove();
        }
    }
    
    @Override
    public String display(){
        //creating a StringBuilder to store message to be displayed 
        StringBuilder message = new StringBuilder();
        
        //checking if theStack is empty
        if(theStack.isEmpty()){
            //if theStack is empty, append a message with the St4ringBuilder
            message.append("The STACK is empty\n");
        } else {
            //if theStack is not empty, iterate through each Object in LikeSongs in theStack
            for(LikedSongs song : theStack){
                //append the details of each song to the StringBuilder
               message.append(song.getDetails()).append("\n");
            }
        }
        //converting the StringBuilder to a String and returning the message
        return message.toString();
    }

    @Override
   public String search(String search){
       //Creating a String builder to store searc results
       StringBuilder result = new StringBuilder();
       
       //Iterating through each object of LikedSongs in theStack
       for(LikedSongs song : theStack){
           //checking if the artist or song title matches the search 
           if(song.getArtist().equalsIgnoreCase(search) || song.getSong().equalsIgnoreCase(search)){
               //appending the details of the matching song to the StringBuilder
               result.append(song.getSearchDetails());
           }
       }
       //checking if any matching songs were found
       if(result.length() == 0){
           //if no matching songs were found, appending a message 
           result.append("Sorry, there are no matching songs, please try again.\n");
       }
       //convertiung the StringBuilder to a String and returning it 
       return result.toString();
   }
   
    @Override
    public String playList1Size() {
        //checking if playListGenreA is empty
        if (playListGenreA.isEmpty()) {
            //if playListGenreA is empty, we return a message 
            return "Sorry, there are no songs in this playlist.\n";
        } else {
            //if playListGenreA isn't empty, we create an Integer variable 
            //equal that interger to the playListGenreA.size() method 
            int iSize = playListGenreA.size();
            //return the interger as a String 
            return String.valueOf(iSize);
        }
    }
    
    @Override
    public String playList2Size() {
        //checking if playListGenreB is empty
        if (playListGenreB.isEmpty()) {
            //if playListGenreA is empty, we return a message 
            return "Sorry, there are no songs in this playlist.\n";
        } else {
            //if playListGenreA isn't empty, we create an Integer variable 
            //equal that interger to the playListGenreA.size() method 
            int iSize = playListGenreB.size();
             //return the interger as a String 
            return String.valueOf(iSize); // or return iSize + "";
        }
    }
    
    
    
    
   
}
    
    