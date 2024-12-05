package gfg.difficulty_01_school;

/*
Problem Statement:
    A and B are a good friend and programmers.
    They are always in a healthy competition with each other.
    They decide to judge the best among them by competing.
    They do so by comparing their three skills as per their values.
    Please help them do so as they are busy.

    Set for A are like [a1, a2, a3]
    Set for B are like [b1, b2, b3]

    Compare ith skill of A with ith skill of B
    if a[i] > b[i] , A's score increases by 1
    if a[i] < b[i] , B's score increases by 1
    if a[i] = b[i] , nothing happens
Example 1:
    Input:
        A = {4, 2, 7}
        B = {5, 6, 3}
    Output:
        1 2
Example 2:
    Input:
        A = {4, 2, 7}
        B = {5, 2, 8}
    Output:
        0 2
*/

public class GFG0010CompeteTheSkills {

    public static void main(String[] args) {

        System.out.println("0001 Palindromic Array Example");
        System.out.println("----------");

        //long[] A = {4, 2, 7};
        //long[] B = {5, 6, 3};

        //long[] A = {4, 2, 7};
        //long[] B = {5, 2, 8};

        long[] A = {1804289384, 846930887, 1681692778};
        long[] B = {1714636916, 1957747794, 424238336};

        scores(A, B);

    }

    public static void scores(long[] a, long[] b) {
        int ca = 0, cb = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) ca++;
            else if (a[i] < b[i]) cb++;
        }
        System.out.println(ca + " " + cb);
    }

}
