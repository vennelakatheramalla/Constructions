package com.collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedlistWithQueue {
	public static void main(String[] args) {
		Queue<Integer> bankquQueue = new LinkedList<>();
		bankquQueue.offer(100);
		bankquQueue.offer(101);
		bankquQueue.offer(102);
		bankquQueue.offer(103);
		bankquQueue.offer(104);
		System.out.println("queue numbers: " + bankquQueue);
		System.out.println("call the head of queue: " + bankquQueue.peek());
		System.out.println("que number 100 task is done: remove from the queue: " + bankquQueue.poll());
		System.out.println("display remaining queue numbers: " + bankquQueue);
		System.out.println("remove queue from the head: "+ bankquQueue.remove());
		System.out.println("display remaining queue numbers: " + bankquQueue);
		System.out.println("retrive head of the queue: "+bankquQueue.element());

		}

		}


