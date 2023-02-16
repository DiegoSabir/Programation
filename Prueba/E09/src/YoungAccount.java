/**
 * Vamos a definir ahora una "Cuenta Joven", para ello va,ps a crear una nueva clase CuentaJoven que deriva de la
 * anterior.
 *
 * Cuando se crea esta nueva clase, ademas del titular y la cantidad se debe guardar una bonificacion que estara
 * experesada en tanto por ciento y la edad del titular de la cuenta joven.
 *
 * Construye los siguientes metodos para la clase:
 * Un constructor.
 *
 * Los setters y getters para el nuevo atributo.
 * En esta ocasion los titulares de este tipo de cuenta tienen que ser mayor, por lo tanto hay que crear un metodo
 * esTitularValido() que devuelve verdadero si el titular es mayor de edad pero menor de 25.
 *
 * Además la retirada de dinero sólo se podrá hacer si el titular es válido.
 * El método mostrar() debe devolver el mensaje de “Cuenta Joven” y la bonificación de la cuenta.
 * Piensa los métodos heredados de la clase madre que hay que reescribir.
 */
public class YoungAccount extends Account {
    private double bonus;
    Owner age;

    public YoungAccount(Owner name, double quantity, double bonus, Owner age) {
        super(name, quantity);
        this.bonus = bonus;
        this.age = age;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Owner getAge() {
        return age;
    }

    public void setAge(Owner age) {
        this.age = age;
    }

    public boolean validOwner(){
        if (getAge().isAdult() && super.getName().getAge() <= 25){
            return true;
        }
        else{
            return false;
        }
    }

    public double withdraw (double quantityWithdrew){
        if (validOwner()){
           return super.withdraw (quantityWithdrew);
        }
        else{
            System.out.println("WITHDREW CANCELED. INVALID OWNER");
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "YoungAccount{" +
                "bonus=" + bonus +
                ", age=" + age +
                '}';
    }

    public String show (){
        return toString() + bonus;
    }

}
