import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Statement sentencia = null;
        Connection connect = null;


        int option = 0;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:mariadb://localhost:3307/?user=root&password=1234";

        try {
            connect = DriverManager.getConnection(url);
        }
        catch (SQLException eSQL) {
            System.out.println("UNRECOGNIZED SPECIFIED URL");
        }
        catch (Exception e) {
            System.out.println("ERROR OCCURRED");
        }

        try {
            sentencia = connect.createStatement();
        }
        catch (SQLException eSQL) {
            System.out.println("ERROR");
        }

        DataBaseCreation.dataBaseCreation(sentencia);

        do {
            option = menu();

            switch (option) {
                case 1:
                    insertLine(sentencia);
                    break;

                case 2:
                    removeLine(sentencia);
                    break;

                case 3:
                    consultLine(sentencia);
                    break;

                case 4:
                    modifyLine(sentencia);
                    break;

                case 5:
                    System.out.println("END'S PROGRAM");
                    break;

                default:
                    System.out.println("ERROR: Introduce a correct option");
                    break;
            }

        }
        while (option != 5);
    }

    private static int menu () {
        System.out.println("Introduce one of the following options: \n"
                + "[1] Insert new line\n"
                + "[2] Remove line\n"
                + "[3] Consult line\n"
                + "[4] Modify line\n"
                + "[5] Exit\n");
        return Integer.parseInt(sc.nextLine());
    }

    private static void insertLine(Statement sentencia){
        System.out.println("Introduce ");
        System.out.println();
    }

    private static void removeLine(Statement sentencia){

    }


    private static void consultLine(Statement sentencia){

    }

    private static void modifyLine(Statement sentencia){

    }
}