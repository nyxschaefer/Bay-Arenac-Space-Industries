import java.util.Scanner;


public class Menu3
{
        public static void main() throws InterruptedException
        {
                Scanner keyboard = new Scanner(System.in);
                int choice;
                String userName = "";
         do
         {
             // Get the user's menu choice.
             choice = getMenuChoice(keyboard);
         
             // Do what the user requested.
             switch(choice)
             {
                 case 1 : menu.main();
                     break;
                 case 2 : AstronautInformation.astro(userName);
                     break;
                 case 3 : Main.fuel(keyboard);
                     break;
                 case 4 : Logout.main();
             }
                 } while (choice != 4);
                     }
                 
         
             public static int getMenuChoice(Scanner keyboard)
             {
                 int choice;
         
         //menu choices
                 System.out.println("1. Start over");
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
