package gfg.difficulty_01_school;

import java.util.Arrays;

/*
Problem Statement:
    Given a sorted array Arr of size N and a value X, find the number of array elements less than or equal to X and elements more than or equal to X.
Example 1:
    Input:
        N = 7, X = 0
        A = {1, 2, 8, 10, 11, 12, 19}
    Output:
        0 7
Example 2:
    Input:
        N = 7, X = 5
        A = {1, 2, 8, 10, 11, 12, 19}
    Output:
        2 5
*/
public class GFG0012SmallerAndLarger {

    public static void main(String[] args) {

        System.out.println("0012 Smaller And Larger");
        System.out.println("----------");

        //int N = 7;
        //int X = 0;
        //int[] A = {1, 2, 8, 10, 11, 12, 19};

        //int N = 7;
        //int X = 5;
        //int[] A = {1, 2, 8, 10, 11, 12, 19};

        int N = 3;
        int X = 3;
        int[] A = {3, 3, 3};

        System.out.println(Arrays.toString(getSmallerAndLarger(A, N, X)));
    }

    public static int[] getSmallerAndLarger(int[] arr, int n, int x) {
        int smaller = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                smaller++;
            }
        }
        int larger = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= x) {
                larger++;
            }
        }
        return new int[]{smaller, larger};
    }

}
