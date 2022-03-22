package microservices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class ConexionPostgreSQL {

	private final String PostgreSQL_CONNECTION = "jdbc:postgresql://localhost:5432/devops?user=postgres&password=123";
	
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
	
	public void registerUser(String name, String password) throws SQLException {
		initConnection();
		statement.executeUpdate("INSERT INTO users (nombre_user, password_user) VALUES ('"+name+"','"+password+"');");
		connection.close();
	}
	
    public void registerObject(String nameProduct, String tipoCarro, String marca, String referencia, String feature, String descripcion, int unidadesStock, int valorSugerido) throws SQLException {
    	initConnection();
		statement.executeUpdate("INSERT INTO stock (name_product, tipo_carro, marca, referencia, feature, descripcion, unidades_stock, valor_sugerido) "
				+ "VALUES ('"+nameProduct+"', '"+tipoCarro+"', '"+marca+"', '"+referencia+"', '"+feature+"', '"+descripcion+"', "+unidadesStock+", "+valorSugerido+");");
		connection.close();
	}
    
    public void registerSale(String name, int units, int valor, int idUser, int idStock) throws SQLException {
    	initConnection();
		statement.executeUpdate("INSERT INTO sales (name_product, date_sale, units_sales, valor_venta, id_product, id_user) "
				+ "VALUES ('"+name+"', '"+LocalDate.now()+"', "+units+", "+valor+", "+idStock+", "+idUser+");");
		connection.close();
	}
}
