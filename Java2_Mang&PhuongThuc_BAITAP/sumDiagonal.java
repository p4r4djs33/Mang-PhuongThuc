import java.util.Scanner;

public class sumDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix1[][] = new int[10][10];
        System.out.println("Enter " + matrix1.length + " rows and " + matrix1[0].length + " columns");
        //nhap matrix
        for (int row = 0; row < matrix1.length ; row++){
            for (int col = 0; col < matrix1[row].length ; col++){
                System.out.println("Enter matrix["+row+"]["+col+"]= ");
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
        int sum = 0;
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                if (i == j) {
                    sum = sum + matrix1[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal is: " + sum);
    }
}
