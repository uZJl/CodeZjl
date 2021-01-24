/**
 * Created by JiaLe on 2021/1/22 9:42
 */
class Card {
    public String suit;
    public int rant;

    public Card(String suit, int rant) {
        this.suit = suit;
        this.rant = rant;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rant=" + rant +
                '}';
    }
}

public class CardDemo {

}
