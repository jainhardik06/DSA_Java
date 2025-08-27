import java.util.*;

public class prime {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int flag = 0;

        for (int i = 2; i<n ; i++) {
            if (n == 0 || n == 1) {
                System.out.println("Not a prime number");
                break;
            } if (n == 2) {
                System.out.println("Prime number");
                break;
            } if (n%i == 0) {
                System.out.println("Not a prime number");
                break;
            }
            else {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println(n +" is a Prime number");
        }
    }
}
