package gfg.difficulty_01_school;

/*
Problem Statement:
    Given a number N. Your task is to check whether it is fascinating or not.
    Fascinating Number: When a number (should contain 3 digits or more) is multiplied by 2 and 3,
    and when both these products are concatenated with the original number,
    then it results in all digits from 1 to 9 present exactly once.
Example 1:
    Input:
        N = 192
    Output:
        Fascinating
Example 2:
    Input:
        N = 853
    Output:
        Not Fascinating
 */

import java.util.Arrays;

public class GFG0008FascinatingNumber {

    public static void main(String[] args) {

        System.out.println("0008 Fascinating Number");
        System.out.println("----------");

        int N = 192;

        System.out.println(isFascinating1(N));

    }

    public static boolean isFascinating1(long n) {
        String num = String.valueOf(n);
        if (num.length() < 3) {
            throw new IllegalArgumentException("n doesn't contain 3 digits or more!");
        }
        num = num.concat(String.valueOf(n * 2)).concat(String.valueOf(n * 3));
        char[] arr = num.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - '0' != (i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isFascinating2(long n) {
        String num = String.valueOf(n);
        if (num.length() < 3) {
            throw new IllegalArgumentException("n doesn't contain 3 digits or more!");
        }
        num = num.concat(String.valueOf(n * 2)).concat(String.valueOf(n * 3));
        return num.matches("^(?!.*(.).*\\1)[1-9]+$");
    }

}
