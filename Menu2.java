import java.util.Scanner;


public class Menu2
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
                 case 1 : Menu2.story2(keyboard);
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
// text timer
         static void printAndSleep(String string, int sleepTimeMs) throws InterruptedException {
                System.out.println(string);
                Thread.sleep(sleepTimeMs);}
//continue misson text
         public static void story2(Scanner keyboard) throws InterruptedException{

                printAndSleep("At this point the rocket is in space and runs out of fuel, entering a free fall, dritfting for another 211090 meters.",3000);
                printAndSleep("While the rocket drifts the astronauts do an EVA for 5 minutes, during this time the rocket slows to a complete stop within 3 minitues and 28 seconds.",3500);
                printAndSleep("At this point the rocket speeds back up, within 250 seconds the rocket has fallen 272031.3 meters.",3000);
                printAndSleep("With the rocket now 9439 meters from the earth, the parschutes deploy.",2500);
                printAndSleep("The rocket falls for 22 minutes and 43 seconds before reaching the ground.",2500);
                printAndSleep("When the rocket finally touches the ground the doors open and the astronauts are directed to get out.",3000);
                Menu3.main();

        }


}
