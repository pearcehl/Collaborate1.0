
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        int choice;

        while (true) {
            System.out.println("Attack Menu");
            System.out.println("----------------------------------------------------------------");
            System.out.print("1.) Attack 1 \n");
            System.out.print("2.) Attack 2 \n");
            System.out.print("3.) End Attack \n");
            System.out.print("Enter Your Menu Choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Executing Attack 1");
                    try {
                        FileWriter a1 = new FileWriter("C:\\Users\\clear\\Documents\\FinalWeek\\Spam.txt");
                        FileWriter a2 = new FileWriter("C:\\Users\\clear\\Documents\\FinalWeek\\virus.txt");
                        FileWriter a3 = new FileWriter("C:\\Users\\clear\\Documents\\FinalWeek\\UpdatedKeyCodes.txt");
                        a1.write(" Important files!!!");
                        a1.close();
                        a2.write("Gotcha");
                        a2.close();
                        a3.write("Your keycodes are gone!");
                        a3.close();

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("Success...");
                    break;

                case 2:

                    System.out.println("Executing Attack 2");
                    int i;
                    try {
                        FileWriter b1 = new FileWriter("C:\\Users\\clear\\Documents\\FinalWeek\\ReadMe.txt");
                        for(i=0; i<1000; i++){
                        b1.write("HA HA HA \n");
                        
                        }
                        b1.close();
                   } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("Success...");
                    break;

                case 3:
                    System.out.println("Ending Attack...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("This is not a valid Menu Option! Please Select Another");
                    break;

            }

        }

    }
}
