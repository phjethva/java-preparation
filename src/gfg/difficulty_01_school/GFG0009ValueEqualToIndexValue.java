package gfg.difficulty_01_school;

/*
Problem Statement:
    Given an array A of N positive integers.
    Your task is to find the elements whose value is equal to that of its index value (Consider 1-based indexing).
Note:
    There can be more than one element in the array which has the same value as its index.
    You need to include every such element's index.
    Follow 1-based indexing of the array.
Example 1:
    Input:
        N = 5
        Arr[] = {15, 2, 45, 12, 7}
    Output:
        2
Example 2:
    Input:
        N = 1
        Arr[] = {1}
    Output:
        1
*/

import java.util.ArrayList;

public class GFG0009ValueEqualToIndexValue {

    public static void main(String[] args) {

        System.out.println("0009 Value Equal To Index Value");
        System.out.println("----------");

        int N = 5;
        int[] A = {15, 2, 45, 12, 7};

        //int N = 1;
        //int[] A = {1};

        System.out.println(valueEqualToIndex(A, N));
    }

    public static ArrayList<Integer> valueEqualToIndex(int[] arr, int n) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == (i + 1)) {
                a.add(arr[i]);
            }
        }
        return a;
    }

}
