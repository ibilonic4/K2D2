/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.view;

import ffos.controller.ObradaVlasnik;
import ffos.model.Vlasnik;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivor
 */
public class FormaVlasnik extends javax.swing.JFrame implements ViewAktivnosti {

  private ObradaVlasnik ov;
    /**
     * Creates new form FormaMesar
     */
    public FormaVlasnik() {
         ov = new ObradaVlasnik();
        initComponents();
        ucitajPodatke();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnc = new javax.swing.JButton();
        btnd = new javax.swing.JButton();
        btnu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txti = new javax.swing.JTextField();
        txtp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnc.setText("c");
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });

        btnd.setText("d");
        btnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndActionPerformed(evt);
            }
        });

        btnu.setText("u");
        btnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuActionPerformed(evt);
            }
        });

        lst.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lst);

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        txti.setText("jTextField1");

        txtp.setText("jTextField2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnc))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnd)
                        .addGap(67, 67, 67)
                        .addComponent(btnu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnc)
                    .addComponent(btnd)
                    .addComponent(btnu))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        // TODO add your handling code here   ov.setEntitet(new Vlasnik());
        ucitajVrijednostiIzViewKontrola();
        try {
            ov.create();
            ucitajPodatke();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_btncActionPerformed

    private void btndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndActionPerformed
        if(ov.getEntitet()==null){
            JOptionPane.showMessageDialog(this,"Prvo odaberite stavku");
            return;
        }
        try {
            ov.delete();
            ucitajPodatke();
        } catch (Exception e) {}
    }//GEN-LAST:event_btndActionPerformed

    private void btnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuActionPerformed
        if(ov.getEntitet()==null){
            JOptionPane.showMessageDialog(this,"Prvo odaberite stavku");
            return;
        }
        ucitajVrijednostiIzViewKontrola();
        try {
            ov.update();
            ucitajPodatke();} catch (Exception e) {}  
    }//GEN-LAST:event_btnuActionPerformed
    
    private void lstValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstValueChanged
        if (evt.getValueIsAdjusting() || lst.getSelectedValue() == null) {postaviVrijednostiNaViewKontrole(); return;}   
    }//GEN-LAST:event_lstValueChanged

    @Override
    public void ucitajPodatke() {
DefaultListModel<Vlasnik> m = new DefaultListModel<>();
        m.addAll(ov.read());
        lst.setModel(m);    }    

    @Override
    public void postaviVrijednostiNaViewKontrole() {
ov.setEntitet(lst.getSelectedValue());
        txti.setText(lst.getSelectedValue().getIme());
    txtp.setText(lst.getSelectedValue().getPrezime());      }

    @Override
    public void ucitajVrijednostiIzViewKontrola() {
ov.SetData(txti.getText(), txtp.getText());    }

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnd;
    private javax.swing.JButton btnu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Vlasnik> lst;
    private javax.swing.JTextField txti;
    private javax.swing.JTextField txtp;
    // End of variables declaration//GEN-END:variables
}
