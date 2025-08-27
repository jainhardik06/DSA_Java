import java.util.*;
public class opprime{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int flag=0;
    for(int i=2; i<a; i++){
        if(a%i==0){
            flag++;
        }

    }
    if (flag == 0) {
        System.out.println(a + "is prime");
    } else {
        System.out.println(a + "is not prime");
    }
  }
}