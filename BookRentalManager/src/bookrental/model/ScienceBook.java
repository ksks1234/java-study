package bookrental.model;

public class ScienceBook extends Book {
	private String field;	// 분야(생물, 물리 등)

	public ScienceBook(String title, String author, String field) {
		super(title, author);
		this.field = field;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("(분야: " + field + ")");
	}
	
	

}
