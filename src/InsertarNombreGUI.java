import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class InsertarNombreGUI {
    private JPanel insertarNombrePanel;
    private JTextField insertarNombreTexto;
    private JButton insertarButton;
    private JLabel insertarNombreLabel;

    public InsertarNombreGUI() {

        insertarNombreTexto.addInputMethodListener(new InputMethodListener() {
            /**
             * Invoked when the text entered through an input method has changed.
             *
             * @param event the event to be processed
             */
            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {

            }

            /**
             * Invoked when the caret within composed text has changed.
             *
             * @param event the event to be processed
             */
            @Override
            public void caretPositionChanged(InputMethodEvent event) {

            }
        });

        insertarButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
