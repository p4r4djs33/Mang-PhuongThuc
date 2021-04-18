import java.util.Scanner;

public class countChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("Enter the character");
        char c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i<s.length(); i++){
            if (c == s.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
