import java.util.Scanner;
public class menu
{
        static Scanner keyboard = new Scanner(System.in);
        public static void main() throws InterruptedException{
         int choice;
       String userName = "";
do
{
    // Get the user's menu choice.
    choice = getMenuChoice(keyboard);

    // Do what the user requested.
    switch(choice)
    {
        case 1 : Main.launch(keyboard);
            break;
        case 2 : AstronautInformation.astro(userName);
            break;
        case 3 : Main.fuel(keyboard);
            break;
        case 4 : Logout.main();
    }
        } while (choice != 4);
            }
        
//menu choices 
    public static int getMenuChoice(Scanner keyboard)
    {
        int choice;


        System.out.println("1. Continue with the mission");
        System.out.println("2. Astronaut information");
        System.out.println("3. Fuel left in tank");
        System.out.println("4. Quit\n");
        System.out.print("Enter your choice (1-4) : ");
        choice = keyboard.nextInt();

if (choice < 1 || choice > 4)
{
    System.out.print("Error: Enter 1, 2, 3, or 4: ");
    choice = keyboard.nextInt();
}

return choice;
}
}
