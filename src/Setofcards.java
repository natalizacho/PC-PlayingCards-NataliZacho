import java.util.Collections;
import java.util.Stack;

public class Setofcards {
    private final Stack<Card> setofcards;


    public Setofcards(){
        setofcards = new Stack<>();
        for (Number n : Number.values()){
        for (Suit s : Suit.values()){
                    setofcards.push(new Card(n, s));
                }

            }
        Collections.shuffle(setofcards);
        }


    public Card draw(){
        Card card;
        card=setofcards.pop();
        return card;
    }
    public int Size(){
        return setofcards.size();
    }
}
