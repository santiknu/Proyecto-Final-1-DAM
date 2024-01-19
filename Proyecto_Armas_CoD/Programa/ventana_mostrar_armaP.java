package Programa;

import java.awt.Color;
import java.awt.EventQueue;
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
import MODELOS.ArmaPrincipalBD;
import MODELOS.ArmamentoBD;

public class ventana_mostrar_armaP extends JFrame {

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
					ventana_mostrar_armaP frame = new ventana_mostrar_armaP();
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
	public ventana_mostrar_armaP() {
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
		String[] titulos={"NOMBRE", "TIPO", "PRECIO", "CAMUFLAJE", "CADENCIA"};
		tableModel.setColumnIdentifiers(titulos);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 150, 1110, 338);
		contentPane.add(scrollPane);
		
		actualizarTabla();
	}
	
	private void actualizarTabla() {
		
    	tableModel.getDataVector().removeAllElements();
    	for (Principal p : ArmaPrincipalBD.obtenerArmasPrincipal()) {
			String nombre = p.getNombre();
			String tipo = p.getTipo();
			Double precio = p.getPrecio();
			String camuflaje = p.getCamuflaje();
			boolean cadencia = p.isCadencia();
			Object[] fila = {nombre,tipo,precio,camuflaje,cadencia};
			tableModel.addRow(fila);
		}
		contentPane.revalidate();
		contentPane.repaint();
	}
}
