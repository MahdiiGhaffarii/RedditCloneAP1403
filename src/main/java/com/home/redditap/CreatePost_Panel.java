/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.home.redditap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author GreatMahdi
 */
public class CreatePost_Panel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePost_Panel
     */
    public CreatePost_Panel() {
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

        CaptionFeild = new javax.swing.JTextField();
        MiniLogo = new javax.swing.JLabel();
        SharePost = new javax.swing.JButton();
        BackToProfileButton = new javax.swing.JButton();
        Gradient = new javax.swing.JLabel();

        setLayout(null);

        CaptionFeild.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        CaptionFeild.setForeground(new java.awt.Color(0, 0, 0));
        add(CaptionFeild);
        CaptionFeild.setBounds(91, 140, 500, 340);

        MiniLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\GreatMahdi\\Desktop\\RedditCloneAP1403-Develop\\RedditCloneAP1403-Develop\\Pictures\\RedditICO2.png")); // NOI18N
        MiniLogo.setText("jLabel1");
        add(MiniLogo);
        MiniLogo.setBounds(320, 10, 60, 80);

        SharePost.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SharePost.setForeground(new java.awt.Color(0, 0, 0));
        SharePost.setText("Share Post");
        SharePost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SharePostActionPerformed(evt);
            }
        });
        add(SharePost);
        SharePost.setBounds(250, 510, 180, 50);

        BackToProfileButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackToProfileButton.setForeground(new java.awt.Color(0, 0, 0));
        BackToProfileButton.setText("Back To Profile");
        BackToProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToProfileButtonActionPerformed(evt);
            }
        });
        add(BackToProfileButton);
        BackToProfileButton.setBounds(250, 600, 180, 40);

        Gradient.setIcon(new javax.swing.ImageIcon("C:\\Users\\GreatMahdi\\Desktop\\RedditCloneAP1403-Develop\\RedditCloneAP1403-Develop\\Pictures\\Gradient.png")); // NOI18N
        add(Gradient);
        Gradient.setBounds(-15, -11, 730, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void SharePostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SharePostActionPerformed
 try 
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection Connection1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/redditproject","root","");
                String SQLQuery1 = "INSERT INTO posts_information (user_name,caption) VALUES (?,?)";
                PreparedStatement PreparedStatement1 = (PreparedStatement) Connection1.prepareStatement(SQLQuery1);
                PreparedStatement1.setString(1, Login_Panel.LoggedInUsername);
                PreparedStatement1.setString(2, CaptionFeild.getText());
                
                PreparedStatement1.executeUpdate();
                JOptionPane.showMessageDialog(null,"Your Post Shared Sucessfully");
  
                DefaultTableModel model = (DefaultTableModel) YourPosts_Panel.YourPostTable.getModel();
                model.addRow(new Object[]{CaptionFeild.getText(), getCurrentDate()});
                
                              
        YourPosts_Panel yourPostsPanel = new YourPosts_Panel();
        yourPostsPanel.RefreshAPP();

        YourPosts_Panel.CreatePost_JFrame.setVisible(false);
        Profile_Panel.YourPostsFrame.setVisible(true);
        Connection1.close();
                            }//GEN-LAST:event_SharePostActionPerformed
   catch (Exception e)
   {
       JOptionPane.showMessageDialog(null,e);
   }
    }
    private void BackToProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToProfileButtonActionPerformed
        Login_Panel.Profile_Frame.setVisible(true);
    }//GEN-LAST:event_BackToProfileButtonActionPerformed
    private String getCurrentDate() {
        SimpleDateFormat SimpleDate1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return SimpleDate1.format(new Date());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BackToProfileButton;
    private javax.swing.JTextField CaptionFeild;
    private javax.swing.JLabel Gradient;
    private javax.swing.JLabel MiniLogo;
    public static javax.swing.JButton SharePost;
    // End of variables declaration//GEN-END:variables
}