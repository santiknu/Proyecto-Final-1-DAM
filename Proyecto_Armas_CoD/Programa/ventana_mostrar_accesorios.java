package Programa;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Accesorios.Accesorios;
import Armas.Principal;
import MODELOS.AccesoriosBD;
import MODELOS.ArmaPrincipalBD;

public class ventana_mostrar_accesorios extends JFrame {

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
					ventana_mostrar_accesorios frame = new ventana_mostrar_accesorios();
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
	public ventana_mostrar_accesorios() {
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
		String[] titulos={"NOMBRE", "ACOPLE", "PRECIO"};
		tableModel.setColumnIdentifiers(titulos);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 150, 1110, 338);
		contentPane.add(scrollPane);
		
		actualizarTabla();
	}
	
	private void actualizarTabla() {
		
    	tableModel.getDataVector().removeAllElements();
    	for (Accesorios p : AccesoriosBD.obtenerAccesorios()) {
			String nombre = p.getNombre();
			String acople = p.getAcople();
			int precio = p.getPrecio();
			Object[] fila = {nombre,acople,precio};
			tableModel.addRow(fila);
		}
		contentPane.revalidate();
		contentPane.repaint();
	}
}
