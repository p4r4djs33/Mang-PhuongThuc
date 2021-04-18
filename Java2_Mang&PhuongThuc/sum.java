/**
 * sum
 */
public class sum {
    public static int countSum(int i1, int i2) {
        int sum =0;
        for(int i = i1; i<=i2; i++){
            sum =sum + i;
        }
        return sum;
    }
    

    public static void main(String[] args) {
        System.out.println("Sum from 1 to 10 is: " + countSum(1, 10));
        System.out.println("Sum from 20 to 37 is: " + countSum(20, 37));
        System.out.println("Sum from 35 to 49 is: " + countSum(35, 49));
    }
}