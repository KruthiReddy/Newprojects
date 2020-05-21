package pack;
class assignment{
	 static int factorial(int l) {
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
	 static int addition(int x) {
		 int i=0;
		 int result=0;
		 for(i=0;i<=x;i++) {
			 result+=i;
		 
			 
		 }
		 return result;
	 }
	 static int minarray(int arr[]){
		 int i=0;
		 int min=arr[0];
		 for(i=1;i<arr.length;i++) {
			 if( arr[i]<min){
				 min=arr[i];
				 
			 }
			 
			 
		 }
		return min;
	 } 
	static int maxarray(int arr[]) {
		int i=0;
		int max=arr[0];
		for(i=1;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
				}
			}
		return max; 
	}
	static int avgarray(int arr[]) {
		int i=0;
		
		int sum=0;
		for(i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int avg= sum/arr.length;
		return avg;
	}
	
}
public class assignment1 {
	public static void main(String args[]) {
		int k=3;
		int array[]= {1,2,4,7,8,4};
		System.out.println(assignment.minarray(array));
		System.out.println(assignment.maxarray(array));
		System.out.println(assignment.avgarray(array));
		System.out.println(assignment.factorial(k));
		System.out.println(assignment.addition(k));
		
		
		
		
	}

}
