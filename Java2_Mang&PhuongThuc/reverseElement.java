import java.util.Scanner;

public class reverseElement {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the size of array: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size is not accepted. It should be under 20");
            }
        } while (size > 20);
        int array[] = new int[size];
        for (int row = 0; row < size; row++){
            System.out.println("Enter element " + (row+1) +" : ");
            array[row] = sc.nextInt();
        }
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        System.out.println("After reverse:");
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
