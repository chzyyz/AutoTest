package com.course.testng;

import org.testng.annotations.Test;

public class ExceptionTest {
//    什么时候进行异常测试？
//    预期就是这个异常，比如输入一些不合法参数时，抛出异常
    @Test(expectedExceptions = RuntimeException.class)
    public void RunTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void  RunTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }
}
