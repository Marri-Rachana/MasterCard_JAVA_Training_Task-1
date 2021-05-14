package com.sample.LibraryConsoleApplication;

import java.util.*;

public class TypeOfUser {
	Scanner sc = new Scanner(System.in);

	public void SelectTypeOfUser() {
		System.out.println("Select Which Type Of User you are : ");
		System.out.println("1. Admin");
		System.out.println("2. User");
		int usertype = sc.nextInt();
		if (usertype == 1) {
			AdminClass adminclass = new AdminClass();
			adminclass.AdminAccessMethod();
		} else if (usertype == 2) {
			UserClass userclass = new UserClass();
			userclass.NameOfUser();
			userclass.filterOnUserChoice();

		} else {
			System.out.println("Enter a Valid input");
		}

	}

}
