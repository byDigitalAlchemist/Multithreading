package org.digitalalchemist.entity;

import java.util.logging.Logger;



public class DigitalThread extends Thread {
	
	private static Logger log = Logger.getLogger(DigitalThread.class.toString());
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			log.info(" Simulating Thread by Extending Thread Class , iteration :"+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				log.info(" Exception Occurred "+ e);
			}
		}
	}
}
