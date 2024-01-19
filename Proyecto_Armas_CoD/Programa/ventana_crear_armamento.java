package Programa;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Accesorios.Accesorios;
import Armamento.Armamento;
import Armas.Principal;
import Armas.Secundaria;
import MODELOS.AccesoriosBD;
import MODELOS.ArmaPrincipalBD;
import MODELOS.ArmaSecundariaBD;
import MODELOS.ArmamentoBD;

import javax.swing.JComboBox;

public class ventana_crear_armamento extends JFrame {
	
	public static ventana_crear_armamento frame;
	
	private JPanel contentPane;
	private JTextField text_nombre;
	private JComboBox<Principal> cb_armap;
	private JComboBox<Secundaria> cb_armas;
	private JComboBox<Accesorios> cb_accesorios;
	private JComboBox<Accesorios> cb_accesorios_1;
	private JComboBox<Accesorios> cb_accesorios_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ventana_crear_armamento();
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
	public ventana_crear_armamento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1146, 803);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(15, 16, 16));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb_nombrea = new JLabel("NOMBRE");
		lb_nombrea.setFont(new Font("Trajan Pro 3", Font.BOLD, 20));
		lb_nombrea.setHorizontalAlignment(SwingConstants.CENTER);
		lb_nombrea.setForeground(new Color(205, 253, 195));
		lb_nombrea.setBounds(186, 65, 267, 63);
		contentPane.add(lb_nombrea);
		
		JLabel lb_armap = new JLabel("ARMA PRINCIPAL");
		lb_armap.setFont(new Font("Trajan Pro 3", Font.BOLD, 20));
		lb_armap.setHorizontalAlignment(SwingConstants.CENTER);
		lb_armap.setForeground(new Color(205, 253, 195));
		lb_armap.setBounds(186, 173, 267, 63);
		contentPane.add(lb_armap);
		
		JLabel lb_armas = new JLabel("ARMA SECUNDARIA");
		lb_armas.setFont(new Font("Trajan Pro 3", Font.BOLD, 20));
		lb_armas.setHorizontalAlignment(SwingConstants.CENTER);
		lb_armas.setForeground(new Color(205, 253, 195));
		lb_armas.setBounds(186, 283, 267, 63);
		contentPane.add(lb_armas);
		
		JLabel lb_municion = new JLabel("MUNICION");
		lb_municion.setFont(new Font("Trajan Pro 3", Font.BOLD, 20));
		lb_municion.setHorizontalAlignment(SwingConstants.CENTER);
		lb_municion.setForeground(new Color(205, 253, 195));
		lb_municion.setBounds(186, 409, 267, 63);
		contentPane.add(lb_municion);
		
		JLabel lb_accesorios = new JLabel("ACCESORIOS");
		lb_accesorios.setFont(new Font("Trajan Pro 3", Font.BOLD, 20));
		lb_accesorios.setHorizontalAlignment(SwingConstants.CENTER);
		lb_accesorios.setForeground(new Color(205, 253, 195));
		lb_accesorios.setBounds(186, 525, 267, 63);
		contentPane.add(lb_accesorios);
		
		text_nombre = new JTextField();
		text_nombre.setBounds(555, 64, 350, 63);
		contentPane.add(text_nombre);
		text_nombre.setColumns(10);
		
		cb_armap = new JComboBox<Principal>();
		cb_armap.setBounds(555, 172, 350, 63);
		actualizarComboArmaP();
		contentPane.add(cb_armap);
		
		cb_armas = new JComboBox<Secundaria>();
		cb_armas.setBounds(555, 283, 350, 63);
		actualizarComboArmaS();
		contentPane.add(cb_armas);
		
		JLabel lb_municion_n = new JLabel("200");
		lb_municion_n.setHorizontalAlignment(SwingConstants.CENTER);
		lb_municion_n.setForeground(new Color(205, 253, 195));
		lb_municion_n.setFont(new Font("Trajan Pro 3", Font.BOLD, 20));
		lb_municion_n.setBounds(555, 409, 350, 63);
		contentPane.add(lb_municion_n);
		
		cb_accesorios = new JComboBox<Accesorios>();
		cb_accesorios.setBounds(555, 524, 156, 63);
		contentPane.add(cb_accesorios);
		
		cb_accesorios_1 = new JComboBox<Accesorios>();
		cb_accesorios_1.setBounds(721, 524, 156, 63);
		contentPane.add(cb_accesorios_1);
		
		cb_accesorios_2 = new JComboBox<Accesorios>();
		cb_accesorios_2.setBounds(887, 524, 156, 63);
		contentPane.add(cb_accesorios_2);
		
		actualizarComboAccesorios();
		
		JButton bt_añadir = new JButton("CREAR ARMAMENTO");
		bt_añadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Principal p = new Principal((String) cb_armap.getSelectedItem());
				Secundaria s = new Secundaria((String) cb_armas.getSelectedItem());
				int municion = Integer.valueOf(lb_municion_n.getText());
				LinkedList<Accesorios> accesorios =  new LinkedList<Accesorios>();
				accesorios.add((Accesorios) cb_accesorios.getSelectedItem());
				accesorios.add((Accesorios) cb_accesorios_1.getSelectedItem());
				accesorios.add((Accesorios) cb_accesorios_2.getSelectedItem());
				
				Armamento A = new Armamento(text_nombre.getText(),p,s,municion,accesorios);
				ArmamentoBD.insertarArmamento(A);
			}
		});
		bt_añadir.setBackground(new Color(140, 167, 145));
		bt_añadir.setForeground(new Color(0, 0, 0));
		bt_añadir.setFont(new Font("OCR A Extended", Font.PLAIN, 30));
		bt_añadir.setBounds(186, 624, 719, 78);
		contentPane.add(bt_añadir);
		
	}
	
	private void actualizarComboArmaP() {
		cb_armap.removeAllItems();
		for(Principal p : ArmaPrincipalBD.obtenerArmasPrincipal())
		{
			cb_armap.addItem(p);
		}
		contentPane.revalidate();
		contentPane.repaint();
	}
	
	private void actualizarComboArmaS() {
		cb_armas.removeAllItems();
		for(Secundaria s : ArmaSecundariaBD.obtenerArmasSecundarias())
		{
			cb_armas.addItem(s);
		}
		contentPane.revalidate();
		contentPane.repaint();
	}
	
	private void actualizarComboAccesorios() {
		cb_accesorios.removeAllItems();
		cb_accesorios_1.removeAllItems();
		cb_accesorios_2.removeAllItems();
		for(Accesorios a : AccesoriosBD.obtenerAccesorios())
		{
			cb_accesorios.addItem(a);
			cb_accesorios_1.addItem(a);
			cb_accesorios_2.addItem(a);
		}
		contentPane.revalidate();
		contentPane.repaint();
	}
}
