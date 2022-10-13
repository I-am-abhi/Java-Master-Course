package Strings;

public class StringAndStringBuilderPerformance {
    public static void main(String[] args) {
        int n = 100000;
//        long start = System.currentTimeMillis();
//        appendString(n); //it will take too much time and also everytime new memory location will be created
//        long end = System.currentTimeMillis();
//        System.out.println(end);
        //the simple looking for loop will give us O(n2)

        long start1 = System.currentTimeMillis();
        appendStringSb(n); //it will take too much time and also everytime new memory location will be created
        long end1 = System.currentTimeMillis();
        System.out.println(end1);

    }
    public static void appendString(int n){
        String s = "";
        for(int i = 1 ; i <= n; i++) s= s+i;
    }
    public static void appendStringSb(int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i <= n; i++) sb.append(i);
    }
}
