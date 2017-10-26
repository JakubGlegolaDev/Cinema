
public class Ticket {
	
	private String title;
	private int price; 
	private int row;
	private int sit;
	private int roomNumber;
	
	public Ticket(String title, int price, int row, int sit, int roomNumber) {
		this.title = title;
		this.price = price;
		this.row = row;
		this.sit = sit;
		this.roomNumber = roomNumber;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public int getRow() {
		return row;
	}

	public int getSit() {
		return sit;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public void setSit(int sit) {
		this.sit = sit;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	
}
