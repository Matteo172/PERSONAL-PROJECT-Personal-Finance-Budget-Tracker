package Project1;
import java.util.*;

public class MainCode{

    static int selection;
    static boolean loop1 = false;
    static String press;

     public static void clearscreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        clearscreen();
        System.out.println("                                                                                                    ");
        System.out.println("                                                                                                    ");
        System.out.println("                           ██     ██ ▄▄▄▄▄ ▄▄     ▄▄▄▄  ▄▄▄  ▄▄   ▄▄ ▄▄▄▄▄   ▄▄▄▄▄▄ ▄▄▄             ");
        System.out.println("                           ██ ▄█▄ ██ ██▄▄  ██    ██▀▀▀ ██▀██ ██▀▄▀██ ██▄▄      ██  ██▀██            ");
        System.out.println("                            ▀██▀██▀  ██▄▄▄ ██▄▄▄ ▀████ ▀███▀ ██   ██ ██▄▄▄     ██  ▀███▀            ");
        System.out.println("                                                                                                    ");
        System.out.println("                                                                                                    ");
        System.out.println("                 █████▄ ▄▄ ▄▄ ▄▄▄▄   ▄▄▄▄ ▄▄▄▄▄ ▄▄▄▄▄▄   ██████ ▄▄▄▄   ▄▄▄   ▄▄▄▄ ▄▄ ▄▄ ▄▄▄▄▄ ▄▄▄▄  ");
        System.out.println("                 ██▄▄██ ██ ██ ██▀██ ██ ▄▄ ██▄▄    ██       ██   ██▄█▄ ██▀██ ██▀▀▀ ██▄█▀ ██▄▄  ██▄█▄ ");
        System.out.println("                 ██▄▄█▀ ▀███▀ ████▀ ▀███▀ ██▄▄▄   ██       ██   ██ ██ ██▀██ ▀████ ██ ██ ██▄▄▄ ██ ██ ");
        System.out.println("                                                                                                    ");
        System.out.println("                                          BY: John Matthew I. Malabag                             \n");

        System.out.print("Please press Enter to Begin ");
        press = scanner.nextLine();

        clearscreen();
        while(!loop1){
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("║                   LOG IN MENU                    ║");
            System.out.println("╠══════════════════════════════════════════════════╣");
            System.out.println("║                                                  ║");
            System.out.println("║  1) Sign up                                      ║");
            System.out.println("║  2) Log in                                       ║");
            System.out.println("║  3) Exit                                         ║");
            System.out.println("║                                                  ║");
            System.out.println("║  Select your option:                             ║");
            System.out.println("╚══════════════════════════════════════════════════╝\n");

            try{
                System.out.print("\033[9;24H");
                selection = scanner.nextInt();
            
                switch (selection) {
                    case 1:
                        clearscreen();
                        Signup.Signup(args);
                        clearscreen();
                        break;

                    case 2:
                        clearscreen();
                        Login.Login(args);
                        break;

                    case 3:
                        clearscreen();
                        System.out.println("                                                                        ");
                        System.out.println("                                                                        ");
                        System.out.println("                     ▄████  ▄▄▄▄   ▄▄▄   ▄▄▄▄ ▄▄  ▄▄▄   ▄▄▄▄  ▄▄        ");
                        System.out.println("                    ██  ▄▄▄ ██▄█▄ ██▀██ ██▀▀▀ ██ ██▀██ ███▄▄  ██        ");
                        System.out.println("                     ▀███▀  ██ ██ ██▀██ ▀████ ██ ██▀██ ▄▄██▀  ██        ");
                        System.out.println("                                                              ▄▄        ");
                        System.out.println("                                                                        ");
                        System.out.println("              ▄█████  ▄▄▄  ▄▄   ▄▄ ▄▄▄▄▄   ▄████▄  ▄▄▄▄  ▄▄▄  ▄▄ ▄▄  ▄▄ ");
                        System.out.println("              ██     ██▀██ ██▀▄▀██ ██▄▄    ██▄▄██ ██ ▄▄ ██▀██ ██ ███▄██ ");
                        System.out.println("              ▀█████ ▀███▀ ██   ██ ██▄▄▄   ██  ██ ▀███▀ ██▀██ ██ ██ ▀██ ");
                        System.out.println("                                                                        ");
                        System.out.println("                                                                        ");
                        System.out.println("                                                                        ");
                        System.exit(0);
                
                    default:
                        scanner.nextLine();
                        System.out.println("\n\nInvalid choice. Please try-again.");
                        System.out.print("Please press Enter to Begin ");
                        scanner.nextLine();
                        clearscreen();
                }
            }catch(InputMismatchException e){
                scanner.nextLine();
                System.out.println("\n\nInvalid input. Please try again");
                System.out.print("Please press Enter to Begin ");
                scanner.nextLine();
                clearscreen();
            }
        }
    }
}
