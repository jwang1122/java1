package com.huaxia.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private List<Card> hand = new ArrayList<>();
	
	public Player(String name) {
		this.name = name;
	}
	
	public void addCardToHand(Card card) {
		hand.add(card);
	}
	
	public void cleanHand() {
		hand.clear();
	}
	
	public int getHandValue() {
		int value = 0;
		for(Card card:hand) {
			value += card.getValue();
		}
		if(value>21) { // busted!
			if (isAceInHand()) {
				value -= 10; // correct my Ace from 11 to 1
			}
		}
		return value;
	}
	
	//Homework: write unit test to test this method
	private boolean isAceInHand() {
		boolean flag = false; // assume there is no Ace in my hand
		for (Card card : hand) {
			if(card.face.equals("A")) {
				flag = true;
				break;
			}
		}
		return flag;
	}
//	for (Card card : hand) {
//		if(card.face.equals("A")) {
//			return true;
//		}
//	}
//	return false;
	
	@Override
	public String toString() {
		return name;
	}

	public Integer getHandSize() {
		return hand.size();
	}
}
