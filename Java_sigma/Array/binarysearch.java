import java.util.Scanner;

public class binarysearch {
    
    public static void sort(int array[], int size) {
        int temp;
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    
    public static int binary(int array[], int low, int high, int n) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (array[mid] == n) {
                System.out.println("The number is found at index " + mid);
                return mid;
            }
            
            if (array[mid] > n) {
                return binary(array, low, mid - 1, n);
            } else {
                return binary(array, mid + 1, high, n);
            }
        }
        
        System.out.println("Number not found");
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        
        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        
        sort(array, size);
        
        System.out.print("Enter the number to search: ");
        int n = sc.nextInt();
        
        binary(array, 0, size - 1, n);
        sc.close();
    }
}