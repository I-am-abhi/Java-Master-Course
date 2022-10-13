package Strings;

import java.util.Arrays;

public class StringDemoConcat {
    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = "bye";
        String s3 = s1+" "+s2;
        String s4 = s1.concat(s2);
        String s5 = s1.toUpperCase();
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println("StringDemoConcat.main");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("s5 = " + s5);
    }
}
