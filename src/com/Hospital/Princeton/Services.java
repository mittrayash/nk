/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Hospital.Princeton;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author mittr
 */
public class Services extends javax.swing.JFrame {
private static int roww = -1;
    public static String ser;
    private String pri;
    private int row;
    public static int Total = 0;
    /**
     * Creates new form Services11
     */
    public Services() {
        super("List of Services Provided");
        initComponents();
        jButton1.setBackground(Color.yellow);
        
        jButton2.setBackground(Color.yellow);
        
        
        
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Hospital/Princeton/logo.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, 60));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service", "Appointment Cost ($)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 470, 450));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cancer Center", "80"},
                {"Dentistry ", "70"},
                {"Dermatology", "60"},
                {"Diabetes", "60"},
                {"Epilepsy Center", "50"},
                {"Eye Center", "70"},
                {"Food and Nutritionist", "40"},
                {"Gynecologist", "60"},
                {"Hand therapy", "50"},
                {"Heart and Vascular Center", "70"},
                {"LASIK Center", "70"},
                {"Massage Therapy", "60"},
                {"Nephrology", "70"},
                {"Neurology Center", "80"},
                {"Rehabilitation Center", "80"},
                {"Pediatric Cardiologist", "60"},
                {"Pediatrictian", "50"},
                {"Respiratory Care Center", "60"},
                {"Reproductive Care Center", "70"},
                {"Skin Care Center", "50"},
                {"Sleep Care Center", "60"},
                {"Spine Therapy", "50"},
                {"Surgical Services", "80"},
                {"Transplant Center", "100"},
                {"Urology ", "100"},
                {"Weight Management Center", "70"}
            },
            new String [] {
                "Service", "Appointment Cost ($)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setEditingColumn(0);
        jTable1.setEditingRow(0);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 450));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Hospital/Princeton/back1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 40));

        jButton1.setText("Add to Your Appointments");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 210, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("Proceed");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 330, 120, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 0));
        jLabel3.setText("Your Appointments");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 320, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 0));
        jLabel4.setText("Services Provided");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 290, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setText("Total       $");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 610, 170, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 610, 130, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Note: It is highly recommended that you only add 1 appointment to Your Appointments.");
        jLabel8.setToolTipText("If you want multiple appointments on the same date, please go to Services again and follow the procedure again.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, -1));

        jButton3.setText("Remove from Your Appointments");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 210, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Hospital/Princeton/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-700, -260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private int click = 0;
private void add(){
    roww = jTable1.getSelectedRow();
     if(click==0){
            if(roww == -1){
                
            }
            else {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(new Object[] {ser, pri});
     
            Total += Integer.parseInt(pri);
           
        jLabel6.setText(String.valueOf(Total));
        click++;
        }}
        else{
            if(roww == -1){
                
            }
            else{
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(new Object[] {ser, pri});
   int sap =  Integer.parseInt((String) model.getValueAt(0, 1));
  
         model.removeRow(0);
         Total -= sap;
    
            Total += Integer.parseInt(pri);
           
        jLabel6.setText(String.valueOf(Total));
        click++;
        }}
        
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       add();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Patient org = new Patient();
       org.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
        roww = jTable1.getSelectedRow();
         if(roww!=-1){
       
             ser = (String) jTable1.getModel().getValueAt(roww, 0);
        pri =  (String) (jTable1.getModel().getValueAt(roww, 1));
         }
         else {
         }
    }//GEN-LAST:event_jTable1MouseClicked
    
   /* private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        Confirm obj = new Confirm();
        obj.setVisible(true);
        this.dispose();
        
    } */                                   

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Confirm obj = new Confirm();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void remove(){
         
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int rw = jTable2.getSelectedRow();
     
       
         
        String spa =  (String) (jTable2.getModel().getValueAt(rw, 1));
       Total -= Integer.parseInt(spa);
      
      jLabel6.setText(String.valueOf(Total));
         model.removeRow(jTable2.getSelectedRow());
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
       remove();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        roww = jTable1.getSelectedRow();
         if(roww!=-1){
       
             ser = (String) jTable1.getModel().getValueAt(roww, 0);
        pri =  (String) (jTable1.getModel().getValueAt(roww, 1));
         }
         else {
         }
    }//GEN-LAST:event_jTable1PropertyChange

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
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Services().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
