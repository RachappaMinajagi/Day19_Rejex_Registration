package userRegistration;

/*
 *As a User needs to  check the regex pattern for the firstName
* As a User needs to check the regex pattern for the latName 
*/

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	Scanner sc = new Scanner(System.in);

	public void firstNameCheck() {
		System.out.print("Enter First Name of User: ");
		String fName = sc.next();
		/*
		 * As a User needs to  check the regex pattern for the firstName
		 */
		boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", fName);
		if (check)
			System.out.println("Perfect! First #Name");
		else
			System.out.println("Please Enter a Valid First name with Only \"One Starting Capital\" latter");
	}

	public void lastNameCheck() {
		/*
		 * It will take the input from the User
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Last Name of User: ");
		String lName = sc.next();
/*
 * As a User needs to  check the regex pattern for the lastName
 */
		boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", lName);
		if (check)
			System.out.println("Perfect! Last #Name");
		else
			System.out.println("Please Enter a Valid Last Name with Only \"One Starting Capital\" latter");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserRegistration user = new UserRegistration();

		System.err.println("Welcome to User Registration Program");

		user.firstNameCheck();
		user.lastNameCheck();

	}
}