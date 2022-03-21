package test;

import java.sql.SQLException;
import java.util.ArrayList;

import microservices.ConexionPostgreSQL;
public class ConexionPostgreSQLTest {

	public static void main(String[] args) {
		ConexionPostgreSQL pssql = new ConexionPostgreSQL("");
		try {
			
			System.out.println(pssql.validateUser("Daneil Gomez", "13"));
			
			/* Obtener el stock
			ArrayList<String[]> list =pssql.getStock("");
			for(String[] i: list) {
				System.out.println(i[0] +" "+ i[1] +" "+ i[2] +" "+ i[3] +" "+ i[4] +" "+ i[5] +" "+ i[6] +" "+ i[7]);
			}
			*/
			
			/* Obtener ventas
			ArrayList<String[]> list =pssql.getSales("");
			for(String[] i: list) {
				System.out.println(i[0] +" "+ i[1] +" "+ i[2] +" "+ i[3] +" "+ i[4] +" "+ i[5]);
			}
			*/
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
