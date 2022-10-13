package Strings;

public class StringDemoSubstring {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.substring(1,str.length()-1));
        System.out.println(str.substring(3));
        System.out.println(str.subSequence(1,3));
    }

}
