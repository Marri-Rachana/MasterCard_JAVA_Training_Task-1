package com.sample.LibraryConsoleApplication;

import java.util.ArrayList;
import java.util.List;

public class PrintLibraryBooksOnConsole implements BookStoreCollectionList {
	List<Book> books = new ArrayList<Book>();
	{
		books.add(new Book(1, "Revolutuion2020", 400.00));
		books.add(new Book(2, "TheStrangersTrio", 500.70));
		books.add(new Book(3, "TheRichdadAndPoorDad", 250.50));
		books.add(new Book(4, "TheHarrypotterSeries", 1000.56));
		books.add(new Book(5, "TheYogaByTyagi", 150.75));
		books.add(new Book(6, "OnlyResonToLive", 350.76));
		books.add(new Book(7, "LetMeTellYouWhatIMean", 100.40));
		books.add(new Book(8, "TheBlackPanterParty", 640.87));
		books.add(new Book(9, "Life-Death-Image-3.0", 850.76));
		books.add(new Book(10, "LieOrDie For Life", 900.23));

	}

	public void printBooksList() {
		books.forEach(s -> {
			System.out.format("BookId:%d	BookName: %s	Price: %.2f INR %n", s.getBookId(), s.getBookName(),
					s.getBookPrice());
		});
	}

}
