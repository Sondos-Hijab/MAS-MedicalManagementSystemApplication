/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.signup.databaseproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class secScreenAccountSettings extends javax.swing.JFrame {

    /**
     * Creates new form secScreenAccountSettings
     */
    public secScreenAccountSettings() {
        initComponents();
    }
    public String name, password,sec_ssn;
    public secScreenAccountSettings(String name, String password) {
       initComponents();
       newpassLabel.setVisible(false);
       oldpassLabel.setVisible(false);
       confirmLabel.setVisible(false);
       newpassText.setVisible(false);
       oldpassText.setVisible(false);
       confirmText.setVisible(false);
       CONFIRMPassButton.setVisible(false);
       this.name = name;
       this.password = password;
       usernameText.setText(this.name);
       
       String user1 = null,pass1 = null,EMAIL_ADDRESS = null,CONTACT_NUMBER=null,birthdate=null;
       try
       {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String usrString = "jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(usrString, "c##sondos", "123456");
            //Statement stmt = con.createStatement();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM employee where username=? AND password=?");
            stmt.setString(1, name);
            stmt.setString(2, password);
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                user1 = res.getString("username");
                pass1 = res.getString("password");
                EMAIL_ADDRESS = res.getString(6);
                CONTACT_NUMBER = res.getString(7);
                birthdate = res.getString(5);
            }
            if (name.equals(user1) && password.equals(pass1)) {
                birthDateText.setText(birthdate);
                contactNumText.setText(CONTACT_NUMBER);
                emailAddressText.setText(EMAIL_ADDRESS);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(FirstScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       ////////////////////////////////

       try {
            String usrString = "jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con;
            con = DriverManager.getConnection(usrString, "c##sondos", "123456");
            Statement stmtRead = con.createStatement();
            ResultSet s1 = stmtRead.executeQuery("Select ssn from employee where username = '"+this.name+"'");
            while(s1.next()){
                sec_ssn=s1.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(addTimeForm.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        doctorsButton = new javax.swing.JButton();
        appointmentsButton = new javax.swing.JButton();
        patientsButtton = new javax.swing.JButton();
        accountSettingsButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        birthDateText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        oldpassLabel = new javax.swing.JLabel();
        newpassLabel = new javax.swing.JLabel();
        confirmLabel = new javax.swing.JLabel();
        oldpassText = new javax.swing.JTextField();
        newpassText = new javax.swing.JTextField();
        confirmText = new javax.swing.JTextField();
        CONFIRMPassButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        contactNumText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        emailAddressText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(253, 250, 246));

        jPanel1.setBackground(new java.awt.Color(186, 232, 232));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\5138232 1.png")); // NOI18N

        doctorsButton.setBackground(new java.awt.Color(186, 232, 232));
        doctorsButton.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        doctorsButton.setText("Doctors");
        doctorsButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        doctorsButton.setBorderPainted(false);
        doctorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorsButtonActionPerformed(evt);
            }
        });

        appointmentsButton.setBackground(new java.awt.Color(186, 232, 232));
        appointmentsButton.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        appointmentsButton.setText("Appointements");
        appointmentsButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        appointmentsButton.setBorderPainted(false);
        appointmentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentsButtonActionPerformed(evt);
            }
        });

        patientsButtton.setBackground(new java.awt.Color(186, 232, 232));
        patientsButtton.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        patientsButtton.setText("Patients");
        patientsButtton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        patientsButtton.setBorderPainted(false);
        patientsButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsButttonActionPerformed(evt);
            }
        });

        accountSettingsButton.setBackground(new java.awt.Color(186, 232, 232));
        accountSettingsButton.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        accountSettingsButton.setText("Account Settings");
        accountSettingsButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        accountSettingsButton.setBorderPainted(false);
        accountSettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountSettingsButtonActionPerformed(evt);
            }
        });

        logOutButton.setBackground(new java.awt.Color(186, 232, 232));
        logOutButton.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        logOutButton.setText("Log out");
        logOutButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        logOutButton.setBorderPainted(false);
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(doctorsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(appointmentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientsButtton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountSettingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(doctorsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(appointmentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(patientsButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accountSettingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jButton6.setBackground(new java.awt.Color(253, 250, 246));
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\x-circle.png")); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Password");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Birthdate");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("Account Settings");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\padlock.png")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\schedule.png")); // NOI18N

        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });

        birthDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthDateTextActionPerformed(evt);
            }
        });

        jButton1.setText("Change Password");
        jButton1.setActionCommand("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(186, 232, 232));
        jButton2.setText("Save Changes");
        jButton2.setActionCommand("");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        oldpassLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        oldpassLabel.setText("Old Password");

        newpassLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        newpassLabel.setText("New Password");

        confirmLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        confirmLabel.setText("Confirm new Password");

        CONFIRMPassButton.setBackground(new java.awt.Color(186, 232, 232));
        CONFIRMPassButton.setText("Confirm Changing Password");
        CONFIRMPassButton.setBorder(null);
        CONFIRMPassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONFIRMPassButtonActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\man.png")); // NOI18N

        contactNumText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumTextActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Contact number");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Email address");

        emailAddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAddressTextActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\gmail.png")); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\phone.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(newpassLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(oldpassLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(confirmLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oldpassText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newpassText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(confirmText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CONFIRMPassButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                                        .addComponent(birthDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(123, 123, 123)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(usernameText)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(contactNumText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(emailAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6)
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(birthDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(contactNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(emailAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(oldpassLabel)
                    .addComponent(oldpassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(newpassLabel)
                    .addComponent(newpassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(confirmLabel)
                    .addComponent(confirmText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(CONFIRMPassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    private void birthDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthDateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthDateTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        newpassLabel.setVisible(true);
        oldpassLabel.setVisible(true);
        confirmLabel.setVisible(true);
        newpassText.setVisible(true);
        oldpassText.setVisible(true);
        confirmText.setVisible(true);
        CONFIRMPassButton.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String username = usernameText.getText();
        String birthdate = birthDateText.getText();
        String contactNum = contactNumText.getText();
        String emailAddress = emailAddressText.getText();
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String usrString = "jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(usrString, "c##sondos", "123456");
            con.setAutoCommit(false);
            Statement statement = con.createStatement();
            String sqlString = "UPDATE employee SET birth_date = '"+birthdate+"',username = '"+username+
            "',contact_number = "+contactNum+",email_address = '"+emailAddress+
            "' WHERE ssn = '"+ sec_ssn+"'";
            statement.executeUpdate(sqlString);
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(null, "Updated Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(editPatientForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CONFIRMPassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONFIRMPassButtonActionPerformed
        // TODO add your handling code here:
        String oldPass = oldpassText.getText();
        String newPass = newpassText.getText();
        String confirmPass = confirmText.getText();

        if(password.equals(oldPass) && newPass.equals(confirmPass)){
            try {
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                String usrString = "jdbc:oracle:thin:@localhost:1521:orcl";
                Connection con = DriverManager.getConnection(usrString, "c##sondos", "123456");
                con.setAutoCommit(false);
                Statement statement = con.createStatement();
                String sqlString = "UPDATE employee SET password = '"+newPass+ "' WHERE ssn = '"+sec_ssn+"'";
                statement.executeUpdate(sqlString);
                con.commit();
                con.close();
                JOptionPane.showMessageDialog(null, "Password Updated Successfully");
            } catch (SQLException ex) {
                Logger.getLogger(adminScreenAccountSettings.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else{
            JOptionPane.showMessageDialog(null, "Can't update your password, check your old password or the confirmation password");
        }

        /*} catch (SQLException ex) {
        Logger.getLogger(adminScreenAccountSettings.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_CONFIRMPassButtonActionPerformed

    private void contactNumTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumTextActionPerformed

    private void emailAddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailAddressTextActionPerformed

    private void doctorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorsButtonActionPerformed
        // TODO add your handling code here:
        secScreenDoctors screen = new secScreenDoctors(name, password);
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_doctorsButtonActionPerformed

    private void appointmentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentsButtonActionPerformed
        // TODO add your handling code here:
        secScreenAppointments screen = new secScreenAppointments(name, password);
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_appointmentsButtonActionPerformed

    private void patientsButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientsButttonActionPerformed
        // TODO add your handling code here:
        secScreenPatients screen = new secScreenPatients(name, password);
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_patientsButttonActionPerformed

    private void accountSettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountSettingsButtonActionPerformed
        // TODO add your handling code here:
        secScreenAccountSettings screen = new  secScreenAccountSettings(name, password);
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_accountSettingsButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        FirstScreen screen = new FirstScreen();
        screen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(secScreenAccountSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secScreenAccountSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secScreenAccountSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secScreenAccountSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secScreenAccountSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CONFIRMPassButton;
    private javax.swing.JButton accountSettingsButton;
    private javax.swing.JButton appointmentsButton;
    private javax.swing.JTextField birthDateText;
    private javax.swing.JLabel confirmLabel;
    private javax.swing.JTextField confirmText;
    private javax.swing.JTextField contactNumText;
    private javax.swing.JButton doctorsButton;
    private javax.swing.JTextField emailAddressText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel newpassLabel;
    private javax.swing.JTextField newpassText;
    private javax.swing.JLabel oldpassLabel;
    private javax.swing.JTextField oldpassText;
    private javax.swing.JButton patientsButtton;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}