package com;

/**
 * Created by 余乐斌 on 2019/4/28.
 *
 * @description:
 * @author: 余乐斌
 * @date: 2019-04-28 10:36
 */

public class example1 {
    public static void main(String[] args){
        MyThread1 myThread=new MyThread1();
        myThread.start();
        while(true)
        {
            System.out.println("Main方法在运行");
        }
    }
}

class MyThread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("MyThread类的run()方法在运行");
        }
    }
}

