package com.threads;

public class MyThread1 extends Thread{


		@Override
		public void run() {
		System.out.println(ThreadColor.ANSI_RED+ " before start");
		for (int i = 1; i <= 5; i++) {
		try {
		Thread.sleep(2000);
		System.out.println(ThreadColor.ANSI_RED + Thread.currentThread().getName() + " " + i);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}
		System.out.println(ThreadColor.ANSI_PURPLE + " after start");
		}

		}

