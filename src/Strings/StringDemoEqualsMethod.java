package Strings;

public class StringDemoEqualsMethod {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = s1;
        String s3 = "hello";
        String s4 = new String("hello");//by defining new keyword the memory will be allocated differently outside the intern pool
        System.out.println(s1==s2); // it will give output as true because s1 and s2 both stores same memory location , not because they are storing same value
        System.out.println(s1 == s4);
        System.out.println(s1 == s3);
        //for comparison of contents inside string instead of addresses u have to use .equals() method
        System.out.println(s1.equals(s4));
        System.out.println(s4.equals(s3));
    }
}
