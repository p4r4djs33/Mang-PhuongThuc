public class testMax {
    public static int max(int num1, int num2) {
        if (num1 > num2)
        return num1;
        else
        return num2;
    }
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is: " + k);
            
        }
    }

