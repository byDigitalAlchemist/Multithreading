package org.digitalalchemist.entity;

import java.util.logging.Logger;

public class DigitalRunner implements Runnable {

	private static Logger log = Logger.getLogger(DigitalRunner.class.toString());
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			log.info(" Simulating Thread Using Runnable Interface, iteration :"+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				log.info(" Exception Occurred "+ e);
			}
		}
	}

}
