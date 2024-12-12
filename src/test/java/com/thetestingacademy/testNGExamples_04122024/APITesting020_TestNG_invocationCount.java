package com.thetestingacademy.testNGExamples_04122024;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting020_TestNG_invocationCount {

    @Test(invocationCount = 5)
    public void test01(){
        Assert.assertTrue(true);
    }


}
