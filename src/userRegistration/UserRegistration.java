package userRegistration;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	Scanner sc = new Scanner(System.in);

	public void firstNameCheck() {
		System.out.print("Enter First Name of User: ");
		String fName = sc.next();
		/*
		 * As a User need to enter a valid firstName -firstName starts with Cap and has
		 * minimum 3 characters
		 */

		boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", fName);
		if (check)
			System.out.println("Perfect! first #Name");
		else
			System.out.println("Please Enter a Valid firstName with Only \"One Starting Capital\" latter");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * It will take input from the User
		 */
		UserRegistration user = new UserRegistration();

		System.out.println("Welcome to User Registration Program");

		user.firstNameCheck();

	}
}
