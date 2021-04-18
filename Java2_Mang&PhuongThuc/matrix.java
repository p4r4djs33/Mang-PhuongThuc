import java.util.Scanner;

public class matrix {
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

        //tong matrix
        int total = 0;
        for (int row = 0; row < matrix1.length; row++){
            for(int col = 0; col < matrix1[row].length; col++){
                total += matrix1[row][col];
            }
        }
        System.out.println("Tong phan tu: " + total);

        //tong column
        for (int col = 0; col< matrix1[0].length; col++){
            int sumCol =0;
            for (int row =0; row<matrix1.length; row++){
                sumCol += matrix1[row][col];
            }
            System.out.println("Sum of column " + col +" is: " + sumCol);
        }

        //tong row
        int arraySumRow[] = new int[matrix1.length];
        for (int row =0; row< matrix1.length; row++){
            int sumRow = 0;
            for (int col = 0 ; col < matrix1[0].length; col++){
                sumRow += matrix1[row][col];
            }

            System.out.println("Sum of row " + row + " is: " + sumRow);
            arraySumRow[row] = sumRow;
        }


        for (int row =0; row<matrix1.length; row++){
            System.out.print(arraySumRow[row] + " ");
        }

        //tim max row
        int max =0;
        for (int row = 0; row < arraySumRow.length; row++){
            if (arraySumRow[row] > max){
                max = arraySumRow[row];
            }
        } 
        System.out.println();
        System.out.println(max);  


        //xao tron matrix
        for (int row = 0 ; row < matrix1.length; row++){
            for (int col = 0; col < matrix1[0].length; col++){
                int row1 = (int) Math.random() * matrix1.length;
                int col1 = (int) Math.random() * matrix1[0].length;

                int temp = matrix1[row][col];
                matrix1[row][col] = matrix1[row1][col1];
                matrix1[row1][col1] = temp;
            }
        }

        for (int row = 0; row <matrix1.length; row++){
            for (int col = 0; col < matrix1[row].length; col++){
                System.out.print(matrix1[row][col] + " ");
            }
            System.out.println();
        }
    }
}
