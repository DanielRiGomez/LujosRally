package test;

import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

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
			
			//Obtener el stock
			ArrayList<String[]> list =pssql.getStock();
			for(String[] i: list) {
				System.out.println(i[0] +" "+ i[1] +" "+ i[2] +" "+ i[3] +" "+ i[4] +" "+ i[5] +" "+ i[6] +" "+ i[7]+" "+ i[8]);
				
				String a = i[8].substring(2, i[8].length()-3);
				String b = a.replace(".","");
				int c = Integer.parseInt(b);
				NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
				String d = format.format(Integer.parseInt(i[7])*c);
				System.out.println();
			}
		
			
			/*
			pssql.registerUser("Edwin", "12");
			 */
			
			/*
			pssql.registerObject("stock_1", "carro", "marca", "referencia", "caracteristica", "descripcion", 4, 100);
			*/
			
			/*
			pssql.registerSale("nombre_1", 4, 100, 2);
			 */
			

			//System.out.println(pssql.validateStock("p1", "carro_2", "", "", "", ""));
			
			
			/*
			pssql.updateStockValue(11, 999);
			*/
			
			/*
			JoinData join = new JoinData();
			String[] data = join.JoinFeatureStock(pssql.getStock());
			for(String i: data){
				System.out.println(i);
			}
			*/

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
		
}
