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
        dealInitialCards();
    }

    private void initializeCards() {
        deck = new ArrayList<>();
        for (char suit : SUITS) {
            for (String rank : RANKS) {
                deck.add(suit + rank);
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

    private int calculateScore(List<String> hand) {
        int score = 0;
        int aceCount = 0;
    
        for (String card : hand) {
            String rank = card.substring(1);
    
            if (rank.equals("J") || rank.equals("Q") || rank.equals("K")) {
                score += 10;
            } else if (rank.equals("A")) {
                aceCount++;
                score += 11;
            } else {
                score += Integer.parseInt(rank);
            }
        }
        while (score > 21 && aceCount > 0) {
            score -= 10;
            aceCount--;
        }
    
        return score;
    }
    

    private void playerTurn(){
        System.out.println("playerhand");
    }

    public static void main(String[] args) {
        Blackjack game = new Blackjack();
        System.out.println(game.deck);
        System.out.println(game.playerHand);
        System.out.println(game.dealerHand);
        System.out.println(game.calculateScore(game.playerHand));
    }
}
