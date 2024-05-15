import java.util.ArrayList;
public class Table{
    private ArrayList<Player> players = new ArrayList<>();
    private Deck deck;
    private int currentPlayer;

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void setDeck(Deck deck){
        this.deck = deck;
    }

    public void initialDraw(Piece piece){
        for(int i = 0; i < players.size(); i++){
            for (int j = 0; j < 7; j++) {
                this.players.get(i).draw(this.deck.pickPiece());
            }
        }
    }

}