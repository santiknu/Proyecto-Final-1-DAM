package Programa;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class ventana_menu extends JFrame {

	public static ventana_menu frame;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ventana_menu();
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
	public ventana_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1146, 803);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(15, 16, 16));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb_bienvenido = new JLabel("MENU PRINCIPAL");
		lb_bienvenido.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
		lb_bienvenido.setForeground(new Color(205, 253, 195));
		lb_bienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lb_bienvenido.setBounds(249, 58, 574, 74);
		contentPane.add(lb_bienvenido);
		
		JButton bt_añadir_armamento = new JButton("CREAR ARMAMENTO");
		bt_añadir_armamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_crear_armamento.frame = new ventana_crear_armamento();
				ventana_crear_armamento.frame.setVisible(true);
			}
		});
		bt_añadir_armamento.setFont(new Font("OCR A Extended", Font.PLAIN, 30));
		bt_añadir_armamento.setBackground(new Color(140, 167, 145));
		bt_añadir_armamento.setForeground(new Color(0, 0, 0));
		bt_añadir_armamento.setBounds(101, 143, 902, 90);
		contentPane.add(bt_añadir_armamento);
		
		JButton bt_borrar_armamento = new JButton("BORRAR ARMAMENTO");
		bt_borrar_armamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_borrar_armamento.frame = new ventana_borrar_armamento();
				ventana_borrar_armamento.frame.setVisible(true);
			}
		});
		bt_borrar_armamento.setFont(new Font("OCR A Extended", Font.PLAIN, 30));
		bt_borrar_armamento.setForeground(Color.BLACK);
		bt_borrar_armamento.setBackground(new Color(140, 167, 145));
		bt_borrar_armamento.setBounds(101, 251, 902, 90);
		contentPane.add(bt_borrar_armamento);
		
		JButton bt_mostrar_armamento = new JButton("MOSTRAR ARMAMENTOS");
		bt_mostrar_armamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventana_mostrar_armamentos.frame = new ventana_mostrar_armamentos();
				ventana_mostrar_armamentos.frame.setVisible(true);
				
			}
		});
		bt_mostrar_armamento.setFont(new Font("OCR A Extended", Font.PLAIN, 30));
		bt_mostrar_armamento.setForeground(Color.BLACK);
		bt_mostrar_armamento.setBackground(new Color(140, 167, 145));
		bt_mostrar_armamento.setBounds(101, 363, 902, 90);
		contentPane.add(bt_mostrar_armamento);
		
		JButton bt_administracion = new JButton("ADMINISTRACION");
		bt_administracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_administracion.frame = new ventana_administracion();
				ventana_administracion.frame.setVisible(true);
				
			}
		});
		bt_administracion.setFont(new Font("OCR A Extended", Font.PLAIN, 30));
		bt_administracion.setForeground(Color.BLACK);
		bt_administracion.setBackground(new Color(140, 167, 145));
		bt_administracion.setBounds(101, 473, 902, 90);
		contentPane.add(bt_administracion);
	}
}
