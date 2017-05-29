package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String HOST = "localhost";
	private static final String USER = "root";
	private static final String PASS = "1234";

	private static final String URL = "jdbc:mysql://localhost:3306/caca_tesouro";

	private Connection con = null;

	public  Connection getCon() {

		try {
			Class.forName(DRIVER);

			if (con == null) {

				this.con = DriverManager.getConnection(URL, USER, PASS);
				System.out.println("conexao realizada com sucesso");

			}
		} catch (ClassNotFoundException | SQLException s) {
			System.out.println(s.getMessage());
		}

		return this.con;

	}
	public void closeConection(Connection con) throws SQLException{
		
		if( con != null){
			con.close();
		}
	
	}

}
