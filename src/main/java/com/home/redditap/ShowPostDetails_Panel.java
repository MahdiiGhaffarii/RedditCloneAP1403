/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.home.redditap;

import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GreatMahdi
 */
public class ShowPostDetails_Panel extends javax.swing.JPanel {

    /**
     * Creates new form ShowPostDetails_Panel
     */
    public static String PostUser;
    public static String PostCaptionText;
    public static String PostDate;

    public ShowPostDetails_Panel(String user_name, String post, String date) {
        initComponents();
        
        PostUser = user_name;
        PostCaptionText = post;
        PostDate = date;
        
        ShareDate.setText(date);
        jTextArea1.setText(post);
        UserPost.setText("User Post : " + Login_Panel.LoggedInUsername);

        int CommentCount = 0;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection Connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/redditproject", "root", "");
String SQLQuery1 = "SELECT user_name1, comment_text FROM comments_list WHERE user_name2 = ? AND post = ?";
            PreparedStatement PreparedStatement1 = Connection1.prepareStatement(SQLQuery1);

            PreparedStatement1.setString(1, PostUser);
            PreparedStatement1.setString(2, PostCaptionText);

            ResultSet ResultSet1 = PreparedStatement1.executeQuery();
            
            while (CommentsTable.getRowCount()>0)
            {
                ((DefaultTableModel)CommentsTable.getModel()).removeRow(0);
            }

            while (ResultSet1.next()) {
                CommentCount++;
                ((DefaultTableModel)CommentsTable.getModel()).addRow(new Object [] {ResultSet1.getString("user_name1"), ResultSet1.getString("comment_text")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        CommentsCount.setText("Comments : " + CommentCount);
 
}
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LikeThisPost = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        CommentsCount = new javax.swing.JLabel();
        LikesCount = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CommentsTable = new javax.swing.JTable();
        CommentButton = new javax.swing.JButton();
        DisplayPostText = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        ShareDate = new javax.swing.JLabel();
        UserPost = new javax.swing.JLabel();
        MiniLogo = new javax.swing.JLabel();
        Gradient = new javax.swing.JLabel();

        setLayout(null);

        LikeThisPost.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LikeThisPost.setForeground(new java.awt.Color(255, 255, 255));
        LikeThisPost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LikeThisPost.setText("Like This Post");
        add(LikeThisPost);
        LikeThisPost.setBounds(280, 290, 120, 40);

        jCheckBox1.setBackground(new java.awt.Color(9, 69, 73));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1);
        jCheckBox1.setBounds(330, 330, 20, 19);

        CommentsCount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CommentsCount.setForeground(new java.awt.Color(255, 255, 255));
        CommentsCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CommentsCount.setText("Comments : 0");
        add(CommentsCount);
        CommentsCount.setBounds(80, 310, 170, 40);

        LikesCount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LikesCount.setForeground(new java.awt.Color(255, 255, 255));
        LikesCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LikesCount.setText("Likes : 0");
        add(LikesCount);
        LikesCount.setBounds(430, 310, 120, 40);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Back To Profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(40, 570, 100, 30);

        CommentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "User", "Comment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CommentsTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(180, 510, 330, 140);

        CommentButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CommentButton.setText("Comment");
        CommentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommentButtonActionPerformed(evt);
            }
        });
        add(CommentButton);
        CommentButton.setBounds(280, 450, 130, 40);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        DisplayPostText.setViewportView(jTextArea1);

        add(DisplayPostText);
        DisplayPostText.setBounds(104, 170, 480, 120);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(jTextField1);
        jTextField1.setBounds(110, 380, 480, 50);

        ShareDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ShareDate.setForeground(new java.awt.Color(255, 255, 255));
        ShareDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShareDate.setText("Share Date :");
        add(ShareDate);
        ShareDate.setBounds(390, 110, 130, 40);

        UserPost.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UserPost.setForeground(new java.awt.Color(255, 255, 255));
        UserPost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserPost.setText("User Post :");
        add(UserPost);
        UserPost.setBounds(150, 110, 130, 40);

        MiniLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\GreatMahdi\\Desktop\\RedditCloneAP1403-Develop\\RedditCloneAP1403-Develop\\Pictures\\RedditICO2.png")); // NOI18N
        MiniLogo.setText("jLabel1");
        add(MiniLogo);
        MiniLogo.setBounds(320, 10, 60, 80);

        Gradient.setIcon(new javax.swing.ImageIcon("C:\\Users\\GreatMahdi\\Desktop\\RedditCloneAP1403-Develop\\RedditCloneAP1403-Develop\\Pictures\\Gradient.png")); // NOI18N
        Gradient.setText("jLabel1");
        add(Gradient);
        Gradient.setBounds(-3, -10, 710, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void CommentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommentButtonActionPerformed
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection Connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/redditproject", "root", "");
            String SQLQuery1 = "INSERT INTO comments_list (user_name1,user_name2,post,post_date,comment_text) VALUES (?,?,?,?,?)";
            PreparedStatement PreparedStatement1 = Connection1.prepareStatement(SQLQuery1);

            PreparedStatement1.setString(1 , Login_Panel.LoggedInUsername);
            PreparedStatement1.setString(2, PostUser);
            PreparedStatement1.setString(3, PostCaptionText);
             PreparedStatement1.setString(4, PostDate);
                          PreparedStatement1.setString(5, jTextField1.getText());

                         PreparedStatement1.executeUpdate(); 
                          DefaultTableModel model = (DefaultTableModel) CommentsTable.getModel();
                          model.addRow(new Object[]{Login_Panel.LoggedInUsername, jTextField1.getText()});
                           CommentsCount.setText("Comments : " + model.getRowCount());
         }
         
         catch (Exception e)
         {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_CommentButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Login_Panel.Profile_Frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
 if (jCheckBox1.isSelected()) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection Connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/redditproject", "root", "");
            String SQLQuery1 = "INSERT INTO likes (user_name1, user_name2, post) VALUES (?, ?, ?)";
            PreparedStatement PreparedStatement1 = Connection1.prepareStatement(SQLQuery1);

            PreparedStatement1.setString(1, Login_Panel.LoggedInUsername);
            PreparedStatement1.setString(2, PostUser);
            PreparedStatement1.setString(3, PostCaptionText);

            PreparedStatement1.executeUpdate();
            
            int likeCount = Integer.parseInt(LikesCount.getText().split(":")[1].trim());
            likeCount++;
            LikesCount.setText("Likes : " + likeCount);
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
 else
 {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection Connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/redditproject", "root", "");
            String SQLQuery1 = "DELETE FROM likes WHERE user_name1 = ? AND user_name2 = ? AND post = ? AND when_like = ?";
            PreparedStatement PreparedStatement1 = Connection1.prepareStatement(SQLQuery1);

            PreparedStatement1.setString(1, Login_Panel.LoggedInUsername);
            PreparedStatement1.setString(2, PostUser);
            PreparedStatement1.setString(3, PostCaptionText);
            PreparedStatement1.setString(4, PostDate);

            PreparedStatement1.executeUpdate();
            
            int likeCount = Integer.parseInt(LikesCount.getText().split(":")[1].trim());
            likeCount--;
            LikesCount.setText("Likes : " + likeCount);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    }//GEN-LAST:event_jCheckBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CommentButton;
    private javax.swing.JLabel CommentsCount;
    private javax.swing.JTable CommentsTable;
    private javax.swing.JScrollPane DisplayPostText;
    private javax.swing.JLabel Gradient;
    private javax.swing.JLabel LikeThisPost;
    private javax.swing.JLabel LikesCount;
    private javax.swing.JLabel MiniLogo;
    private javax.swing.JLabel ShareDate;
    private javax.swing.JLabel UserPost;
    public static javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}