import org.mariadb.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Connection conexion = null;

        int op = 0;

        try{
            Class.forName("org.mariadb.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        String url = "jdbc.mariadb://";//1234
        try {
            conexion = DriverManager.getConnection(url);
            try{
                conexion = DriverManager.getConnection(url);
            }
            catch (SQLException e){
                System.out.println("No hay ningun driver que reconozca la URL especificada");
            }
            catch (Exception e){
                System.out.println("Se ha producido otro error");
            }
        }
    }

    private static void insertar(Statement sentencia) {
        System.out.println("Dame nombre de producto");
        String nombre = sc

    }
}