
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author henrypearce
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        int choice;
        
        while (true) {
            System.out.println("Attack Menu\n");
            System.out.println("----------------------------------------------------------------");
            System.out.print("1.) Attack 1 \n");
            System.out.print("2.) Attack 2 \n");
            System.out.print("3.) End Attack \n");
            System.out.print("\nEnter Your Menu Choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Executing Attack 1");
                    break;

                case 2:

                    System.out.println("Executing Attack 2");
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
