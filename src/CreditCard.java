
public class CreditCard implements Payment {
	
	private String Name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCard(String Name, String cardNumber, String cvv, String dateOfExpiry) {
		this.Name = Name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}
	
	public void pay(int amount) {
		System.out.println(amount + " paid by Credit Card.");
	}

}
