/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.home.redditap;

/**
 *
 * @author GreatMahdi
 */
public class Splash_Panel extends javax.swing.JPanel {

    /**
     * Creates new form Splash_Panel
     */
    public Splash_Panel() {
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

        Progress = new javax.swing.JProgressBar();
        AP1403 = new javax.swing.JLabel();
        Percentage = new javax.swing.JLabel();
        RedditLogo = new javax.swing.JLabel();
        Gradient = new javax.swing.JLabel();

        setLayout(null);
        add(Progress);
        Progress.setBounds(26, 260, 390, 50);

        AP1403.setBackground(new java.awt.Color(255, 255, 255));
        AP1403.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AP1403.setForeground(new java.awt.Color(255, 255, 255));
        AP1403.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AP1403.setText("AP - 1403");
        add(AP1403);
        AP1403.setBounds(0, 410, 440, 40);

        Percentage.setBackground(new java.awt.Color(255, 255, 255));
        Percentage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Percentage.setForeground(new java.awt.Color(255, 255, 255));
        Percentage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Percentage.setText("0 %");
        add(Percentage);
        Percentage.setBounds(27, 310, 390, 100);

        RedditLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\GreatMahdi\\Desktop\\RedditLogoo.png")); // NOI18N
        add(RedditLogo);
        RedditLogo.setBounds(10, 0, 440, 300);

        Gradient.setIcon(new javax.swing.ImageIcon("C:\\Users\\GreatMahdi\\Desktop\\Gradient.png")); // NOI18N
        add(Gradient);
        Gradient.setBounds(-10, -10, 470, 470);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel AP1403;
    private javax.swing.JLabel Gradient;
    public static javax.swing.JLabel Percentage;
    public static javax.swing.JProgressBar Progress;
    private javax.swing.JLabel RedditLogo;
    // End of variables declaration//GEN-END:variables
}
