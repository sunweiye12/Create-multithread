package com.java._Callable;

import java.util.concurrent.Callable;

/**
 * 创建 Callable 接口的实现类，并实现 call() 方法
 */
class MyCallable implements Callable<String>{

    /** 
     * 该 call() 方法将作为线程执行体，并且有返回值
     */
    @Override
    public String call() throws Exception {
    	System.out.println("---------Callable创建一个小线程-----------");
        return "success";
    }
}

