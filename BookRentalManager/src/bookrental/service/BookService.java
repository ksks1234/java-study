package bookrental.service;

import bookrental.model.Book;
import bookrental.model.ComicBook;
import bookrental.model.ScienceBook;

public class BookService {
	Book[] books;
	
	public BookService() {
		this.books = new Book[] { 
				(new ComicBook("고양이","냐옹", "액션")),
				(new ScienceBook("폭풍", "호랑나비", "자연과학")),
				(new ComicBook("강아지","멍멍", "호러")), 
				(new ComicBook("나비","살랑살랑", "아포칼립스")),
				(new ScienceBook("욕조", "유레카", "물리학"))
				};
				
	}
		
	
	public void printBookList() {
		for(int i = 0; i < this.books.length; i++) {
			System.out.print("[" + i + "] ");
			this.books[i].printInfo();
		}
		
	}
	
	public void rentBook(int index) {
		if(this.books[index] != null) {
			this.books[index].rent();
		}
	}
	
	public void returnBook(int index) {
		if(this.books[index] != null) {
			this.books[index].returnBook();
		}
	}
	
	public boolean isValidIndex(int index) {
		if(this.books[index] == null) {
			return false;
		}
		return true;
	}
}
