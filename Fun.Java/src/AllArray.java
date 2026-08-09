import java.util.Scanner;
class AllArray {
	
	public static void PrintArray(int a[]) {
		
		for(int v : a) {
			
			System.out.print("  " +v);
		}
	}
	
	public static void RevArray(int a[]) {
	    
	       for(int i=a.length-1 ; i>=0 ; i--) {
	       System.out.print("  " +a[i]);
	    }
	}
	
	public static void SumArray(int a[]) {
		
		   int sum = 0;
		    
	       for(int i=0 ; i<a.length ; i++) {
	    	 sum = sum+a[i]; 
		}
	       System.out.print("Sum : " +sum);
	}
	public static void MaxArray(int a[]) {
		
		   int max = a[0];
		    
	       for(int i=0 ; i<a.length ; i++) {
	    	 if(a[i]>max) {
	    		 max = a[i];
	    	 }
		}
	       System.out.print("Maximum : " +max);
	}
    
	public static void MinArray(int a[]) {
		
		   int min = a[0];
		    
	       for(int i=0 ; i<a.length ; i++) {
	    	 if(a[i]<min) {
	    		 min = a[i];
	    	 }
		}
	       System.out.print("Minimum : " +min);
	}

	public static void SecMax(int a[]) {
		
		   int max = a[0];
		    
	       for(int i=0 ; i<a.length ; i++) {
	    	 if(a[i]>max) {
	    		 max = a[i];
	    	 }
		}
		   int secmax = a[0];
		    
	       for(int i=0 ; i<a.length ; i++) {
	    	 if(a[i]>secmax && a[i]<max) {
	    		 secmax = a[i];
	    	 }
		}
	       System.out.print("Maximum : " +max);
	       System.out.print("\nSecMaximum : " +secmax);
	}
	public static void SelSort(int a[]) {
	    
	       for(int i=0 ; i<a.length ; i++) {
	    	   
	    	   for(int j=i+1 ; i<a.length ; i++) {
	               
	    		  if(a[i] < a[j]) {
	    	        int temp = a[i];
	    	        a[i] = a[j];
	    	        a[j] = temp;
	    		  }
		       }
	       }
	       for(int i=0 ; i<a.length ; i++) {
	       System.out.print("  " +a[i]);
	    }
	}
	
	public static void BubbleSort(int a[]) {
	    
	       for(int i=0 ; i<a.length ; i++) {
	    	   
	    	   for(int j=0 ; i<a.length-1 ; i++) {
	               
	    		  if(a[j] < a[j+1]) {
	    	        int temp = a[j];
	    	        a[j] = a[j+1];
	    	        a[j+1] = temp;
	    		  }
		       }
	       }
	       for(int i=0 ; i<a.length ; i++) {
	       System.out.print("  " +a[i]);
	    }
	}
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
        int a[] = new int[5];
         
		for(int i=0 ; i<a.length ; i++) {
			System.out.print("Enter the number : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("\n=====Display Array Element=====\n ");
		PrintArray(a);
		System.out.print("\n================================\n ");
		
		System.out.print("=====Reverse of Array=====\n ");
		RevArray(a);

		System.out.print("\n=====Sum of Array=====\n ");
		SumArray(a);
		
		System.out.print("\n=====Maximum Element of Array=====\n ");
		MaxArray(a);
		
		System.out.print("\n=====Minimum Element of Array=====\n ");
		MinArray(a);
		
		System.out.print("\n=====SecMaximum Element of Array=====\n ");
		SecMax(a);
		
		System.out.print("\n===== Selection Sort Array=====\n ");
		SelSort(a);
		
		System.out.print("\n===== Bubble Sort Array=====\n ");
		BubbleSort(a);
		
	    
	}	    
	
}
