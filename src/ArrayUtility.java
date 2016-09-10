import javafx.scene.transform.MatrixType;

import java.util.Arrays;

/**
 * Created by Davide on 09/09/16.
 */
public class ArrayUtility {

    public static int findMax(int[] A, int i, int j) {
        int max = A[i];

        for (int a=i+1; i<=j; a++) {
            if (A[a] > max)
                max = A[a];
        }

        return max;
    }


    public static int findMaxPos(int[] A, int i, int j) {
        int maxPos = i;

        for (int a=i+1; a<=j; a++) {
            if (A[a] > A[maxPos])
                maxPos = a;
        }

        return maxPos;
    }


    public static int findMin(int[] A, int i, int j) {
        int min = A[i];

        for (int a=i+1; a<=j; a++) {
            if (A[a] < min)
                min = A[a];
        }

        return min;
    }


    public static int findMinPos(int[] A, int i, int j) {
        int minPos = i;

        for (int a=i+1; a<=j; a++) {
            if (A[a] < A[minPos])
                minPos = a;
        }

        return minPos;
    }


    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }


    public static void shiftRight(int[] A, int i, int j) {
        if (i > j)
            return;

        if (i < 0)
            return;

        if (j >= A.length-1)
            return;

        for (int k=j+1; k>=i+1; k--)
            A[k] = A[k-1];
    }


    public static void shiftLeft(int[] A, int i, int j) {
        if (i > j)
            return;

        if (i < 1)
            return;

        if (j > A.length-1)
            return;

        for (int k=i-1; k<=j-1; k++)
            A[k] = A[k+1];
    }


    public static int[] createRandomArray(int size, int min, int max) {
        int[] A = new int[size];

        for (int i=0; i<A.length; i++) {
            A[i] = (int)(Math.random() * (max - min) + min);
        }

        return A;
    }


    public static int[][] createRandomMatrix(int rows, int cols, int min, int max) {
        int[][] M = new int[rows][cols];

        for (int r=0; r<rows; r++) {
            for (int c=0; c<cols; c++) {
                M[r][c] = (int)(Math.random() * (max - min) + min);
            }
        }

        return M;
    }


    public static void printMatrix(int matrix[][]) {
        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));
    }


    public static int[] copyArray(int[] A) {
        int B[] = new int[A.length];


        return B;
    }


    public static void main(String[] args) {
        //int[] A = {5, 4, 10, 9, 8, 4};
        /*int[] A = createRandomArray(7, 0, 25);

        System.out.println(Arrays.toString(A));
        shiftLeft(A, 1, 5);
        System.out.println(Arrays.toString(A));*/

        int[][] M = createRandomMatrix(2, 10, 0, 25);

        printMatrix(M);


    }
}
