package Strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        //String is creted inside intern pool -> heap
        //StringBuilder is created inside heap but not in internal pool
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.setCharAt(2,'w');
        System.out.println(sb);
        sb.insert(3,'a');
        System.out.println(sb);
        sb.replace(0,4,"hel");
        System.out.println(sb);
        sb.append("hello");
        System.out.println(sb);
        sb.append('a');
        System.out.println(sb);
        sb.insert(8,'b');
        System.out.println();
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
        //delete range - sb.length()-1
        //insert range - sb.length()
        String s = sb.toString();
        System.out.println(s);
    }
}
