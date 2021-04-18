import java.util.Scanner;


/**
 * mergeArray
 */
public class mergeArray {
    public static void nhap(int array[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< n ; i++){
            System.out.println("Enter " + (i+1) + " :");
            array[i] = sc.nextInt();
        }
    }
    public static void xuat(int array[], int n) {
        for (int i = 0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1: " );
        int n = sc.nextInt();
        int array1[] = new int [n];
        nhap(array1, n);
        xuat(array1, n);
        System.out.println("Enter size of array 2: ");
        int m = sc.nextInt();
        int array2[] = new int[m];
        nhap(array2, m);
        xuat(array2, m);
        int k = m + n;
        int array3[] = new int [k];
        for(int i = 0; i< array1.length; i++){
                array3[i] = array1[i];
        }
        for(int i = 0; i <array2.length; i++){
            array3[array2.length + i] = array2[i];
        }
        xuat(array3, k);
    }
}