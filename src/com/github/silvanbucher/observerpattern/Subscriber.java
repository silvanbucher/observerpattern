package com.github.silvanbucher.observerpattern;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer {

	public Subscriber(Observable o) {
		o.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(String.valueOf(arg));
	}

}
