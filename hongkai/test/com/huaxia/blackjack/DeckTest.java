package com.huaxia.blackjack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeckTest {
	Deck deck;
	@BeforeEach
	void setUp() throws Exception {
		deck = new Deck();
	}

	@Test
	void testNumberOfCards() {
		assertEquals(52, deck.getStackOfCards().size());
	}
	
	@Test
	void testStackCardBeforeShuffle() {
		assertEquals("[A, SPADES]", deck.getStackOfCards().get(0).toString());
		assertEquals("[K, HEARTS]", deck.getStackOfCards().get(51).toString());
	}
	
	@Test
	void testStackCardAfterShuffle() {
		deck.shuffle();
		assertNotEquals("[A, SPADES]", deck.getStackOfCards().get(0).toString());
		assertNotEquals("[K, HEARTS]", deck.getStackOfCards().get(51).toString());
	}
	
	@Test
	void testNextCard() {
		String expected = "[K, HEARTS]";
		Card card = deck.nextCard();
		String actual = card.toString();
		assertEquals(expected, actual);
		assertEquals(50, deck.getCurrentIndex());
		
		card = deck.nextCard();
		expected = "[K, DIAMONDS]";
		actual = card.toString();
		assertEquals(expected, actual);
		assertEquals(49, deck.getCurrentIndex());
	}

}
