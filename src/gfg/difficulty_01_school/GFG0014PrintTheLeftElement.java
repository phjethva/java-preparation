package gfg.difficulty_01_school;

/*
Problem Statement:
    Given an array of length N, at each step it is reduced by 1 element.
    In the first step the maximum element would be removed,
    while in the second step the minimum element of the remaining array would be removed,
    in the third step again the maximum and so on.
    Continue this till the array contains only 1 element.
    And find the final element remaining in the array.
Example 1:
    Input:
        N = 7
        A[] = {7, 8, 3, 4, 2, 9, 5}
    Output:
        5
Example 2:
    Input:
        N = 8
        A[] = {8, 1, 2, 9, 4, 3, 7, 5}
    Output:
        4
*/

import utils.StringUtils;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;

public class GFG0014PrintTheLeftElement {

    static {
        String name = MethodHandles.lookup().lookupClass().getSimpleName();
        StringUtils.getGFGHeader(name);
    }

    public static void main(String[] args) {

        int N = 7;
        long[] A = {7, 8, 3, 4, 2, 9, 5};

        System.out.println(leftElement(A, N));
    }

    public static long leftElement(long[] arr, long n) {
        Arrays.sort(arr);//2,3,4,5,7,8,9
        if (n % 2 == 0) {
            return arr[(int) ((n / 2) - 1)];
        } else {
            return arr[(int) (n / 2)];
        }
    }

}
