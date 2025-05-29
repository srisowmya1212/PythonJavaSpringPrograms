package com.sri.multithreading;


//class MyTask{
//	void executeTask() {
//		for(int i=0;i<10;i++) {
//			System.out.println("Printing document  "+i+" from printer 2");
//		}
//		
//	}
//}

//mytask IS-A (inheritance) relation of thread
//class MyTask extends Thread{
//	@Override
//	public void run() {
//		
//		for(int i=0;i<10;i++) {
//			System.out.println("Printing document  "+i+" from printer 2");
//		}
//		
//	}
//}

class CA{
	
}

//class MyTask extends CA,Thread{ --> error multiple inheritance doesn't supported in java
class MyTask extends CA implements Runnable{
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("Printing document  "+i+" from printer 2");
		}
		
	}
}

public class Thread1 {

	public static void main(String[] args) {
		//main method represenrts the main thread
		//whatever we write in here will be executed by main thread
		//threads always executes the job i.e; a code  or processes in sequence which is called execution context
		//consider  u opened a application in os , it runs under main thread and has taken long running process then other processes has to wait until completion of main process as works under sequence. so we create a separate thread for the processes by making subprocesses
		
		//job 1
		System.out.println("--Application started---");
		
		//job 2 using Thread class
//		MyTask myTask=new MyTask(); // child thread or worker thread
////		myTask.executeTask();
//		myTask.start();// -->start will execute internally run method
//		
		//till job 2 finished, below jobs are not going to be executed. below jobs are in waiting state
		//in case job2 is a long running operation i.e; if it is 100 docs to print i.e;several documents has to be printed.
		//so in such use case os/jvm shoukd give a message that app is not responding. example if we open some applications in our pc if it take time os will give a mesage to kill or wait
		//some sluggish behaviour in app i.e; apps are hanged. bcoz as job2 is taking long running which makes job 3 blocked.
		//so we will make mytask as thread.
		//when we execute everytime, we get mixed outputs of job2 i.e; mytask and job3 i.e; main thread where they are executing parallely or concurrently.
		
		//job 2 gone with runnable interface
		Runnable r=new MyTask(); //ruunable interface is the polymorphic statement of mytask class 
		Thread thread=new Thread(r);
		thread.start();
		//here also everytime we run will get mixed output bcoz jvm will do time slicing bcoz jvm will do sometime to main thread and sometime to the mytask thread
		
		
		
		//job3
		for(int i=0;i<10;i++) {
			System.out.println("Printing document  "+i+" from printer 1");
		}
		
		//job 4
		System.out.println("---Application executed---");
		
	}
	
	/*
	 * main thread is the most important thread of a java program
	 * it is executed whenever a java program has started
	 * every program must contain this thread for its execution to take place
	 * java main thread needed bcoz of following reasons
	 * 1)from this other child threads are swapned. for ex\; parallely mytask threaded is executed
	 * 2)it must be the last thread to finish execution i.e; when the main thread stops program terminates */
	
	/*multi threading means when there are many threads to be executed . for example along with main thread there are nany other threads or processes are in execution*/
	
	/**
	 multithreading is the ability of a program to run two or more threads concurrently, where each thread will handle different functionality or task at the same time and will make optimal use of resource available
	 * */

}
