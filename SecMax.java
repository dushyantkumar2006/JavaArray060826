import java.util.Scanner;

public class SecMax {

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

        int max = a[0];
   
        for (int i = 0; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }
		}	
        int secmax = a[0];  
			
         for (int i = 0; i < a.length; i++) {			
            if (a[i] > secmax && a[i] < max) {
                secmax = a[i];
            }
        }

        System.out.print("\nSecmaximum element of array : " + secmax);
		
        System.out.print("\nMaximum element of array : " + max);
    }
}