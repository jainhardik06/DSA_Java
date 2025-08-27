public class solidrhombus {

    public static void main(String[] args) {
        int c=0;
        for (int i=4; i>=1; i--) {
            for (int j=1; j<=8; j++) {
                if(j>=i) {
                    if(c<=4) {
                    System.out.print("*");
                    c++;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            c=0;
            System.out.println();
        }
    }
}