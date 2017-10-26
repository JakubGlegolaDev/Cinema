//////////////interfejs to kontrakt, który mówi co klasa implementuj¹ca mo¿e robiæ, ale nie jak ma to robiæ./////////////////
// Interfejs ten zosta³ stworzony z myœl¹ o zastowoswaniu wzorca projektowego: Strategia
public interface Payment {

	public void pay(int amount); // amount of payment.
	
}
