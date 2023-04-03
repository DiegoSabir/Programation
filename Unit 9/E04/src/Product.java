public class Product {
    private int idProduct;
    private String nameProduct;
    private String description;

    public Product(int idProduct, String nameProduct, String description) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.description = description;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
