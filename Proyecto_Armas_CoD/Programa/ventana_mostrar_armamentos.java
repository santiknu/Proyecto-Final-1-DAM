package Programa;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Accesorios.Accesorios;
import Armamento.Armamento;
import Armas.Principal;
import Armas.Secundaria;
import MODELOS.ArmamentoBD;

public class ventana_mostrar_armamentos extends JFrame {
	
	public static ventana_mostrar_armamentos frame;
	
	private JPanel contentPane;
	private DefaultTableModel tableModel;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ventana_mostrar_armamentos();
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
	public ventana_mostrar_armamentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1146, 803);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(15, 16, 16));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tableModel = new DefaultTableModel();
		table = new JTable(tableModel);
		String[] titulos={"NOMBRE", "ARMA PRINCIPAL", "ARMA SECUNDARIA", "MUNICION", "ACCESORIOS"};
		tableModel.setColumnIdentifiers(titulos);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 150, 1110, 338);
		contentPane.add(scrollPane);
		
		actualizarTabla();
			
	}
	
	private void actualizarTabla() {
		
	    	tableModel.getDataVector().removeAllElements();
	    	for (Armamento a: ArmamentoBD.obtenerArmamento()) {
				String nombre = a.getNombre();
				Principal p = new Principal(a.getArmap().getNombre());
				Secundaria s = new Secundaria(a.getArmas().getNombre());
				int municion = a.getMunicion();
				LinkedList<Accesorios> accesorios = a.getAccesorios();
				Object[] fila = {nombre, p, s , municion, accesorios};
				tableModel.addRow(fila);
			}
			contentPane.revalidate();
			contentPane.repaint();
		}

}
