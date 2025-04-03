import java.util.Scanner;

public class MatrixManipulation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
        System.out.println("\n********************************************** Matrix Manipulation *****************************************");
        System.out.println("\n1.Create Matrix \n2.Addition of Matrices\n3.Subtraction of Matrices\n4.Multiplication of Matrices\n5.Division of Matrices\n6.Transpose\n7.Inverse\n8.Exit");
        System.out.print("\nSelect an option : ");
        int ch = in.nextInt();
        System.out.println();
        switch(ch){
        
        case 1:
        	System.out.print("Enter No. of Matrix : ");
        	int l = in.nextInt();
        	System.out.print("Enter row size: ");
            int m8 = in.nextInt();
            System.out.print("Enter column size: ");
            int n8 = in.nextInt();
            int[][][] array=new int[m8][n8][l];
            for(int k=0;k<l;k++) {
            	System.out.println("Enter values of Matrix "+(k+1)+" : \n");
            	for(int i=0;i<m8;i++) {
            		for(int j=0;j<n8;j++) {
            			System.out.print("a["+(i+1)+"]["+(j+1)+"] : ");
            			array[i][j][k] = in.nextInt();
            		}
            	}
            }
            for(int k=0;k<l;k++) {
            	System.out.println("\nMatrix "+(k+1)+" : \n");
            	for(int i=0;i<m8;i++) {
            		for(int j=0;j<n8;j++) {
            			System.out.print("\t"+array[i][j][k]);
            		}
            		System.out.println();
            	}
            }
            break;
            
/*-------------------------------------------------------------------------*/
            
        case 2:
        	System.out.print("Enter row size: ");
            int m = in.nextInt();
            System.out.print("Enter column size: ");
            int n = in.nextInt();
            
            int[][] arr1 = new int[m][n];
            int[][] arr2 = new int[m][n];
            System.out.println("Enter elements for 1st matrix: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr1[i][j] = in.nextInt();
                }
            }
            System.out.println("Enter elements for 2nd matrix: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr2[i][j] = in.nextInt();
                }
            }
            System.out.println("Addition : \n");
            int[][] arr3 = new int[m][n];
            for(int i=0;i<m;i++) {
            	for(int j=0;j<n;j++) {
            		arr3[i][j] = arr1[i][j]+arr2[i][j];
            		System.out.print("\t"+arr3[i][j]);
            	}
            	System.out.println();
            }
            break;
            
/*-------------------------------------------------------------------------*/
            
        case 3:
        	System.out.print("Enter row size: ");
            int m1 = in.nextInt();
            System.out.print("Enter column size: ");
            int n1 = in.nextInt();
            
            int[][] arr11 = new int[m1][n1];
            int[][] arr12 = new int[m1][n1];
            System.out.println("Enter elements for 1st matrix: ");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    arr11[i][j] = in.nextInt();
                }
            }
            System.out.println("Enter elements for 2nd matrix: ");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    arr12[i][j] = in.nextInt();
                }
            }
            System.out.println("Subtraction : \n");
            int[][] arr13 = new int[m1][n1];
            for(int i=0;i<m1;i++) {
            	for(int j=0;j<n1;j++) {
            		arr13[i][j] = arr11[i][j]-arr12[i][j];
            		System.out.print("\t"+arr13[i][j]);
            	}
            	System.out.println();
            }
            break;
            
/*-------------------------------------------------------------------------*/            
            
        case 4:
        	System.out.print("Enter row size: ");
            int m2 = in.nextInt();
            System.out.print("Enter column size: ");
            int n2 = in.nextInt();
            
            int[][] arr21 = new int[m2][n2];
            int[][] arr22 = new int[m2][n2];
            System.out.println("Enter elements for 1st matrix: ");
            for (int i = 0; i < m2; i++) {
                for (int j = 0; j < n2; j++) {
                    arr21[i][j] = in.nextInt();
                }
            }
            System.out.println("Enter elements for 2nd matrix: ");
            for (int i = 0; i < m2; i++) {
                for (int j = 0; j < n2; j++) {
                    arr22[i][j] = in.nextInt();
                }
            }
            System.out.println("Addition : \n");
            int[][] arr23 = new int[m2][n2];
            for(int i=0;i<m2;i++) {
            	for(int j=0;j<n2;j++) {
            		arr23[i][j] = arr21[i][j]+arr22[i][j];
            		System.out.print("\t"+arr23[i][j]);
            	}
            	System.out.println();
            }
            break;
            
