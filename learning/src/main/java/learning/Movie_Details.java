package learning;

public class Movie_Details implements Comparable <Movie_Details> {
	private String mov_Name;
	private String lead_Actor;
	private String lead_Actress;
	private String genre;
	public Movie_Details(String mov_Name, String lead_Actor, String lead_Actress, String genre) {
		super();
		this.mov_Name = mov_Name;
		this.lead_Actor = lead_Actor;
		this.lead_Actress = lead_Actress;
		this.genre = genre;
	}
	public String getMov_Name() {
		return mov_Name;
	}
	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}
	public String getLead_Actor() {
		return lead_Actor;
	}
	public void setLead_Actor(String lead_Actor) {
		this.lead_Actor = lead_Actor;
	}
	public String getLead_Actress() {
		return lead_Actress;
	}
	public void setLead_Actress(String lead_Actress) {
		this.lead_Actress = lead_Actress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int compareTo(Movie_Details m) {
		// TODO Auto-generated method stub
		int l = this.mov_Name.compareTo(m.mov_Name);
	     //Sorting by first name if last name is same d
	     return l == 0 ? this.mov_Name.compareTo(m.mov_Name) : l;
	}
	
}