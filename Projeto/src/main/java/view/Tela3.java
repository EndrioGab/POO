package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.DAO;
import model.paciente;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Tela3 {

	private JFrame frame;
	private JTable table;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela3 window = new Tela3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(190, 223, 250));
		frame.setBounds(100, 100, 442, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnDeletar = new JButton("DELETE");
		btnDeletar.addActionListener(new ActionListener() {
			private JLabel txtNome_Paciente;

			public void actionPerformed(ActionEvent e) {
				paciente paciente = new paciente();
				txtNome_Paciente = null;
						paciente.setNome_paciente(txtNome_Paciente.getText());
			}
		});
		btnDeletar.setBounds(247, 214, 89, 23);
		frame.getContentPane().add(btnDeletar);
		
		JButton btnUPDATE = new JButton("UPDATE");
		btnUPDATE.addActionListener(new ActionListener() {
			private JLabel txtNomePaciente;

			public void actionPerformed(ActionEvent e) {
				paciente paciente = new
						paciente();
				DAO dao = new
						DAO();
					txtNomePaciente = (null);
					paciente.setNome_paciente(txtNomePaciente.getText());
					
					dao.UPDATE(paciente);
					JOptionPane.showMessageDialog(null,"Ficha atualizada");
					
			}
		});
		btnUPDATE.setBounds(86, 214, 89, 23);
		frame.getContentPane().add(btnUPDATE);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Nome", "Sobrenome", "Codigo"
			}
		));
		table.setBounds(65, 44, 304, 159);
		frame.getContentPane().add(table);
		
		JLabel lblFichA = new JLabel("Fichas");
		lblFichA.setFont(new Font("Arial", Font.PLAIN, 16));
		lblFichA.setBounds(178, -1, 191, 23);
		frame.getContentPane().add(lblFichA);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(86, 29, 46, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(188, 29, 66, 14);
		frame.getContentPane().add(lblSobrenome);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(290, 29, 46, 14);
		frame.getContentPane().add(lblCodigo);
	}
}