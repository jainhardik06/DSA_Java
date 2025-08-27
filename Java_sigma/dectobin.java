import java.util.*;

public class dectobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int dec =  sc.nextInt();
        int q,rem, temp = dec;
        String binary = "";
        while (temp >0) {
            temp = temp / 2;
            rem = dec%2;
            binary=rem+binary;
            dec = temp;
        }


        System.out.println(binary);
    }
}
