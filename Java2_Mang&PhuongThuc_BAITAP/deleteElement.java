import java.util.Scanner;

public class deleteElement {
    public static void enterArray(int arr[]) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < arr.length; i++){
            System.out.println("Enter " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
    }
    public static void showArray(int arr[] ){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void delE(int arr[],int x) {
        int index =0;
        for (int i =0; i<arr.length; i++){
            if  (arr[i] == x){
                index = i;
            }
        }
        for (int i = index ; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int array[] = new int [n];
        enterArray(array);
        showArray(array);
        System.out.println("Enter the element you want to delete: ");
        int x = sc.nextInt();
        delE(array, x);
        n = n-1;
        showArray(array);
    }
}
