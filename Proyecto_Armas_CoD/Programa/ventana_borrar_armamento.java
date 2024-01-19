package Programa;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Armamento.Armamento;
import Armas.Principal;
import MODELOS.ArmaPrincipalBD;
import MODELOS.ArmamentoBD;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana_borrar_armamento extends JFrame {
	
	public static ventana_borrar_armamento frame;
	
	private JPanel contentPane;
	private JComboBox<Armamento> cb_armamentos;
	private JButton bt_borrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ventana_borrar_armamento();
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
	public ventana_borrar_armamento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1146, 803);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(15, 16, 16));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb_pregunta = new JLabel("¿QUE ARMAMNETO QUIERES BORRAR?");
		lb_pregunta.setHorizontalAlignment(SwingConstants.CENTER);
		lb_pregunta.setForeground(new Color(128, 255, 0));
		lb_pregunta.setBounds(334, 124, 341, 57);
		contentPane.add(lb_pregunta);
		
		cb_armamentos = new JComboBox<Armamento>();
		cb_armamentos.setBounds(334, 217, 341, 57);
		actualizarComboArmamentos();
		contentPane.add(cb_armamentos);
		
		bt_borrar = new JButton("BORRAR");
		bt_borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Armamento a = new Armamento((String) cb_armamentos.getSelectedItem());
				ArmamentoBD.eliminarArmamento(a);
			}
		});
		bt_borrar.setBounds(334, 381, 341, 57);
		contentPane.add(bt_borrar);
	}
	
	private void actualizarComboArmamentos() {
		cb_armamentos.removeAllItems();
		for(Armamento a : ArmamentoBD.obtenerArmamento())
		{
			cb_armamentos.addItem(a);
		}
		contentPane.revalidate();
		contentPane.repaint();
	}

}
