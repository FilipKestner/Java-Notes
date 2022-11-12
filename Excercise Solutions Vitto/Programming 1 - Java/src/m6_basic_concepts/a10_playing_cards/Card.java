package m6_basic_concepts.a10_playing_cards;

public class Card {
    private String rank;
    private String suit;

    public Card(String suit, String rank) {
        setRank(rank);
        setSuit(suit);
    }

    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String toString() {
        return String.format("%s of %s", rank, suit);
    }
}
