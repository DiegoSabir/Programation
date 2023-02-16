public abstract class Legislator extends Person {
    private String stateRepresented;

    public Legislator(String dni, String name, String surname, int age, String stateRepresented) {
        super(dni, name, surname, age);
        this.stateRepresented = stateRepresented;
    }

    public String getStateRepresented() {
        return stateRepresented;
    }

    public void setStateRepresented(String stateRepresented) {
        this.stateRepresented = stateRepresented;
    }

    public abstract String houseWorks();

    public String toString() {
        return super.toString() + " --> " + "Legislator{" +
                "state=" + stateRepresented +
                '}';
    }
}
