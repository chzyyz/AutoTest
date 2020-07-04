package com.course.testng;

import com.sun.security.ntlm.Server;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethodTest {
    @Test(groups = "Server")
    public void Test1(){
        System.out.println("这是服务端组的测试方法1");
    }
    @Test(groups = "Server")
    public void Test2(){
        System.out.println("这是服务端组的测试方法2");
    }
    @Test(groups = "Client")
    public  void Test3(){
        System.out.println("这是客户端组的测试方法3");
    }
    @Test(groups = "Client")
    public void  Test4(){
        System.out.println("这是客户端组的测试方法4");
    }
//   注意要在BeforeGroups和AfterGroups后边添加Group的名称
    @BeforeGroups("Server")
    public void BeforeGroupsOnServer(){
        System.out.println("BeforeGroups在Server组执行前执行");
    }
    @AfterGroups("Server")
    public void AfterGroupsOnServer(){
        System.out.println("AfterGroups在Server组执行后执行");
    }
    @BeforeGroups("Client")
    public void BeforeGroupsOnClient(){
        System.out.println("BeforeGroups在Server组执行前执行");
    }
    @AfterGroups("Client")
    public void AfterGroupsOnClient(){
        System.out.println("AfterGroups在Server组执行后执行");
    }
}
