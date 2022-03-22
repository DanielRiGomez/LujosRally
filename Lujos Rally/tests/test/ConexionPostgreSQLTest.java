package test;

import java.sql.SQLException;
import java.util.ArrayList;

import microservices.ConexionPostgreSQL;
import model.JoinData;
public class ConexionPostgreSQLTest {

	public static void main(String[] args) {
		
		String PostgreSQL_CONNECTION = "jdbc:postgresql://localhost:5432/Lujos Rally?user=postgres&password=123"; 
		
		ConexionPostgreSQL pssql = new ConexionPostgreSQL(PostgreSQL_CONNECTION);
		
		
		try {
			/*
			System.out.println(pssql.validateUser("Daneil Gomez", "13"));
			*/
			
			/* Obtener el stock
			ArrayList<String[]> list =pssql.getStock();
			for(String[] i: list) {
				System.out.println(i[0] +" "+ i[1] +" "+ i[2] +" "+ i[3] +" "+ i[4] +" "+ i[5] +" "+ i[6] +" "+ i[7]);
			}
			*/
			
			/* Obtener ventas
			ArrayList<String[]> list =pssql.getSales();
			for(String[] i: list) {
				System.out.println(i[0] +" "+ i[1] +" "+ i[2] +" "+ i[3] +" "+ i[4]);
			}
			*/
			
			/*
			pssql.registerUser("Edwin", "12");
			 */
			
			/*
			pssql.registerObject("stock_1", "carro", "marca", "referencia", "caracteristica", "descripcion", 4, 100);
			*/
			
			/*
			pssql.registerSale("nombre_1", 4, 100, 2);
			 */
			
			/*
			System.out.println(pssql.validateStock("product_3", "carro_3", "", "referencia_2", "feature_3", ""));
			*/
			
			/*
			pssql.updateStockValue(11, 999);
			*/
			
			JoinData join = new JoinData();
			String[] data = join.JoinFeatureStock(pssql.getStock());
			for(String i: data){
				System.out.println(i);
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
		
}
