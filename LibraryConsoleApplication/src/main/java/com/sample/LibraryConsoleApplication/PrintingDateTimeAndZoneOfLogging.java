package com.sample.LibraryConsoleApplication;

import java.time.*;

public class PrintingDateTimeAndZoneOfLogging {
	LocalDateTime localdatetimeObject;
	ZoneId currentzoneobject;

	public void EntryPrintingDateTimeZoneMethod() {
		localdatetimeObject = LocalDateTime.now();
		currentzoneobject = ZoneId.systemDefault();
		System.out.printf("You logged in at : %d-%d-%d   %d : %d : %d \n", localdatetimeObject.getYear(),
				localdatetimeObject.getMonthValue(), localdatetimeObject.getDayOfMonth(), localdatetimeObject.getHour(),
				localdatetimeObject.getMinute(), localdatetimeObject.getSecond());
		System.out.println("You are in " + currentzoneobject + " zone.");
	}

	public void ExitPrintingDateTimeZoneMethod() {
		localdatetimeObject = LocalDateTime.now();
		currentzoneobject = ZoneId.systemDefault();
		System.out.printf("You are logging out at : %d-%d-%d   %d : %d : %d \n", localdatetimeObject.getYear(),
				localdatetimeObject.getMonthValue(), localdatetimeObject.getDayOfMonth(), localdatetimeObject.getHour(),
				localdatetimeObject.getMinute(), localdatetimeObject.getSecond());
		System.out.println("You are in " + currentzoneobject + " zone.");
	}

}
