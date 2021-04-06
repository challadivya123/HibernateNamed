package com.hcl.logginng.apache;
import org.apache.log4j.Logger;

import org.apache.log4j.BasicConfigurator;
public class HelloWorld {
	static final Logger logger=Logger.getLogger(HelloWorld.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.debug("Sample debug message");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
		
	}

}
