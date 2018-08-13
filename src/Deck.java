import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Deck {
    List<Card> allCards=new ArrayList<Card>();

    Deck(int numberOfPacks){
        while(numberOfPacks--!=0)
            allCards.addAll(Pack.getPackCards());
    }

    Deck(int numberOfPacks, int numberOfjokers){
        int numberOfJokersToRemove=2*numberOfPacks-numberOfjokers;
        while(numberOfPacks--!=0)
            allCards.addAll(Pack.getPackCards());
        while(numberOfJokersToRemove--!=0)
            removeJokerFromDeck();
    }

    private void removeJokerFromDeck(){
        Iterator<Card> iter=allCards.iterator();
        while(iter.hasNext()){
            Card c=iter.next();
            if(c.getPip()== Utils.Pip.Joker)
                iter.remove();
            break;
        }
    }
}
