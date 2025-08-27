import java.util.*;
import java.math.*;
public class bitodec {
    public static void main(String args[])
    {
       int i=0 , sum=0 ; 
        System.out.println("Enter a binary number");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        while (a>0){
            int d = a%10;
            int n = (int)Math.pow(2,i);
            int b=d*n;
            sum = sum+b;
            i++;
            a=a/10;
        }
        System.out.println(sum);
    }
}
