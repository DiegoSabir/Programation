import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    private String dni;
    private String name;
    private Date bornDate;
    private String nationality;
    private String telephoneNumber;
    private String addres;

    public Person(String dni, String name, int bornYear, int bornMonth, int bornDay, String nationality, String telephoneNumber, String addres) {
        this.dni = dni;
        this.name = name;
        GregorianCalendar bornDate = new GregorianCalendar(bornYear, bornMonth - 1, bornDay);
        this.bornDate = bornDate.getTime();
        this.nationality = nationality;
        this.telephoneNumber = telephoneNumber;
        this.addres = addres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }
}
