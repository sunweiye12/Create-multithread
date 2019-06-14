package com.java._Thread;

class MyThread extends Thread{
    /** 
     * 重写run方法
     */
     @Override
     public void run() {
    	 System.out.println("--------Thread创建了一条线程---------");
     }
}
	

