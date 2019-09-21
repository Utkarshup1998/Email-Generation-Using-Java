//package EmailApplication;

import java.util.Random;
import java.util.Scanner;

public class Email 
{
	private String fname;
	private String lname;
	private String depname;
	private String password;
	private int length=8;
	private String email;
	private String compname="imsec.ac.in";
	
	//constructor to set name and password
	Email(String fname,String lname)
	{
		this.fname=fname;
		this.lname=lname;
		//System.out.println("Email created --- "+fname+" "+lname);
		this.depname=setdeptname();
		//System.out.println("Department--"+this.depname);
		this.password=setpassword(this.length);
		System.out.println("your pass--  "+this.password);
		
		//now generate email method call
		 email=fname.toLowerCase()+"."+lname.toLowerCase()+"@"+ depname + "." + compname;
		 //System.out.println(email);
		 //showInfo();
	}

	
	//method to set the password 
private String setpassword(int length) 
{
	String s_alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String c_alpha=s_alpha.toLowerCase();
	String num="1234567890";
	String symbol="!@#$%^&*()=+><?\"|";
	String value=s_alpha+c_alpha+num+symbol;
	
	
	
	char[] pass=new char[length];
	for (int i = 0; i <length; i++) 
	{
		int random=(int) (Math.random() * value.length());
		pass[i]=value.charAt(random);
	}
		return new String(pass);
}

//method to return the password 
	private String setdeptname() 
	{
		System.out.println("Select dept Code---\n0-None\n1.Sales\n2.Development\n3.Accounting\n---");
		Scanner sc=new Scanner(System.in);
		int code =sc.nextInt();
		if(code==1)
		{
			return "sales";
		}
		if(code==2)
		{
			return "Development";
		}
		if(code==3)
		{
			return "Accounting";
		}
		else
		return "";
	}
	
	public String showInfo()
	{
		return "Display NAme"+fname+" "+lname+"\nDisplay Company Email"+email;
	}
	
	
	
	
	
}
