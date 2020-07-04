package com.course.testng;

import com.sun.xml.internal.ws.util.xml.CDATA;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void DataProviderTest(String name, int age){
        System.out.println("name=" + name + "; age=" + age);
    }
    @DataProvider(name = "data")
    public Object[][] Providerdata(){
        Object[][] o = new Object[][]{
                {"zhuzhu",10},
                {"pipi",13},
                {"pangzai",20},
        };
        return o;
    }
    @Test(dataProvider = "MethodData")
    public void MethodDataTest1(String name, int age){
        System.out.println("Test111name=" + name + "; age" + age);
    }
    @Test(dataProvider = "MethodData")
    public void MethodDataTest2(String name, int age){
        System.out.println("Test222name=" +name + "; age" + age);
    }
    @DataProvider(name="MethodData")
    public Object[][] MethodDataTest(Method method){
        Object[][] result = null;
        if(method.getName().equals("MethodDataTest1")){
            result = new Object[][]{
                    {"pipi",3},
                    {"pangpang",6}
            };
        }else if(method.getName().equals("MethodDataTest2")){
            result = new Object[][]{
                    {"zhuzhu",8},
                    {"xiaopitu",10}
            };
        }
        return result;
    }
}
