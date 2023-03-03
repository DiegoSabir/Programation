public class Car implements Vehicles {
    int actualSpeed;
    public Car(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }

    public int brake (int slowDown){
        actualSpeed -= slowDown;
        return actualSpeed;
    }

    public int accelerate (int increaseSpeed){
        if (actualSpeed >= MAXSPEED){
            System.out.println("MAXIMUM SPEED ACHIEVED");
            return 120;
        }
        else{
            actualSpeed += increaseSpeed;
            if(actualSpeed >= 120){
                return 120;
            }
            else{
                return actualSpeed;
            }
        }
    }

    public int maxCapacity(int capacity){
        return capacity;
    }
}
