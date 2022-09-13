package com.threads;
public class ThreadTest {
// highest priorty thread is our main thread (main method)
	public static void main(String[] args) {
// single unit of process is calling a thread main thread--1
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " Main thread!........");
		}

		// demo-thread---> 2
		
		ThreadDemo demo = new ThreadDemo();
		
		Thread t1 = new Thread(demo);
		t1.start();

		MyThread myThread = new MyThread();
		Thread t2 = new Thread(myThread);
		t2.start();
		
		MyThread myThread1 = new MyThread();
		Thread t3 = new Thread(myThread);
		t3.start();
//		t3.suspend();
//		t3.resume();
//		t3.stop();
//		t3.resume();
		
		MyThread myThread2 = new MyThread();
		Thread t4 = new Thread(myThread);
		t4.start();
		//t4.suspend();
	}

}