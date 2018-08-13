public class Card {

    Utils.Suits suit;
    Utils.Pip pip;
    boolean isWildCard;

    public Card(String suit, String pip) {
        this.suit = Utils.Suits.valueOf(suit);
        this.pip = Utils.Pip.valueOf(pip);
        isWildCard = false;
    }

    public Card(Utils.Suits suit, Utils.Pip pip) {
        this.suit = suit;
        this.pip = pip;
        isWildCard = false;
    }

    public void setWildCard(boolean wildCard) {
        isWildCard = wildCard;
    }

}
