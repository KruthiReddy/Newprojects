package hello;
import java.util.*;

class newDemo {
	int rno;
	String n2;
newDemo(String name,int r) {
	
	
	this.rno=r;
	this.n2=name;
	
		System.out.println(this.n2);
		System.out.print(this.rno);
System.out.print("hi")
;
		
	}
}

public class Demo{
	int num;
	Demo(){
		System.out.println("iam object of demo1");
	}
	
	
	Demo(int num1){
		this.num=num1;
		
		
		
	
		System.out.println("Iam  object of DEmo"+ this.num);
	}
	
	public static void main(String args[]) { 
		System.out.print("Enter a number");
        Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		newdemo1 d1=new newdemo1(); 
		
				
		
		
		
		
	}
	public static void fibonacci(int k) {
		
		int i ;
		int num1=0;
		int num2=1;
		int num3;
		for(i=0;i<=k;i++) {
			
		if(i==0) {
		System.out.print(num1);}
	
		
		else if(i==1) {
			System.out.print(num2);}
		
		else {  
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(num2);}
				
}
}
	public static int factorial(int l) {
		if (l==0) {
			return 1;
		}
		else if(l==1) {
			return 1;
		
		}
		else {
		return l*factorial(l-1);
			
		}
	
	}
}
class newdemo1 extends Demo{
	
	int n;
	newdemo1(){
		
		
		
		System.out.println("i am an object of newdemo1"+this.num);
	}
	void greet(){
		System.out.print("hello");
		
	}
	
	
}