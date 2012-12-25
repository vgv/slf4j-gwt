package me.vgv.slf4j.gwt.logging;

import org.slf4j.Logger;
import org.slf4j.Marker;

/**
 * Многие браузеры не поддерживают trace/debug уровни, поэтому количество уровней ограничено так:
 * TRACE,DEBUG,INFO -> INFO
 * WARNING -> WARNING
 * ERROR -> ERROR
 * <p/>
 * Три уровня INFO, WARNING, ERROR вроде бы есть у всех браузеров
 */
class JSLogger implements Logger {

	private final String name;

	public JSLogger(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	/**
	 * ******************************* TRACE ******************************************
	 */

	@Override
	public final void trace(String msg) {
		LogUtils.log(this, LogLevel.INFO, msg);
	}

	@Override
	public final void trace(String format, Object arg) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void trace(String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void trace(String format, Object[] argArray) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void trace(String msg, Throwable t) {
		LogUtils.log(this, LogLevel.INFO, msg, t);
	}

	@Override
	public final void trace(Marker marker, String msg) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void trace(Marker marker, String format, Object arg) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void trace(Marker marker, String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void trace(Marker marker, String format, Object[] argArray) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void trace(Marker marker, String msg, Throwable t) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * ******************************* DEBUG ******************************************
	 */
	@Override
	public final void debug(String msg) {
		LogUtils.log(this, LogLevel.INFO, msg);
	}

	@Override
	public final void debug(String format, Object arg) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void debug(String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void debug(String format, Object[] argArray) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void debug(String msg, Throwable t) {
		LogUtils.log(this, LogLevel.INFO, msg, t);
	}

	@Override
	public final void debug(Marker marker, String msg) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void debug(Marker marker, String format, Object arg) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void debug(Marker marker, String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void debug(Marker marker, String format, Object[] argArray) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void debug(Marker marker, String msg, Throwable t) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * ******************************* INFO ******************************************
	 */

	@Override
	public final void info(String msg) {
		LogUtils.log(this, LogLevel.INFO, msg);
	}

	@Override
	public final void info(String format, Object arg) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void info(String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void info(String format, Object[] argArray) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void info(String msg, Throwable t) {
		LogUtils.log(this, LogLevel.INFO, msg, t);
	}

	@Override
	public final void info(Marker marker, String msg) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void info(Marker marker, String format, Object arg) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void info(Marker marker, String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void info(Marker marker, String format, Object[] argArray) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void info(Marker marker, String msg, Throwable t) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * ******************************* WARNING ******************************************
	 */

	@Override
	public final void warn(String msg) {
		LogUtils.log(this, LogLevel.WARNING, msg);
	}

	@Override
	public final void warn(String format, Object arg) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void warn(String format, Object[] argArray) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void warn(String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void warn(String msg, Throwable t) {
		LogUtils.log(this, LogLevel.WARNING, msg, t);
	}

	@Override
	public final void warn(Marker marker, String msg) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void warn(Marker marker, String format, Object arg) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void warn(Marker marker, String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void warn(Marker marker, String format, Object[] argArray) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void warn(Marker marker, String msg, Throwable t) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * ******************************* ERROR ******************************************
	 */

	@Override
	public final void error(String msg) {
		LogUtils.log(this, LogLevel.ERROR, msg);
	}

	@Override
	public final void error(String format, Object arg) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void error(String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void error(String format, Object[] argArray) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void error(String msg, Throwable t) {
		LogUtils.log(this, LogLevel.ERROR, msg, t);
	}

	@Override
	public final void error(Marker marker, String msg) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void error(Marker marker, String format, Object arg) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void error(Marker marker, String format, Object arg1, Object arg2) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void error(Marker marker, String format, Object[] argArray) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	@Override
	public final void error(Marker marker, String msg, Throwable t) {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * ******************************* ERROR ******************************************
	 */

	@Override
	public final boolean isDebugEnabled() {
		return true;
	}

	@Override
	public final boolean isDebugEnabled(Marker marker) {
		return true;
	}

	@Override
	public final boolean isErrorEnabled() {
		return true;
	}

	@Override
	public final boolean isErrorEnabled(Marker marker) {
		return true;
	}

	@Override
	public final boolean isInfoEnabled() {
		return true;
	}

	@Override
	public final boolean isInfoEnabled(Marker marker) {
		return true;
	}

	@Override
	public final boolean isTraceEnabled() {
		return true;
	}

	@Override
	public final boolean isTraceEnabled(Marker marker) {
		return true;
	}

	@Override
	public final boolean isWarnEnabled() {
		return true;
	}

	@Override
	public final boolean isWarnEnabled(Marker marker) {
		return true;
	}

}
