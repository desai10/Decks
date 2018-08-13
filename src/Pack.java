import java.util.ArrayList;
import java.util.List;

public class Pack {


    public static List<Card> getPackCards() {
        List<Card> cards = new ArrayList<>();
        Utils.Suits suitArray[] = Utils.Suits.values();
        Utils.Pip pipArray[]=Utils.Pip.values();
        for(int i=1;i<suitArray.length;i++)
            for(int j=1;j<pipArray.length;j++)
                cards.add(new Card(suitArray[i],pipArray[j]));
        cards.add(new Card(suitArray[0],pipArray[0]));
        cards.add(new Card(suitArray[0],pipArray[0]));
        return cards;
    }


}
