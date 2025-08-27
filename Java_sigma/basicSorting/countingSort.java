public class countingSort {
    public static void countingSort(int arr[]) {
        // Find the largest element in the array
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        
        // Create count array
        int count[] = new int[largest + 1];
        
        // Count frequency of each element
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        
        // Sorting - reconstruct the original array
        int j = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 2, 3};
        countingSort(arr);  
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }      
    }
}
