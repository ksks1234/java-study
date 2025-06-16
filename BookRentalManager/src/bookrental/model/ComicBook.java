package bookrental.model;

public class ComicBook extends Book {
	private String genre;	// 장르

	public ComicBook(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("(장르: " + genre + ")");
	}
}
