package com.java._Thread;

public class test {
	public static void main(String[] args) {
        new MyThread().start();
        new Thread(new MyThread(), "�߳�2").start();
    }
}
