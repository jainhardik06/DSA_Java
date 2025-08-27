import java.util.*;

public class areaofcircle {
    public static void main (String srgs[]) {
        System.out.println("Enter the radius of circle:");
        Scanner sc = new Scanner (System.in);
        int r = sc.nextInt();
        double area = 3.14 * r * r;
        System.out.println("Area of Circle:" + area);
    }
}
