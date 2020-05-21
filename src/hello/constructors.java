package hello;

class copy{
	int no;
	String name;
	private static int copymodel=123;
	copy(){
		System.out.println("im from default constructor");
	}
	copy(int n,String myname){
		this.no=n;
		this.name=myname;
		System.out.println(no+""+name+""+copymodel);
		
	}
	copy(copy c){
		this.no=c.no;
		this.name=c.name;
		//System.out.println(this.no+" "+this.name);
	}
	 public Object clone() throws
     CloneNotSupportedException 
    { 
    return super.clone();
    }
	
	void fun()
	{
		System.out.println("I am from class copy");
		
	}
}

public class constructors {
	
public static void main(String args[]) throws CloneNotSupportedException { 
	copy c=new copy(10,"kruthi");
	//copy c1=new copy();
	copy c2=new copy(c);
	copy c4=c;
	
	
	
	
}
}
class newcopy extends copy{
	newcopy()
	{
		
		System.out.print("hello");
	}	newcopy(int x,String y)
	{
		
		super(20,"jag");
		this.no=x;
		this.name=y;
		
		
		
		
	}
	void print() {
		
		
		
	}
		
	}

	



