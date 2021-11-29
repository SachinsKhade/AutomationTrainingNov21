package Com.fbAssignment.pageFactory;
import java.util.*;
public class SignUpPage {
	static Scanner objtest = new Scanner(System.in);

	public void verifySignUpPageIsDispyaed() {
		System.out.println(" Facebook Sign Up Page is Displayed");

	}

	public void setFirstName() {
		System.out.println("Enter Your Name:");
		String name1 = objtest.nextLine();
		System.out.println("Enter first Name is : " + name1);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}

	public void setLastName() {
		System.out.println(" Enter Your Last Name:");
		String Last_Name = objtest.nextLine();
		System.out.println("Enter Last Name is : " + Last_Name);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");

	}

	public void setMobileNumber() {
		System.out.println(" Enter Your Mobile Number  :");
		Long number = objtest.nextLong();
		System.out.println("Enter Mobile numbers is : " + number);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");

	}

	public void set_mailid() {
		System.out.println(" Enter Your E-mail Id :");
		String mailid = objtest.next();
		System.out.println("Enter email Id is : " + mailid);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");

	}

	public void setBirth_Day() {
		System.out.println(" Enter Your BOD:");
		String number1 = objtest.next();
		//String Birthday = objtest.nextLine();
		System.out.println("Enter Birth Day is : " + number1);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}

	public void set_gender()

	{
		System.out.println(" Enter Your Gender male or females:");
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");

	}

	public void male()

	{
		System.out.println(" Enter Your Gender:");

		String gender = objtest.next();
		System.out.println("Enter gender is : " + gender);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}

	public void female()

	{
		System.out.println(" Enter Your Gender:");
		String gender = objtest.next();
		System.out.println("Enter gender is : " + gender);
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");
	}
	public void verifySignUpPageButton() {
		System.out.println(" Facebook Sign Up is successfull");
		System.out.println("Test Script Pass");
		System.out.println("===================================================================");

	}


}
