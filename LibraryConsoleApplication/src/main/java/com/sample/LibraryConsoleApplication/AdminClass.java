package com.sample.LibraryConsoleApplication;

public class AdminClass {

	public void AdminAccessMethod() {
		PrintLibraryBooksOnConsole printingobject = new PrintLibraryBooksOnConsole();
		BookStoreCollectionList admincollectionbooksList = printingobject::printBooksList;
		admincollectionbooksList.printBooksList();
	}

}
