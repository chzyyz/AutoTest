package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "Class1Stu")
public class GroupTestOnClass1 {
    public void StuTest1(){
        System.out.println("class1stu1");
    }
    public void StuTest2(){
        System.out.println("class1stu2");
    }
    public void StuTest3(){
        System.out.println("class1stu3");
    }
}
