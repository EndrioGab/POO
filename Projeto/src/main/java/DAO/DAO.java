package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conection.SingleConnection;
import model.paciente;
public class DAO {
	private Connection connection;
	public DAO() {
		connection = SingleConnection.getConnetion();
	}

	public void salvar(paciente paciente) {
		try {
			String sql = "INSERT INTO PACIENTE( nome_paciente,cod_paciente,sobrenome_paciente) VALUES (?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, paciente.getNome_paciente());
			statement.setInt(2, paciente.getCod_paciente());
			

			statement.execute();
			connection.commit();

		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	public List<paciente> listar()throws SQLException{
		List<paciente> list=new
				ArrayList<paciente>();
		String sql = "SLECT*FROM paciente";
		PreparedStatement statement = connection.prepareStatement(sql); 
				try {
					ResultSet resultado = statement.executeQuery();
					while(resultado.next()) {
						paciente paciente = new paciente();
						
						paciente.setNome_paciente(resultado.getString("nome_paciente"));
						
						list.add(paciente);
					}
				}catch(SQLException e) {
					list = null;
				}
		return list;
	}
	public List<paciente>buscarpaciente(String Nome_paciente) throws SQLException{
		String sql = "SELECT*FROM paciente WHERE nome_paciente ILIKE?";
				PreparedStatement statement=connection.prepareStatement(sql);
					ResultSet resultado = null;
					List<paciente> paciente = new ArrayList<paciente>();

					try {
						statement.setString(1, "%" + Nome_paciente + "%");

						resultado = statement.executeQuery();

						while (resultado.next()) {

							((model.paciente) paciente).setNome_paciente(resultado.getString("nome_paciente"));
						}

					} catch (SQLException ex) {

					}
					return buscarpaciente(null);
					
	}

	
		public void UPDATE(paciente paciente) {
		try {
			String sql = "UPDATE paciente SET nome = ? WHERE id = " + paciente.getNome_paciente();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, paciente.getNome_paciente());
			statement.execute();
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}}
		
		public void DELETAR(paciente paciente) {
			try {
			String sql = "DELETAR paciente SER nome=? WHERA id=" + paciente.getNome_paciente();	
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, paciente.getNome_paciente());
			statement.execute();
			connection.commit();
			} catch (SQLException e) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
				}
			
		}
	
				
	

