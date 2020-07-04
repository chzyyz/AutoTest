package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testcase1(){
        System.out.printf("ThreadID: %s%n", Thread.currentThread().getId());
        System.out.println("用例1");
    }
    @Test
    public void testcase2(){
        System.out.printf("ThreadID: %s%n", Thread.currentThread().getId());
        System.out.println("用例2");
    }
    @BeforeMethod
    public void beforetest(){
        System.out.println("beforetest测试方法前执行的");
    }
    @AfterMethod
    public void aftertest(){
        System.out.println("aftertest测试方法后执行的");
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("beforeclass类运行前执行");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("beforeclass类运行后执行");
    }
    @BeforeSuite
    public void beforesuite(){
        System.out.println("beforesuite");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("aftersuite");
    }
}
