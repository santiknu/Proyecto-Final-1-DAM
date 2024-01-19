package Programa;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Accesorios.Accesorios;
import Armas.Principal;
import MODELOS.AccesoriosBD;
import MODELOS.ArmaPrincipalBD;

public class ventana_borrar_accesorio extends JFrame {

	private JPanel contentPane;
	private JComboBox<Accesorios> cb_acc;
	private JButton bt_borrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana_borrar_accesorio frame = new ventana_borrar_accesorio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventana_borrar_accesorio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1146, 803);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(15, 16, 16));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb_pregunta = new JLabel("¿QUE ACCESORIO QUIERES BORRAR?");
		lb_pregunta.setHorizontalAlignment(SwingConstants.CENTER);
		lb_pregunta.setForeground(new Color(128, 255, 0));
		lb_pregunta.setBounds(334, 124, 341, 57);
		contentPane.add(lb_pregunta);
		
		cb_acc = new JComboBox<Accesorios>();
		cb_acc.setBounds(334, 217, 341, 57);		
		contentPane.add(cb_acc);
		
		bt_borrar = new JButton("BORRAR");
		bt_borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accesorios p = new Accesorios((String) cb_acc.getSelectedItem());
				AccesoriosBD.eliminarAccesorio(p);
			}
		});
		bt_borrar.setBounds(334, 381, 341, 57);
		contentPane.add(bt_borrar);
		
		actualizarComboP();
	}
	
	private void actualizarComboP() {
		cb_acc.removeAllItems();
		for(Accesorios a : AccesoriosBD.obtenerAccesorios())
		{
			cb_acc.addItem(a);
		}
		contentPane.revalidate();
		contentPane.repaint();
	}
}
