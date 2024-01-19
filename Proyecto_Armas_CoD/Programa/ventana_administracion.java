package Programa;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana_administracion extends JFrame {

	public static ventana_administracion frame;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ventana_administracion();
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
	public ventana_administracion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1146, 803);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(15, 16, 16));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("AÑADIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_añadir_armaP frame = new ventana_añadir_armaP();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(174, 174, 167, 63);
		contentPane.add(btnNewButton);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_borrar_armaP frame = new ventana_borrar_armaP();
				frame.setVisible(true);
			}
		});
		btnBorrar.setBounds(174, 294, 167, 63);
		contentPane.add(btnBorrar);
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_modificar_armaP frame = new ventana_modificar_armaP();
				frame.setVisible(true);
			}
		});
		btnModificar.setBounds(174, 412, 167, 63);
		contentPane.add(btnModificar);
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_mostrar_armaP frame = new ventana_mostrar_armaP();
				frame.setVisible(true);
			}
		});
		btnMostrar.setBounds(174, 525, 167, 63);
		contentPane.add(btnMostrar);
		
		JButton btnAadir = new JButton("AÑADIR");
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_añadir_armaS frame = new ventana_añadir_armaS();
				frame.setVisible(true);
			}
		});
		btnAadir.setBounds(489, 174, 167, 63);
		contentPane.add(btnAadir);
		
		JButton btnBorarr = new JButton("BORARR");
		btnBorarr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_borrar_armaS frame = new ventana_borrar_armaS();
				frame.setVisible(true);
			}
		});
		btnBorarr.setBounds(489, 294, 167, 63);
		contentPane.add(btnBorarr);
		
		JButton btnModificar_1 = new JButton("MODIFICAR");
		btnModificar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_modificar_armaS frame = new ventana_modificar_armaS();
				frame.setVisible(true);
			}
		});
		btnModificar_1.setBounds(489, 412, 167, 63);
		contentPane.add(btnModificar_1);
		
		JButton btnMostrar_1 = new JButton("MOSTRAR");
		btnMostrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_mostrar_armaS frame = new ventana_mostrar_armaS();
				frame.setVisible(true);
			}
		});
		btnMostrar_1.setBounds(489, 525, 167, 63);
		contentPane.add(btnMostrar_1);
		
		JButton btnAadir_1 = new JButton("AÑADIR");
		btnAadir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_añadir_accesorio frame = new ventana_añadir_accesorio();
				frame.setVisible(true);
			}
		});
		btnAadir_1.setBounds(799, 174, 167, 63);
		contentPane.add(btnAadir_1);
		
		JButton btnBorrar_1 = new JButton("BORRAR");
		btnBorrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_borrar_accesorio frame = new ventana_borrar_accesorio();
				frame.setVisible(true);
			}
		});
		btnBorrar_1.setBounds(799, 294, 167, 63);
		contentPane.add(btnBorrar_1);
		
		JButton btnModificar_2 = new JButton("MODIFICAR");
		btnModificar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar_2.setBounds(799, 412, 167, 63);
		contentPane.add(btnModificar_2);
		
		JButton btnMostrar_2 = new JButton("MOSTRAR");
		btnMostrar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_mostrar_accesorios frame = new ventana_mostrar_accesorios();
				frame.setVisible(true);
			}
		});
		btnMostrar_2.setBounds(799, 525, 167, 63);
		contentPane.add(btnMostrar_2);
		
		JLabel lblNewLabel = new JLabel("ARMA PRINCIPAL");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(128, 255, 0));
		lblNewLabel.setBounds(174, 59, 167, 63);
		contentPane.add(lblNewLabel);
		
		JLabel lblArmaSecundaria = new JLabel("ARMA SECUNDARIA");
		lblArmaSecundaria.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmaSecundaria.setForeground(new Color(128, 255, 0));
		lblArmaSecundaria.setBounds(489, 59, 167, 63);
		contentPane.add(lblArmaSecundaria);
		
		JLabel lblAccesorios = new JLabel("ACCESORIOS");
		lblAccesorios.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccesorios.setForeground(new Color(128, 255, 0));
		lblAccesorios.setBounds(799, 59, 167, 63);
		contentPane.add(lblAccesorios);
		
		
	}

}
