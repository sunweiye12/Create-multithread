package com.java._Runnable;

public class test {
	public static void main(String[] args) {
        new Thread(new MyThread(),"�߳�1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
            	System.out.println("------runnable������һ��С�߳�------");
            }
        },"�߳�2").start();
    }
}
