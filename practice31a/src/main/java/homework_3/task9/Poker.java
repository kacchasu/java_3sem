package homework_3.task9;

import java.util.*;

class Card{
    Suit suit;
    Rank rank;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + " " + suit;
    }

}

public class Poker {
    public static void main(String[] args) {
        List<Card> deck = new ArrayList<Card>();
        for(Suit suit: Suit.values()){
            for(Rank rank: Rank.values()){
                deck.add(new Card(rank, suit));
            }
        }
        Collections.shuffle(Arrays.asList(deck));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                System.out.println(deck.get(deck.size()-1).toString());
                deck.remove(deck.size()-1);
            }
            System.out.println();
        }
    }
}
