package frequentlyaskedprograms;

public class SwapNumbers {

	public static void main(String[] args) {
		
		// Logic 1
		
		int a = 10;
		int b = 20;
		
		System.out.println("This is before swap.."+a+"  "+b );
		
	/*	int c=b;
		b=a;
		a=c; 
		
		System.out.println("This is after swap.."+a+" "+b);*/
		
		// Logic 2
		
		int c = a+b;
		    a = c-a;
		    b = c-b;

		 System.out.println("This is after swap.."+a+" "+b);
	}
	

}
