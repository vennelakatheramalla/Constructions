    package com.threads;
   public class AnotherThread implements Runnable {

   @Override
   public void run() {

   for (int i = 1; i <= 5; i++) {

   try {
   Thread.sleep(2000);
   System.out.println(ThreadColor.ANSI_GREEN + Thread.currentThread().getName() + " " + i);
   } catch (InterruptedException e) {
   
    e.printStackTrace();
    }

    }
    }

}