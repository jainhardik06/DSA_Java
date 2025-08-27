import java.util.Scanner;

public class pairs {
    
    public static void displayarray(int array[], int size) {
        for (int i =0; i<size; i++ ) {
            System.out.print(array[i] +",");
            
        } 
        System.out.println();
    }
    
    public static void main(String[] args) {
        int size;
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner (System.in);
        size = sc.nextInt();
        int array[] =new int[size];
        
        System.out.println("Enter elements in array:");
        for (int i =0; i<size; i++ ) {
            array[i] = sc.nextInt();
        }
        displayarray(array, size);

        for (int i =0; i<size; i++ ) {
            for (int j=i+1; j<size; j++) {
                System.out.print("(" + array[i] + "," + array[j] + ")" + ",");
            }
        }
    }
}
