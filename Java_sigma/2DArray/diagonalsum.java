public class diagonalsum {
    public static void main (String [] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        System.out.println("4x4 Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int psum=0, ssum=0;
        for(int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (i==j) {
                    psum+=matrix[i][j];
                }
                if (j == matrix[0].length-i-1) {
                    ssum += matrix[i][j];
                }
            }
        }
        System.out.println("Primary sum:" + psum +" Secondary sum:" + ssum);
    }
}
