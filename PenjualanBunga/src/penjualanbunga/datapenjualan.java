/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualanbunga;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sby
 */
public class datapenjualan extends javax.swing.JFrame {
    String a = "Anggrek", s = "Sedap Malam", m = "Mawar";
    String simpan="";

    /**
     * Creates new form datapenjualan
     */
    public datapenjualan() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jenisbunga = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        jumlah = new javax.swing.JLabel();
        jml = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        diskon = new javax.swing.JTextField();
        kirim = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        biayakirim = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        satu = new javax.swing.JRadioButton();
        dua = new javax.swing.JRadioButton();
        tiga = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        total_bayar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        str = new javax.swing.JLabel();
        stru = new java.awt.ScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("APLIKASI PENJUALAN BUNGA");

        jLabel2.setText("Nama Bunga ");

        jenisbunga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anggrek", "Sedap Malam", "Mawar" }));
        jenisbunga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisbungaActionPerformed(evt);
            }
        });

        jLabel3.setText("Harga");

        jumlah.setText("Jumlah Beli");

        jml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlActionPerformed(evt);
            }
        });

        jLabel5.setText("Diskon");

        kirim.setText("Kirim");
        kirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kirimActionPerformed(evt);
            }
        });

        jLabel6.setText("Biaya Kirim");

        biayakirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biayakirimActionPerformed(evt);
            }
        });

        jLabel7.setText("Jarak");

        satu.setText("<5km");
        satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });

        dua.setText("5-15km");
        dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaActionPerformed(evt);
            }
        });

        tiga.setText(">15km");
        tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaActionPerformed(evt);
            }
        });

        jLabel8.setText("TOTAL BAYAR");

        total_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_bayarActionPerformed(evt);
            }
        });

        jButton1.setText("PRINT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        str.setText("Struk");

        stru.setBackground(new java.awt.Color(255, 255, 255));
        stru.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jumlah)
                                    .addComponent(jLabel5))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jenisbunga, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(harga)
                                    .addComponent(jml)
                                    .addComponent(diskon)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kirim)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(biayakirim, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(satu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tiga)))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(str, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stru, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(47, 47, 47)
                        .addComponent(total_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jenisbunga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jumlah)
                            .addComponent(jml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(diskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kirim)
                            .addComponent(jLabel6)
                            .addComponent(biayakirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(satu)
                                .addComponent(dua)
                                .addComponent(tiga)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(str, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(stru, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlActionPerformed
        // TODO add your handling code here:
       String h1=harga.getText();
        int jml = Integer.parseInt(jumlah.getText());
        if (jml >= 10){
            int har= Integer.parseInt(harga.getText());
            int tbayar = har * jml;
            int tot = (int)(0.1 * tbayar);
            int total = tbayar - tot;
            diskon.setText("" + tot);
            total_bayar.setText("" + total);
        }else {
            diskon.setText("0");
            int har = Integer.parseInt(harga.getText());
            int tbayar = har * jml;
            total_bayar.setText("" + tbayar);
        }
    }//GEN-LAST:event_jmlActionPerformed

    private void kirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kirimActionPerformed
        // TODO add your handling code here:
        if (kirim.isSelected()){
            biayakirim.setText("0");
        }else{
            biayakirim.setText("0");
        }
    }//GEN-LAST:event_kirimActionPerformed

    private void biayakirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biayakirimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biayakirimActionPerformed

    private void tigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigaActionPerformed
        // TODO add your handling code here:
        if (tiga.isSelected()&& kirim.isSelected()){
            biayakirim.setText("20.000");
        }
        int kirim = Integer.parseInt(biayakirim.getText());
        int tbayar = Integer.parseInt(total_bayar.getText());
        
        int hasil = kirim + tbayar;
        total_bayar.setText("" + hasil);
    }//GEN-LAST:event_tigaActionPerformed

    private void jenisbungaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisbungaActionPerformed
        // TODO add your handling code here:
        if (jenisbunga.getSelectedItem()== "Anggrek"){
            harga.setText("100.000");
            simpan = a;
        }
        if (jenisbunga.getSelectedItem()== "Sedap Malam"){
            harga.setText("50.000");
            simpan = s;
        }
        if (jenisbunga.getSelectedItem()== "Mawar"){
            harga.setText("15.000");
            simpan = m;
        }
    }//GEN-LAST:event_jenisbungaActionPerformed

    private void satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuActionPerformed
        // TODO add your handling code here:
        if (satu.isSelected() && kirim.isSelected()){
            biayakirim.setText("0");
        }
    }//GEN-LAST:event_satuActionPerformed

    private void duaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaActionPerformed
        // TODO add your handling code here:
        if (dua.isSelected() && kirim.isSelected()){
            biayakirim.setText("10.000");
        }
        int kirim = Integer.parseInt(biayakirim.getText());
        int tbayar = Integer.parseInt(total_bayar.getText());
        
        int hasil = kirim + tbayar;
        total_bayar.setText("" + hasil);
    }//GEN-LAST:event_duaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /*if(tgl_tran.getDate()!=null){
            SimpleDateFormat format = new
                SimpleDateFormat("yyyy-MM-dd");
            tgl = format.format(tgl_tran.getDate());
        }*/
        String tgl="";
        //Date tgl = new Date();
        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
        String tanggal = format.format(tgl);
        
        String jml = jumlah.getText();
        String har = harga.getText();
        String tbayar = total_bayar.getText();
        String disk = diskon.getText();
        
        str.setText("*** Toko Buka Freak Programmer ***\n\n" + 
                "Tanggal Transaksi = " + tanggal + "\n" +
                "Jenis Bunga       = " + simpan + "\n" +
                "Harga Satuan      = " + jml + "Tangkai\n" +
                "Diskon            = " + diskon + "\n" +
                "Total Bayar       = " + tbayar + "\n\n" +
                "*** Terima Kasih ***");
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void total_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_bayarActionPerformed
        // TODO add your handling code here:
        String h1=harga.getText();
        int jml = Integer.parseInt(jumlah.getText());
        if (jml >= 10){
            int har= Integer.parseInt(harga.getText());
            int tbayar = har * jml;
            int tot = (int)(0.1 * tbayar);
            int total = tbayar - tot;
            diskon.setText("" + tot);
            total_bayar.setText("" + total);
        }else {
            diskon.setText("0");
            int har = Integer.parseInt(harga.getText());
            int tbayar = har * jml;
            total_bayar.setText("" + tbayar);
        
    }//GEN-LAST:event_total_bayarActionPerformed

    /**
     * @param args the command line arguments
     */

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
            java.util.logging.Logger.getLogger(datapenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datapenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datapenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datapenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datapenjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField biayakirim;
    private javax.swing.JTextField diskon;
    private javax.swing.JRadioButton dua;
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> jenisbunga;
    private javax.swing.JTextField jml;
    private javax.swing.JLabel jumlah;
    private javax.swing.JCheckBox kirim;
    private javax.swing.JRadioButton satu;
    private javax.swing.JLabel str;
    private java.awt.ScrollPane stru;
    private javax.swing.JRadioButton tiga;
    private javax.swing.JTextField total_bayar;
    // End of variables declaration//GEN-END:variables
}
