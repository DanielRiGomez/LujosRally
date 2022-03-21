package microservices;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConexionPostgreSQL {

	private final String PostgreSQL_CONNECTION = "jdbc:postgresql://localhost:5432/devops?user=postgres&password=123";
	private final String PostgreSQL_USER = "postgres";
	private final String PostgreSQL_PASSWORD = "123";
	
	private Connection connection;
	private Statement statement;
	private String stringConnection;
	
	public ConexionPostgreSQL(String stringConnection) {
		this.stringConnection = PostgreSQL_CONNECTION;
		connection = null;
		statement = null;
	}
	
	private void initConnection() throws SQLException {
		connection = DriverManager.getConnection(stringConnection);
		statement = connection.createStatement();
		statement.setQueryTimeout(10); 
	}
	
	public boolean validateUser(String name, String password) throws SQLException {
		boolean user = false;
		initConnection();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM users WHERE nombre_user = \'"+ name +"\' AND password_user = \'"+ password +"\';");
		if(resultSet.next()) {
			user = true;
		}
		connection.close();
		return user;
	}
	
	public ArrayList<String[]> getStock(String consulta) throws SQLException{
		ArrayList<String[]> stock = new ArrayList<>();
		initConnection();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM stock");
		while(resultSet.next()) {
			String[] row = {resultSet.getString("name_product"), resultSet.getString("tipo_carro"), resultSet.getString("marca"), 
					resultSet.getString("referencia"), resultSet.getString("feature"), resultSet.getString("descripcion"), 
					Integer.toString(resultSet.getInt("unidades_stock")), resultSet.getString("valor_sugerido")};
			stock.add(row);
		}
		connection.close();
		return stock;
	}
	
	public ArrayList<String[]> getSales(String consulta) throws SQLException{
		ArrayList<String[]> sales = new ArrayList<>();
		initConnection();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM sales");
		while(resultSet.next()) {
			String[] row = {resultSet.getString("name_product"), ""+resultSet.getDate("date_sale"), 
					Integer.toString(resultSet.getInt("units_sales")), resultSet.getString("valor_venta"), 
					Integer.toString(resultSet.getInt("id_product")), Integer.toString(resultSet.getInt("id_user"))};
			sales.add(row);
		}
		connection.close();
		return sales;
	}
}
