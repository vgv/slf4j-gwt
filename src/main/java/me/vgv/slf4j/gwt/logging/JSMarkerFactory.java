package me.vgv.slf4j.gwt.logging;

import org.slf4j.IMarkerFactory;
import org.slf4j.Marker;

public class JSMarkerFactory implements IMarkerFactory {

	public Marker getMarker(String name) {
		return null;
	}

	public boolean exists(String name) {
		return false;
	}

	public boolean detachMarker(String name) {
		return false;
	}

	public Marker getDetachedMarker(String name) {
		return null;
	}
}
