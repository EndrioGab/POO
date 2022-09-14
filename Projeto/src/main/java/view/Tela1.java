package view;
import model.paciente;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import DAO.DAO;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class Tela1 {

	private JFrame frame;
	private JTextField txtNomePaciente;
	private JTextField txtSobrenomePaciente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 window = new Tela1();
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
	public Tela1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 450, 321);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Nome = new JLabel("Nome:");
		Nome.setBounds(106, 80, 46, 14);
		frame.getContentPane().add(Nome);
		
		txtNomePaciente = new JTextField();
		txtNomePaciente.setBounds(149, 77, 137, 20);
		frame.getContentPane().add(txtNomePaciente);
		txtNomePaciente.setColumns(10);
		
		JLabel Sobrenome = new JLabel("Sobrenome:");
		Sobrenome.setBounds(84, 133, 89, 14);
		frame.getContentPane().add(Sobrenome);
		
		txtSobrenomePaciente = new JTextField();
		txtSobrenomePaciente.setBounds(149, 130, 137, 20);
		frame.getContentPane().add(txtSobrenomePaciente);
		txtSobrenomePaciente.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar ");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paciente paciente = new
						paciente();
				DAO dao = new DAO();
				paciente.setNome_paciente(txtNomePaciente.getText());
				dao.salvar(paciente);
				dao.salvar(paciente);
				JOptionPane.showMessageDialog(null,"Ficha enviada");
					txtNomePaciente.setText(null);
					txtSobrenomePaciente.setText(null);
				
						
			}
		});
		btnEnviar.setBackground(new Color(43, 219, 122));
		btnEnviar.setBounds(166, 211, 95, 39);
		frame.getContentPane().add(btnEnviar);
		
		JLabel lblNewLabel_2 = new JLabel("Faça sua ficha");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(150, 11, 158, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(61, 11, 295, 260);
		frame.getContentPane().add(panel);
	}
}
