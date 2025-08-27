import java.util.*;
public class subarray {
    
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
        System.out.println("All subarrays:");
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
        }
    }
}

