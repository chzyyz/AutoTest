package com.course.testng.groups;

import org.testng.annotations.Test;
@Test(groups = "Class2Stu")
public class GroupTestOnClass2 {
    public void StuTest1(){
        System.out.println("class2stu1");
    }
    public void StuTest2(){
        System.out.println("class2stu2");
    }
    public void StuTest3(){
        System.out.println("class2stu3");
    }
}
