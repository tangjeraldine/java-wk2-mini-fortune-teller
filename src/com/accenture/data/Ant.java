package com.accenture.data;

public class Ant extends AnimalData {
	@Override
	public void character() {
		System.out.println("Spirit Animal: Ant");
	}
	@Override
	public void work() {
		System.out.println("Work: A hard worker as always, you strive to do your best but you're tiny and invisible. Your dilligence will go unnoticed by your boss.");
	}
	@Override
	public void luck() {
		System.out.println("Luck: Not great. Stay hidden or you will 10/10 get squashed by a tissue.");
	}
	@Override
	public void diet() {
		System.out.println("Recommended diet: You should eat rubbish today, as you always do.");
	}
}