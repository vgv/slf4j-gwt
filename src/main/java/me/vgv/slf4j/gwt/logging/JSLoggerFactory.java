package me.vgv.slf4j.gwt.logging;

import org.slf4j.ILoggerFactory;

public class JSLoggerFactory implements ILoggerFactory {

	@Override
	public JSLogger getLogger(String name) {
		return new JSLogger(name);
	}

}
