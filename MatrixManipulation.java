import java.util.Scanner;

public class MatrixManipulation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n********************************************** Matrix Manipulation *****************************************");
            System.out.println("\n1.Create Matrix \n2.Addition \n3.Subtraction \n4.Multiplication \n5.Transpose \n6.Inverse \n7.Exit");
            System.out.print("\nSelect an option : ");
            int ch = in.nextInt();
            System.out.println();

            switch (ch) {
                case 1:
                    System.out.print("Enter No. of Matrices: ");
                    int l = in.nextInt();
                    System.out.print("Enter row size: ");
                    int rows = in.nextInt();
                    System.out.print("Enter column size: ");
                    int cols = in.nextInt();
                    int[][][] mats = new int[rows][cols][l];
                    for (int k = 0; k < l; k++) {
                        System.out.println("Enter values for Matrix " + (k + 1) + ":");
                        for (int i = 0; i < rows; i++) {
                            for (int j = 0; j < cols; j++) {
                                System.out.print("a[" + (i + 1) + "][" + (j + 1) + "] : ");
                                mats[i][j][k] = in.nextInt();
                            }
                        }
                    }
                    for (int k = 0; k < l; k++) {
                        System.out.println("\nMatrix " + (k + 1) + ":");
                        printMatrix(mats, k);
                    }
                    break;

                case 2: // Addition
                    System.out.print("Enter rows and columns: ");
                    int r2 = in.nextInt(); int c2 = in.nextInt();
                    int[][] a2 = new int[r2][c2]; int[][] b2 = new int[r2][c2];
                    fillMatrix(in, a2, "1st"); fillMatrix(in, b2, "2nd");
                    System.out.println("Result:");
                    for (int i = 0; i < r2; i++) {
                        for (int j = 0; j < c2; j++) System.out.print("\t" + (a2[i][j] + b2[i][j]));
                        System.out.println();
                    }
                    break;

                case 4: // Multiplication
                    System.out.print("Rows for Matrix A: "); int ra = in.nextInt();
                    System.out.print("Cols for Matrix A (Rows for B): "); int ca = in.nextInt();
                    System.out.print("Cols for Matrix B: "); int cb = in.nextInt();
                    int[][] A = new int[ra][ca]; int[][] B = new int[ca][cb];
                    fillMatrix(in, A, "A"); fillMatrix(in, B, "B");
                    
                    
                    
                    System.out.println("Result:");
                    for (int i = 0; i < ra; i++) {
                        for (int j = 0; j < cb; j++) {
                            int sum = 0;
                            for (int k = 0; k < ca; k++) sum += A[i][k] * B[k][j];
                            System.out.print("\t" + sum);
                        }
                        System.out.println();
                    }
                    break;

                case 5: // Transpose
                    System.out.print("Rows and Cols: ");
                    int rt = in.nextInt(); int ct = in.nextInt();
                    int[][] T = new int[rt][ct];
                    fillMatrix(in, T, "Matrix");
                    System.out.println("Transpose:");
                    for (int i = 0; i < ct; i++) {
                        for (int j = 0; j < rt; j++) System.out.print("\t" + T[j][i]);
                        System.out.println();
                    }
                    break;

                case 6: // Inverse (Precise)
                    findAndDisplayInverse(in);
                    break;

                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // --- HELPER METHODS ---

    private static void fillMatrix(Scanner in, int[][] m, String name) {
        System.out.println("Enter elements for " + name + ":");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++) m[i][j] = in.nextInt();
    }

    private static void printMatrix(int[][][] mats, int k) {
        for (int i = 0; i < mats.length; i++) {
            for (int j = 0; j < mats[0].length; j++) System.out.print("\t" + mats[i][j][k]);
            System.out.println();
        }
    }

    private static void findAndDisplayInverse(Scanner in) {
        System.out.print("Size of square matrix: ");
        int n = in.nextInt();
        double[][] matrix = new double[n][n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) matrix[i][j] = in.nextDouble();

        

        double[][] inv = calculateInverse(matrix);
        if (inv == null) {
            System.out.println("Singular matrix! No inverse exists.");
        } else {
            System.out.println("Inverse Matrix:");
            for (double[] row : inv) {
                for (double val : row) System.out.printf("\t%.2f", val);
                System.out.println();
            }
        }
    }

    private static double[][] calculateInverse(double[][] matrix) {
        int n = matrix.length;
        double[][] aug = new double[n][2 * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) aug[i][j] = matrix[i][j];
            aug[i][i + n] = 1;
        }

        for (int i = 0; i < n; i++) {
            double pivot = aug[i][i];
            if (Math.abs(pivot) < 1e-10) return null;
            for (int j = 0; j < 2 * n; j++) aug[i][j] /= pivot;
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = aug[k][i];
                    for (int j = 0; j < 2 * n; j++) aug[k][j] -= factor * aug[i][j];
                }
            }
        }

        double[][] res = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) res[i][j] = aug[i][j + n];
        return res;
    }
}
