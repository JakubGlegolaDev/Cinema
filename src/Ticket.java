
public class Ticket {
	
	private String title; // from  DB
	private String type;  // from DB
	private int price;    // from DB	
	private int row;	  // PODAJE U¯YTK	U¯YTKOWNIK POWINIEN WYBRAÆ TYTU£ A DOPIERO POBIERZE TO Z DB HMMM
	private int sit;	  // PODAJE U¯	
	private int roomNumber; // FROM DB?? czy narazie zostawiæ?
	
	public Ticket(String title, String type, int price, int row, int sit, int roomNumber) {
		this.title = title;
		this.type = type;
		this.price = price;
		this.row = row;
		this.sit = sit;
		this.roomNumber = roomNumber;
	}

	public String getTitle() {
		return title;
	}
	
	public String getType() {
		return type;
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

	public void setType(String type) {
		this.type = type;
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
