
public class Game {
    private static Setofcards setofcards;
    private static int player1;
    private static int player2;

    public Game(){
        setofcards = new Setofcards();
    }

    public static void play(){
        while (setofcards.Size() > 0){
            Card card = setofcards.draw();
            System.out.println("Player 1:"+card);
            Card card1 = setofcards.draw();
            System.out.println("Player 2:"+card1);

            if (card.compareTo(card1) < 0){
                player2++; }
            else if (card1.compareTo(card) < 0){
                player1++; }
            else{
                assert(card.compareTo(card1) == 0);
                System.out.println("You are both equal");

            }
        }
        System.out.println();
        System.out.println("Player1: "+player1+" VS. "+"Player2: "+player2);



    }
}
