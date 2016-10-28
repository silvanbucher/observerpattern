package com.github.silvanbucher.observerpattern;

public class Main {

	public static void main(String[] args) {
		Publisher publisher = new Publisher();

		Subscriber subscriber = new Subscriber(publisher);

		publisher.toggleState();
	}
}
