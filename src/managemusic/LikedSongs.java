/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managemusic;



/**
 *
 * @author murph
 */
public class LikedSongs{
    protected String artist, song, genre; 

    
    public LikedSongs(String artist, String song, String genre){
        this.artist = artist;
        this.song = song;
        this.genre = genre;
    }

    //Getters and Setter methods 

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    //methods returning the deatils of an added Object to theStack, a removed Object from theStack and the search details of an Object from theStack 
    public String getDetails(){
        return "Artist: " + getArtist() + ", Song: " + getSong() + " has been added to liked songs.";
    }
    
    public String getRemovedDetails(){
        return "Artist: " + getArtist() + ", Song: " + getSong() + " has been removed from liked songs.";
    }
    
    public String getSearchDetails(){
        return getSong() + " has been found in your liked songs.\n";
    }
}
