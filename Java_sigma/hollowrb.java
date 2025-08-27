public class hollowrb {
    public static void main(String[] args) {
        int c=0;
        for(int i=5;i>0;i--) {
            for (int j=0; j<11; j++) {
                if (j<i){
                    System.out.print(" ");
                }
                else if ((i==5 && j>i && c<=4) || (i==1 && j>i && c<=4) || (j==i+1 || j==(10-(5-i)))) {
                    System.out.print("*");
                    c++;
                }
                else{
                    System.out.print(" ");
                }
            }
            c=0;
            System.out.println();
        }
    }
}

