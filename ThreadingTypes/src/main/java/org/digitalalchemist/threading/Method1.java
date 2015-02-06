package org.digitalalchemist.threading;

import java.util.logging.Logger;

import org.digitalalchemist.entity.DigitalRunner;
import org.digitalalchemist.entity.DigitalThread;



public class Method1 {

	private static Logger log = Logger.getLogger(Method1.class.toString());
	
	public static void main(String[] args) {
		log.info("Understanding Threading and its types");
		
		
		Thread t1 = new Thread(new DigitalRunner());
		Thread t2 = new Thread(new DigitalRunner());
		
		t1.start();
		t2.start();

		
		/**
		 * Executing Using Start Method
		 */
		/*DigitalThread dThread1 = new DigitalThread();
		dThread1.start();

		DigitalThread dThread2 = new DigitalThread();
		dThread2.start();*/
		
		/**
		 * Executing Using Run Method
		 */
		/*DigitalThread dThread1 = new DigitalThread();
		dThread1.run();

		DigitalThread dThread2 = new DigitalThread();
		dThread2.run();*/
	
	}


}
