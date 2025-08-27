public class basic {

    public static int update(int a, int arr[]) {
        
        for (int i=0; i<arr.length; i++) {
            arr[i]=arr[i]+5;
        }
        return(a+5);
    }
    public static void main(String[] args) {
        int num = 1;
        int array[] = {1,2,3,4,5};
        int number = update(num, array);
        System.out.println(number);
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + ",");
            System.out.println(num);
        }
    }
}
