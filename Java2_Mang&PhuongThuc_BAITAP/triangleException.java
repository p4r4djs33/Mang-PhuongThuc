import java.util.Scanner;

/**
 * triangleException
 */
public class triangleException {
    public void CheckTriangle(int angle1, int angle2, int angle3){
        if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
            throw new ArithmeticException("Triangle's angle must be positive");
        } else if (angle1 + angle2 <= angle3 || angle2 + angle3 <= angle1 || angle1 + angle3 <= angle2 ) {
            throw new ArithmeticException("Sum of 2 angles must larger than the rest");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first angle: ");
        int angle1 = sc.nextInt();
        System.out.println("");
        System.out.println("Enter the second angle: ");
        int angle2 = sc.nextInt();
        System.out.println("");
        System.out.println("Enter the third angle: ");
        int angle3 = sc.nextInt();
        System.out.println("");
        triangleException a = new triangleException();
        a.CheckTriangle(angle1, angle2, angle3);
        System.out.println("Successfully entered");
    }
}