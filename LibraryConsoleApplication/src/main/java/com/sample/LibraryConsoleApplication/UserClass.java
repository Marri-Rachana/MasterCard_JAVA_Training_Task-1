package com.sample.LibraryConsoleApplication;

import java.util.*;

public class UserClass {
	static Scanner sc = new Scanner(System.in);
	static String nameofuser;

	public void NameOfUser() {
		System.out.println("Enter The Your Name:");
		nameofuser = sc.next();
	}

	public static Book BookInfo(Integer bookid) {
		Book displaybook = null;
		PrintLibraryBooksOnConsole printingobject = new PrintLibraryBooksOnConsole();
		for (Book eachbook : printingobject.books) {
			if (eachbook.getBookId() == bookid) {
				displaybook = eachbook;
			}
		}
		return displaybook;
	}

	public static void PrintBill() {
		System.out.println("Enter the BookId You want to Buy :");
		int bookid = sc.nextInt();
		Book selectedbookinfo = BookInfo(bookid);
		System.out.println("Thank you for shopping with us  " + nameofuser);
		System.out.println("Your order details are :");
		System.out.println("Book Purchased :" + selectedbookinfo.getBookName());
		System.out.println("Your Bill is :" + selectedbookinfo.getBookPrice() + "INR");
	}

	public void filterOnUserChoice() {
		System.out.println("Choose a Filtering Option below :");
		System.out.println("1. Filter Based on Price");
		System.out.println("2. No Filtering needed");
		PrintLibraryBooksOnConsole printingobject = new PrintLibraryBooksOnConsole();
		BookStoreCollectionList usercollectionbooksList = printingobject::printBooksList;
		usercollectionbooksList.printBooksList();
		int chooseForFiltering = sc.nextInt();
		if (chooseForFiltering == 1) {
			System.out.println("Enter the Minimum Range :");
			int minCost = sc.nextInt();
			System.out.println("Enter the Maximum Range :");
			int maxCost = sc.nextInt();
			/*
			 * for( Book eachbook : printingobject.books) {
			 * if(eachbook.getBookPrice()>=minCost && eachbook.getBookPrice()<=maxCost) {
			 * System.out.format("BookId:%d	BookName: %s	Price: %f INR %n",
			 * eachbook.getBookId(),eachbook.getBookName(), eachbook.getBookPrice()); } }
			 */
			printingobject.books.stream().forEach(eachbook -> {
				if (eachbook.getBookPrice() >= minCost && eachbook.getBookPrice() <= maxCost) {
					System.out.format("BookId:%d	BookName: %s	Price: %.2f INR %n", eachbook.getBookId(),
							eachbook.getBookName(), eachbook.getBookPrice());
				}
			});
			PrintBill();
		} else if (chooseForFiltering == 2) {
			PrintBill();
		}

	}

}
