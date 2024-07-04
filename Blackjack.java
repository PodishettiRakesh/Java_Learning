import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Blackjack {
    private static final char[] SUITS = {'H', 'D', 'C', 'S'};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private static final int MAX_POINTS = 21;
    private static final int DEALER_MIN_POINTS = 17;

    private List<String> deck;
    private List<String> playerHand;
    private List<String> dealerHand;

    public Blackjack() {
        initializeCards();
        shuffleDeck();
        playerHand = new ArrayList<>();
        dealerHand = new ArrayList<>();
    }

    private void initializeCards() {
        deck = new ArrayList<>();
        for (char suit : SUITS) {
            for (String rank : RANKS) {
                deck.add(suit + "" + rank);
            }
        }
    }

    private void shuffleDeck() {
        Collections.shuffle(deck);
    }

    private void dealInitialCards() {
        playerHand.add(drawCard());
        playerHand.add(drawCard());
        dealerHand.add(drawCard());
        dealerHand.add(drawCard());
    }

    private String drawCard() {
        return deck.remove(deck.size() - 1);
    }

    public static void main(String[] args) {
        Blackjack game = new Blackjack();
        System.out.println(game.deck);
    }
}
