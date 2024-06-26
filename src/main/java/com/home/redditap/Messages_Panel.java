/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.home.redditap;

/**
 *
 * @author GreatMahdi
 */
public class Messages_Panel extends javax.swing.JPanel {

    /**
     * Creates new form Messages_Panel
     */
    public Messages_Panel() {
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

        MessageListPane = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BackToProfileButton = new javax.swing.JButton();
        MiniLogo = new javax.swing.JLabel();
        Gradient = new javax.swing.JLabel();

        setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "User", "Last Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MessageListPane.setViewportView(jTable1);

        add(MessageListPane);
        MessageListPane.setBounds(130, 140, 452, 402);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BackToProfileButton;
    private javax.swing.JLabel Gradient;
    private javax.swing.JScrollPane MessageListPane;
    private javax.swing.JLabel MiniLogo;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
