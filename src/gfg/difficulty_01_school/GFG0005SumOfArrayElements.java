package gfg.difficulty_01_school;

/*
Problem Statement:
    Given an Integer array A of N elements.
    The task is to find a sum of it.
Example 1:
    Input:
        N = 4
        A = {1, 2, 3, 4}
    Output:
        10
Example 2:
    Input:
        N = 3
        A = {1, 3, 3}
    Output:
        7
 */

import java.util.Arrays;

public class GFG0005SumOfArrayElements {

    public static void main(String[] args) {

        System.out.println("0005 Sum Of Array");
        System.out.println("----------");

        int N = 4;
        int[] A = {1, 2, 3, 4};
        //int N = 3;
        //int[] A = {1, 3, 3};

        System.out.println(sum1(A, N));
        System.out.println(sum2(A, N));
    }

    public static int sum1(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum = sum + arr[i];
        return sum;
    }


    public static int sum2(int[] arr, int n) {
        return Arrays.stream(arr, 0, n).sum();
    }

}
