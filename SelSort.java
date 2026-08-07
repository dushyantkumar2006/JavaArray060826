import java.util.Scanner;

public class SelSort
{
     public static void main(String[] args){ 
	 
	  Scanner sc = new Scanner(System.in);
	  
	  int a[] = new int[5];
	  
	  for(int i=0 ; i<a.length ; i++){
	   
	     System.out.print("Enter the element : ");
		 a[i] = sc.nextInt();
	  }
	  
	  for(int i=0 ; i<a.length; i++){
	     
		 for(int j=i+1 ; j<a.length ; j++ ){
		 
		      if(a[i] < a[j]){
			   
			     int temp = a[i];
				 a[i] = a[j];
				 a[j] = temp;
			  }
		  }
	  }
	  
	  System.out.print("\n=====Sorted Array=====\n");
	  
	  for(int i=0 ; i<a.length ; i++)
	  System.out.print("  " + a[i]);
	
    }
} 
    