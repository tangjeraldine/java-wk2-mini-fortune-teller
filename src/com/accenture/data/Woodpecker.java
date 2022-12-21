package com.accenture.data;

public class Woodpecker extends AnimalData {
	@Override
	public void character() {
		System.out.println("Spirit Animal: Woodpecker");
	}
	@Override
	public void work() {
		System.out.println("Work: Your work is literally giving you a headache. LOL");
	}
	@Override
	public void luck() {
		System.out.println("Luck: Bad. A neighbouring bird will steal the hole that you painstakingly pecked as their nest");
	}
	@Override
	public void diet() {
		System.out.println("Diet: Hot porridge and a panadol for that headache");
	}
}