import java.util.ArrayList;
import java.util.List;

public class Pack {
    List<Card> cards = new ArrayList<>();

    public Pack() {
        for(Utils.Suits suit : Utils.Suits.values())
            for(Utils.Pip pip : Utils.Pip.values())
                cards.add(new Card(suit,pip));
    }

    public List<Card> getCards() {
        return cards;
    }
}
