import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		 
		int a[] = new int[10];
		 
		System.out.print("\n====Input Array Element===\n ");
		 
		for(int i=0 ; i<a.length ; i++){
		 
		  System.out.print("Enter the element : ");
		  a[i] = sc.nextInt();
		} 
		
		for(int i=0, j=a.length-1 ; i<j ; i++,j--){
		
		    int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		  
	    System.out.print("\n====Reversing Array====\n ");
		   
	    for(int i=0 ; i<a.length ; i++){
			   
		   System.out.print("  " +a[i]);
		   
		}  
		 		  
	}
}