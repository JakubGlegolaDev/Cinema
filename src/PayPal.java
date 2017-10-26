
public class PayPal implements Payment {
	
	private String email;
	private String password;
	
	public PayPal(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public void pay(int amount) {
		System.out.println(amount + " paid by PayPal service.");
	}

}
