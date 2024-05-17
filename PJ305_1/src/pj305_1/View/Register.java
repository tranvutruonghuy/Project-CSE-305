/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pj305_1.View;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Register extends javax.swing.JFrame {

   
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
        ScaleImage();
    }
    
    public void ScaleImage() {
        ImageIcon icon = new ImageIcon("PJ305_1//src//Images//Bus1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(imageBus.getWidth(), imageBus.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        imageBus.setIcon(scaledIcon);
        //
//        ImageIcon icon1 = new ImageIcon("PJ305_1//src//Images//hide.png");
//        Image img1 = icon1.getImage();
//        Image imgScale1 = img1.getScaledInstance(hiddenButton.getWidth(), hiddenButton.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
//        hiddenButton.setIcon(scaledIcon1);
        // 

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        registerLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        passwordTF = new javax.swing.JTextField();
        firstNameTF2 = new javax.swing.JTextField();
        passwordLB = new javax.swing.JLabel();
        lastNameTF2 = new javax.swing.JTextField();
        passwordLB1 = new javax.swing.JLabel();
        passwordTF1 = new javax.swing.JTextField();
        imageBus = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setMaximumSize(new java.awt.Dimension(800, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(0, 102, 102));
        registerLabel.setText("Register");
        bg.add(registerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 6, -1, -1));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLabel.setText("Fisrt name");
        bg.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 390, -1));

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userNameLabel.setText("User name");
        bg.add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 390, -1));

        passwordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTFActionPerformed(evt);
            }
        });
        bg.add(passwordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 365, 45));

        firstNameTF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTF2ActionPerformed(evt);
            }
        });
        bg.add(firstNameTF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 365, 45));

        passwordLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLB.setText("Password");
        bg.add(passwordLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 73, -1));

        lastNameTF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTF2ActionPerformed(evt);
            }
        });
        bg.add(lastNameTF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 365, 45));

        passwordLB1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLB1.setText("Confirm password");
        bg.add(passwordLB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        passwordTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTF1ActionPerformed(evt);
            }
        });
        bg.add(passwordTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 365, 45));

        imageBus.setPreferredSize(new java.awt.Dimension(376, 604));
        bg.add(imageBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        registerButton.setBackground(new java.awt.Color(0, 102, 102));
        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        bg.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 100, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Return to Login");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, -1, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTFActionPerformed

    private void firstNameTF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTF2ActionPerformed

    private void lastNameTF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTF2ActionPerformed

    private void passwordTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTF1ActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel1MousePressed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JTextField firstNameTF2;
    private javax.swing.JLabel imageBus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lastNameTF2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel passwordLB;
    private javax.swing.JLabel passwordLB1;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JTextField passwordTF1;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
