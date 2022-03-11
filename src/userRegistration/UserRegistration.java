package userRegistration;

/*
 *As a User needs to check the regex pattern for the firstName
* As a User needs to check the regex pattern for the latName 
* As a User needs to check the regex pattern for the emailId 
* As a User needs to check the regex pattern for the MobileNumber
* As a User needs to check the regex pattern rule1  minimum 8 characters
* As a User needs to check the regex pattern rule2  minimum 1 UperCase Later
* As a User needs to check the regex pattern rule3 1 Numeric Number.
* As a User needs to check the regex pattern rule4 1 Special character
* As a User needs to check the regex pattern Should clear the all emails
*/

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	Scanner sc = new Scanner(System.in);

	public void firstNameCheck() {
		System.out.print("Enter First Name of User: ");
		String fName = sc.next();
		/*
		 * As a User needs to check the regex pattern for the firstName
		 */
		boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", fName);
		if (check)
			System.out.println("Perfect! First #Name");
		else
			System.out.println("Please Enter a Valid First name with Only \"One Starting Capital\" latter");
	}

	public void lastNameCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Last Name of User: ");
		String lName = sc.next();
		/*
		 * As a User needs to check the regex pattern for the laststName
		 */
		boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", lName);
		if (check)
			System.out.println("Perfect! Last #Name");
		else
			System.out.println("Please Enter a Valid Last Name with Only \"One Starting Capital\" latter");
	}

	public void email() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Email of User: ");
		String eMail = sc.next();
		/*
		 * As a User needs to check the regex pattern for the emailId
		 */
		boolean check = Pattern.matches("^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*", eMail);
		if (check)
			System.out.println("Perfect! #Email!");
		else
			System.out.println("Please Enter a Valid Email with Only \"example.abc@bl.co.in\" latter");
	}

	public void mobileNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Mobile number with country code (91)  : ");
		String mobileNum = sc.nextLine();
		/*
		 * As a User needs to check the regex pattern for the MobileNumber
		 */
		boolean check = Pattern.matches("^91\\s[6789][0-9]{9}", mobileNum);
		if (check)
			System.out.println("Perfect! Mobile #Num");
		else
			System.out.println("Please Enter a Valid Mobile Num ex:- 90 9686127142");
	}

	/*
	 * / rule1 minimum 8 characters
	 */
	public void passWordRule1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password :  ");
		String passWord = sc.nextLine();
		boolean check = Pattern.matches("[a-zA-Z]{8,}", passWord);
		if (check)
			System.out.println("Perfect! #password");
		else
			System.out.println("Please Enter a Valid password, it should have minimum 8 characters");
	}

	/*
	 * rule2 minimum 8 characters with minimum 1 UperCase Later
	 */
	public void passWordRule2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password :  ");
		String passWord = sc.nextLine();
		boolean check = Pattern.matches("[A-Z]{1}[a-z]{7,}", passWord);
		if (check)
			System.out.println("Perfect! #password");
		else
			System.out.println("Please Enter a Valid password, it should have minimum 8 characters with 1 upper case");
	}

	/*
	 * rule3 minimum 8 characters with, 1 upper case and 1 Numeric
	 */
	public void passWordRule3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password :  ");
		String passWord = sc.nextLine();
		boolean check = Pattern.matches("[A-Z]{1}[a-z]{6,}[0-9]{1}", passWord);
		if (check)
			System.out.println("Perfect! #password");
		else
			System.out.println(
					"Please Enter a Valid password, it should have minimum 8 characters with, 1 upper case and 1 Numeric ");
	}

	/*
	 * rule4 minimum 8 characters with, 1 upper case, 1 Numeric and 1 Special Char
	 */
	public void passWordRule4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password :  ");
		String passWord = sc.nextLine();
		boolean check = Pattern.matches("[A-Z]{1}[a-z]{5,}[0-9]{1}[!@#$%^&*~]{1}", passWord);
		if (check)
			System.out.println("Perfect! #password");
		else
			System.out.println(
					"Please Enter a Valid password, it should have minimum 8 characters with, 1 upper case, 1 Numeric and 1 Special Char ");
	}

	/*
	 * this is code for which satisfies for all emails given to check
	 */
	public void emailUniversal(String eMail) {
		boolean check = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", eMail);
		if (check)
			System.out.println("Perfect! #Email!");
		else
			System.out.println("Please Enter a Valid Email with Only \"example.abc@bl.co.in\" latter");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserRegistration user = new UserRegistration();

		System.out.println("Welcome to User Registration Program");
		/*
		 * A method Calling (Function)
		 */
		user.firstNameCheck();
		user.lastNameCheck();
		user.email();
		user.mobileNum();
		user.passWordRule1();
		user.passWordRule2();
		user.passWordRule3();
		user.passWordRule4();
		
		/*
		 *  this is code for which satisfies for all emails given to check
		 */
        user.emailUniversal("abc@yahoo.com");
        user.emailUniversal("abc-100@yahoo.com");
        user.emailUniversal("abc.100@yahoo.com");
        user.emailUniversal("abc111@abc.com");
        user.emailUniversal("abc-100@abc.net");
        user.emailUniversal("abc.100@abc.com.au");
        user.emailUniversal("abc@1.com");
        user.emailUniversal("abc@gmail.com.com");
        user.emailUniversal("abc+100@gmail.com.com");

	}
}