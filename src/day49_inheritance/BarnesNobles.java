package day49_inheritance;

public class BarnesNobles {
public static void main(String[] args) {
	EBook ebook = new EBook();
	ebook.setTitle("Introduction to Java");
	ebook.setAuthor("Savitch");
	ebook.setPages(1016);
	ebook.setSize(500);
	ebook.setType("Tech Book");
	
	System.out.println(ebook.getTitle());
	System.out.println(ebook.getAuthor());
	
	
	AudioBook aBook = new AudioBook();
	aBook.setTitle("OCA prep");
	aBook.setAuthor("Jeanne");
	aBook.setNarrator("Marufjon");
	aBook.listen();
	PaperBack pBack = new PaperBack();
	
	pBack.setAuthor("Bojan");
	pBack.setTitle("BWize");
	pBack.setPrice(9.99);
	pBack.setType("Gold Nuggets");
	
	System.out.println(pBack);
}

}
