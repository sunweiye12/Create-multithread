package com.java._Callable;

import java.util.concurrent.Callable;

/**
 * ���� Callable �ӿڵ�ʵ���࣬��ʵ�� call() ����
 */
class MyCallable implements Callable<String>{

    /** 
     * �� call() ��������Ϊ�߳�ִ���壬�����з���ֵ
     */
    @Override
    public String call() throws Exception {
    	System.out.println("---------Callable����һ��С�߳�-----------");
        return "success";
    }
}

