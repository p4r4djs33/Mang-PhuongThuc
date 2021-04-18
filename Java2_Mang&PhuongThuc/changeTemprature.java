import java.util.Scanner;

public class changeTemprature {
    public static double CtoF(double C) {
        double F = (9.0/5) * C + 32;
        return F;
    }
    public static double FtoC(double F) {
        double C = (5.0/9) * (F - 32);
        return C;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. F to C ");
            System.out.println("2. C to F");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter F: ");
                double F = sc.nextDouble();
                FtoC(F);
                System.out.println("After change to C: " + FtoC(F));
                break;
                case 2:
                System.out.println("Enter C: ");
                double C = sc.nextDouble();
                CtoF(C);
                System.out.println("After change to F: " + CtoF(C));
                break;
            } 
        } while(choice != 0);
    }
}
