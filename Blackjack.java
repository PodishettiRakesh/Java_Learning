import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Blackjack {
    private static final char[] SUITS = {'H', 'D', 'C', 'S'};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private static final int MAX_POINTS = 21;
    private static final int DEALER_MAX_POINTS = 17;

    private List<String> deck;
    private List<String> playerHand;
    private List<String> dealerHand;
    private int playerScore;
    private int dealerScore;

    public Blackjack() {
        initializeCards();
        shuffleDeck();
        playerHand = new ArrayList<>();
        dealerHand = new ArrayList<>();
        dealInitialCards();
        playerScore=calculateScore(playerHand);
        dealerScore=calculateScore(dealerHand);

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
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("playerhand"+playerHand);
            System.out.println("playerScore "+playerScore);
            System.out.println("please enter h to hit or s to stand");
            String choice=scan.nextLine();
            if(choice.equalsIgnoreCase("h")){
                playerHand.add(drawCard());
                playerScore=calculateScore(playerHand);
                if(playerScore>MAX_POINTS){
                    System.out.println("your score exceeds maximum score");
                    break;
                }
            } else if(choice.equalsIgnoreCase("s")){
                break;
            }else{
                System.out.println("invalid input, allowed inputs: (h) and (s)");
            }
        }
        scan.close();
    }

    private void dealerTurn(){
        dealerScore=calculateScore(dealerHand);
        while(dealerScore < DEALER_MAX_POINTS){
            dealerHand.add(drawCard());
            dealerScore=calculateScore(dealerHand);
            System.out.println("dealerscore: "+ dealerScore);
        }
        System.out.println("dealer score also exceeds dealer max points limit");
    }

    public static void main(String[] args) {
        Blackjack game = new Blackjack();
        game.playerTurn();
        game.dealerTurn();
    }
}
