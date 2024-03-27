package Visao;

import java.awt.EventQueue;
import java.net.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import Controle.LoginBD;
import Modelo.Funcionario;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEmail;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		TelaLogin TL = this;
		this.setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Controle de Estacionamento");
		lblNewLabel.setBounds(35, 34, 562, 55);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 45));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setBounds(222, 235, 169, 36);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(401, 237, 258, 36);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(35, 132, 258, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(222, 312, 169, 36);
		contentPane.add(lblNewLabel_1_1);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(401, 312, 258, 36);
		contentPane.add(txtSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login();
				TelaPagamento TP = new TelaPagamento(TL);
				TP.setVisible(true);
				dispose();
			}
		});
		btnEntrar.setForeground(new Color(255, 255, 255));
		btnEntrar.setBackground(new Color(0, 0, 0));
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEntrar.setBounds(347, 435, 216, 36);
		contentPane.add(btnEntrar);
		
		JLabel lblEsqueceu = new JLabel("Esqueceu a senha?");
		lblEsqueceu.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEsqueceu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new java.net.URI("https://chat.openai.com/"));
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		lblEsqueceu.setForeground(new Color(0, 0, 255));
		lblEsqueceu.setBounds(540, 359, 119, 14);
		lblEsqueceu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(lblEsqueceu);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(TelaLogin.class.getResource("/Imagens/estacionamento.png")));
		lblNewLabel_3.setBounds(900, 132, 396, 371);
		contentPane.add(lblNewLabel_3);
	}
	
	private void Login() {
		String email, senha;
		
		email = txtEmail.getText();
		senha = txtSenha.getText();
		
		Funcionario f = new Funcionario();
		f.setEmail(email);
		f.setSenha(senha);
		
		LoginBD lBD = new LoginBD();
		lBD.pesquisarFuncionario();
	}
}
