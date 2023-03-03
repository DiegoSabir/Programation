public class Animal extends LivingBeing {
    private double weight;
    private double height;
    private String food;

    public Animal(String commonName, String scientificName, double weight, double height, String food) {
        super(commonName, scientificName);
        this.weight = weight;
        this.height = height;
        this.food = food;
    }

    public Animal(String commonName, String scientificName, String food) {
        super(commonName, scientificName);
        this.food = food;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String foodClassification(){
        if (food.equals("meat") || food.equals("fish")){
            return "carnivorous";
        }
        else if (food.equals("grass") || food.equals("fruit")){
            return "herbivorous";
        }
        else{
            return "omnivorous";
        }
    }
}
