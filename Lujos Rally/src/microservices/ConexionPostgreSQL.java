package microservices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class ConexionPostgreSQL {
	
	private Connection connection;
	private Statement statement;
	private String stringConnection;
	
	public ConexionPostgreSQL(String stringConnection) {
		this.stringConnection = stringConnection;
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
	
	public ArrayList<String[]> getStock() throws SQLException{
		ArrayList<String[]> stock = new ArrayList<>();
		initConnection();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM stock");
		while(resultSet.next()) {
			String[] row = {resultSet.getString("id_product"), resultSet.getString("name_product"), resultSet.getString("tipo_carro"), resultSet.getString("marca"), 
					resultSet.getString("referencia"), resultSet.getString("feature"), resultSet.getString("descripcion"), 
					Integer.toString(resultSet.getInt("unidades_stock")), resultSet.getString("valor_sugerido")};
			stock.add(row);
		}
		connection.close();
		return stock;
	}
	
	public ArrayList<String[]> getSales() throws SQLException{
		ArrayList<String[]> sales = new ArrayList<>();
		initConnection();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM sales");
		while(resultSet.next()) {
			String[] row = {resultSet.getString("name_product"), ""+resultSet.getDate("date_sale"), 
					Integer.toString(resultSet.getInt("units_sales")), resultSet.getString("valor_venta"), 
					Integer.toString(resultSet.getInt("id_product"))};
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
    
    public void registerSale(String name, int units, int valor, int idStock) throws SQLException {
    	initConnection();
		statement.executeUpdate("INSERT INTO sales (name_product, date_sale, units_sales, valor_venta, id_product) "
				+ "VALUES ('"+name+"', '"+LocalDate.now()+"', "+units+", "+valor+", "+idStock+");");
		connection.close();
	}
    
    public boolean validateStock(String nameProduct, String tipoCarro, String marca, String referencia, String feature, String descripcion) throws SQLException {
    	boolean exist = false;
		initConnection();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM stock WHERE name_product = \'"+ nameProduct +"\' "
				+ "AND tipo_carro = \'"+ tipoCarro +"\' AND marca = '"+ marca +"' AND referencia = '"+ referencia +"' "
				+ "AND feature = '"+ feature +"' AND descripcion = '"+ descripcion +"' ;");
		if(resultSet.next()) {
			exist = true;
		}
		connection.close();
		return exist;
    }
    
    public void updateStockName(int idStock, String name) throws SQLException {
    	initConnection();
		statement.executeUpdate("UPDATE stock set name_product = '"+name+"' WHERE  id_product = "+idStock+";");
		connection.close();
    }
    
    public void updateStockCar(int idStock, String car) throws SQLException {
    	initConnection();
		statement.executeUpdate("UPDATE stock set tipo_carro = '"+car+"' WHERE  id_product = "+idStock+";");
		connection.close();
    }

    public void updateStockMarca(int idStock, String marca) throws SQLException {
    	initConnection();
		statement.executeUpdate("UPDATE stock set marca = '"+marca+"' WHERE  id_product = "+idStock+";");
		connection.close();
    }
    
    public void updateStockRefrencia(int idStock, String referencia) throws SQLException {
    	initConnection();
		statement.executeUpdate("UPDATE stock set referencia = '"+referencia+"' WHERE  id_product = "+idStock+";");
		connection.close();
    }
    
    public void updateStockFeature(int idStock, String feature) throws SQLException {
    	initConnection();
		statement.executeUpdate("UPDATE stock set feature = '"+feature+"' WHERE  id_product = "+idStock+";");
		connection.close();
    }
    
    public void updateStockDescription(int idStock, String description) throws SQLException {
    	initConnection();
		statement.executeUpdate("UPDATE stock set descripcion = '"+description+"' WHERE  id_product = "+idStock+";");
		connection.close();
    }
    
    public void updateStockUnits(int idStock, int units) throws SQLException {
    	initConnection();
		statement.executeUpdate("UPDATE stock set unidades_stock = '"+units+"' WHERE  id_product = "+idStock+";");
		connection.close();
    }
    
    public void updateStockValue(int idStock, int value) throws SQLException {
    	initConnection();
		statement.executeUpdate("UPDATE stock set valor_sugerido = '"+value+"' WHERE  id_product = "+idStock+";");
		connection.close();
    }
    
}
