package com.course.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforesuite(){
        System.out.println("beforesuite开始运行");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("aftersuite开始运行");
    }
}
