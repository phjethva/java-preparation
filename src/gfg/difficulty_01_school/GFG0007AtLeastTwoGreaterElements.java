package gfg.difficulty_01_school;

/*
Problem Statement:
    Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.
Example 1:
    Input:
        N = 5
        A = {2, 8, 7, 1, 5}
    Output:
        1 2 5
Example 2:
    Input:
        N = 5
        A = {7, -2, 3, 4, 9, -1}
    Output:
        -2 -1 3 4
 */

import java.util.Arrays;

public class GFG0007AtLeastTwoGreaterElements {

    public static void main(String[] args) {

        System.out.println("0007 At Least Two Greater Elements");
        System.out.println("----------");

        long N = 5;
        long[] A = {2, 8, 7, 1, 5};

        System.out.println(Arrays.toString(findElements(A, N)));
    }

    public static long[] findElements(long[] a, long n) {
        if (n < 2) {
            throw new IllegalArgumentException("Array must have minimum 2 elements!");
        }
        Arrays.sort(a);
        long[] b = new long[a.length - 2];
        for (int i = 0; i < n - 2; i++) {
            b[i] = a[i];
        }
        return b;
    }

}
