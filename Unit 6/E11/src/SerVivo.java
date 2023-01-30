/**
 * Codifica la jerarquia ser vivo, animal y vegetal, creando las estructuras que consideres necesario para almacenar de
 * cada elemento como minimo nombre cientifico y nombre comun. Para los animales almacenar peso y altura. Para los
 * vegetales unicamente altura. Cada ser vivo se alimentara de una manera diferente, por lo que debera reflejar este
 * aspecto de alguna forma.
 */
public abstract class SerVivo {

    private String nombrecientifico;

    private String nombrecomun;

    public SerVivo(String nombrecientifico, String nombrecomun) {

        this.nombrecientifico = nombrecientifico;

        this.nombrecomun = nombrecomun;
    }

    public String getNombrecientifico() {

        return nombrecientifico;
    }

    public void setNombrecientifico(String nombrecientifico) {

        this.nombrecientifico = nombrecientifico;
    }

    public String getNombrecomun() {

        return nombrecomun;
    }

    public void setNombrecomun(String nombrecomun) {

        this.nombrecomun = nombrecomun;
    }

    abstract String alimentar();
}
