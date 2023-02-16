public class Representative extends Legislator{

    public Representative(String dni, String name, String surname, int age, String stateRepresented) {
        super(dni, name, surname, age, stateRepresented);
    }

    public String houseWorks(){
        return "Lower chamber";
    }

    public String toString() {
        return super.toString() + " --> " + "Representative{" +
                "house=" + houseWorks() +
                '}';
    }
}
