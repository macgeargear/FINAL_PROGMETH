public abstract class BaseCard {
    private String cardName;

    public BaseCard(String cardName){
        this.cardName = cardName;
    }

    abstract void useEffect();
}
