package conection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {
	private static String url = "jdbc:postgresql://localhost:2000/conection";
	private static String password = "0000";
	private static String user = "postgres";
	private static Connection connection = null;
	
	public SingleConnection() {
		conectar();
	}
	
	static {
		conectar();
	}
	
	private static void conectar() {
		try {
			if(connection == null) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);
				System.out.println("Conectou com Sucesso!!");
						
			}	
			
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static Connection getConnetion() {
		return connection;
		
	}
}
