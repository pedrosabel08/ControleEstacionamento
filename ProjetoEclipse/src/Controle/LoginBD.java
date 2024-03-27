package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Funcionario;

public class LoginBD {

	Connection conn;
	PreparedStatement stmt;
	ResultSet rs;
	ArrayList<Funcionario> lista = new ArrayList<>();
	
	public ArrayList <Funcionario> pesquisarFuncionario(){
		String sql = "select * from funcionario";

		conn = new Conexao().faz_conexao();

		try {
			stmt =  conn.prepareStatement(sql);
			rs = stmt.executeQuery();


			while(rs.next()) {
				Funcionario f = new Funcionario();
				f.setNome(rs.getString("nome"));
				f.setEmail(rs.getString("email"));
				f.setSenha(rs.getString("senha"));


				lista.add(f);

			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Erro no Banco de Dados ao pesquisar o Usuario -> " + e);
		}
		return lista;
	}
	
}