import java.util.*;
public class income {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt();
        if (i < 500000) {
            System.out.println("No tax");
        } else if (i > 500000 && i < 1000000) {
            System.out.println("10% tax");
            int tax = (i * 10) / 100;
            System.out.println("Tax is " + tax);
            System.out.println("Income left" + (i - tax));
        } else if (i > 1000000 && i < 2000000) {
            System.out.println("20% tax");
            int tax = (i * 20) / 100;
            System.out.println("Tax is " + tax);
            System.out.println("Income left" + (i - tax));
        } else if (i > 2000000) {
            System.out.println("30% tax");
            int tax = (i * 30) / 100;
            System.out.println("Tax is " + tax);
            System.out.println("Income left" + (i - tax));
        } else {
            System.out.println("Invalid input");
        }
    }
}
