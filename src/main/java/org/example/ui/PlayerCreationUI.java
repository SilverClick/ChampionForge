/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.example.ui;

/**
 *
 * @author PC-LORENZO
 */
public class PlayerCreationUI extends javax.swing.JInternalFrame {

    MainFrame frame;
    /**
     * Creates new form PlayersUI
     */
    public PlayerCreationUI(MainFrame frame) {
        this.frame = frame;
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

        mainPanel = new javax.swing.JPanel();
        logPanel = new javax.swing.JPanel();
        regionLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        pwdField = new javax.swing.JPasswordField();
        pwdLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        signButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTField = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        logBg = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        setBorder(null);

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logPanel.setBackground(new java.awt.Color(27, 27, 27));
        logPanel.setPreferredSize(new java.awt.Dimension(550, 400));
        logPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regionLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\ChampionForge\\src\\icons\\login\\region.png")); // NOI18N
        logPanel.add(regionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 280, 80));

        descriptionLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\ChampionForge\\src\\icons\\login\\description.png")); // NOI18N
        logPanel.add(descriptionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 400, 80));

        userField.setBackground(new java.awt.Color(0, 0, 0));
        userField.setFont(new java.awt.Font("Lora", 1, 14)); // NOI18N
        userField.setForeground(new java.awt.Color(255, 157, 0));
        userField.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 157, 0), new java.awt.Color(255, 157, 0)));
        logPanel.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 250, 40));

        pwdField.setBackground(new java.awt.Color(0, 0, 0));
        pwdField.setForeground(new java.awt.Color(255, 157, 0));
        pwdField.setToolTipText("");
        pwdField.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 157, 0), new java.awt.Color(255, 157, 0)));
        pwdField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pwdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdFieldActionPerformed(evt);
            }
        });
        logPanel.add(pwdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 250, 40));

        pwdLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\ChampionForge\\src\\icons\\login\\password.png")); // NOI18N
        logPanel.add(pwdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 350, 70));

        userLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\ChampionForge\\src\\icons\\login\\user.png")); // NOI18N
        logPanel.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 370, 80));

        signButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\ChampionForge\\src\\icons\\login\\signUpButton.png")); // NOI18N
        signButton.setBorderPainted(false);
        signButton.setContentAreaFilled(false);
        signButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signButtonActionPerformed(evt);
            }
        });
        logPanel.add(signButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 210, 80));

        descriptionTField.setBackground(new java.awt.Color(0, 0, 0));
        descriptionTField.setColumns(20);
        descriptionTField.setFont(new java.awt.Font("Lora", 1, 14)); // NOI18N
        descriptionTField.setForeground(new java.awt.Color(255, 157, 0));
        descriptionTField.setRows(5);
        descriptionTField.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 157, 0), new java.awt.Color(255, 157, 0)));
        jScrollPane1.setViewportView(descriptionTField);

        logPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 410, 320));

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setForeground(new java.awt.Color(255, 157, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 157, 0), new java.awt.Color(255, 157, 0)));
        logPanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 330, 50));

        logBg.setBackground(new java.awt.Color(0, 0, 0));
        logBg.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC-LORENZO\\Documents\\NetBeansProjects\\ChampionForge\\src\\icons\\login\\logPanel.jpg")); // NOI18N
        logBg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(6, 27, 42), new java.awt.Color(6, 27, 42), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        logPanel.add(logBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 700));

        mainPanel.add(logPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 100, 1250, 700));

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

    private void pwdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdFieldActionPerformed

    private void signButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionTField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logBg;
    private javax.swing.JPanel logPanel;
    private javax.swing.JPanel mainPanel;
    public javax.swing.JPasswordField pwdField;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JLabel regionLabel;
    private javax.swing.JButton signButton;
    public javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}