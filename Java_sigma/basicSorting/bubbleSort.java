public class bubbleSort {
    public static void bubble(int arr[]) {
        int swaps=0;
        for(int i=0; i<arr.length - 1; i++) {
            for(int j=0; j<arr.length - 1- i; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if (swaps==0) {
                return;
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {4,5,1,2,3};
        bubble(arr);  
        for (int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + ",");
        }      
    }
}
