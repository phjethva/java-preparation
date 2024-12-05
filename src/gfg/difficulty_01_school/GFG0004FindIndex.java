package gfg.difficulty_01_school;

/*
Problem Statement:
    Given an Integer array A of N elements and a KEY which is present in this array.
    You need to write a program to find the start index (index where the element is first found from a left in the array).
    and end index (index where the element is first found from right in the array).
    (0 based indexing is used)
    If the key does not exist in the array then return -1 for both start and end index in this case.
Example 1:
    Input:
        N = 6
        A = {1, 2, 3, 4, 5, 5 }
        KEY = 5
    Output:
        {4, 5}
Example 2:
    Input:
        N = 6
        A = {6, 5, 4, 3, 1, 2 }
        KEY = 4
    Output:
        {2, 2}
*/

import java.util.Arrays;

public class GFG0004FindIndex {

    public static void main(String[] args) {

        System.out.println("0004 Find Index");
        System.out.println("----------");

        int N = 6;
        int[] A = {1, 2, 3, 4, 5, 5};
        int KEY = 5;

        //int N = 6;
        //int[] A = {6, 5, 4, 3, 1, 2};
        //int KEY = 4;

        System.out.println(Arrays.toString(findIndex1(A, N, KEY)));
        System.out.println(Arrays.toString(findIndex2(A, N, KEY)));
    }

    public static int[] findIndex1(int[] arr, int n, int key) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                if (first != -1)
                    last = i;
                else {
                    first = i;
                    last = i;
                }
            }
        }
        return new int[]{first, last};
    }

    public static int[] findIndex2(int[] a, int N, int key) {
        int[] result = {-1, -1};
        for (int i = 0; i < N; i++) {
            if (a[i] == key) {
                result[0] = i;
                break;
            }
        }
        for (int j = N - 1; j >= 0; j--) {
            if (a[j] == key) {
                result[1] = j;
                break;
            }
        }
        return result;
    }

}
