import java.util.Scanner;

public class findMinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix1[][] = new int[10][10];
        System.out.println("Enter " + matrix1.length + " rows and " + matrix1[0].length + " columns");
        //nhap matrix
        for (int row = 0; row < matrix1.length ; row++){
            for (int col = 0; col < matrix1[row].length ; col++){
                System.out.println("Nhap matrix["+row+"]["+col+"]= ");
                matrix1[row][col] = (int) (Math.random() * 10);
            }
        }
        //xuat matrix
        for (int row = 0; row <matrix1.length; row++){
            for (int col = 0; col < matrix1[row].length; col++){
                System.out.print(matrix1[row][col] + " ");
            }
            System.out.println();
        }

        int min = matrix1[0][0];
        int row1=0, col1=0;
        for (int row = 0; row < matrix1.length; row++){
            for (int col = 0; col < matrix1[0].length; col++){
                if (matrix1[row][col] < min){
                    min = matrix1[row][col];
                    row1 = row;
                    col1 = col;
                }
            }
        }
        System.out.println("Min is: " + min + " at " + (row1+1) + ", " + (col1+1) );
    }
}
