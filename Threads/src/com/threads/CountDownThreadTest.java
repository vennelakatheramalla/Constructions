package com.threads;

public class CountDownThreadTest {
	public static void main(String[] args) {
		
		CountDown countDown = new CountDown();
		CountDownThread countaDownThread = new CountDownThread(countDown);
		Thread t1 = new Thread(countaDownThread);
		t1.setName("Thread 1");
		t1.start();

		Thread t2 = new Thread(countaDownThread);
		t2.setName("Thread 2");
		t2.start();

		}
}