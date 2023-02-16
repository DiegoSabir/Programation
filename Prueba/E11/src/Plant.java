public class Plant extends LivingBeing {
    private double height;

    public Plant(String commonName, String scientificName, double height) {
        super(commonName, scientificName);
        this.height = height;
    }

    public Plant(String commonName, String scientificName) {
        super(commonName, scientificName);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String foodClassification(){
        return "photosynthesis";
    }
}
