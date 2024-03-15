/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package managemusic;

/**
 *
 * @author murph
 */
public interface MusicInterface{
    
    public void add(Object newItem);
    
    public Object remove();
    
    public boolean isEmpty();
    
    public boolean isFull();
    
    public int size();
    
    public void emptyStack();
    
    public String display();
    
    public String search(String search);
    
    public String playList1Size();
    
    public String playList2Size();
}
