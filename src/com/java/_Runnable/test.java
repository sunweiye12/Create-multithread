package com.java._Runnable;

public class test {
	public static void main(String[] args) {
        new Thread(new MyThread(),"线程1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
            	System.out.println("------runnable创建了一条小线程------");
            }
        },"线程2").start();
    }
}
