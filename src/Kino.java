public class Kino {
	
	public Kino() {
		new Window(512, 512, "staff"); //EDIT THE NAME.
		
	}
	
	
	public static void main(String args[]) throws Exception {
		new Kino(); // straight to constructor.
		
		
		
		//////// SQL connectivity  ///////////// 
		// DB_service dbService = new DB_service();
		// dbService.createTable();
		// dbService.get();
		
		/////// Usage payment options ///////////
		// Order order = new Order();
		// Ticket t1 = new Ticket("American B", 50, 2, 10, 8);
		// Ticket t2 = new Ticket("Her", 100, 10, 8, 1);
		
		// order.addTicket(t1);
		// order.addTicket(t2);
		
		// order.pay(new CreditCard("Jake", "12", "15", "12"));
		// order.pay(new Cash("banknot", 10));
		
	}
	
}
