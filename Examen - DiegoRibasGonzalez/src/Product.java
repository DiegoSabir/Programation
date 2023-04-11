import java.util.Date;
public class Product {
    private int idProduct;
    private String name;
    private Section section;
    private Date expirationDate;

    public Product() {
        this.idProduct = 0;
        this.name = "defectName";
        this.section = new Section();
        this.expirationDate = new Date();
    }

    public Product(int idProduct, String name, Section section, Date expirationDate) {
        this.idProduct = idProduct;
        this.name = name;
        this.section = section;
        this.expirationDate = expirationDate;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", section=" + section +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
