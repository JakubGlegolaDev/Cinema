
// main class
import java.sql.*;
import java.util.ArrayList;

import com.mysql.*;

public class Kino {
	
	public static Connection getConnection() throws Exception {
		// 1. Get connection to database
				Connection conn = null;
				try {
					conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin", "root", "root");
					if(conn!=null) {
						System.out.println("Connection success!");
					}
				}
				catch (Exception exc) {
					System.out.println("Connection failed!");
					exc.printStackTrace();
				}				
		return conn;
	}
	public static void createTable() throws Exception {
		try {
		Connection con = getConnection();   //after this, we are connected to database.
		PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS lista_filmow(id int(100) PRIMARY KEY AUTO_INCREMENT NOT NULL, tytul varchar(100) NOT NULL, gatunek varchar(50) NOT NULL, rezyser varchar(100) NOT NULL, ograniczenie_wieku varchar(10) NOT NULL, godziny varchar(100) NOT NULL, kino varchar(100) NOT NULL);");
		create.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);}
		finally{
			System.out.println("Function complete");}
	}
	public static ArrayList<String> get() throws Exception{
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT * from lista_filmow;");
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<String> array = new ArrayList<String>();
			while(result.next()) {
				System.out.print(result.getString("tytul"));
				System.out.print("| ");
				System.out.print(result.getString("gatunek"));
				System.out.print("| ");
				System.out.print(result.getString("rezyser"));
				System.out.print("| ");
				System.out.print(result.getString("ograniczenie_wieku"));
				System.out.print("| ");
				System.out.print(result.getString("godziny"));
				System.out.print("| ");
				System.out.print(result.getString("kino"));
				System.out.println(" ");
				
			}
			System.out.println("records added!");
			return array;
		}catch(Exception e){
			System.out.println(e);
		}
		return null;
	}
	
	
	public static void main(String args[]) throws Exception {
		createTable();	
		get();
		
		
		Order order = new Order();
		Ticket t1 = new Ticket("American B", 50, 2, 10, 8);
		Ticket t2 = new Ticket("Her", 100, 10, 8, 1);
		
		order.addTicket(t1);
		order.addTicket(t2);
		
		order.pay(new CreditCard("Jake", "12", "15", "12"));
		
		order.pay(new Cash("banknot", 10));
		
	}
	
}
