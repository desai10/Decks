import java.util.*;

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

    public void shuffle(){
        Collections.shuffle(allCards);
    }

    public List<List<Card>> deal(int numberOfPlayers){
        //this.shuffle();
        List<List<Card>> gameSet=new ArrayList<List<Card>>();
        for(int i=0; i<numberOfPlayers; i++)
            gameSet.add(new ArrayList<Card>());
        int player=0;
        Iterator<Card> iter=allCards.iterator();
        while(iter.hasNext()){
            gameSet.get(player).add(iter.next());
            player=(player+1)%numberOfPlayers;
        }
        System.out.println(gameSet);
        return gameSet;
    }

}
