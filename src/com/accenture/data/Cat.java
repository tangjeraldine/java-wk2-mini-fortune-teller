package com.accenture.data;

public class Cat extends AnimalData {
	@Override
	public void character() {
		System.out.println("Spirit Animal: Cat");
	}
	@Override
	public void work() {
		System.out.println("Work: Too lazy to do anything. Why bother? Just sit on the sofa and sweep things off the table.");
	}
	@Override
	public void luck() {
		System.out.println("Luck: Pretty good, considering you have 9 lives");
	}
	@Override
	public void diet() {
		System.out.println("Diet: Only the best food will do. You accept nothing else!");
	}
}
