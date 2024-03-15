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
    
    private ArrayList <LikedSongs> theStack;
    private ArrayList <LikedSongs> playListGenreA;
    private ArrayList <LikedSongs> playListGenreB;
    
    public MyStack(){
        theStack = new ArrayList<>();
        playListGenreA = new ArrayList<>();
        playListGenreB = new ArrayList<>();
    }
    
    
    @Override
    public boolean isEmpty(){
        return theStack.isEmpty();
    }
    
    @Override
    public boolean isFull(){
        return false;
    }
    
    @Override
    public void add(Object newItem){
        if(newItem instanceof LikedSongs){
            theStack.add(0, (LikedSongs) newItem);
        } else{
            
        }
    }
    
    @Override
    public Object remove(){
        if(theStack.isEmpty()){
            return "The STACK is empty\n";
        }else{
            return theStack.remove(0);
        }
    }
    
    @Override
    public int size(){
        return theStack.size();
    }
    
    @Override
    public void emptyStack(){
        while(!theStack.isEmpty()){
            remove();
        }
    }
    
    @Override
    public String display(){
        StringBuilder message = new StringBuilder();
        
        if(theStack.isEmpty()){
            message.append("The STACK is empty\n");
        } else {
            for(LikedSongs song : theStack){
               message.append(song.getDetails()).append("\n");
            }
        }
        return message.toString();
    }

    @Override
   public String search(String search){
       StringBuilder result = new StringBuilder();
       
       for(LikedSongs song : theStack){
           if(song.getArtist().equalsIgnoreCase(search) || song.getSong().equalsIgnoreCase(search)){
               result.append(song.getSearchDetails());
           }
       }
       
       if(result.length() == 0){
           result.append("Sorry, there are no matching songs, please try again.\n");
       }
       return result.toString();
   }
   
    @Override
    public String playList1Size() {
        if (playListGenreA.isEmpty()) {
            return "Sorry, there are no songs in this playlist.\n";
        } else {
            int iSize = playListGenreA.size();
            return String.valueOf(iSize); // or return iSize + "";
        }
    }
    
    @Override
    public String playList2Size() {
        if (playListGenreA.isEmpty()) {
            return "Sorry, there are no songs in this playlist.\n";
        } else {
            int iSize = playListGenreA.size();
            return String.valueOf(iSize); // or return iSize + "";
        }
    }
}