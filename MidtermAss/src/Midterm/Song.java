package Midterm;

public class Song {
	
	public String title;
	public String artist;
	public int year;
	public String country;
	
	Song(){}
	public Song(String title, String artist, String country, int year) {
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.year = year;
	}
	
	void show() {
		System.out.println(title+" by "+artist+" from "+country+", "+year);
	}

	public static void main(String[] args) {
		Song s = new Song("Dynamite","BTS","Korea",2021);
		s.show();
	}

}
