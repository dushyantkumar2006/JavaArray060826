import java.util.Scanner;

public class MaxMin {

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
        int min = a[0];  
			
         for (int i = 0; i < a.length; i++) {			
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.print("\nMinimum element of array : " + min);
		
        System.out.print("\nMaximum element of array : " + max);
    }
}