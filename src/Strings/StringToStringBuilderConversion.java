package Strings;

import java.util.Scanner;

public class StringToStringBuilderConversion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
    }
}
