import java.security.PublicKey;

/**
 * Codifica la jerarquia ser vivo, animal y vegetal, creando las estructuras que consideres necesario para almacenar de
 * cada elemento como minimo nombre cientifico y nombre comun. Para los animales almacenar peso y altura. Para los
 * vegetales unicamente altura. Cada ser vivo se alimentara de una manera diferente, por lo que debera reflejar este
 * aspecto de alguna forma.
 */
public abstract class SerVivo {

    private String nombreCientifico;

    private String nombreComun;

    public SerVivo(String nombreCientifico, String nombreComun) {

        this.nombreCientifico = nombreCientifico;

        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {

        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {

        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {

        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {

        this.nombreComun = nombreComun;
    }

    public abstract void alimentacion();
}
