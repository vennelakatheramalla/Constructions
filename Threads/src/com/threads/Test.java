  package com.threads;
  public class Test {

   public static void main(String[] args) {
   for (int i = 1; i <= 5; i++) {
   System.out.println(ThreadColor.ANSI_BLACK + Thread.currentThread().getName());
  }

    MyThread myThread = new MyThread();
  Thread t1 = new Thread(myThread);
  t1.start();

  AnotherThread an = new AnotherThread();
   Thread t2 = new Thread(an);
  t2.start();

//  new Thread() {
//  public void run() {
//  for (int i = 1; i <= 5; i++) {
//  System.out.println(Thread.currentThread().getName());
//  }
//
// start();
//  };
//
//  };

//  Runnable r1 = new Runnable() {
//
//  @Override
//  public void run() {
//  for (int i = 1; i <= 5; i++) {
//  System.out.println(Thread.currentThread().getName());
// }
//
// }
// };
//
// Thread t4 = new Thread(r1);
//  t4.start();

  }
  }
