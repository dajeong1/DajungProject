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
		System.out.println("�뷡���� : " + title);
		System.out.println("���� : " + artist);
		System.out.println("�ٹ� : " + album);
		System.out.println("���� : " + year);
		System.out.println("Ʈ����ȣ : " + track);
	}
	
	public static void main(String[] args) {
		Song s = new Song("������", "������", "Real", 2010, 3);
		s.Show();
	}

}
