package br.ufam.edu.icomp.Trabalho1;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RemoverDespesaGUI {

	private JFrame frame;
	private JTextField txtNomeTabela;
	private JTextField txtDescricaoDespesa;
	private JButton btnRemover;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoverDespesaGUI window = new RemoverDespesaGUI();
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
	public RemoverDespesaGUI() {
		initialize();
	}

	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Remover despesas");
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInformeONome = new JLabel("Informe o nome da tabela de despesas do projeto");
		lblInformeONome.setBounds(12, 12, 466, 15);
		lblInformeONome.setFont(new Font("Dialog", Font.PLAIN | Font.BOLD, 14));
		frame.getContentPane().add(lblInformeONome);
		
		txtNomeTabela = new JTextField();
		txtNomeTabela.setText("nome tabela");
		txtNomeTabela.setBounds(12, 39, 315, 19);
		frame.getContentPane().add(txtNomeTabela);
		txtNomeTabela.setColumns(10);
		
		JLabel lblInformeONome_1 = new JLabel("Informe o nome da despesa a ser removida");
		lblInformeONome_1.setBounds(12, 86, 361, 15);
		lblInformeONome_1.setFont(new Font("Dialog", Font.PLAIN | Font.BOLD, 14));
		frame.getContentPane().add(lblInformeONome_1);
		
		txtDescricaoDespesa = new JTextField();
		txtDescricaoDespesa.setText("descricao despesa");
		txtDescricaoDespesa.setBounds(12, 140, 315, 19);
		frame.getContentPane().add(txtDescricaoDespesa);
		txtDescricaoDespesa.setColumns(10);
		
		btnRemover = new JButton("Remover");
		btnRemover.setBounds(339, 137, 117, 25);
		
		frame.getContentPane().add(btnRemover);
		
		lblNewLabel = new JLabel("Despesa capital");
		lblNewLabel.setBounds(12, 113, 139, 15);
		frame.getContentPane().add(lblNewLabel);
	}

}
