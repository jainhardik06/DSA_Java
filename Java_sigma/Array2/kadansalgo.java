public class kadansalgo {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,-4,-3,-2,-1};
        int cs =0, ms =0;
        for (int i =0; i<6; i ++) {
            if(array[i] < 0) {
                cs =0;
            } else {
                cs = cs+array[i];
            }

            if(ms < cs) {
                ms = cs;
            }
        }

        System.err.println("max sum:" + ms);
    }   
}
