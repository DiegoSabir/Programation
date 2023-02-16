public class Die extends Raffle {
    protected int chance;

    public Die(int chance) {
        this.chance = 6;
    }
    public int threw(){
        return (int) (Math.random() * chance + 1);
    }
}
