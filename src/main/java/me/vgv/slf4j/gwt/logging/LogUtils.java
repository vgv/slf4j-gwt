package me.vgv.slf4j.gwt.logging;

import org.slf4j.Logger;

import java.util.Date;

/**
 * @author Vasily Vasilkov (vgv@vgv.me)
 */
class LogUtils {

	public static void log(Logger logger, LogLevel logLevel, String msg) {
		StringBuilder message = new StringBuilder();
		message.append(new Date());
		message.append(" ");
		message.append(logger.getName());
		message.append(" ");
		message.append(msg);

		logLevel.writeMessage(message.toString());
	}

	public static void log(Logger logger, LogLevel logLevel, String msg, Throwable exception) {
		StringBuilder message = new StringBuilder();
		message.append(new Date());
		message.append(" ");
		message.append(logger.getName());
		message.append(" ");
		message.append(msg);

		while (exception != null) {
			message.append("\n");
			message.append(exception.getMessage());
			if (exception.getStackTrace() != null) {
				for (StackTraceElement stackTraceElement : exception.getStackTrace()) {
					message.append("\n");
					message.append("\t").append(stackTraceElement);
				}
			}

			exception = exception.getCause();
		}

		logLevel.writeMessage(message.toString());
	}

}
