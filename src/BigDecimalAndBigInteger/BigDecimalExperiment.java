package BigDecimalAndBigInteger;

import java.math.BigDecimal;

public class BigDecimalExperiment {
    // It can handle very large and very small floating point numbers with great precision but compensating with the time complexity a bit.
    //A BigDecimal consists of a random precision integer unscaled value and a 32-bit integer scale
    public static void main(String[] args) {
        double a = 0.03;
        double b = 0.04;
        double c = b-a;
        System.out.println(b-a);
        System.out.println(c);

        BigDecimal num1 = new BigDecimal("0.03");
        BigDecimal num2 = new BigDecimal("0.04");
        BigDecimal num3 = num2.subtract(num1);
        System.out.println(num3);

        //Declaration
        BigDecimal number1,number2;
        //Initialization
        number1 = BigDecimal.valueOf(5.4);
        number2 = new BigDecimal("5.4");
        //Easy initialization
        number2 = BigDecimal.ONE;
        // Other than this, available constants
        // are BigDecimal.ZERO and BigDecimal.TEN

        BigDecimal number3 = number1.add(number2);
        System.out.println(number3);

        //Other similar function are subtract() , multiply(), divide(), pow()

        //Extraction of value from BigDecimal
        double x = number3.doubleValue();
        System.out.println(x);

        //Comparison

        if(number1.compareTo(number3) < 0) System.out.println("number1 "+ number1);
        System.out.println("Minimum Value among "+ number3 + " and "+ number1+" is "+ number3.min(number1));

        // Create 2 BigDecimal objects
        BigDecimal ax, bx;
        String s = "GeeksforGeeks";
        String str = "GeeksClasses";

        int l1, l2;
        l1 = s.length();
        l2 = str.length();

        ax = new BigDecimal(l1);
        bx = new BigDecimal(l2);

        // Print the respective lengths
        System.out.println("Length of string " + s + " is " + ax);
        System.out.println("Length of string " + str + " is " + bx);
        // Print the maximum value
        System.out.println("Minimum length is " + ax.min(bx));


        //Negate

        BigDecimal num10;

        // Assign value to num
        num10 = new BigDecimal("4743");

        System.out.println( "Negated value is " + num10.negate() );
    }
}
