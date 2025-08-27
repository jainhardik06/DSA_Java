import java.util.Scanner;

public class trappedrainwater {
    public static void auxarray(int array[], int size, int leftmax[], int rightmax[]) {



        for (int i =0; i<size; i++) {
            if(i==0) {
                leftmax[i] = array[i];
            }
            else if (array[i] > leftmax[i-1]) {
                leftmax[i] = array[i];
            } else {
                leftmax[i] = leftmax[i-1];
            }
        }

        for (int i =size-1; i>=0; i--) {
            if(i==size-1) {
                rightmax[i] = array[i];
            }
            else if (array[i] > rightmax[i+1]) {
                rightmax[i] = array[i];
            } else {
                rightmax[i] = rightmax[i+1];
            }
        }

    
        
    }

    public static int trappedwater(int array[], int size, int leftmax[], int rightmax[]) {
        int water,minhight, totalwater=0;
        for(int i =0; i<size; i++){
            if (leftmax[i]> rightmax[i]) {
                minhight = rightmax[i];
            } else {
                minhight = leftmax[i];
            }

            water = minhight-array[i];
            if(water>=0) {
                totalwater+=water;
            }
            
        }

        return totalwater;
        
    }

    public static void displayArray(int array[], int size) {
        System.out.println();
        for (int i =0; i<size; i++) {
            
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];

        for (int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        

        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        auxarray(array, n, leftmax, rightmax);

        displayArray(leftmax, n);
        displayArray(rightmax, n);

        int totalwater = trappedwater(array, n, leftmax, rightmax);
        System.out.println("Total water trapped:" + totalwater);
        
    }
}
