import java.sql.Statement;

public class Creacion {
    public static void crearBase(Statement sentencia){
        try{
            String bd = "productos";

            sentencia.execute("CREATE DATABASE IF NOT EXISTS " + bd ";");
            sentencia.execute("USE " + bd + ";");

            sentencia.execute()
        }
    }
}
