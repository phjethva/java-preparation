package gfg.difficulty_01_school;

/*
Problem Statement:

Example 1:
    Input:

    Output:

Example 2:
    Input:

    Output:

*/

import utils.StringUtils;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;

public class GFG0000 {

    static {
        String name = MethodHandles.lookup().lookupClass().getSimpleName();
        StringUtils.getGFGHeader(name);
    }

    public static void main(String[] args) {

        //Collection<String> x1 = new ArrayList<>();

        /*Class c = List.class;
        Method[] methods = c.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }*/

        byte[] a = new byte[10];
        a[0] = 1;
        a[1] = '1';
        a[2] = 'A';
        a[3] = 'a';
        System.out.println(Arrays.toString(a));
    }

}
