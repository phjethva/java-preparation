package gfg.difficulty_01_school;

/*
Problem Statement:
    Given an array Arr of size N, print all its elements.
Example 1:
    Input:
        N = 5
        A = {1, 2, 3, 4, 5}
    Output:
        1 2 3 4 5
Example 2:
    Input:
        N = 4
        A = {2, 3, 5, 5}
    Output:
        2 3 5 5
 */

import java.util.Arrays;

public class GFG0006PrintElementsOfArray {

    public static void main(String[] args) {

        System.out.println("0006 Print Elements Of Array");
        System.out.println("----------");

        int N = 5;
        int[] A = {1, 2, 3, 4, 5};

        //int N = 4;
        //int[] A = {2, 3, 5, 5};

        printArray1(A, N);
        System.out.println();
        printArray2(A, N);
    }

    public static void printArray1(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArray2(int[] arr, int n) {
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }

}
