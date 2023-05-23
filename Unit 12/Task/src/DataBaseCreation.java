import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseCreation {
    public static void dataBaseCreation(Statement sentence){
        try{
            String database = "Library";
            sentence.execute("CREATE DATABASE IF NOT EXISTS " + database + ";");
            sentence.execute("USE " + database + ";");
            sentence.execute("CREATE TABLE IF NOT EXISTS AUTHORS("
                    + " dni VARCHAR(9),"
                    + " name VARCHAR(30),"
                    + " nationality VARCHAR(30),"
                    + " PRIMARY KEY (dni))"
                    + " ENGINE INNODB;");

            sentence.execute("CREATE TABLE IF NOT EXISTS BOOKS("
                    + " idBook INT(5) unsigned zerofill not null auto_increment,"
                    + " title VARCHAR(30),"
                    + " price FLOAT,"
                    + " author VARCHAR (9),"
                    + " PRIMARY KEY (idBook),"
                    + " FOREIGN KEY (author) REFERENCES AUTHORS(dni))"
                    + " ENGINE INNODB;");
        }
        catch (SQLException eSQL){
            System.out.println(eSQL);
        }
    }
}
