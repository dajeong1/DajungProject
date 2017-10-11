package silseup2;

public class Song {
	private String title;
	private String artist;
	private String album;
	private int year;
	private int track;
	
	Song(){
		this.title=null;
		this.artist=null;
		this.album=null;
		this.year=0;
		this.track=0;
	}
	
	Song(String title, String artist, String album, int year, int track){
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.year=year;
		this.track=track;
	}

	public void Show(){
		System.out.println("노래제목 : " + title);
		System.out.println("가수 : " + artist);
		System.out.println("앨범 : " + album);
		System.out.println("연도 : " + year);
		System.out.println("트랙번호 : " + track);
	}
	
	public static void main(String[] args) {
		Song s = new Song("좋은날", "아이유", "Real", 2010, 3);
		s.Show();
	}

}
