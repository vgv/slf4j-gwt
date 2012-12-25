package me.vgv.slf4j.gwt.logging;

import org.slf4j.Marker;

import java.util.Iterator;

public class JSMarker implements Marker {

	@Override
	public String getName() {
		return "";
	}

	@Override
	public void add(Marker reference) {

	}

	@Override
	public boolean remove(Marker reference) {
		return false;
	}

	@Override
	public boolean hasReferences() {
		return false;
	}

	@Override
	public boolean contains(Marker other) {
		return false;
	}

	@Override
	public boolean contains(String name) {
		return false;
	}

	@Override
	public boolean hasChildren() {
		return false;
	}

	@Override
	public Iterator iterator() {
		return null;
	}
}
