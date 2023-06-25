public class Student {
    private String DNI;
    private String name;
    private int age;
    private String address;

    public Student() {
        this.DNI = "";
        this.name = "";
        this.age = 0;
        this.address = "";
    }

    public Student(String DNI, String name, int age, String address) {
        this.DNI = DNI;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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

    @Override
    public String toString() {
        return "Student{" +
                "DNI='" + DNI + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
