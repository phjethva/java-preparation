package gfg.difficulty_01_school;

/*
Problem Statement:
    Given an Integer array A of N elements.
    You need to print elements of A in alternate order (starting from index 0).
Example 1:
    Input:
        N = 4
        A = {1, 2, 3, 4}
    Output:
        1 3
Example 2:
    Input:
        N = 5
        A = {1, 2, 3, 4, 5}
    Output:
        1 3 5
*/

public class GFG0002PrintAlternateElementsOfAnArray {

    public static void main(String[] args) {

        System.out.println("0002 Print Alternate Elements Of An Array");
        System.out.println("----------");

        int N = 4;
        int[] A = {1, 2, 3, 4};
        //int N = 5;
        //int[] A = {1, 2, 3, 4, 5};
        print1(A, N);
        print2(A, N);
        print3(A, N);
    }

    public static void print1(int[] arr, int n) {
        for (int i = 0; i < n; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void print2(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            String num = "";
            if (i % 2 == 0) {
                num = String.valueOf(arr[i]);
            } else {
                num = " ";
            }
            System.out.print(num);
        }
    }

    public static void print3(int[] arr, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i += 2) {
            stringBuilder.append(arr[i]).append(" ");
        }
        System.out.print(stringBuilder.toString().trim());
    }

}
