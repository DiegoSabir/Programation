public class Person {
    private String dni;
    private String name;
    private int age;
    private String address;

    public Person() {
        this.dni = "Defect Dni";
        this.name = "Defect Name";
        this.age = 18;
        this.address = "Defect Address";
    }

    public Person(String dni, String name, int age, String address) {
        this.dni = dni;
        this.name = name;
        this.age = age;
        this.address = address;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
