package day49_inheritance;

import day48_inheritance02.Book;

public class PaperBack extends Book{
private int pages;


public String toString() {
	//title author price type
	return "Book title " + getTitle() + ", Author: "+ getAuthor()+ 
			", Price: "+getPrice()+", Type: "+getType();
}

public int getPages() {
	return pages;
}

public void setPages(int pages) {
	this.pages = pages;
}


}
