/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

<<<<<<< HEAD
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

=======
>>>>>>> dbe698bd061d136474904406b50333b21319a92c
/**
 *
 * @author Joel
 */
public class JuegoPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JuegoPrincipal
<<<<<<< HEAD
=======
     * @param player the player
>>>>>>> dbe698bd061d136474904406b50333b21319a92c
     */
    public JuegoPrincipal(Usuario player) {
        initComponents();
        setVisible(true);
<<<<<<< HEAD
        player.getManoCartas().listar();
        this.player=player;

        //actualizarCartas();


        //Carta0.setIcon(new ImageIcon(player.getManoCartas().getNodo(0).getValor().getPathImage()));
        //Carta0.updateUI();


        nombreJugador1.setText(player.getNombre());
        //nombreJugador1.setText(player.getEnemigo().getNombre());

        botonHistorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HistorialJugadasGUI(historial).setVisible(true);

            }
        });

        CartaEnemigo0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.setPosCartaEnemigoSeleccionada(0);

            }
        });

        CartaEnemigo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.setPosCartaEnemigoSeleccionada(1);

            }
        });

        CartaEnemigo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.setPosCartaEnemigoSeleccionada(2);

            }
        });

        CartaEnemigo3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.setPosCartaEnemigoSeleccionada(3);

            }
        });

        Carta0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n=0;
                player.setPosicionCartaSeleccinada(n);

                if (player.isTurno()) {
                    player.UsarCarta(player.getPuertoEnemigo());
                    player.setTurno(false);
                    historial.agregarAlFinal(String.format("%s utilizón una carta contra %s",player.getNombre(),player.getEnemigo().getNombre()) );
                } else {
                    System.out.println("No puedes utilizar esta carta, aún no es tu turno");
                }
                //player.getDeck().listar();
                player.getManoCartas().listar();
                //actualizarCartas();

            }
        });


        Carta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n=1;
                player.setPosicionCartaSeleccinada(n);

                if (player.isTurno()) {
                    player.UsarCarta(player.getPuertoEnemigo());
                    player.setTurno(false);
                    historial.agregarAlFinal(String.format("%s utilizón una carta contra %s",player.getNombre(),player.getEnemigo().getNombre()) );
                } else {
                    System.out.println("No puedes utilizar esta carta, aún no es tu turno");
                }
                //player.getDeck().listar();
                player.getManoCartas().listar();
                //actualizarCartas();
            }
        });

        Carta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n=2;
                player.setPosicionCartaSeleccinada(n);

                if (player.isTurno()) {
                    player.UsarCarta(player.getPuertoEnemigo());
                    player.setTurno(false);
                    historial.agregarAlFinal(String.format("%s utilizón una carta contra %s",player.getNombre(),player.getEnemigo().getNombre()) );
                } else {
                    System.out.println("No puedes utilizar esta carta, aún no es tu turno");
                }
                //player.getDeck().listar();
                player.getManoCartas().listar();
                //actualizarCartas();
            }
        });

        Carta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n=3;
                player.setPosicionCartaSeleccinada(n);

                if (player.isTurno()) {
                    player.UsarCarta(player.getPuertoEnemigo());
                    player.setTurno(false);
                    historial.agregarAlFinal(String.format("%s utilizón una carta contra %s",player.getNombre(),player.getEnemigo().getNombre()) );
                } else {
                    System.out.println("No puedes utilizar esta carta, aún no es tu turno");
                }
                //player.getDeck().listar();
                player.getManoCartas().listar();
                //actualizarCartas();
            }
        });


        jProgressBar1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {


            }
        });


    }

    public void actualizarCartas(){
        for(int i = 0; i<4; i++){
            String variable = player.getManoCartas().getNodo(i).getValor().getNombre();
            variable.replace("","\n");

            //var image = ImageIcon(player.getManoCartas().getNodo(i).getValor().getPathImage());
            switch (i){
                case 0:{
                    //Carta0.setIcon(IconImage );
                    Carta0.setText(variable);
                }
                case 1:{
                    Carta1.setText(variable);
                }
                case 2:{
                    Carta2.setText(variable);
                }
                case 3:{
                    Carta3.setText(variable);
                }

            }
        }
=======
>>>>>>> dbe698bd061d136474904406b50333b21319a92c
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
        CartaEnemigo4 = new javax.swing.JButton();
=======
>>>>>>> dbe698bd061d136474904406b50333b21319a92c
        Carta1 = new javax.swing.JButton();
        Carta0 = new javax.swing.JButton();
        Carta3 = new javax.swing.JButton();
        Carta2 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        CartaEnemigo2 = new javax.swing.JButton();
        CartaEnemigo3 = new javax.swing.JButton();
        CartaEnemigo0 = new javax.swing.JButton();
        CartaEnemigo1 = new javax.swing.JButton();
<<<<<<< HEAD
        nombreJugador2 = new javax.swing.JLabel();
        nombreJugador1 = new javax.swing.JLabel();
        botonHistorial = new javax.swing.JButton();
        CartaEnemigo5 = new javax.swing.JButton();

        CartaEnemigo4.setBackground(new java.awt.Color(51, 0, 0));
        CartaEnemigo4.setText("Carta 0");
        CartaEnemigo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monster TECG!");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(102, 102, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
=======
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monster TECG!");
        setBackground(new java.awt.Color(102, 102, 0));
>>>>>>> dbe698bd061d136474904406b50333b21319a92c

        Carta1.setBackground(new java.awt.Color(51, 0, 0));
        Carta1.setText("Carta1");
        Carta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
<<<<<<< HEAD
        Carta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carta1ActionPerformed(evt);
            }
        });
