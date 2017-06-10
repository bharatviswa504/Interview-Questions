package bh.algo.matrices;

/**
 * Created by bharatviswanadham on 6/10/17.
 */



public class RotateMatrix {
    public static void main(String args[]) throws Exception
    {
        int size=4;
        int matrix[][] = new int[size][size];
        int t=1;
        for (int i=0;i<size;i++) {
            for (int j=0;j<size;j++) {
                matrix[i][j]=t++;
            }
        }

        System.out.println("original Matrix");
        for (int i=0;i<size;i++) {
            for (int j=0;j<size;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Rotate Matrix 90 degree clock wise");
        rotateClockWise(matrix,size);
        System.out.println("Rotate Matrix 90 degree Anti Clock wise");
        rotateAntiClockWise(matrix,size);
        System.out.println("Rotate Matrix 180 degree Clock wise");
        rotate180ClockWise(matrix,size);
    }

    public static void rotateClockWise(int matrix[][],int n) {

        for (int i=0;i<n/2;i++) {
            for (int r=i;r<n-i-1;r++) {
                int tmp = matrix[i][r];

                matrix[i][r] = matrix[n-r-1][i];

                matrix[n-r-1][i] = matrix[n-i-1][n-r-1];

                matrix[n-i-1][n-r-1] = matrix[r][n-i-1];

                matrix[r][n-i-1] = tmp;
            }
        }

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void rotateAntiClockWise(int matrix[][], int n) {

        for (int i=0;i<n/2;i++){
            for (int r=i;r<n-i-1;r++) {
                int tmp = matrix[i][r];

                matrix[i][r] = matrix[r][n-i-1];

                matrix[r][n-i-1] = matrix[n-i-1][n-r-1];

                matrix[n-i-1][n-r-1] = matrix[n-r-1][i];

                matrix[n-r-1][i] = tmp;
            }
        }

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate180ClockWise(int matrix[][], int n) {

        int tmp =0;
        for (int i=0;i<n/2;i++) {
            for (int r=i;r<n-i-1;r++) {
                tmp = matrix[i][r];

               matrix[i][r] =  matrix[n-i-1][n-r-1];

               matrix[n-i-1][n-r-1] = tmp;

                tmp = matrix[r][n-i-1];

               matrix[r][n-i-1] =  matrix[n-r-1][i];
                matrix[n-r-1][i] = tmp;
            }
        }

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}
