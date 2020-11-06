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
public class EsperandoJugadorGUI extends javax.swing.JFrame {

    /**
     * Creates new form EsperandoJugadorGUI
     */
    public EsperandoJugadorGUI(Usuario player, int puerto) {
        initComponents();
        setVisible(true);
        //System.out.println(esperandoJugadorLabel1.getText());
        //System.out.println(esperandoJugadorLabel2.getText());
        this.puerto=puerto;
        this.ip=player.getIp();
        //esperandoJugadorLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        esperandoJugadorLabel1.setText("IP: " + player.getIp());
        esperandoJugadorLabel2.setText("PUERTO: " + puerto);

        add(esperandoJugadorLabel1);
        add(esperandoJugadorLabel2);

        iniciarPartidaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("No conectado");
                if (player.isConectado()){
                    System.out.println("Conectado");
                    new JuegoPrincipal(player);
                    dispose();
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

        esperandoJugadorLabel1 = new javax.swing.JLabel();
        esperandoJugadorLabel2 = new javax.swing.JLabel();
        iniciarPartidaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        esperandoJugadorLabel1.setText("PUERTO: " + puerto);

        esperandoJugadorLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        esperandoJugadorLabel2.setText("IP: " + ip);

        iniciarPartidaButton.setText("INICIAR PARTIDA");
        iniciarPartidaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarPartidaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(esperandoJugadorLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(esperandoJugadorLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iniciarPartidaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(esperandoJugadorLabel1)
                .addGap(15, 15, 15)
                .addComponent(esperandoJugadorLabel2)
                .addGap(15, 15, 15)
                .addComponent(iniciarPartidaButton)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarPartidaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarPartidaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarPartidaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EsperandoJugadorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EsperandoJugadorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EsperandoJugadorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EsperandoJugadorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EsperandoJugadorGUI(new Usuario(), 50000).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel esperandoJugadorLabel1;
    private javax.swing.JLabel esperandoJugadorLabel2;
    private javax.swing.JButton iniciarPartidaButton;
    private int puerto;
    private String ip;
    // End of variables declaration//GEN-END:variables
}