=======
>>>>>>> dbe698bd061d136474904406b50333b21319a92c

        Carta0.setBackground(new java.awt.Color(51, 0, 0));
        Carta0.setText("Carta0");
        Carta0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
<<<<<<< HEAD
        Carta0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carta0ActionPerformed(evt);
            }
        });
=======
>>>>>>> dbe698bd061d136474904406b50333b21319a92c

        Carta3.setBackground(new java.awt.Color(51, 0, 0));
        Carta3.setText("Carta3");
        Carta3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
<<<<<<< HEAD
        Carta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carta3ActionPerformed(evt);
            }
        });
=======
>>>>>>> dbe698bd061d136474904406b50333b21319a92c

        Carta2.setBackground(new java.awt.Color(51, 0, 0));
        Carta2.setText("Carta2");
        Carta2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
<<<<<<< HEAD
        Carta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carta2ActionPerformed(evt);
            }
        });
=======
>>>>>>> dbe698bd061d136474904406b50333b21319a92c

        jProgressBar1.setBackground(new java.awt.Color(0, 0, 204));
        jProgressBar1.setForeground(new java.awt.Color(0, 0, 204));

        jProgressBar2.setBackground(new java.awt.Color(255, 0, 0));
        jProgressBar2.setForeground(new java.awt.Color(255, 0, 0));

        jProgressBar3.setBackground(new java.awt.Color(255, 0, 0));
        jProgressBar3.setForeground(new java.awt.Color(255, 0, 0));

        jProgressBar4.setBackground(new java.awt.Color(0, 0, 204));
        jProgressBar4.setForeground(new java.awt.Color(0, 0, 204));

        CartaEnemigo2.setBackground(new java.awt.Color(51, 0, 0));
        CartaEnemigo2.setText("Carta 2");
        CartaEnemigo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
<<<<<<< HEAD
        CartaEnemigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartaEnemigo2ActionPerformed(evt);
            }
        });
=======
>>>>>>> dbe698bd061d136474904406b50333b21319a92c

        CartaEnemigo3.setBackground(new java.awt.Color(51, 0, 0));
        CartaEnemigo3.setText("Carta 3");
        CartaEnemigo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
<<<<<<< HEAD
        CartaEnemigo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartaEnemigo3ActionPerformed(evt);
            }
        });
=======
>>>>>>> dbe698bd061d136474904406b50333b21319a92c

        CartaEnemigo0.setBackground(new java.awt.Color(51, 0, 0));
        CartaEnemigo0.setText("Carta 0");
        CartaEnemigo0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
<<<<<<< HEAD
        CartaEnemigo0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartaEnemigo0ActionPerformed(evt);
            }
        });
=======
>>>>>>> dbe698bd061d136474904406b50333b21319a92c

        CartaEnemigo1.setBackground(new java.awt.Color(51, 0, 0));
        CartaEnemigo1.setText("Carta 1");
        CartaEnemigo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
<<<<<<< HEAD
        CartaEnemigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartaEnemigo1ActionPerformed(evt);
            }
        });

        nombreJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreJugador2.setText("Player 2");

        nombreJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreJugador1.setText("Player 2");
        nombreJugador1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonHistorial.setText("Historial");
        botonHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHistorialActionPerformed(evt);
            }
        });

        CartaEnemigo5.setBackground(new java.awt.Color(51, 0, 0));
        CartaEnemigo5.setText("Deck");
        CartaEnemigo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CartaEnemigo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartaEnemigo5ActionPerformed(evt);
            }
        });
