/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Hospital.Princeton;

import static com.Hospital.Princeton.PatientLogin.s;
import static com.Hospital.Princeton.Services.Total;
import static com.Hospital.Princeton.Services.ser;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.joda.time.DateTime;

/**
 *
 * @author mittr
 */
public class Confirm extends javax.swing.JFrame {

    int id;
    String fn, ln, ag, wt, ht, bg, ad, gen, app, des, tim, dat1;
    int key=0;
    java.util.Date dat;
    /**
     * Creates new form Confirm
     */
    
    public Confirm() {
        super("Confirm your appointment");
        
      initComponents();  
      try {
      
            jButton1.setBackground(Color.yellow);
            Connect c = new Connect();
            PreparedStatement ps = c.con.prepareStatement("SELECT * FROM users WHERE username = '"+s+"';");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               id = rs.getInt(1);
               fn = rs.getString(2);
               ln = rs.getString(3);
               ag = rs.getString(13);
               wt = rs.getString(12);
               ht = rs.getString(15);
               bg = rs.getString(14);
               ad = rs.getString(7);
               gen = rs.getString(4);
               app = ser;
               
               
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Confirm.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        symptoms = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        time = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        symptoms.setColumns(20);
        symptoms.setRows(5);
        jScrollPane1.setViewportView(symptoms);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 810, 200));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Hospital/Princeton/back1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 40));

        jLabel3.setText("Please enter details about your symptom(s)   [500 WORDS MAX.]");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 770, -1));

        jCalendar1.setBorder(javax.swing.BorderFactory.createTitledBorder("Select an Appointment Date"));
        jCalendar1.setMaxSelectableDate(new java.util.Date(253370748712000L));
        jCalendar1.setMinSelectableDate(new java.util.Date(1467315112000L));
        jCalendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendar1PropertyChange(evt);
            }
        });
        getContentPane().add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09 - 10 AM", "10 - 11 AM", "11 - 12 Noon", "12 - 13 PM", "13 - 14 PM", "14 - 15 PM", "15 - 16 PM", "16 - 17 PM", "17 - 18 PM", "18 - 19PM", "19 - 20PM" }));
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 160, -1));

        jLabel4.setText("Preffered Appointment Time");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 294, 160, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Create Appointment Letter");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, 180, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 360, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Hospital/Princeton/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-530, -910, 1470, 1500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Services org = new Services();
        org.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar1PropertyChange
        
        
        dat = jCalendar1.getDate();     
        
        dat1 = new SimpleDateFormat("dd-MMM-yyyy").format(dat);
       
    }//GEN-LAST:event_jCalendar1PropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                 jLabel5.setText("Please Wait for a few seconds. Generating Invoice now...");
                try {                                         
                    
                    des = symptoms.getText();
                    tim = time.getSelectedItem().toString();
                    
                    
                    Connect c = new Connect();
                    PreparedStatement ps2 = c.con.prepareStatement("DELETE FROM appointments;");
                    PreparedStatement ps4 = c.con.prepareStatement("ALTER TABLE appointments AUTO_INCREMENT = 1;");
                    ps2.executeUpdate();
                    ps4.executeUpdate();
                    
                          
                } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Confirm.class.getName()).log(Level.SEVERE, null, ex);
        }
                    try {
                        Connect c1 = new Connect();
                        PreparedStatement ps = c1.con.prepareStatement("INSERT INTO appointments VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                        ps.setInt(1, id);
                        ps.setString(2, fn);
                        ps.setString(3, ln);
                        ps.setString(4, ag);
                        ps.setString(5, wt);
                        ps.setString(6, ht);
                        ps.setString(7, bg);
                        ps.setString(8, app);
                        ps.setInt(9, Total);
                        ps.setString(10, des);
                        ps.setString(11, dat1);
                        ps.setString(12, tim);
                        ps.setString(13, ad);
                        ps.setString(14, gen);
                        ps.setString(15, null);
                        ps.executeUpdate();
                        
                        
                        /*My right wrist got fractured on 17th March of this year. It has never been the same ever since. I bared with a cast for about a month after which it was decided to be taken off by the respective doctors.
                        It still hurts like hell when I try to turn it. Painkillers help but they can only shield me from the pain for so long. It isn't permanent of course.
                        */     
                    } catch (SQLException | ClassNotFoundException ex) {
                        Logger.getLogger(Confirm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    // delete and auto increment = 1
                    
                    try {
                        Connect c2 = new Connect();
                        /* PreparedStatement ps = c.con.prepareStatement("SELECT id2 FROM appointments WHERE id = "+id+";");
                        ResultSet rs = ps.executeQuery();
                        while(rs.next()){
                        key++;
                        }*/
                        JasperDesign jd = JRXmlLoader.load("C:\\Users\\mittr\\Documents\\NetBeansProjects\\Hospital Management\\src\\com\\Hospital\\Princeton\\Princeton.jrxml");
                        JRDesignQuery q = new JRDesignQuery();
                        String sql = "SELECT * FROM appointments WHERE ID = "+id+";";
                        q.setText(sql);
                        jd.setQuery(q);
                        JasperReport jr = JasperCompileManager.compileReport(jd);
                        JasperPrint jp = JasperFillManager.fillReport(jr, null, c2.con);
                        JasperViewer.viewReport(jp, false);
                        
                        
                        
                        
                        
                        
                    } catch (JRException | ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(Confirm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                    
                    
                    
                    
                    
                    
              
        // delete and auto increment = 1
        
                   // delete and auto increment = 1
                   
                   
                   
                   
              
             
          
             
             
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Confirm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea symptoms;
    private javax.swing.JComboBox<String> time;
    // End of variables declaration//GEN-END:variables
}
