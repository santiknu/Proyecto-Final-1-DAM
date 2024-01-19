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

import Accesorios.Accesorios;
import Armas.Principal;
import MODELOS.AccesoriosBD;
import MODELOS.ArmaPrincipalBD;

public class ventana_añadir_accesorio extends JFrame {

	private JPanel contentPane;
	private JTextField txt_nombre;
	private JTextField txt_acople;
	private JTextField txt_precio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana_añadir_accesorio frame = new ventana_añadir_accesorio();
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
	public ventana_añadir_accesorio() {
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
		
		JLabel lblacople = new JLabel("acople");
		lblacople.setForeground(new Color(128, 255, 0));
		lblacople.setBounds(155, 181, 260, 64);
		contentPane.add(lblacople);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setForeground(new Color(128, 255, 0));
		lblPrecio.setBounds(155, 279, 260, 64);
		contentPane.add(lblPrecio);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(451, 78, 347, 64);
		contentPane.add(txt_nombre);
		txt_nombre.setColumns(10);
		
		txt_acople = new JTextField();
		txt_acople.setColumns(10);
		txt_acople.setBounds(451, 181, 347, 64);
		contentPane.add(txt_acople);
		
		txt_precio = new JTextField();
		txt_precio.setColumns(10);
		txt_precio.setBounds(451, 279, 347, 64);
		contentPane.add(txt_precio);
		
		
		JButton btnNewButton = new JButton("AÑADIR ACCESORIO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Accesorios a=new Accesorios(txt_nombre.getText(),txt_acople.getText(),Integer.valueOf(txt_precio.getText()));
				AccesoriosBD.insertarAccesorios(a);
				
			}
		});
		btnNewButton.setBounds(155, 632, 643, 64);
		contentPane.add(btnNewButton);
		
		
	}

}
