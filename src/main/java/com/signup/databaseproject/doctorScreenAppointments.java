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
public class doctorScreenAppointments extends javax.swing.JFrame {

    /**
     * Creates new form doctorScreenAppointments
     */
    public doctorScreenAppointments() {
        initComponents();
    }
    String name, password;
    //"SELECT distinct appointment.* FROM appointment,employee where employee.ssn=appointment.doctor_ssn and employee.username = '"+name+"'"
    public doctorScreenAppointments(String name, String password) {
        initComponents();
        this.name=name;
        this.password=password;
         try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String usrString = "jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(usrString, "c##sondos", "123456");
            Statement stmt = con.createStatement();
            ResultSet s1 = stmt.executeQuery("SELECT distinct appointment.* FROM appointment,employee where employee.ssn=appointment.doctor_ssn and employee.username = '"+name+"'");
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
        patients = new javax.swing.JButton();
        times = new javax.swing.JButton();
        appointments = new javax.swing.JButton();
        accountSettings = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        showAllButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(253, 250, 246));

        jPanel1.setBackground(new java.awt.Color(186, 232, 232));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\doctorimage.png")); // NOI18N

        patients.setBackground(new java.awt.Color(186, 232, 232));
        patients.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        patients.setText("Patients");
        patients.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        patients.setBorderPainted(false);
        patients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsActionPerformed(evt);
            }
        });

        times.setBackground(new java.awt.Color(186, 232, 232));
        times.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        times.setText("Available Times");
        times.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        times.setBorderPainted(false);
        times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesActionPerformed(evt);
            }
        });

        appointments.setBackground(new java.awt.Color(186, 232, 232));
        appointments.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        appointments.setText("Appointments");
        appointments.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        appointments.setBorderPainted(false);
        appointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentsActionPerformed(evt);
            }
        });

        accountSettings.setBackground(new java.awt.Color(186, 232, 232));
        accountSettings.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        accountSettings.setText("Account Settings");
        accountSettings.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        accountSettings.setBorderPainted(false);
        accountSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountSettingsActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(186, 232, 232));
        jButton9.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jButton9.setText("Log out");
        jButton9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton9.setBorderPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(times, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(appointments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(accountSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(patients, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(times, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(appointments, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(showAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            String st = "SELECT appointment.* FROM employee , appointment WHERE '"+searchText.getText()+ "' IN (APPOINTMENT.APPOINTMENT_ID,APPOINTMENT.TIME_ID,APPOINTMENT.DOCTOR_SSN,APPOINTMENT.PATIENT_SSN,APPOINTMENT.SECRETARY_SSN)  and employee.ssn=appointment.doctor_ssn and employee.username ='"+name+"'";
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
            ResultSet s1 = stmt.executeQuery("SELECT distinct appointment.* FROM appointment,employee where employee.ssn=appointment.doctor_ssn and employee.username = '"+name+"'");
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

    private void patientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientsActionPerformed
        // TODO add your handling code here:
        doctorScreenPatients newscreen = new doctorScreenPatients(name,  password);
        newscreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_patientsActionPerformed

    private void timesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesActionPerformed
        // TODO add your handling code here:
        doctorScreenTimes screen= new doctorScreenTimes(name,password);
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_timesActionPerformed

    private void appointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentsActionPerformed
        // TODO add your handling code here:
        doctorScreenAppointments screen= new doctorScreenAppointments(name,password);
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_appointmentsActionPerformed

    private void accountSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountSettingsActionPerformed
        // TODO add your handling code here:
        doctorScreenAcccountSettings screen = new doctorScreenAcccountSettings(name,password);
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_accountSettingsActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        FirstScreen screen = new FirstScreen();
        screen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(doctorScreenAppointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctorScreenAppointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctorScreenAppointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctorScreenAppointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctorScreenAppointments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountSettings;
    private javax.swing.JButton appointments;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton patients;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JButton showAllButton;
    private javax.swing.JButton times;
    // End of variables declaration//GEN-END:variables
}
