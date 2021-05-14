package com.sample.LibraryConsoleApplication;

public class LibraryStore {
	public static void main(String[] args) {
		PrintingDateTimeAndZoneOfLogging printdatetimeobject = new PrintingDateTimeAndZoneOfLogging();
		printdatetimeobject.EntryPrintingDateTimeZoneMethod();
		System.out.println("WELCOME TO RACHANA's ONLINE LIBRARY BOOK STORE.");
		TypeOfUser typeofuserobject = new TypeOfUser();
		typeofuserobject.SelectTypeOfUser();
		printdatetimeobject.ExitPrintingDateTimeZoneMethod();
	}

}
