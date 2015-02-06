package org.digitalalchemist.threading;

import java.util.logging.Logger;

import org.digitalalchemist.entity.DigitalRunner;
import org.digitalalchemist.entity.DigitalThread;



public class Method3 {
	private static Logger log = Logger.getLogger(Method3.class.toString());
	public static void main(String[] args) {
		log.info("Understanding Threading and its types");
		/**
		 * Executing Thread using Anonymous Class
		 */
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					log.info(" Simulating Thread Using Anonymous Class, iteration :"+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						log.info(" Exception Occurred "+ e);
					}
				}

			}
		});
	
		
		t1.start();
	}


}
