public class Main {

    public static void main(String [] args) {
        //Deck d=new Deck(2);
        Deck d1=new Deck(1,2);
        System.out.println(d1.allCards);
        d1.shuffle();
        System.out.println(d1.allCards);
        d1.deal(25);
        d1.setWildCard(Utils.Pip.valueOf("Three"));
        System.out.println(d1.allCards);
    }

}
