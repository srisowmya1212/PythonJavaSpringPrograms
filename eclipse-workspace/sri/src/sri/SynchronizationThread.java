package com.sri.multithreading;

//as we are getting output mixed of two threads, so we are going to use a synchronization where we are going to lock until the thread is completly executed. we use that keyboard to the single object which we are using.
class Printer{
	synchronized void printDocuments(int noOfDocs,String docName) {
		for(int i=1;i<=noOfDocs;i++) {
			try {
				Thread.sleep(1000);//as two threads are not executing in sequence introduced thread.sleep method. as we kept 1000ms so everyline of output comes at 1000ms gap
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Printing documents "+i+" "+docName);
		}
	}
}

class MyThread extends Thread {
	Printer pref;

//	 Printer pref=new Printer();//we cant create like this bcoz we need to pass object of printer as reference in the constructor
	// create constructor of printer
	public MyThread(Printer p) {
		pref = p;
	}

	@Override
	public void run() {
		pref.printDocuments(10, "sowmya.pdf");
	}
}

class MyThread2 extends Thread {
	Printer pref;

	public MyThread2(Printer p) {
		pref = p;
	}

	@Override
	public void run() {
		pref.printDocuments(10, "arun.pdf");
	}
}

public class SynchronizationThread {

	public static void main(String[] args) {
		System.out.println("Application started");

		// we have only single object of printer

		Printer p = new Printer();
//		p.printDocuments(10, "sowmya.pdf");

		// scenario we have multiple threads working on single printer object
		MyThread myThread = new MyThread(p);// as we create constructor need to pass printer p object. MyThread is
											// having reference to printer object
		myThread.start();

		MyThread2 myThread2 = new MyThread2(p);
		myThread2.start();

		// here every time we run we get mixed outputs

		System.out.println("Application finished");
	}

}
