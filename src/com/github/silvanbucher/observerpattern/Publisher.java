package com.github.silvanbucher.observerpattern;

import java.util.Observable;

public class Publisher extends Observable {

	private boolean state;

	public Publisher() {
		state = false;
	}

	public void toggleState() {
		state = !state;
		setChanged(); // indicates that the object has changed
		notifyObservers();
	}

	@Override
	public void notifyObservers() {
		super.notifyObservers(state);
	}
}
