package ru.loginov.learning123;

import org.junit.Assert;
import org.junit.Test;

public class MyMathTest {

    @Test
    public void testSum() { //without "static"
        int sum = MyMath.sum(1, 2);
        Assert.assertEquals(3, sum);
    }

    @Test
    public void testSum2() { //without "static"
        int sum = MyMath.sum(-1, -2);
        Assert.assertEquals(-3, sum);
    }

    @Test
    public void testaverage(){
        double avg = MyMath.avg(new int[] {8, 9, 7}); //sum = 24, length = 3, avg = 8
        System.out.println("average = " + avg);
        Assert.assertTrue(8.0 == avg);
    }

    @Test
    public void testaverage2(){
        double avg = MyMath.avg(new int[] {-2, 2}); //sum = 0, length = 2, avg = 0
        System.out.println("average = " + avg);
        Assert.assertTrue(0.0 == avg);
    }

}
