
import java.util.Scanner;
public class FunctionDemo {

	public static void sum(int a,int b) {
		
	     int c = a+b;
	     
         System.out.print(" sum : "+c);
	}
	
	public static float product(float a,float b) {
		
		return a*b;
	}
	
	public static double avg(double x,double y,double z) {
		
		 return (x+y+z)/3.0;	 	 
	}
	
	public static double SimpleInterest(double p,double r,double t) {
		
		return (p * r * t)/100;
	}
	
	public static int Square(int n) {
		
		return n * n;
	}
	
	public static int Cube(int n) {
		
		return n*n*n;
	}
	
    public static int AreaOfRectangle(int l,int w) {
		
		return l*w;
    }
    
    public static void CheckEvenOdd(int n) {
    		
		if(n%2==0)
			
		System.out.print("\nEven Number : "+n);	
		
		else
			
		System.out.print("\nOdd Number : "+n);	
			
    }
    
    public static void LargeSmall(int a,int b) {
    	
    	if(a>b)
    	
    	System.out.print("\nLargest Number : "+a);	
    	
    	else
    		
        System.out.print("\nLargest Number : "+b);	
    }
    
	public static void Factorial(int n) {
		
		int fact = 1;
		for(int i=1 ; i<=n ; i++) {
			
			 fact = fact * i;
		}
		System.out.print("\nFactorial : "+fact);	
	}
	
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		sum(100,200);
		
		System.out.print("\n\nEnter the value of a : ");
		float a = sc.nextFloat();
		System.out.print("Enter the value of b: ");
		float b = sc.nextFloat();
		float pro = product(a,b);
		System.out.print("product : "+pro);
		
		System.out.print("\n\nEnter the value of a : ");
		double x = sc.nextDouble();
		System.out.print("Enter the value of b : ");
		double y = sc.nextDouble();
		System.out.print("Enter the value of c : ");
		double z = sc.nextDouble();
		double res = avg(x,y,z);
		System.out.print("Average : "+res);
		
		System.out.print("\n\nEnter the value of principle : ");
		double p = sc.nextDouble();
		System.out.print("Enter the value of rate : ");
		double r = sc.nextDouble();
		System.out.print("Enter the value of time : ");
		double t = sc.nextDouble();
		double si = SimpleInterest(p,r,t);
        System.out.print("SimpleInterest : "+si);
	    
    	System.out.print("\n\nEnter the number : ");
		int n = sc.nextInt();
		int s = Square(n);
		System.out.print("Square : "+s);
		
		System.out.print("\n\nEnter the number : ");
		int i = sc.nextInt();
		int result = Cube(i);
		System.out.print("Cube : "+result);
		
		System.out.print("\n\nEnter the length : ");
		int l = sc.nextInt();
		System.out.print("Enter the width : ");
		int w = sc.nextInt();
		int area = AreaOfRectangle(20,30);
		System.out.print("Area of rectangle : "+area);
		
		CheckEvenOdd(10);
		
		LargeSmall(65,89);
		
		Factorial(5);
	}

}
;