package BigDecimalAndBigInteger;

import java.math.BigInteger;

public class BigIntegerExperiment {
    public static void main(String[] args) {
        //BigInteger class is used for the mathematical operation which involves very big integer calculations
        // that are outside the limit of all available primitive data types.
        String str = "123456789";
        BigInteger num = new BigInteger(str);
        long val = 123456789;
        BigInteger num2 = BigInteger.valueOf(val);
        BigInteger num3 = num.add(num2);
        System.out.println("Addition of "+ num +" and "+ num2 +" is "+ num3);
    }
}
