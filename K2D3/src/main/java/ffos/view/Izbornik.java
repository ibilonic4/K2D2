/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.view;

import ffos.controller.ObradaVlasnik;
import ffos.model.Vlasnik;

/**
 *
 * @author Ana-Marija
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
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

        btnPrvi = new javax.swing.JButton();
        btnDrugi = new javax.swing.JButton();
        btnTreci = new javax.swing.JButton();
        btnCetvrti = new javax.swing.JButton();
        btnPeti = new javax.swing.JButton();
        btnSesti = new javax.swing.JButton();
        btnSedmi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPrvi.setText("3.1.");
        btnPrvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrviActionPerformed(evt);
            }
        });

        btnDrugi.setText("3.2.");
        btnDrugi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrugiActionPerformed(evt);
            }
        });

        btnTreci.setText("3.3.");
        btnTreci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreciActionPerformed(evt);
            }
        });

        btnCetvrti.setText("3.4.");
        btnCetvrti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetvrtiActionPerformed(evt);
            }
        });

        btnPeti.setText("3.5.");

        btnSesti.setText("3.6.");

        btnSedmi.setText("3.7.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTreci)
                    .addComponent(btnPrvi)
                    .addComponent(btnCetvrti)
                    .addComponent(btnDrugi))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSesti)
                    .addComponent(btnSedmi)
                    .addComponent(btnPeti))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPeti)
                    .addComponent(btnPrvi))
                .addGap(18, 18, 18)
                .addComponent(btnDrugi)
                .addGap(1, 1, 1)
                .addComponent(btnSesti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTreci)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnSedmi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnCetvrti)))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrviActionPerformed
new FormaVlasnik().setVisible(true);     }//GEN-LAST:event_btnPrviActionPerformed

    private void btnDrugiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrugiActionPerformed
new FormaJastuk().setVisible(true);     }//GEN-LAST:event_btnDrugiActionPerformed

    private void btnTreciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreciActionPerformed
        
        ObradaVlasnik ov = new ObradaVlasnik();
        int i = 0;
        
        while(i < 20){
        ov.SetData("ivan", "prezime"+i);
        try{
            ov.create();
            ov.setEntitet(null);}
        catch (Exception e){System.out.println("greška");}
        i++;
        }
        
    }//GEN-LAST:event_btnTreciActionPerformed

    private void btnCetvrtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetvrtiActionPerformed
ObradaVlasnik ov = new ObradaVlasnik();
for (Vlasnik v : ov.read()){
    ov.setEntitet(v);
ov.getEntitet().setIme("DEJAN");

try{ov.update();}catch(Exception e){System.out.println("grešlka");}
}
    
    
    
    }//GEN-LAST:event_btnCetvrtiActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetvrti;
    private javax.swing.JButton btnDrugi;
    private javax.swing.JButton btnPeti;
    private javax.swing.JButton btnPrvi;
    private javax.swing.JButton btnSedmi;
    private javax.swing.JButton btnSesti;
    private javax.swing.JButton btnTreci;
    // End of variables declaration//GEN-END:variables
}
