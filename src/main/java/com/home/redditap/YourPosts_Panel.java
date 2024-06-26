package com.home.redditap;


import com.home.redditap.Login_Panel;
import static com.home.redditap.Login_Panel.LoggedInUsername;
import static com.home.redditap.Login_Panel.Profile_Frame;
import static com.home.redditap.Profile_Panel.ShowPostDetails_JFrame;
import static com.home.redditap.Profile_Panel.YourPostsFrame;
import com.home.redditap.RedditAP;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GreatMahdi
 */
public class YourPosts_Panel extends javax.swing.JPanel {

    /**
     * Creates new form YourPostsPanel
     */
    
            public static JFrame CreatePost_JFrame;
            
    public YourPosts_Panel() {
        initComponents();
        RefreshAPP();
}

        public void RefreshAPP() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection Connection1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/redditproject","root","");
            String SQLQuery1 = "SELECT caption, share_date FROM posts_information WHERE user_name = ? ORDER BY share_date DESC";
            PreparedStatement PreparedStatement1 = (PreparedStatement) Connection1.prepareStatement(SQLQuery1);
            PreparedStatement1.setString(1, Login_Panel.LoggedInUsername);

            ResultSet ResultSet1 = PreparedStatement1.executeQuery();   

            while (YourPostTable.getRowCount() > 0) {
                ((DefaultTableModel)YourPostTable.getModel()).removeRow(0);
            }

            while (ResultSet1.next()) {
                ((DefaultTableModel)YourPostTable.getModel()).addRow(new Object [] { ResultSet1.getString("caption"),ResultSet1.getString("share_date")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MessageListPane = new javax.swing.JScrollPane();
        YourPostTable = new javax.swing.JTable();
        DeletePost = new javax.swing.JButton();
        NewPost = new javax.swing.JButton();
        BackToProfileButton = new javax.swing.JButton();
        MiniLogo = new javax.swing.JLabel();
        Gradient = new javax.swing.JLabel();

        setLayout(null);

        YourPostTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Post Caption", "Sharing Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        YourPostTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YourPostTableMouseClicked(evt);
            }
        });
        MessageListPane.setViewportView(YourPostTable);

        add(MessageListPane);
        MessageListPane.setBounds(130, 140, 452, 290);

        DeletePost.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DeletePost.setForeground(new java.awt.Color(0, 0, 0));
        DeletePost.setText("Delete Post");
        DeletePost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePostActionPerformed(evt);
            }
        });
        add(DeletePost);
        DeletePost.setBounds(380, 490, 180, 40);

        NewPost.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewPost.setForeground(new java.awt.Color(0, 0, 0));
        NewPost.setText("New Post");
        NewPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPostActionPerformed(evt);
            }
        });
        add(NewPost);
        NewPost.setBounds(150, 490, 180, 40);

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

        MiniLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\GreatMahdi\\Desktop\\RedditCloneAP1403-Develop\\RedditCloneAP1403-Develop\\Pictures\\RedditICO2.png")); // NOI18N
        MiniLogo.setText("jLabel1");
        add(MiniLogo);
        MiniLogo.setBounds(320, 10, 60, 80);

        Gradient.setIcon(new javax.swing.ImageIcon("C:\\Users\\GreatMahdi\\Desktop\\RedditCloneAP1403-Develop\\RedditCloneAP1403-Develop\\Pictures\\Gradient.png")); // NOI18N
        add(Gradient);
        Gradient.setBounds(-15, -11, 730, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void BackToProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToProfileButtonActionPerformed
        Login_Panel.Profile_Frame.setVisible(true);
    }//GEN-LAST:event_BackToProfileButtonActionPerformed

    private void NewPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPostActionPerformed
        RefreshAPP();
        CreatePost_JFrame = RedditAP.Create_JFrame(new CreatePost_Panel(), "Reddit - New Post",700,700,1);
        Profile_Panel.YourPostsFrame.setVisible(false);
        CreatePost_JFrame.setVisible(true);
    }//GEN-LAST:event_NewPostActionPerformed

    private void DeletePostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePostActionPerformed

        DefaultTableModel model = (DefaultTableModel)YourPostTable.getModel();
        int SelectedRow = YourPostTable.getSelectedRow();
        if (SelectedRow != -1)
        {
            String selectedDate = model.getValueAt(SelectedRow, 1).toString();
        
        try
            {
              Class.forName("com.mysql.jdbc.Driver");
                Connection Connection1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/redditproject","root","");
                String SQLQuery1 = "DELETE FROM posts_information WHERE user_name = ? AND share_date = ?";
                PreparedStatement PreparedStatement1 = (PreparedStatement) Connection1.prepareStatement(SQLQuery1);
                PreparedStatement1.setString(1, Login_Panel.LoggedInUsername);
                PreparedStatement1.setString(2, selectedDate);
                PreparedStatement1.executeUpdate();
                Connection1.close();
                
                 Profile_Panel.YourPostsFrame.setVisible(false);
                 
                             RefreshAPP();
              
         YourPostsFrame = RedditAP.Create_JFrame(new YourPosts_Panel(),"Reddit - YourPosts",700,700,1);
               Profile_Panel.YourPostsFrame.setVisible(true);                                     
                 
                          
            }
        
                          catch (Exception e)
                                  {
                                  JOptionPane.showMessageDialog(null,e);
                                  }
        }
    }//GEN-LAST:event_DeletePostActionPerformed
   
    private void YourPostTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YourPostTableMouseClicked
DefaultTableModel model = (DefaultTableModel)YourPostTable.getModel(); int SelectedRow = YourPostTable.getSelectedRow();
String Post = model.getValueAt(SelectedRow, 0).toString();
String Date = model.getValueAt(SelectedRow, 1).toString();

        ShowPostDetails_JFrame = RedditAP.Create_JFrame(new ShowPostDetails_Panel(Login_Panel.LoggedInUsername,Post,Date),"Reddit - Post Details",700,700,1);
        Login_Panel.Profile_Frame.setVisible(false);
        Profile_Panel.ShowPostDetails_JFrame.setVisible(true);   

    }//GEN-LAST:event_YourPostTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BackToProfileButton;
    public static javax.swing.JButton DeletePost;
    private javax.swing.JLabel Gradient;
    private javax.swing.JScrollPane MessageListPane;
    private javax.swing.JLabel MiniLogo;
    public static javax.swing.JButton NewPost;
    public static javax.swing.JTable YourPostTable;
    // End of variables declaration//GEN-END:variables
}
