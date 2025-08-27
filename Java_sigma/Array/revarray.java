import java.util.Scanner;

public class revarray {
    
    public static void displayarray(int array[], int size) {
        for (int i =0; i<size; i++ ) {
            System.out.print(array[i] +",");
            
        } 
        System.out.println();
    }

    public static void reversearray(int array[], int size) {
        int temparray[] = new int[size];
        for (int i =0; i<size; i++ ) {
            temparray[i] =array[i]; 
        } 

        for (int i=size-1; i>=0; i--) {
            array[(size-1)-i] = temparray[i];
        }
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

        reversearray (array, size);

        displayarray(array, size);
    }
}
