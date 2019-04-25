
import java.util.Scanner;
import java.io.FileWriter;
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
                    int j;
                    System.out.println("Executing Attack 1");
                    FileWriter a2;
                    FileWriter a3;
                    FileWriter a4;
                    FileWriter a5;
                    FileWriter a6;
                    try (FileWriter a1 = new FileWriter("C:\\Users\\clear\\Documents\\FinalWeek\\Spam.txt")) {
                        a2 = new FileWriter("C:\\Users\\clear\\Documents\\FinalWeek\\virus.txt");
                        a3 = new FileWriter("C:\\Users\\clear\\Documents\\FinalWeek\\UpdatedKeyCodes.txt");
                        a4 = new FileWriter("C:\\Users\\clear\\Documents\\FinalWeek\\WhoAmI.txt");
                        a5 = new FileWriter("C:\\Users\\clear\\Documents\\FinalWeek\\WhereAmI.txt");
                        a6 = new FileWriter("C:\\Users\\clear\\Documents\\FinalWeek\\Whoops.txt");
                        a1.write(" Important files!!!");

                        for (j = 0; j < 500; j++) {
                            a2.write("Gotcha \n");
                        }
                        a2.close();
                        a3.write("Your keycodes are gone!");
                        a3.close();
                        a4.write("Who am I? Why cant i see? Where are your root files?");
                        a4.close();
                        a5.write("I think i took a wrong turn. Can you point me in the right direction to your root directory?");
                        a5.close();
                        a6.write("Press F for me. ");
                        a6.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    System.out.println("Success...");
                    break;

                case 2:

                    System.out.println("Executing Attack 2");
                    int i;
                    try (FileWriter b1 = new FileWriter("C:\\Users\\clear\\Documents\\FinalWeek\\ReadMe.txt")) {
                        for (i = 0; i < 1000; i++) {
                            b1.write("HA HA HA \n");

                        }
                    } catch (IOException e) {
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
