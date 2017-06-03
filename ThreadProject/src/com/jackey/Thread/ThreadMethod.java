package com.jackey.Thread;

import java.util.concurrent.*;
/*
class threadInterface implements Runnable {
	@Override
	public void run(){
		for(int i=0;i<100;i++){
			System.out.printf("output %d\n",i);
		}
	}
}
*/

class nativeThread extends Thread {
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.printf("output %d\n",i);
	}
}
}
public class ThreadMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*threadInterface tI=new threadInterface();
		Thread myThread=new Thread(tI);
		myThread.start();*/
		nativeThread nt=new nativeThread();
		nt.start();
	}

}
