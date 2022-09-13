package com.threads;

public class ThreadTest1 {

	

		public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
		System.out.println(Thread.currentThread().getName() + " " + i);
		}

		MyThread myThread = new MyThread();
		Thread t1 = new Thread(myThread);
		// t1.setPriority(2);
		t1.start();
		System.out.println(t1.getPriority());

		Thread t2 = new Thread(myThread);
		t2.start();
		t2.join();
		System.out.println(t2.getPriority());
		Thread t3 = new Thread(myThread);
		// t3.setPriority(10);
		t3.start();
		System.out.println(t3.getPriority());
		}
		}


