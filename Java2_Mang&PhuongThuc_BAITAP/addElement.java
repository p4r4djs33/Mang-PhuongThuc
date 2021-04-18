import java.util.Scanner;

/**
 * addElement
 */
public class addElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {5,6,2,3,4};
        int newArray[] = new int[6];
        System.out.println("Enter the number you want to add: ");
        int x = sc.nextInt();
        System.out.println("Enter the index you want to put it: ");
        int index = sc.nextInt();
        for (int i= 0; i < array.length; i++){
                newArray[i] = array[i];
        }
        for (int i = newArray.length-1; i>=index ; i--){
            newArray[i] = newArray[i-1];
        }
        newArray[index] = x;
        for (int i = 0; i<newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
    }
}