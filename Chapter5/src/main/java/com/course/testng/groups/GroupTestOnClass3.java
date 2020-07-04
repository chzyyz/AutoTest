package com.course.testng.groups;

import org.testng.annotations.Test;
@Test(groups = "teacher")
public class GroupTestOnClass3 {
    public void StuTest1(){
        System.out.println("t1");
    }
    public void StuTest2(){
        System.out.println("t2");
    }
    public void StuTest3(){
        System.out.println("t3");
    }
}
