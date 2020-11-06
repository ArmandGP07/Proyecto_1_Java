/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.gui.proyecto1gui;

/**
 *
 * @author Armando
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class ButtonsTest {

    public ButtonsTest() {
        initComponents();
    }

    private void initComponents() {

        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 3));//create gridlayput to hold buttons

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //display action command of jbutton
                String ac = ((JButton) ae.getSource()).getActionCommand();
                System.out.println(ac);
                //display full test in Jbutton
                //String text = ((JButton) ae.getSource()).getText();
                //System.out.println(text);
            }
        };

        for (int i = 0; i < 6; i++) {
            JButton b = new JButton("No: " + String.valueOf((i + 1)));
            b.setActionCommand(String.valueOf((i + 1)));
            b.addActionListener(al);
            panel.add(b);
        }

        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //set L&F and create UI on EDT
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                try {//set L&F
                    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (Exception e) {
                    // If Nimbus is not available, you can set the GUI to another look and feel.
                }
                //create UI
                new ButtonsTest();
            }
        });
    }
}
