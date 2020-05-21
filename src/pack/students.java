package pack;
import java.lang.*;
import java.util.Random.*;

public class students {
	private String name;
	private String SSN;
	private static int ID=100;
	private String emailID;
	private String userID;
	private long phonenum;
	private String city;
	private String state;
	private int balance=0;
   students(String SSN,String name){
		this.SSN=SSN;
		this.name=name;
		ID++;
		System.out.println(createemailID());
		
	}
  private String createemailID() {
	emailID=name+"@gmail.com";
	return emailID;
	}
  private String createuserID() {
	 
	int rand=(int)(Math.random()*10000);
	userID = ID+""+rand+SSN.substring(SSN.length()-4,SSN.length());
	return userID;

	
}
public void enroll(long phoneno)
{
	this.phonenum=phoneno;

	System.out.println("Thank you for enrolling ");
	System.out.println("Your phone number"+phonenum);
	System.out.println("Your emailID is"+this.createemailID());
	System.out.println("Your userID is"+this.createuserID());
}
public int pay(int balance)
{
	this.balance+=balance;
	return this.balance;
	
}
public void checkBalance() {
	System.out.println("Your balance is"+ balance);
	
}
public String toString() {
	return "Your name is"+ name+"Your SSN is"+SSN+"Your emailID is"+emailID+"Your balance is"+balance+"Your userID is"+userID;
	
	
}
public void showcourses() {
	System.out.println(this.toString());
	System.out.println("Our courses are:"+"1.Python" +"2.Java"+"3.Javascript");
	
}

}
