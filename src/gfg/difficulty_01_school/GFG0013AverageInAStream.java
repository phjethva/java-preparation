package gfg.difficulty_01_school;

/*
Problem Statement:
    Given a stream of incoming numbers, find average or mean of the stream at every point.
Example 1:
    Input:
        n = 5
        arr[] = {10, 20, 30, 40, 50}
    Output:
        10.00 15.00 20.00 25.00 30.00
Example 2:
    Input:
        n = 2
        arr[] = {12, 2}
    Output:
        12.00 7.00
*/

import java.util.Arrays;

public class GFG0013AverageInAStream {

    public static void main(String[] args) {

        System.out.println("0013 Average In A Stream");
        System.out.println("----------");

        //int N = 5;
        //int[] A = {10, 20, 30, 40, 50};

        //int N = 2;
        //int[] A = {12, 2};

        int N = 26;
        int[] A = {39, 72, 44, 66, 57, 70, 63, 91, 70, 77, 12, 80, 56, 10, 80, 72, 37, 88, 73, 84, 61, 41, 57, 26, 37, 7};

        System.out.println(Arrays.toString(streamAverage1(A, N)));
        System.out.println(Arrays.toString(streamAverage2(A, N)));

    }

    public static float[] streamAverage1(int[] arr, int n) {
        float[] avg = new float[n];
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            avg[i] = sum / (i + 1);
        }
        return avg;
    }

    public static float[] streamAverage2(int[] arr, int n) {
        final float[] avg = new float[n];
        return new float[]{};
    }

}
