package com.huaxia.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private List<BlackjackCard> hand = new ArrayList<>();
	
	Player(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
