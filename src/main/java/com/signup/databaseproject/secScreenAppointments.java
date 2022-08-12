/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.signup.databaseproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class secScreenAppointments extends javax.swing.JFrame {

    /**
     * Creates new form secScreenAppointments
     */
    public String name, password,sec_ssn;
    public secScreenAppointments() {
        initComponents();
    }
    
    public secScreenAppointments(String name, String password) {
        initComponents();
        this.name=name;
        this.password=password;
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
         try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String usrString = "jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(usrString, "c##sondos", "123456");
            Statement stmt = con.createStatement();
            ResultSet s1 = stmt.executeQuery("SELECT distinct appointment.* FROM appointment,employee where employee.ssn=appointment.secretary_ssn and employee.ssn = '"+sec_ssn+"'");
            while(s1.next()){
            String APPOINTMENT_ID = s1.getString(1);
            String TIME_ID = s1.getString(2);
            String APPOINTMENT_DATE = s1.getString(3);
            String DOCTOR_SSN = s1.getString(4);
            String PATIENT_SSN = s1.getString(5);
            String SECRETARY_SSN = s1.getString(6);
            String tbData [] = {APPOINTMENT_ID,TIME_ID,APPOINTMENT_DATE,DOCTOR_SSN,PATIENT_SSN,SECRETARY_SSN};
            
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            tblModel.addRow(tbData);
        }  
        } catch (SQLException ex) {
            Logger.getLogger(adminScreenEmployees.class.getName()).log(Level.SEVERE, null, ex);
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
        jButton7 = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        showAllButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton7.setBackground(new java.awt.Color(253, 250, 246));
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\x-circle.png")); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(253, 250, 246));
        searchButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\search 1.png")); // NOI18N
        searchButton.setBorder(null);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        showAllButton.setBackground(new java.awt.Color(186, 232, 232));
        showAllButton.setText("Show all");
        showAllButton.setBorder(null);
        showAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllButtonActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(253, 250, 246));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "APPOINTMENT_ID", "TIME_ID", "APPOINTMENT_DATE", "DOCTOR_SSN", "PATIENT_SSN", "SECRETARY_SSN"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton3.setBackground(new java.awt.Color(255, 230, 82));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\plus.png")); // NOI18N
        jButton3.setText("Add Appointment");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(180, 254, 152));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\editing.png")); // NOI18N
        jButton4.setText("Edit Appointment");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(185, 131, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\trash.png")); // NOI18N
        jButton2.setText("Delete Appintment");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(showAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 149, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        try {
            String st = "SELECT appointment.* FROM employee , appointment WHERE '"+searchText.getText()+ "' IN (APPOINTMENT.APPOINTMENT_ID,APPOINTMENT.TIME_ID,APPOINTMENT.DOCTOR_SSN,APPOINTMENT.PATIENT_SSN,APPOINTMENT.SECRETARY_SSN)  and employee.ssn=appointment.secretary_ssn and employee.ssn ='"+sec_ssn+"'";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String usrString = "jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(usrString, "c##sondos", "123456");
            Statement stt= con.createStatement();
            ResultSet s1 = stt.executeQuery(st);
            DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
            int rowCount = dm.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                dm.removeRow(i);
            }
            while(s1.next()){
                String APPOINTMENT_ID = s1.getString(1);
                String TIME_ID = s1.getString(2);
                String APPOINTMENT_DATE = s1.getString(3);
                String DOCTOR_SSN = s1.getString(4);
                String PATIENT_SSN = s1.getString(5);
                String SECRETARY_SSN = s1.getString(6);
                String tbData [] = {APPOINTMENT_ID,TIME_ID,APPOINTMENT_DATE,DOCTOR_SSN,PATIENT_SSN,SECRETARY_SSN};

                DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                tblModel.addRow(tbData);
            }

        } catch (SQLException ex) {
            Logger.getLogger(adminScreenSections.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void showAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String usrString = "jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(usrString, "c##sondos", "123456");
            Statement stmt = con.createStatement();
            ResultSet s1 = stmt.executeQuery("SELECT distinct appointment.* FROM appointment,employee where employee.ssn=appointment.secretary_ssn and employee.ssn = '"+sec_ssn+"'");
            while(s1.next()){
                String APPOINTMENT_ID = s1.getString(1);
                String TIME_ID = s1.getString(2);
                String APPOINTMENT_DATE = s1.getString(3);
                String DOCTOR_SSN = s1.getString(4);
                String PATIENT_SSN = s1.getString(5);
                String SECRETARY_SSN = s1.getString(6);
                String tbData [] = {APPOINTMENT_ID,TIME_ID,APPOINTMENT_DATE,DOCTOR_SSN,PATIENT_SSN,SECRETARY_SSN};

                DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
                tblModel.addRow(tbData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(adminScreenEmployees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showAllButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        addAppointmentSecForm screen = new addAppointmentSecForm(name, password);
        screen.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        editAppointmentSecForm s = new editAppointmentSecForm(name, password);
        s.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        deleteAppointmentSecForm screen = new deleteAppointmentSecForm(name, password);
        screen.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(secScreenAppointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secScreenAppointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secScreenAppointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secScreenAppointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secScreenAppointments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountSettingsButton;
    private javax.swing.JButton appointmentsButton;
    private javax.swing.JButton doctorsButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton patientsButtton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JButton showAllButton;
    // End of variables declaration//GEN-END:variables
}
