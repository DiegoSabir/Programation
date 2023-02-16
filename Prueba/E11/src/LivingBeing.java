public abstract class LivingBeing {
    private String commonName;
    private String scientificName;

    public LivingBeing(String commonName, String scientificName) {
        this.commonName = commonName;
        this.scientificName = scientificName;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public abstract String foodClassification();
}
