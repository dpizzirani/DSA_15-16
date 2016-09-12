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

        for (int i=0; i<B.length; i++) {
            B[i] = A[i];
        }

        return B;
    }


    public static int[][] copyMatrix(int[][] A) {
        int B[][] = new int[A.length][A[0].length];

        for (int r=0; r<B.length; r++) {
            for (int c=0; c<B[r].length; c++) {
                B[r][c] = A[r][c];
            }
        }

        return B;
    }


    public static int findInArray(int[] A, int q) {
        for (int i=0; i<A.length; i++) {
            if (A[i] == q)
                return i;
        }

        return -1;
    }


    public static int findInSortedArray(int[] A, int q) {
        return binarySearchRecursive(A, q, 0, A.length-1);
    }


    public static int binarySearchRecursive(int[] A, int q, int l, int r) {
        if (l > r)
            return -1;

        int m = (l + r)/2;

        if (A[m] == q)
            return m;
        else if (A[m] < q)
            return binarySearchRecursive(A, q, m+1, r);
        else
            return binarySearchRecursive(A, q, l, m);
    }


    public static int findFirstInSortedArrary(int[] A, int q) {
        return findFirstInSortedArraryAux(A, q, 0, A.length-1);
    }


    /*public static int findFirstInSortedArraryAux(int[] A, int q, int l, int r) {
        if (l == 0 && A[q] == q) {
            if (A[l] == q)
                return l;
            else
                return -1;
        }

        int m = (int)Math.floor((l+r)/2);

        if (A[m] < q)
            return findFirstInSortedArraryAux(A, q, m+1, r);
        else
            return findFirstInSortedArraryAux(A, q, l, m);
    }*/


    public static int findFirstInSortedArraryAux(int[] A, int q, int l, int r) {
        if (l > r)
            return -1;

        int m = (int)Math.floor((l + r)/2);

        if (A[l] == q)
            return l;
        else if (A[m] < q)
            return binarySearchRecursive(A, q, m+1, r);
        else
            return binarySearchRecursive(A, q, l, m);
    }


    public static void main(String[] args) {
        //int[] A = {1, 3, 4, 6, 7, 9, 11, 13, 24, 45, 56, 67, 78, 78, 123, 145};
        //int[] A = createRandomArray(7, 0, 25);
        int[] A = {1, 1, 2, 3, 3, 5, 5, 7, 7, 7, 9};

        System.out.println(Arrays.toString(A));
        //System.out.println(findInSortedArray(A, 7));
        //System.out.println(findInArray(A, 7));
        //System.out.println(findFirstInSortedArrary(A, 5));

        System.out.println(Arrays.toString(A));


    }
}
