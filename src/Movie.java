
public class Movie {
	
	private String title;
	private String director;
	private int ageLimit;
	private String type;
	
	public Movie(String title, String directory, int ageLimit, String type) {
		this.title = title;
		this.director = directory;
		this.ageLimit = ageLimit;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public String getType() {
		return type;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public void setType(String type) {
		this.type = type;
	}

}
