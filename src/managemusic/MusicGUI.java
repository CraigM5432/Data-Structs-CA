/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package managemusic;

import java.util.ArrayList;



/**
 *
 * @author murph
 */
public class MusicGUI extends javax.swing.JFrame{
        
    /**
     * Creates new form MusicInterface
     */
    
    MusicInterface stackInterface;
    
    public MusicGUI() {
        stackInterface = new MyStack();
        initComponents();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        artistTF = new javax.swing.JTextField();
        songTF = new javax.swing.JTextField();
        genreTF = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nameAndSongTA = new javax.swing.JTextArea();
        addBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();
        artistNameLbl = new javax.swing.JLabel();
        songLbl = new javax.swing.JLabel();
        genreLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        playListTA = new javax.swing.JTextArea();
        playlist1Btn = new javax.swing.JButton();
        playlis2Btn = new javax.swing.JButton();
        shuffle1Btn = new javax.swing.JButton();
        shufflelist2Btn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        playList1SizeBtn = new javax.swing.JButton();
        playList2SizeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        artistTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistTFActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        title.setText("Add your favourite songs to your favourite playlists!");

        nameAndSongTA.setColumns(20);
        nameAndSongTA.setRows(5);
        jScrollPane1.setViewportView(nameAndSongTA);

        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addBtn.setText("Add ");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        displayBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        displayBtn.setText("Display");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        artistNameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        artistNameLbl.setText("Artist Name: ");

        songLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        songLbl.setText("Song Title: ");

        genreLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genreLbl.setText("Genre of Song: ");

        playListTA.setColumns(20);
        playListTA.setRows(5);
        jScrollPane2.setViewportView(playListTA);

        playlist1Btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        playlist1Btn.setText("Add to your PlayList 1");
        playlist1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlist1BtnActionPerformed(evt);
            }
        });

        playlis2Btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        playlis2Btn.setText("Add to your PlayList 2");

        shuffle1Btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        shuffle1Btn.setText("Shuffle PlayList 1");

        shufflelist2Btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        shufflelist2Btn.setText("Shuffle PlayList 2");

        exitBtn.setText("Exit App");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        playList1SizeBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        playList1SizeBtn.setText("View PlayList 1");
        playList1SizeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playList1SizeBtnActionPerformed(evt);
            }
        });

        playList2SizeBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        playList2SizeBtn.setText("View PlayList 2");
        playList2SizeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playList2SizeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exitBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(artistNameLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(artistTF, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(songLbl)
                                        .addComponent(genreLbl))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(displayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(29, 29, 29)
                                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(songTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                                        .addComponent(genreTF, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(playList1SizeBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(shuffle1Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(playlist1Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(playlis2Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(shufflelist2Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(playList2SizeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artistTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artistNameLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(songTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreLbl))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(searchBtn)
                    .addComponent(addBtn)
                    .addComponent(displayBtn))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playlist1Btn)
                    .addComponent(playlis2Btn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shuffle1Btn)
                    .addComponent(shufflelist2Btn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playList1SizeBtn)
                    .addComponent(playList2SizeBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(exitBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void artistTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_artistTFActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        //declaring new variables and setting them to the Text Fields in the GUI
        String sArtist, sSong, sGenre;
        sArtist = artistTF.getText();
        sSong = songTF.getText();
        sGenre = genreTF.getText();
        
               //if else statement handling user input error and displaying error in JText Area
            if(sArtist.isEmpty() || sSong.isEmpty() || sGenre.isEmpty()){
                nameAndSongTA.append("Please enter all fields correctly\n");
            } else{
                //creating an instance of the LikedSongs songs class and then adding it to the STACK 
                LikedSongs newEntry = new LikedSongs(sArtist, sSong, sGenre);
                stackInterface.add(newEntry);
                
                //displaying that the new entry of song has been added to the STACK
                nameAndSongTA.append("A new song has been added\n");
                
                //clearing the text fields after every entry 
                artistTF.setText("");
                songTF.setText("");
                genreTF.setText("");
                
                
            }
            
            
    }//GEN-LAST:event_addBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
                //calling on the display methoid in the MyStack class to display the objects that have been added to the STACK in the JText Area
                //
                nameAndSongTA.append(stackInterface.display());
    }//GEN-LAST:event_displayBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        //to exit the application
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String search; 
        search = songTF.getText();
        nameAndSongTA.append(stackInterface.search(search));
    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
                //calling the remove method to remove and item from the STACK
                Object removedItem = stackInterface.remove();
                
                //Checking if the removed item is a String 
                //If it's a String, append it directly to the JText Area
                if(removedItem instanceof String){
                    nameAndSongTA.append((String) removedItem);
                }else if(removedItem instanceof LikedSongs){
                    //If it's a LikedSongs object, cast it to LikedSongs
                    LikedSongs song = (LikedSongs) removedItem;
                    //Then append the details of the removed song to the JText Area
                    nameAndSongTA.append(song.getRemovedDetails() + "\n");
                }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void playList1SizeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playList1SizeBtnActionPerformed
                playListTA.append(stackInterface.playList1Size());
    }//GEN-LAST:event_playList1SizeBtnActionPerformed

    private void playList2SizeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playList2SizeBtnActionPerformed
                playListTA.append(stackInterface.playList2Size());
    }//GEN-LAST:event_playList2SizeBtnActionPerformed

    private void playlist1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlist1BtnActionPerformed
               
    }//GEN-LAST:event_playlist1BtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel artistNameLbl;
    private javax.swing.JTextField artistTF;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel genreLbl;
    private javax.swing.JTextField genreTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea nameAndSongTA;
    private javax.swing.JButton playList1SizeBtn;
    private javax.swing.JButton playList2SizeBtn;
    private javax.swing.JTextArea playListTA;
    private javax.swing.JButton playlis2Btn;
    private javax.swing.JButton playlist1Btn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton shuffle1Btn;
    private javax.swing.JButton shufflelist2Btn;
    private javax.swing.JLabel songLbl;
    private javax.swing.JTextField songTF;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}