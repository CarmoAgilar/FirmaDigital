/*
 * Elaboraron: Grimaldo Guadarrama, Jorge Leonell;
 *             Ibáñez Marmolejo, Miguel Gabriel.
 * Profesor:   Jaime Minor Gómez (SWyA).
 */
package interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import modelo.Controlador;

@SuppressWarnings("serial")
public class Main extends JFrame {

    private Controlador controlador;

    public Main() {
        controlador = new Controlador();
        setTitle("Menú de selección");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        setLayout(null);
        contentPane.setBackground( new Color(203, 235, 228, 92) );

        Generar generadorClaves = new Generar(this);
        Firmar firmador = new Firmar(this);
        Comprobar comprobador = new Comprobar(this);

        JButton butGeneradorClaves = new JButton("Generar contraseña");
        butGeneradorClaves.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generadorClaves.setVisible(true);
                dispose();
            }
        });
        butGeneradorClaves.setBounds(110, 50, 220, 30);
        contentPane.add(butGeneradorClaves);

        JButton butFirmador = new JButton("Firmar");
        butFirmador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firmador.setVisible(true);
                dispose();
            }
        });
        butFirmador.setBounds(110, 120, 220, 30);
        contentPane.add(butFirmador);

        JButton butComprobador = new JButton("Comprobar");
        butComprobador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                comprobador.setVisible(true);
                dispose();
            }
        });
        butComprobador.setBounds(110, 190, 220, 30);
        contentPane.add(butComprobador);
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public static void main(String[] args) {
        menu window = new menu();
        window.setVisible(true);
    }
}
