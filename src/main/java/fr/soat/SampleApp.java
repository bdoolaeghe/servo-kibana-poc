package fr.soat;

import java.util.concurrent.TimeUnit;

public class SampleApp {

	
	public static void main(String[] args) throws InterruptedException {
		SampleApp instance = new SampleApp();
		int time = 10;
		boolean coin = false;
		
		while(true) {
			if (time == 1 || time == 5) {
				coin = ! coin;
			}
			if (coin)
				time++;
			else 
				time--;
			
			TimeUnit.SECONDS.sleep(time);
			instance.doSomething();
		}
	}

	public void doSomething() {
		System.out.println("doing something !");
	}
	
}
