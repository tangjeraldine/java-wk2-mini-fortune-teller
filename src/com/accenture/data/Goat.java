package com.accenture.data;

public class Goat extends AnimalData {
	@Override
	public void character() {
		System.out.println("Spirit Animal: Goat");
	}
	@Override
	public void work() {
		System.out.println("Work: Light workload today, probably pull some farmer's cart, that's about it");
	}
	@Override
	public void luck() {
		System.out.println("Luck: Average. You're a goat, how good do you want it to be");
	}
	@Override
	public void diet() {
		System.out.println("Diet: I would recommend more fibre in your diet today, maybe straw and hay");
	}
}
