//package EmailApplication;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name");
		String fname=sc.next();
		System.out.println("Enter your Seconnd Name ");
		String lname=sc.next();
		Email e=new Email(fname,lname);
		System.out.println(e.showInfo());
				

	}

}
