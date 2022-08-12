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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class adminScreenPatients extends javax.swing.JFrame {

    /**
     * Creates new form adminScreenPatients
     */
    public adminScreenPatients() {
        initComponents();
            try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String usrString = "jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(usrString, "c##sondos", "123456");
            Statement stmt = con.createStatement();
            ResultSet s1 = stmt.executeQuery("SELECT * FROM Patient");
            while(s1.next()){
            String SSN = s1.getString(1);
            String FNAME = s1.getString(2);
            String MINIT = s1.getString(3);
            String LNAME = s1.getString(4);
            String BIRTH_DATE = s1.getString(5);
            String CONTACT_NUMBER = s1.getString(6);
            String tbData [] = {SSN,FNAME,MINIT,LNAME,BIRTH_DATE,CONTACT_NUMBER};
            
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            tblModel.addRow(tbData);
        }  
        } catch (SQLException ex) {
            Logger.getLogger(adminScreenEmployees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String name;
    public String password;
    public adminScreenPatients(String name, String pass) {
        initComponents();
        this.name= name;
        this.password = pass;
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String usrString = "jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(usrString, "c##sondos", "123456");
            Statement stmt = con.createStatement();
            ResultSet s1 = stmt.executeQuery("SELECT * FROM Patient");
            while(s1.next()){
            String SSN = s1.getString(1);
            String FNAME = s1.getString(2);
            String MINIT = s1.getString(3);
            String LNAME = s1.getString(4);
            String BIRTH_DATE = s1.getString(5);
            String CONTACT_NUMBER = s1.getString(6);
            String tbData [] = {SSN,FNAME,MINIT,LNAME,BIRTH_DATE,CONTACT_NUMBER};
            
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
        dashboardJButton = new javax.swing.JButton();
        employeesJButton = new javax.swing.JButton();
        appointmensJBUtton = new javax.swing.JButton();
        patientsJButtton = new javax.swing.JButton();
        sectionsJButton = new javax.swing.JButton();
        accountSettingsJButton = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        showAllButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(253, 250, 246));

        jPanel1.setBackground(new java.awt.Color(186, 232, 232));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\admin.png")); // NOI18N

        dashboardJButton.setBackground(new java.awt.Color(186, 232, 232));
        dashboardJButton.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        dashboardJButton.setText("Dashboard");
        dashboardJButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dashboardJButton.setBorderPainted(false);
        dashboardJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardJButtonActionPerformed(evt);
            }
        });

        employeesJButton.setBackground(new java.awt.Color(186, 232, 232));
        employeesJButton.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        employeesJButton.setText("Employees");
        employeesJButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        employeesJButton.setBorderPainted(false);
        employeesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesJButtonActionPerformed(evt);
            }
        });

        appointmensJBUtton.setBackground(new java.awt.Color(186, 232, 232));
        appointmensJBUtton.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        appointmensJBUtton.setText("Appointements");
        appointmensJBUtton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        appointmensJBUtton.setBorderPainted(false);
        appointmensJBUtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmensJBUttonActionPerformed(evt);
            }
        });

        patientsJButtton.setBackground(new java.awt.Color(186, 232, 232));
        patientsJButtton.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        patientsJButtton.setText("Patients");
        patientsJButtton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        patientsJButtton.setBorderPainted(false);
        patientsJButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsJButttonActionPerformed(evt);
            }
        });

        sectionsJButton.setBackground(new java.awt.Color(186, 232, 232));
        sectionsJButton.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        sectionsJButton.setText("Sections");
        sectionsJButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sectionsJButton.setBorderPainted(false);
        sectionsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionsJButtonActionPerformed(evt);
            }
        });

        accountSettingsJButton.setBackground(new java.awt.Color(186, 232, 232));
        accountSettingsJButton.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        accountSettingsJButton.setText("Account Settings");
        accountSettingsJButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        accountSettingsJButton.setBorderPainted(false);
        accountSettingsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountSettingsJButtonActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(186, 232, 232));
        jButton7.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jButton7.setText("Log out");
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employeesJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(appointmensJBUtton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientsJButtton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sectionsJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountSettingsJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(dashboardJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(employeesJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(appointmensJBUtton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(patientsJButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sectionsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accountSettingsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jTable1.setBackground(new java.awt.Color(253, 250, 246));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SSN", "FNAME", "MINIT", "LNAME", "BIRTH_DATE", "CONTACT_NUMBER"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        searchButton.setBackground(new java.awt.Color(253, 250, 246));
        searchButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\search 1.png")); // NOI18N
        searchButton.setBorder(null);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(185, 131, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\trash.png")); // NOI18N
        jButton2.setText("Delete Patient");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 230, 82));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\plus.png")); // NOI18N
        jButton3.setText("Add Patient");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(180, 254, 152));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\editing.png")); // NOI18N
        jButton4.setText("Edit Info");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(253, 250, 246));
        backButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Y3S1\\Database\\dataBaseProject\\back 1.png")); // NOI18N
        backButton.setBorder(null);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(backButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        deletePatientForm screen = new deletePatientForm();
        screen.setVisible(true);
        /*String usrString = "jdbc:oracle:thin:@localhost:1521:orcl";
        Connection con;
        try {
        con = DriverManager.getConnection(usrString, "c##sondos", "123456");
        con.setAutoCommit(false);
        String s1= "DELETE FROM patient where ssn= '"+ssnText.getText();
        Statement stmt = con.createStatement();
        stmt.executeUpdate(s1);
        con.commit();
        con.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(adminScreenPatients.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        addPatientForm screen = new addPatientForm();
        screen.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        editPatientForm screen = new editPatientForm();
        screen.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        administratorScreen s = new administratorScreen();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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
            ResultSet s1 = stmt.executeQuery("SELECT * FROM patient");
           while(s1.next()){
            String SSN = s1.getString(1);
            String FNAME = s1.getString(2);
            String MINIT = s1.getString(3);
            String LNAME = s1.getString(4);
            String BIRTH_DATE = s1.getString(5);
            String CONTACT_NUMBER = s1.getString(6);
            String tbData [] = {SSN,FNAME,MINIT,LNAME,BIRTH_DATE,CONTACT_NUMBER};
            
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            tblModel.addRow(tbData);
        }  
        } catch (SQLException ex) {
            Logger.getLogger(adminScreenEmployees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showAllButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        try {
            String st = "SELECT * " +"FROM patient " + "WHERE '"+searchText.getText()+ "' IN (SSN,FNAME,MINIT,LNAME)";
            String selectSQL = "SELECT * FROM patient WHERE contact_number = ?";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String usrString = "jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(usrString, "c##sondos", "123456");
            PreparedStatement stmt = con.prepareStatement(selectSQL);
            stmt.setString(1, searchText.getText());
            //ResultSet s1 = stmt.executeQuery();
            Statement stt= con.createStatement();
            ResultSet s1 = stt.executeQuery(st);
            DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
            int rowCount = dm.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                dm.removeRow(i);
            }
            while(s1.next()){
            String SSN = s1.getString(1);
            String FNAME = s1.getString(2);
            String MINIT = s1.getString(3);
            String LNAME = s1.getString(4);
            String BIRTH_DATE = s1.getString(5);
            String CONTACT_NUMBER = s1.getString(6);
            String tbData [] = {SSN,FNAME,MINIT,LNAME,BIRTH_DATE,CONTACT_NUMBER};
            
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            tblModel.addRow(tbData);
        }  
            
            
        } catch (SQLException ex) {
            Logger.getLogger(adminScreenSections.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void dashboardJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardJButtonActionPerformed
        // TODO add your handling code here:
        administratorScreen screen = new administratorScreen(name, password);
        screen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashboardJButtonActionPerformed

    private void employeesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesJButtonActionPerformed
        // TODO add your handling code here:
        adminScreenEmployees screen = new adminScreenEmployees(name, password);
        screen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_employeesJButtonActionPerformed

    private void appointmensJBUttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmensJBUttonActionPerformed
        // TODO add your handling code here:
        adminScreenAppointments screen = new adminScreenAppointments(name,password);
        screen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_appointmensJBUttonActionPerformed

    private void patientsJButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientsJButttonActionPerformed
        // TODO add your handling code here:
        adminScreenPatients screen = new adminScreenPatients(name, password);
        screen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_patientsJButttonActionPerformed

    private void sectionsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionsJButtonActionPerformed
        // TODO add your handling code here:
        adminScreenSections screen = new adminScreenSections(name, password);
        screen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sectionsJButtonActionPerformed

    private void accountSettingsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountSettingsJButtonActionPerformed
        // TODO add your handling code here:
        adminScreenAccountSettings screen = new adminScreenAccountSettings(name,password);
        screen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_accountSettingsJButtonActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        FirstScreen screen = new FirstScreen();
        screen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(adminScreenPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminScreenPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminScreenPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminScreenPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminScreenPatients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountSettingsJButton;
    private javax.swing.JButton appointmensJBUtton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton dashboardJButton;
    private javax.swing.JButton employeesJButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton patientsJButtton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JButton sectionsJButton;
    private javax.swing.JButton showAllButton;
    // End of variables declaration//GEN-END:variables
}