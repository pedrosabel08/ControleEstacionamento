package Visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controle.LoginBD;

import javax.swing.JLabel;
import java.awt.Font;

import Modelo.*;
import javax.swing.JTextField;

public class TelaPagamento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Funcionario funcionarioSelecionado;
	private JTextField txtNome;
	

	/**
	 * Launch the application.
	 */

	
	/**
	 * Create the frame.
	 */
	public TelaPagamento(TelaLogin TL) {
		this.setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bem vindo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(37, 25, 200, 79);
		contentPane.add(lblNewLabel);
		
		
	}
	

}
