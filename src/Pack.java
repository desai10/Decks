import java.util.ArrayList;
import java.util.List;

public class Pack {


    public static List<Card> getPackCards() {
        List<Card> cards = new ArrayList<>();
        for(Utils.Suits suit : Utils.Suits.values())
            for(Utils.Pip pip : Utils.Pip.values())
                cards.add(new Card(suit,pip));
    return cards;
    }


}
