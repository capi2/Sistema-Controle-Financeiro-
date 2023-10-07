package br.ufam.edu.icomp.Trabalho1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AlterarInfoProjGUI {

	private JFrame frame;
	private JTextField txtNomeDoProjeto;
	private JTextField txtNovoNome;
	private JTextField txtNovoNomeDo;
	private JTextField txtNomeProf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarInfoProjGUI window = new AlterarInfoProjGUI();
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
	public AlterarInfoProjGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Alterar informações");
		frame.setBounds(100, 100, 550, 450);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		ProjetosDAO projetosDAO = new ProjetosDAO();
		ListaProjetosPesquisa lista = new ListaProjetosPesquisa();
		
		JLabel lblIndiqueO = new JLabel("Informe o nome do projeto a ser alterado");
		lblIndiqueO.setBounds(12, 12, 454, 26);
		lblIndiqueO.setFont(new Font("Dialog", Font.PLAIN | Font.BOLD, 16));
		frame.getContentPane().add(lblIndiqueO);
		
		txtNomeDoProjeto = new JTextField();
		txtNomeDoProjeto.setText("nome do projeto");
		txtNomeDoProjeto.setBounds(12, 50, 526, 19);
		frame.getContentPane().add(txtNomeDoProjeto);
		txtNomeDoProjeto.setColumns(10);
		
		JLabel lblInformeONovo = new JLabel("Informe o novo nome do projeto");
		lblInformeONovo.setBounds(12, 81, 389, 20);
		lblInformeONovo.setFont(new Font("Dialog", Font.PLAIN | Font.BOLD, 16));
		frame.getContentPane().add(lblInformeONovo);
		
		txtNovoNome = new JTextField();
		txtNovoNome.setText("novo nome");
		txtNovoNome.setBounds(12, 112, 328, 19);
		frame.getContentPane().add(txtNovoNome);
		txtNovoNome.setColumns(10);
		
		JButton btnTrocarNome = new JButton("Trocar Nome");
		btnTrocarNome.setBounds(372, 109, 151, 25);
		btnTrocarNome.addActionListener((ActionEvent e) -> {
			projetosDAO.alterarTituloProjetoBD(txtNomeDoProjeto.getText(), txtNovoNome.getText());
			lista.alterarTituloProjeto(txtNomeDoProjeto.getText(), txtNovoNome.getText());
			JOptionPane.showMessageDialog(null, "Troca feita com sucesso!");
			});
		frame.getContentPane().add(btnTrocarNome);
		
		JLabel lblInformeONome = new JLabel("Informe o nome do professor a ser alterado");
		lblInformeONome.setBounds(12, 161, 454, 15);
		lblInformeONome.setFont(new Font("Dialog", Font.PLAIN | Font.BOLD, 16));
		frame.getContentPane().add(lblInformeONome);
		
		txtNomeProf = new JTextField();
		txtNomeProf.setText("nome prof");
		txtNomeProf.setBounds(12, 188, 114, 19);
		frame.getContentPane().add(txtNomeProf);
		txtNomeProf.setColumns(10);
		
		JLabel lblInformeONovo_1 = new JLabel("Informe o novo nome do professor responsável");
		lblInformeONovo_1.setBounds(12, 219, 496, 26);
		lblInformeONovo_1.setFont(new Font("Dialog", Font.PLAIN | Font.BOLD, 16));
		frame.getContentPane().add(lblInformeONovo_1);
		
		txtNovoNomeDo = new JTextField();
		txtNovoNomeDo.setText("novo nome do professor");
		txtNovoNomeDo.setBounds(12, 257, 328, 19);
		frame.getContentPane().add(txtNovoNomeDo);
		txtNovoNomeDo.setColumns(10);
		
		JButton btnTrocarProfessor = new JButton("Trocar Professor");
		btnTrocarProfessor.setBounds(352, 254, 171, 25);
		btnTrocarProfessor.addActionListener((ActionEvent e) -> {
			projetosDAO.alterarProfessorProjetoBD(txtNomeProf.getText(), txtNovoNomeDo.getText());
			lista.alterarProfProjeto(txtNomeProf.getText(), txtNovoNomeDo.getText());
			JOptionPane.showMessageDialog(null, "Troca feita com sucesso!");
			});
		frame.getContentPane().add(btnTrocarProfessor);
	}
	
	public JFrame getFrame() {
		// TODO Auto-generated method stub
		return frame;
	}
}
