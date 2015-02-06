package org.digitalalchemist.threading;

import java.util.logging.Logger;

import org.digitalalchemist.entity.DigitalRunner;
import org.digitalalchemist.entity.DigitalThread;



public class Method2 {

	private static Logger log = Logger.getLogger(Method2.class.toString());
	
	public static void main(String[] args) {
		log.info("Understanding Threading and its types");
		
		/**
		 * Executing Using Runnable Interface
		 */
		Thread t1 = new Thread(new DigitalRunner());
		Thread t2 = new Thread(new DigitalRunner());
		t1.start();
		t2.start();
	}
}
