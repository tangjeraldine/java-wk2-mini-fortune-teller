package com.accenture.data;

public class Hippo extends AnimalData {
	@Override
	public void character() {
		System.out.println("Spirit Animal: Hippo");
	}
	@Override
	public void work() {
		System.out.println("Work: What work? You're the boss of the river, you can command anyone you like!");
	}
	@Override
	public void luck() {
		System.out.println("Luck: EXCELLENT. A poacher who's trying to hunt you down will be eaten by you today.");
	}
	@Override
	public void diet() {
		System.out.println("Diet: There's a rumour that poachers are pretty tasty");
	}
}