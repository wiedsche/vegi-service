package de.chemmedia.demo;

import de.chemmedia.demo.vegetables.Vegetables;
import de.chemmedia.demo.vegetables.impl.Tomato;

public class Mixer {
	public static void main(String[] args) {
		new Mixer().mixedSalad(new Tomato("Heinz"), new Tomato("Roma"));
	}
	
	
	public void mixedSalad(Vegetables... vegetables) {
		for (Vegetables vegetable : vegetables) {
			System.out.println("Mixing " + vegetable.getName() + " into salad...");
		}
	}
}
