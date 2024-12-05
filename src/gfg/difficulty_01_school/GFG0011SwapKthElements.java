package gfg.difficulty_01_school;

import java.util.Arrays;

/*
Problem Statement:
    Given an array Arr of size N,
    swap the Kth element from beginning with a Kth element from an end.
Example 1:
    Input:
        N = 8
        A = {1, 2, 3, 4, 5, 6, 7, 8}
        K = 3
    Output:
        1 2 6 4 5 3 7 8
Example 2:
    Input:
        N = 5
        A = {5, 3, 6, 1, 2}
        K = 2
    Output:
        5 1 6 3 2
*/
public class GFG0011SwapKthElements {

    public static void main(String[] args) {

        System.out.println("0011 Swap Kth Elements");
        System.out.println("----------");

        int N = 8;
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
        int K = 3;

        //int N = 5;
        //int[] A = {5, 3, 6, 1, 2};
        //int K = 2;

        swapKth(A, N, K);
    }

    public static void swapKth(int[] arr, int n, int k) {
        int temp = arr[n - k];
        arr[n - k] = arr[k - 1];
        arr[k - 1] = temp;
        System.out.println(Arrays.toString(arr));
    }

}
