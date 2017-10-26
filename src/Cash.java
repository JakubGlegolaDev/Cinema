
public class Cash implements Payment {
	
	private String type;	// moneta czy banknot
	private int denominal;  // nomina³

	public Cash(String type, int denominal){
		this.type = type;
		this.denominal = denominal;
	}
	
	public void pay(int amount) {
		System.out.println(amount + " paid by cash.");
	}
	
}
