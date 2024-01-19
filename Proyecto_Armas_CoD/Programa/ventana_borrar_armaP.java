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

import Armamento.Armamento;
import Armas.Principal;
import MODELOS.ArmaPrincipalBD;
import MODELOS.ArmamentoBD;

public class ventana_borrar_armaP extends JFrame {

	private JPanel contentPane;
	private JComboBox<Principal> cb_principal;
	private JButton bt_borrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana_borrar_armaP frame = new ventana_borrar_armaP();
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
	public ventana_borrar_armaP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1146, 803);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(15, 16, 16));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb_pregunta = new JLabel("¿QUE ARMA PRINCIPAL QUIERES BORRAR?");
		lb_pregunta.setHorizontalAlignment(SwingConstants.CENTER);
		lb_pregunta.setForeground(new Color(128, 255, 0));
		lb_pregunta.setBounds(334, 124, 341, 57);
		contentPane.add(lb_pregunta);
		
		cb_principal = new JComboBox<Principal>();
		cb_principal.setBounds(334, 217, 341, 57);		
		contentPane.add(cb_principal);
		
		bt_borrar = new JButton("BORRAR");
		bt_borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal p = new Principal((String) cb_principal.getSelectedItem());
				ArmaPrincipalBD.eliminarArmaPrincipal(p);
			}
		});
		bt_borrar.setBounds(334, 381, 341, 57);
		contentPane.add(bt_borrar);
		
		actualizarComboP();
	}
	private void actualizarComboP() {
		cb_principal.removeAllItems();
		for(Principal p : ArmaPrincipalBD.obtenerArmasPrincipal())
		{
			cb_principal.addItem(p);
		}
		contentPane.revalidate();
		contentPane.repaint();
	}

}
