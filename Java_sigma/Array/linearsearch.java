import java.util.*;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number you want to Search on array:");
        int num = sc.nextInt();

        int arr[] = {1,2,3,4,5,6,7,8,9};
        int index=0, Flag = 0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i] == num) {
                Flag = 1;
                index = i;
                break;
            }
        }

        if(Flag == 1) {
            System.out.println(num + " is Found on " + index + " index");
        } else {
            System.out.println(num +" is not found on entire array");
        }
    }
}
