package m6_basic_concepts.a10_playing_cards;

import java.util.Random;
import java.util.Scanner;

public class CardMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] suits = {"clubs", "diamonds", "spades", "hearts"};
        String[] ranks = {
                "ace", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten",
                "jack", "queen", "king"
        };

        Card[] cards = new Card[52];
        int counter = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards[counter] = new Card(suits[i], ranks[j]);
                counter++;
            }
        }

        int cardCount;
        System.out.print("How many cards would you like? (1..5) ");
        cardCount = scanner.nextInt();
        if (cardCount < 1 || cardCount > 5) {
            System.out.println("That's not a valid amount!");
        }

        Card[] selectedCards = new Card[cardCount];
        Random rand = new Random();

        for (int i = 0; i < selectedCards.length; i++) {
            boolean cardDrawn = false;
            Card drawnCard = null;
            while (!cardDrawn) {
                drawnCard = cards[rand.nextInt(cards.length)];
                for (Card c : selectedCards) {
                    if (c == drawnCard) {
                        //Card is already in the collection, try again
                        cardDrawn = false;
                        System.out.println("FALSE: " + c + " = " + drawnCard);
                        break;
                    } else{
                        cardDrawn = true;
                        System.out.println("TRUE: " + c + " = " + drawnCard);
                    }
                }
            }
            selectedCards[i] = drawnCard;
        }


        for (Card selectedCard: selectedCards) {
            System.out.println(selectedCard);
        }
    }
}
