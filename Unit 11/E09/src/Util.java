import java.io.*;
import java.util.Scanner;

public class Util {
    public class Main {
        static Scanner sc = new Scanner(System.in);
        public void main(String[] args) {
            int option;
            do {
                option = menu();
                switch (option) {
                    case 1:
                        createFile();
                        break;
                    case 2:
                        showProducts();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Introduce a right option");
                }
            } while (option != 3);
        }

        private static int menu() {
            System.out.println("Choose a option: ");
            System.out.println("[1] Create file");
            System.out.println("[2] Show product and remove");
            System.out.println("[3] Exit");

            return Integer.parseInt(sc.nextLine());
        }

        private void createFile(){
            String[] products = {"PlayStation 5", "Xbox One", "Switch"};
            double[] prices = {549.99, 771.26, 299.00};

            try (BufferedWriter file = new BufferedWriter(new FileWriter("gameConsoles.txt"))){
                for (int i = 0; i < products.length; i++) {
                    file.write(products[i] + " = $" + prices[i]);
                    file.newLine();
                }
                System.out.println("Data saved to file");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void showProducts(){
            Scanner sc = new Scanner(System.in);
            File readFile = new File("gameConsoles.txt");
            File temporalFile = new File("gameConsolesTemporal.txt");

            System.out.println("Introduce product name: ");
            String product = sc.next();

            try (BufferedReader reading = new BufferedReader(new FileReader(readFile));
                 BufferedWriter writing = new BufferedWriter(new FileWriter(temporalFile))){
                String readingLine;

                while((readingLine = reading.readLine()) != null){
                    if (readingLine.contains(product)) {
                        System.out.println(readingLine);
                    }
                    else{
                        writing.write(readingLine + '\n');
                    }
                }

                if (readFile.delete()){
                    temporalFile.renameTo(readFile);
                }
                else {
                    System.out.println("ERROR");
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }

    }
