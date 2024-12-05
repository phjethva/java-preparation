package gfg.difficulty_01_school;

/*
Problem Statement:
    Given an Integer array A of N elements.
    You have to tell whether the array is perfect or not.
    An array is said to be perfect if its reverse array matches the original array.
    If the array is perfect, then return True else return False.
Example 1:
    Input:
        A = {1, 2, 3, 2, 1}
    Output:
        PERFECT
Example 2:
    Input:
        A = {1, 2, 3, 4, 5}
    Output:
        NOT PERFECT
*/

import java.util.Arrays;

public class GFG0003PerfectArrays {

    public static void main(String[] args) {

        System.out.println("0003 Perfect Arrays");
        System.out.println("----------");

        int N = 5;
        int[] A = {1, 2, 3, 2, 1};
        //int N = 5;
        //int[] A = {1, 2, 3, 4, 5};

        System.out.println(isArrayPerfect1(A, N));
        System.out.println(isArrayPerfect2(A, N));
    }

    public static boolean isArrayPerfect1(int[] arr, int n) {
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isArrayPerfect2(int[] arr, int n) {
        int[] arrReverse = new int[n];
        for (int i = 0; i < n; i++) {
            arrReverse[n - i - 1] = arr[i];
        }
        return Arrays.equals(arr, arrReverse);
    }

}
