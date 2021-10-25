/*
* name- farzana akter mim
* id- 2012020051
* sec-B
* email-cse_2012020051@lus.ac.bd
* date-16.10.21
* */
package farzana;
import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic {
    public int divisorSum(int n){
        int j = 0;
        for(int i = 1; i <= n; i++) {
            if(n%i ==0){
                j = j+i;
            }
        }
        return j;
    }

    public int findFactorial(int n){
        BigInteger p = new BigInteger("1");
        for (int i = 2; i <= n; i++)
            p = p.multiply(BigInteger.valueOf(i));

        return p.intValue();
    }
}
