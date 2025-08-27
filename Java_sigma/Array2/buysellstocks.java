public class buysellstocks {
    public static int[] buysell(int array[], int size) {
        int min=array[1], max=0,buyat=0,sellat=0;
        for (int i=0; i<size; i++) {
            if (min>array[i]){
                min = array[i];
            }
        }

        for (int i=0; i<size; i++) {
            if (min==array[i]){
                buyat = i;
                break;
            }
        }

        for (int i=buyat; i<size; i++) {
            if (max<array[i]){
                max = array[i];
            }
        }

        for (int i=0; i<size; i++) {
            if (min==array[i]){
                sellat = i;
                break;
            }
        }

        int retarray[] = {min, buyat+1, max, sellat+1};
        return retarray;

    }

    public static void main(String[] args) {
        int size = 6;
        int array[] = {7,1,5,3,6,4};
        int result[] = buysell(array, size);
        

        System.out.println("Buy at day:" + result[1] + " at price:" + result[0]);
        System.out.println("Sell at day:" + result[3] + " at price:" + result[2]);
    }
}
