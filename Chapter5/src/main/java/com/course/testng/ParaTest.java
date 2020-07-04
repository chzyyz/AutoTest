package com.course.testng;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaTest{
    @Test
    @Parameters({"name","age"})
    public void ParaTest(String name, int age){
        System.out.println("name=" + name + "; age=" + age);
    }
}
