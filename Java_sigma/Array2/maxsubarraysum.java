public class maxsubarraysum {

    public static void maxsubarray(int array[]) {
        int max=0,i,j,sum=0;
        for(i=0; i<array.length; i++) {
            for (j=i; j<array.length; j++) {
                System.out.println("Sub Array:");
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + ",");
                    sum += array[k];
                    
                }
                if(max<sum) {
                        max=sum;
                    }
                System.out.println();
                System.out.println("Sum of Subarray:" + sum);
                sum=0;
            }
        }
        System.out.println("max sum:" + max);
        
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        maxsubarray(array);
    }
}
