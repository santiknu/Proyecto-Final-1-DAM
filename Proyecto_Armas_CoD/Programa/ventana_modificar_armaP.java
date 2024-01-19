package Programa;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Armas.Principal;
import MODELOS.ArmaPrincipalBD;

public class ventana_modificar_armaP extends JFrame {

	private JPanel contentPane;
	private JTextField txt_nombre;
	private JTextField txt_tipo;
	private JTextField txt_precio;
	private JTextField txt_camuflaje;
	private JTextField txt_cadencia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana_modificar_armaP frame = new ventana_modificar_armaP();
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
	public ventana_modificar_armaP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1146, 803);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(15, 16, 16));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOMBRE");
		lblNewLabel.setForeground(new Color(128, 255, 0));
		lblNewLabel.setBounds(155, 78, 260, 64);
		contentPane.add(lblNewLabel);
		
		JLabel lblTipo = new JLabel("TIPO");
		lblTipo.setForeground(new Color(128, 255, 0));
		lblTipo.setBounds(155, 181, 260, 64);
		contentPane.add(lblTipo);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setForeground(new Color(128, 255, 0));
		lblPrecio.setBounds(155, 279, 260, 64);
		contentPane.add(lblPrecio);
		
		JLabel lblCamuflaje = new JLabel("CAMUFLAJE");
		lblCamuflaje.setForeground(new Color(128, 255, 0));
		lblCamuflaje.setBounds(155, 385, 260, 64);
		contentPane.add(lblCamuflaje);
		
		JLabel lblCadencia = new JLabel("CADENCIA");
		lblCadencia.setForeground(new Color(128, 255, 0));
		lblCadencia.setBounds(155, 495, 260, 64);
		contentPane.add(lblCadencia);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(451, 78, 347, 64);
		contentPane.add(txt_nombre);
		txt_nombre.setColumns(10);
		
		txt_tipo = new JTextField();
		txt_tipo.setColumns(10);
		txt_tipo.setBounds(451, 181, 347, 64);
		contentPane.add(txt_tipo);
		
		txt_precio = new JTextField();
		txt_precio.setColumns(10);
		txt_precio.setBounds(451, 279, 347, 64);
		contentPane.add(txt_precio);
		
		txt_camuflaje = new JTextField();
		txt_camuflaje.setColumns(10);
		txt_camuflaje.setBounds(451, 385, 347, 64);
		contentPane.add(txt_camuflaje);
		
		txt_cadencia = new JTextField();
		txt_cadencia.setColumns(10);
		txt_cadencia.setBounds(451, 495, 347, 64);
		contentPane.add(txt_cadencia);
		
		JButton btnNewButton = new JButton("MODIFICAR ARMA PRINCIPAL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean cadencia = false;
				if(txt_cadencia.getText().equalsIgnoreCase("automatica")) {
					cadencia=true;
				}
				
				Principal p=new Principal(txt_nombre.getText(),txt_tipo.getText(),Double.valueOf(txt_precio.getText()),txt_camuflaje.getText(),cadencia);
				ArmaPrincipalBD.actualizarArmaPrincipal(p);
				
			}
		});
		btnNewButton.setBounds(155, 632, 643, 64);
		contentPane.add(btnNewButton);
		
	}

}
