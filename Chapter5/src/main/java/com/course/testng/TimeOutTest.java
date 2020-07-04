package com.course.testng;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TimeOutTest {
    @Test(timeOut = 3000)
    public void TestSuccess() throws InterruptedException{
//        Thread.sleep(2000);
        TimeUnit.SECONDS.sleep(2);
    }
    @Test(timeOut = 3000)
    public void TestFail() throws InterruptedException{
        TimeUnit.SECONDS.sleep(4);
    }
}
