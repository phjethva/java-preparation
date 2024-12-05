package gfg.difficulty_01_school;

/*
Problem Statement:
    Given an Integer array A of N elements.
    Your task is to complete the function of palindromicArray().
    Which will return 1 if all the elements of the Array are palindrome, otherwise it will return 0.
Example 1:
    Input:
        N = 5
        A = {111, 222, 333, 444, 555}
    Outputs:
        1
Example 2:
    Input:
        N = 3
        A = {121, 131, 20}
    Outputs:
        0
*/

import utils.StringUtils;

import java.lang.invoke.MethodHandles;

public class GFG0001PalindromicArray {

    static {
        String name = MethodHandles.lookup().lookupClass().getSimpleName();
        StringUtils.getGFGHeader(name);
    }

    public static void main(String[] args) {

        int N = 5;
        int[] A = {111, 222, 333, 444, 555};
        //int N = 5;
        //int[] A = {121, 131, 200};

        System.out.println(palindromicArray(A, N));
    }

    public static int palindromicArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            String number = String.valueOf(arr[i]);
            for (int j = 0; j < number.length() / 2; j++) {
                int x = number.charAt(j);
                int y = number.charAt(number.length() - 1 - j);
                if (x != y) return 0;
            }
        }
        return 1;
    }

}