=======

        jTextPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTextPane1.setText("Name");
        jScrollPane1.setViewportView(jTextPane1);

        jTextPane2.setBackground(new java.awt.Color(204, 204, 204));
        jTextPane2.setText("Name");
        jScrollPane2.setViewportView(jTextPane2);
>>>>>>> dbe698bd061d136474904406b50333b21319a92c

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
<<<<<<< HEAD
                        .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nombreJugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15)
                                .addComponent(CartaEnemigo3)
                                .addGap(15, 15, 15)
                                .addComponent(CartaEnemigo2)
                                .addGap(15, 15, 15)
                                .addComponent(CartaEnemigo1)
                                .addGap(15, 15, 15)
                                .addComponent(CartaEnemigo0))
=======
                        .addComponent(CartaEnemigo3)
                        .addGap(15, 15, 15)
                        .addComponent(CartaEnemigo2)
                        .addGap(15, 15, 15)
                        .addComponent(CartaEnemigo1)
                        .addGap(15, 15, 15)
                        .addComponent(CartaEnemigo0))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
>>>>>>> dbe698bd061d136474904406b50333b21319a92c
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Carta0)
                                        .addGap(15, 15, 15)
                                        .addComponent(Carta1)
                                        .addGap(15, 15, 15)
                                        .addComponent(Carta2)
                                        .addGap(15, 15, 15)
                                        .addComponent(Carta3))
                                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
<<<<<<< HEAD
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botonHistorial)
                                            .addComponent(nombreJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(CartaEnemigo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 6, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))))
=======
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1)
                                .addGap(4, 4, 4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jProgressBar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))))
>>>>>>> dbe698bd061d136474904406b50333b21319a92c
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
<<<<<<< HEAD
                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CartaEnemigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CartaEnemigo0, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CartaEnemigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CartaEnemigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(nombreJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Carta0, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CartaEnemigo5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(nombreJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
=======
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CartaEnemigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartaEnemigo0, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartaEnemigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartaEnemigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Carta0, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
>>>>>>> dbe698bd061d136474904406b50333b21319a92c
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
                    .addComponent(botonHistorial))
=======
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> dbe698bd061d136474904406b50333b21319a92c
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void CartaEnemigo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartaEnemigo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CartaEnemigo5ActionPerformed

    private void Carta0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carta0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Carta0ActionPerformed

    private void Carta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Carta1ActionPerformed

    private void Carta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Carta2ActionPerformed

    private void Carta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Carta3ActionPerformed

    private void CartaEnemigo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartaEnemigo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CartaEnemigo3ActionPerformed

    private void CartaEnemigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartaEnemigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CartaEnemigo2ActionPerformed

    private void CartaEnemigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartaEnemigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CartaEnemigo1ActionPerformed

    private void CartaEnemigo0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartaEnemigo0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CartaEnemigo0ActionPerformed

    private void botonHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonHistorialActionPerformed

=======
>>>>>>> dbe698bd061d136474904406b50333b21319a92c
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
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
<<<<<<< HEAD
                Usuario player= new Usuario("Joel");
                Usuario enemigo = new Usuario("Armando");
                try {
                    player.obtencionDeCartas();
                    enemigo.obtencionDeCartas();
                } catch (IOException e) {
                    e.printStackTrace();
                }


                new JuegoPrincipal(player).setVisible(true);

=======
                new JuegoPrincipal(new Usuario()).setVisible(true);
>>>>>>> dbe698bd061d136474904406b50333b21319a92c
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Carta0;
    private javax.swing.JButton Carta1;
    private javax.swing.JButton Carta2;
    private javax.swing.JButton Carta3;
    private javax.swing.JButton CartaEnemigo0;
    private javax.swing.JButton CartaEnemigo1;
    private javax.swing.JButton CartaEnemigo2;
    private javax.swing.JButton CartaEnemigo3;
<<<<<<< HEAD
    private javax.swing.JButton CartaEnemigo4;
    private javax.swing.JButton CartaEnemigo5;
    private javax.swing.JButton botonHistorial;
=======
>>>>>>> dbe698bd061d136474904406b50333b21319a92c
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
<<<<<<< HEAD
    private javax.swing.JLabel nombreJugador1;
    private javax.swing.JLabel nombreJugador2;
    // End of variables declaration//GEN-END:variables

    private Historial historial;
    private Usuario player;
=======
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
>>>>>>> dbe698bd061d136474904406b50333b21319a92c
}
