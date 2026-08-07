import java.util.Scanner;

public class SecMin {

    public static void main(String[] args) {

        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the element : ");
            a[i] = sc.nextInt();
        }

        System.out.print("\n======Display array element=======\n");

        for (int v : a) {
            System.out.print(" " + v);
        }

        System.out.print("\n===============================\n");
		
	    int min = a[0];  
			
         for (int i = 0; i < a.length; i++) {	
		 
            if (a[i] < min) {
                min = a[i];
            }
        }
		
        int secmin = a[0];
   
        for (int i = 0; i < a.length; i++) {

            if (a[i] < min) {
                secmin = min;
                min = a[i];
            }
			
            else if (a[i] < secmin && a[i] != min) {
                secmin = a[i];
            }
        }
    
        System.out.print("\nMinimum element of array : " + min);
		
        System.out.print("\nSecminimum element of array : " + secmin);
    }
}