public class hollowrectangle {
    public static void main (String args[]) {
        int r = 4, c = 4;
        int i,j;
        for (i=0; i < r ; i++){
            for (j=0; j<c; j++) {
                if (i==0 || i == r-1 || j==0 || j==c-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
