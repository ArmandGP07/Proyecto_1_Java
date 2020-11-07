/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Armando
 */
public class HistorialJugadasGUI extends javax.swing.JFrame {

    /**
     * Creates new form HistorialJugadasGUI
     */
    public HistorialJugadasGUI(Historial historial) {
        initComponents();
        setVisible(true);
        historial.agregarAlFinal("Hola");
        historial.agregarAlFinal("Yo");
        historial.agregarAlFinal("Soy");
        historial.agregarAlFinal("Tu");
        historial.agregarAlFinal("Padre");
        historial.agregarAlFinal(":)");

        System.out.println(historial.getInicio().getValor());

        jugadaSiguienteDespues.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(historial.getAuxNodoString().getNext() == null)) {
                    //NodoString m = historial.getAuxNodoString().getNext();
                    NodoString m = historial.getAuxNodoString();

                    historialJugadasTextPane.setText(m.getValor());
                }
            }
        });


        jugadaAnteriorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(historial.getAuxNodoString().getPrev() == null)) {
                    NodoString m = historial.getAuxNodoString().getPrev();
                    historialJugadasTextPane.setText(m.getValor());
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        historialJugadasLabel = new javax.swing.JLabel();
        jugadaSiguienteDespues = new javax.swing.JButton();
        jugadaAnteriorButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        historialJugadasTextPane = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        historialJugadasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        historialJugadasLabel.setText("HISTORIAL DE JUGADAS");

        jugadaSiguienteDespues.setText("SIGUIENTE");
        jugadaSiguienteDespues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugadaSiguienteDespuesActionPerformed(evt);
            }
        });

        jugadaAnteriorButton.setText("ANTERIOR");
        jugadaAnteriorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugadaAnteriorButtonActionPerformed(evt);
            }
        });

        historialJugadasTextPane.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                historialJugadasTextPaneAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(historialJugadasTextPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jugadaAnteriorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jugadaSiguienteDespues, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(historialJugadasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(historialJugadasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugadaSiguienteDespues)
                    .addComponent(jugadaAnteriorButton))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jugadaAnteriorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugadaAnteriorButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jugadaAnteriorButtonActionPerformed

    private void jugadaSiguienteDespuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugadaSiguienteDespuesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jugadaSiguienteDespuesActionPerformed

    private void historialJugadasTextPaneAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_historialJugadasTextPaneAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_historialJugadasTextPaneAncestorAdded

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
            java.util.logging.Logger.getLogger(HistorialJugadasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialJugadasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialJugadasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialJugadasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Historial historial = new Historial();
                new HistorialJugadasGUI(historial).setVisible(true);
                historial.agregarAlFinal("Hola");
                historial.agregarAlFinal("Yo");
                historial.agregarAlFinal("Soy");
                historial.agregarAlFinal("Tu");
                historial.agregarAlFinal("Padre");
                historial.agregarAlFinal(":)");

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel historialJugadasLabel;
    private javax.swing.JTextPane historialJugadasTextPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jugadaAnteriorButton;
    private javax.swing.JButton jugadaSiguienteDespues;
    // End of variables declaration//GEN-END:variables
}
