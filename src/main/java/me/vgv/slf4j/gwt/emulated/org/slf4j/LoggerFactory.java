package org.slf4j;

import com.google.gwt.core.client.GWT;

public final class LoggerFactory {

	private static final ILoggerFactory iLoggerFactory = GWT.create(ILoggerFactory.class);

	private LoggerFactory() {

	}

	public static Logger getLogger(String name) {
		return iLoggerFactory.getLogger(name);
	}

	public static Logger getLogger(Class clazz) {
		return iLoggerFactory.getLogger(clazz.getName());
	}

}
