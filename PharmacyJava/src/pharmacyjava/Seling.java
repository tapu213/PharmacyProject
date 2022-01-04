/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class Seling extends javax.swing.JFrame {

    Connection con;
    Statement st;
    ResultSet rs;

    /**
     * Creates new form Seling
     */
    public Seling() {
        initComponents();
        selectmed();
        ShowDate();
    }

    public void ShowDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        datelbl.setText(s.format(d));
    }

    public void selectmed() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb", "root", "nh123456");
            st = con.createStatement();
            rs = st.executeQuery("select * from medicinetb");
            medtable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        datelbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        medid = new javax.swing.JTextField();
        txtmed = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        medtable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnclear = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        datelbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        datelbl.setForeground(new java.awt.Color(204, 51, 0));
        datelbl.setText("Date");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("BILLID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setText("MEDICINE");

        medid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        medid.setForeground(new java.awt.Color(0, 153, 0));

        txtmed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtmed.setForeground(new java.awt.Color(0, 153, 0));

        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(102, 204, 0));
        btnadd.setText("ADD TO BILL");
        btnadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaddMouseClicked(evt);
            }
        });

        btnprint.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnprint.setForeground(new java.awt.Color(102, 204, 0));
        btnprint.setText("PRINT");
        btnprint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnprintMouseClicked(evt);
            }
        });

        medtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MEDNAME", "MEDPRICE", "QUANTITY", "FABDATE", "EXPDATE", "COMPANY"
            }
        ));
        medtable.setRowHeight(25);
        medtable.setSelectionBackground(new java.awt.Color(0, 153, 0));
        medtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medtable);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setText("BILL");

        jLabel13.setBackground(new java.awt.Color(0, 204, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 204, 0));
        jLabel13.setText("X");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnclear.setForeground(new java.awt.Color(102, 204, 0));
        btnclear.setText("CLEAR");
        btnclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclearMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 0));
        jLabel14.setText("BILLING");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 51, 0));
        jLabel15.setText("Seller");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 0));
        jLabel16.setText("MEDICINES LIST");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 0));
        jLabel7.setText("QTY");

        txtqty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtqty.setForeground(new java.awt.Color(0, 153, 0));

        txtarea.setColumns(20);
        txtarea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtarea.setRows(5);
        txtarea.setText("              ********************************************PharmaCenter*****************************************");
        jScrollPane2.setViewportView(txtarea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmed, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medid, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(btnprint)))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(211, 211, 211)
                        .addComponent(datelbl)
                        .addGap(145, 145, 145))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(494, 494, 494)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(btnadd)
                        .addGap(186, 186, 186)
                        .addComponent(btnclear))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(435, 435, 435)
                    .addComponent(jLabel14)
                    .addContainerGap(587, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(jLabel15)
                    .addContainerGap(953, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datelbl)
                    .addComponent(jLabel16))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(medid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtmed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnadd)
                            .addComponent(btnclear))
                        .addGap(22, 22, 22)))
                .addComponent(jLabel12)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnprint)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel14)
                    .addContainerGap(804, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(jLabel15)
                    .addContainerGap(752, Short.MAX_VALUE)))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("COMPANY");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MEDICINE");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AGENTS");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void update(){
    int newqty;
    newqty=oldqty-Integer.valueOf(txtqty.getText());
    try {
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","nh123456");
        PreparedStatement pst=con.prepareStatement("update medicinetb set medqty=? where medid=?");
           
        
          pst.setInt(1, newqty);
         
          pst.setInt(2, Integer.parseInt(medid.getText()));
          pst.executeUpdate();
          selectmed();
          //JOptionPane.showMessageDialog(this, "medicine updated successfully");
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    int i = 0, price,Medid,oldqty;
    private void btnaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddMouseClicked
      if(txtmed.getText().isEmpty()||txtqty.getText().isEmpty()){
          JOptionPane.showMessageDialog(this, "missing information");
      }
      else{
       i++;
       update();
        if (i == 1)
        {
            txtarea.setText(txtarea.getText() + "                       ********************************************PharmaCenter*****************************************\n  "
                    + "\t         ID     MEDICINE    QTY    PRICE    TOTAL\n\t"
                    + "  " + i + "         " + txtmed.getText() + "      " + txtqty.getText() + "      " + price + "         " + Integer.valueOf(txtqty.getText()) * price);

        } else
        {
            txtarea.setText(txtarea.getText() + i + "       " + txtmed.getText() + "      " + txtqty.getText() + "       " + price + "          " + Integer.valueOf(txtqty.getText()) * price);
        }
      }
       


    }//GEN-LAST:event_btnaddMouseClicked

    private void btnprintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprintMouseClicked
//        if(medid.getText().isEmpty()||medname.getText().isEmpty()||medprice.getText().isEmpty()||medqty.getText().isEmpty()){
//            JOptionPane.showMessageDialog(this, "missing information");
//        }
//        else{
//            try {
//                fdate=fabdate.getDate();
//                MyFabDate=new java.sql.Date(fdate.getTime());
//                edate=expdate.getDate();
//                MyExpDate=new java.sql.Date(edate.getTime());
//                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","nh123456");
//                PreparedStatement pst=con.prepareStatement("update medicinetb set medname=?,medprice=?,medqty=?,medfab=?,medexp=?,medcomp=? where medid=?");
//
//                pst.setString(1, medname.getText());
//                pst.setInt(2, Integer.parseInt(medprice.getText()));
//                pst.setInt(3, Integer.parseInt(medqty.getText()));
//                pst.setDate(4, MyFabDate);
//                pst.setDate(5, MyExpDate);
//                pst.setString(6, compcb.getSelectedItem().toString());
//                pst.setInt(7, Integer.parseInt(medid.getText()));
//                pst.executeUpdate();
//                selectmed();
//                JOptionPane.showMessageDialog(this, "medicine updated successfully");
//            } catch (Exception e) {
//            }
//
//        }
try {
            txtarea.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnprintMouseClicked

    private void medtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medtableMouseClicked
        DefaultTableModel model = (DefaultTableModel) medtable.getModel();
        int tabindex = medtable.getSelectedRow();
        txtmed.setText(model.getValueAt(tabindex, 1).toString());
        Medid=Integer.valueOf(model.getValueAt(tabindex, 0).toString());
//        medname.setText(model.getValueAt(tabindex, 1).toString());
        price = Integer.valueOf(model.getValueAt(tabindex, 2).toString());
//        medqty.setText(model.getValueAt(tabindex, 3).toString());
    }//GEN-LAST:event_medtableMouseClicked

    private void btnclearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclearMouseClicked
//        medid.setText("");
//        medname.setText("");
//        medprice.setText("");
//        medqty.setText("");
    }//GEN-LAST:event_btnclearMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
//        new Company().setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
//        new Agents().setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new Company().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Seling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnprint;
    private javax.swing.JLabel datelbl;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField medid;
    private javax.swing.JTable medtable;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtmed;
    private javax.swing.JTextField txtqty;
    // End of variables declaration//GEN-END:variables
}
