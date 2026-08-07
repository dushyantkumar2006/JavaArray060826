import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args)
	{
	     Scanner sc = new Scanner(System.in);
		 
		 int a[] = new int[10];
		 int flag = 0;
		 int index = -1;
		 for(int i=0 ; i<a.length ; i++){
		 
		 System.out.print("Enter the element : ");
		 a[i] = sc.nextInt();
		} 
		
		System.out.print("\nEnter the element to search : ");
		int n = sc.nextInt();
		
		for(int i=0 ; i<a.length ; i++){
		
		    if(a[i] == n){
		
		       flag = 1;
		       index = i;
			   break; 
			}
		}
		if(flag == 1){
		  
		   System.out.print("\nElement fount at index : " +index);
		}
		
		else{
		
		   System.out.print("Element not found ");

		}
	}
}