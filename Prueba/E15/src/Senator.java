public class Senator extends Legislator{
    public Senator(String dni, String name, String surname, int age, String stateRepresented) {
        super(dni, name, surname, age, stateRepresented);
    }

    public String houseWorks(){
        return "Upper chamber";
    }

    public String toString() {
        return super.toString() + " --> " + "Senator{" +
                "house=" + houseWorks() +
                '}';
    }
}
