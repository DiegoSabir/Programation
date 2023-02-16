public class Motorcycle implements Vehicles {
    int actualSpeed;
    public Motorcycle(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }

    public int brake (int slowDown){
        actualSpeed -= slowDown;
        return actualSpeed;
    }

    public int accelerate (int increaseSpeed){
        if (actualSpeed >= MAXSPEED){
            System.out.println("MAXIMUM SPEED ACHIEVED");
            return actualSpeed;
        }
        else{
            actualSpeed += increaseSpeed;
            return actualSpeed;
        }
    }

    public int maxCapacity(int capacity){
        return capacity;
    }
}
