package com.java._Callable;

import java.util.concurrent.FutureTask;

public class test {
	public static void main(String[] args) {
        //���� Callable ʵ�����ʵ��
        MyCallable myCallable = new MyCallable();
        //ʹ�� FutureTask ������װ Callable ���󣬸� FutureTask �����װ�˸� Callable ����� call() �����ķ���ֵ
        FutureTask<String> futureTask = new FutureTask<String>(myCallable);
        String res = null;
        try {
            //ʹ�� FutureTask ������Ϊ Thread ����� target �������������߳�
            //û��䣬�¾�����ȡ�����������һֱ�ȴ�ִ�н��
            new Thread(futureTask,"�߳�1").start();
            //���� FutureTask ����� get() ������������߳�ִ�н�����ķ���ֵ
            res = futureTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(res);
    }
}
