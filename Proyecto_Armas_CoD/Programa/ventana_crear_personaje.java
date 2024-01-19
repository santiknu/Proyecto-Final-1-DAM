package Programa;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MODELOS.PersonajeBD;
import Personaje.Personaje;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana_crear_personaje extends JFrame {

	public static ventana_crear_personaje frame;
	private JPanel contentPane;
	private JTextField txt_nombre_personaje;
    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ventana_crear_personaje();
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
	public ventana_crear_personaje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1146, 803);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(15, 16, 16));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb_bienvenido = new JLabel("BIENVENIDO");
		lb_bienvenido.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
		lb_bienvenido.setForeground(new Color(205, 253, 195));
		lb_bienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lb_bienvenido.setBounds(247, 76, 574, 74);
		contentPane.add(lb_bienvenido);
		
		JLabel lb1 = new JLabel("Para comenzar el juego, deberas crear un personaje");
		lb1.setFont(new Font("Trajan Pro 3", Font.BOLD, 20));
		lb1.setForeground(new Color(205, 253, 195));
		lb1.setHorizontalAlignment(SwingConstants.LEFT);
		lb1.setBounds(232, 214, 651, 54);
		contentPane.add(lb1);
		
		JLabel lb_nombre = new JLabel("NOMBRE");
		lb_nombre.setFont(new Font("Trajan Pro 3", Font.BOLD, 20));
		lb_nombre.setForeground(new Color(205, 253, 195));
		lb_nombre.setBounds(300, 358, 181, 54);
		contentPane.add(lb_nombre);
		
		txt_nombre_personaje = new JTextField();
		txt_nombre_personaje.setBackground(new Color(140, 167, 145));
		txt_nombre_personaje.setBounds(640, 357, 181, 54);
		contentPane.add(txt_nombre_personaje);
		txt_nombre_personaje.setColumns(10);
		
		JLabel lb2 = new JLabel("Se te añadiran unos fondos por defecto con valor de 5000");
		lb2.setFont(new Font("Trajan Pro 3", Font.BOLD, 20));
		lb2.setForeground(new Color(205, 253, 195));
		lb2.setHorizontalAlignment(SwingConstants.CENTER);
		lb2.setBounds(204, 511, 749, 103);
		contentPane.add(lb2);
	    
	    JButton btnNewButton = new JButton("SIGUIENTE");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		/*Personaje p = new Personaje(txt_nombre_personaje.getText());
	    		PersonajeBD.insertarPersonaje(p);*/
	    		
	    		ventana_menu.frame = new ventana_menu();
	    		ventana_menu.frame.setVisible(true);
	    		
	    	}
	    });
	    btnNewButton.setForeground(new Color(0, 0, 0));
	    btnNewButton.setBackground(new Color(140, 167, 145));
	    btnNewButton.setFont(new Font("OCR A Extended", Font.PLAIN, 30));
	    btnNewButton.setBounds(432, 625, 237, 54);
	    contentPane.add(btnNewButton);
	}
}
