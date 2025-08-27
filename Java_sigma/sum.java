import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum:" + sum);
        int p = a*b;
        System.out.println("Product:" + p);
    }
}
