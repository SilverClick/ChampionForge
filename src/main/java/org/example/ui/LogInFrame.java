/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.example.ui;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.*;

/**
 *
 * @author PC-LORENZO
 */
public class LogInFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form LogInFrame
     */
    public LogInFrame() {
        initComponents();

        // Eliminar el borde decorativo
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        ui.setEastPane(null);
        ui.setWestPane(null);
        ui.setSouthPane(null);
        this.setBorder(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        logPanel = new javax.swing.JPanel();
        userField = new javax.swing.JTextField();
        pwdField = new javax.swing.JPasswordField();
        pwdLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        logButton = new javax.swing.JButton();
        signButton = new javax.swing.JButton();
        logBg = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1920, 960));

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logPanel.setBackground(new java.awt.Color(27, 27, 27));
        logPanel.setPreferredSize(new java.awt.Dimension(550, 400));
        logPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userField.setBackground(new java.awt.Color(0, 0, 0));
        userField.setFont(new java.awt.Font("Lora", 1, 14)); // NOI18N
        userField.setForeground(new java.awt.Color(204, 0, 0));
        userField.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 0, 0), java.awt.Color.red));
        logPanel.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 250, 40));

        pwdField.setBackground(new java.awt.Color(0, 0, 0));
        pwdField.setForeground(new java.awt.Color(204, 0, 0));
        pwdField.setToolTipText("");
        pwdField.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 0, 0), java.awt.Color.red));
        pwdField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pwdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdFieldActionPerformed(evt);
            }
        });
        logPanel.add(pwdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 250, 40));

        pwdLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\ChampionForge\\src\\icons\\login\\password.png")); // NOI18N
        logPanel.add(pwdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 290, 70));

        userLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\ChampionForge\\src\\icons\\login\\user.png")); // NOI18N
        logPanel.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 180, 80));

        logButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\ChampionForge\\src\\icons\\login\\logInButton.png")); // NOI18N
        logButton.setBorderPainted(false);
        logButton.setContentAreaFilled(false);
        logButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logButtonActionPerformed(evt);
            }
        });
        logPanel.add(logButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 210, 80));

        signButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\ChampionForge\\src\\icons\\login\\signUpButton.png")); // NOI18N
        signButton.setBorderPainted(false);
        signButton.setContentAreaFilled(false);
        signButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signButtonActionPerformed(evt);
            }
        });
        logPanel.add(signButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 210, 80));

        logBg.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\ChampionForge\\src\\icons\\login\\logPanel.jpg")); // NOI18N
        logBg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        logPanel.add(logBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 600));

        mainPanel.add(logPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 190, 550, 600));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\ChampionForge\\src\\icons\\login\\bg.jpg")); // NOI18N
        mainPanel.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 960));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signButtonActionPerformed

    private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logButtonActionPerformed

    private void pwdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel logBg;
    private javax.swing.JButton logButton;
    private javax.swing.JPanel logPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField pwdField;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JButton signButton;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}