/*-------------------------------------------------------------------------*/            
            
		case 5:
        	System.out.print("Enter row size: ");
            int m3 = in.nextInt();
            System.out.print("Enter column size: ");
            int n3 = in.nextInt();
            
            int[][] arr31 = new int[m3][n3];
            int[][] arr32 = new int[m3][n3];
            System.out.println("Enter elements for 1st matrix: ");
            for (int i = 0; i < m3; i++) {
                for (int j = 0; j < n3; j++) {
                    arr31[i][j] = in.nextInt();
                }
            }
            System.out.println("Enter elements for 2nd matrix: ");
            for (int i = 0; i < m3; i++) {
                for (int j = 0; j < n3; j++) {
                    arr32[i][j] = in.nextInt();
                }
            }
            System.out.println("Division : \n");
            int[][] arr33 = new int[m3][n3];
            for(int i=0;i<m3;i++) {
            	for(int j=0;j<n3;j++) {
            		arr33[i][j] = arr31[i][j]/arr32[i][j];
            		System.out.print("\t"+arr33[i][j]);
            	}
            	System.out.println();
            }
            break;
            
/*-------------------------------------------------------------------------*/            
            
        case 6:
        	System.out.print("Enter row size: ");
            int m4 = in.nextInt();
            System.out.print("Enter column size: ");
            int n4 = in.nextInt();
            
            int[][] arr41 = new int[m4][n4];
            System.out.println("Enter elements for 1st matrix: ");
            for (int i = 0; i < m4; i++) {
                for (int j = 0; j < n4; j++) {
                    arr41[i][j] = in.nextInt();
                }
            }
            System.out.println("Original Matrix : \n");
            for(int i=0;i<m4;i++) {
            	for(int j=0;j<n4;j++) {
            		System.out.print("\t"+arr41[i][j]);
            	}
            	System.out.println();
            }
            System.out.println("Transpose : \n");
            for(int i=0;i<m4;i++) {
            	for(int j=0;j<n4;j++) {
            		System.out.print("\t"+arr41[j][i]);
            	}
            	System.out.println();
            }
            break;
            
/*-------------------------------------------------------------------------*/
            
        case 7:
        	findAndDisplayInverse();
        	break;
        	
/*-------------------------------------------------------------------------*/        	
        	
        case 8:
        	System.out.println("Exiting the program....");
        	System.exit(0);
        	
/*-------------------------------------------------------------------------*/
        	
        default:
        	System.out.println("Invalid choice...!");
        }
       }
    }
    
/*-------------------------------------------------------------------------*/
    
    public static void findAndDisplayInverse() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int m = in.nextInt();
        System.out.print("Enter column size: ");
        int n = in.nextInt();

        if (m != n) {
            System.out.println("Matrix inversion is only possible for square matrices!");
            return;
        }

        int[][] matrix = new int[m][n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        
        int[][] inverse = findInverse(matrix);

        if (inverse == null) {
            System.out.println("The matrix is singular and cannot be inverted.");
        } else {
            System.out.println("Inverse of the matrix:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("\t" + inverse[i][j]);
                }
                System.out.println();
            }
        }
    }

    // Function to calculate the inverse of a matrix
    public static int[][] findInverse(int[][] matrix) {
        int n = matrix.length;
        double[][] augmented = new double[n][2 * n];

        // Create augmented matrix [A | I]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                augmented[i][j] = matrix[i][j];
            }
            for (int j = n; j < 2 * n; j++) {
                augmented[i][j] = (i == j - n) ? 1 : 0;
            }
        }

        // Perform Gaussian elimination
        for (int i = 0; i < n; i++) {
            // Make the diagonal element 1
            double diagElement = augmented[i][i];
            if (diagElement == 0) {
                return null; // Singular matrix
            }
            for (int j = 0; j < 2 * n; j++) {
                augmented[i][j] /= diagElement;
            }

            // Make all other elements in the current column 0
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = augmented[k][i];
                    for (int j = 0; j < 2 * n; j++) {
                        augmented[k][j] -= factor * augmented[i][j];
                    }
                }
            }
        }

        // Extract the inverse matrix from the augmented matrix
        int[][] inverse = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverse[i][j] = (int) Math.round(augmented[i][j + n]);
            }
        }

        return inverse;
    }
}
