package com.threads;

public class CountDownThread extends Thread{
	private CountDown countDown;

	
	

	public CountDownThread(CountDown countDown2) {
		// TODO Auto-generated constructor stub
	}

	public void CountThread(CountDown countDown) {

		this.countDown = countDown;
	}

	@Override
	public void run() {
		countDown.doCountDown();
	}

}
