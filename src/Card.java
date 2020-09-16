
public class Card implements Comparable<Card>{
    private final Number number;
    private final Suit suit;

    public Card(Number number, Suit suit){
        this.number = number;
        this.suit = suit;
    }

    @Override
    public String toString(){
        return number+" "+suit;
    }
    @Override
    public int compareTo(Card o){
        if (this.number != o.number){
            return this.number.compareTo(o.number); }
        else{
            return this.suit.compareTo(o.suit);
        }
    }
}

