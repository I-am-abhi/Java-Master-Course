package Strings;

import java.util.Arrays;

public class StringDemoCharAt {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "x";
        System.out.println(str.length());
        System.out.println(Arrays.toString(str.getBytes()));
        System.out.println(str.charAt(1));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.contains(str1));
    }
}
