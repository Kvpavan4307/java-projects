package com.producerconsumer;

// produce 1 consumer 1 buffer size 1
public class Company  {
	int n;
	boolean f=false;
	//f= false chance:producer
	// f=true : chance : consumer
	synchronized public void produceItem(int n) throws InterruptedException {
		if(f) {
			wait();
		}
		this.n=n;
		System.out.println("Produced : "+this.n);
		f=true;
		notify();
	}
	synchronized public int consumeItem() throws InterruptedException {
		if(!f) {
			wait();
		}
		System.out.println("Consumed : "+this.n);
		f=false;
		notify();
		return this.n;
	}
	
	
}
