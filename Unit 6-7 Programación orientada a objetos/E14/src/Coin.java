public class Coin extends Raffle{
    protected int chance;

    public Coin(int chance) {
        this.chance = 2;
    }

    public int threw(){
        int side = (int) (Math.random() * chance + 1);
        if (side == 1){
            System.out.println("front");
            return 1;
        }
        else{
            System.out.println("tails");
            return 2;
        }
    }
}
