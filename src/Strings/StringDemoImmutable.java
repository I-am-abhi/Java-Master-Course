package Strings;

public class StringDemoImmutable {
    public static void main(String[] args) {
        // All the strings are created in (intern pool - Heap)
        String str = "Hello";
        //First JVM checks if there is already a string 'hello' present in intern pool in heap
        // in Stack memory there will be reference memory - which will refer to exact memory location in internpool in heap
        String str1 = "Hello";
        //both str and str1 are pointing to one memory location
        str = "Bye";
        // str will create new memory in intern pool in heap if Bye string is not present in intern pool
        // That's why Strings are immutable . u can't change at original position
        System.out.println(str);
        System.out.println(str1);
    }
}
