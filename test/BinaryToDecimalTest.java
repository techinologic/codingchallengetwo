import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryToDecimalTest {

    @Test
    public void test1(){
        BinaryToDecimal test = new BinaryToDecimal();
        double result = test.convertToDecimal("010011");
        Assert.assertEquals(19.0, result,0);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()
        + ":  Passed!");
    }

    @Test
    public void test2(){
        BinaryToDecimal test = new BinaryToDecimal();
        double result = test.convertToDecimal("11110011");
        Assert.assertEquals(243.0, result,0);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()
                + ":  Passed!");

    }

    @Test
    public void test3(){
        BinaryToDecimal test = new BinaryToDecimal();
        double result = test.convertToDecimal("111101001111");
        Assert.assertEquals(3919.0, result,0);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()
                + ":  Passed!");

    }
}