package com.course.testng;

import org.testng.annotations.Test;
import sun.font.TrueTypeFont;

public class IgnoreTest{
    @Test
    public void IgnoreTest1(){
        System.out.println("IgnoreTest1执行");
    }
    @Test(enabled = false)
    public void IgnoreTest2(){
        System.out.println("IgnoreTest2执行");
    }
    @Test(enabled = true)
    public void IgnoreTest3(){
        System.out.println("IgnoreTest3执行");
    }
}
