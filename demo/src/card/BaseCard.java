public abstract class BaseCard {
    private String cardName;

    public BaseCard(String cardName){
        this.cardName = cardName;
        System.out.println("Make new card");
    }

    abstract void useEffect();
}
