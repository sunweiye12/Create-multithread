package com.java._Runnable;

/**
 * 实现 Runnable 接口的线程类
 */
class MyThread implements Runnable{

    /** 
     * 重写run方法
     */
    @Override
    public void run() {
        System.out.println("------runnable创建了一条小线程------");
        
    }
}
