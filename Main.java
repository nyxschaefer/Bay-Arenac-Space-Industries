import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
   //KEYBOARD
        Scanner keyboard = new Scanner(System.in);
        //SET PASSWORD
        String password = "F8*3&G84h%0";
        String passquery;

        //DISPLAY PASSWORD
        System.out.println("Password: " + password);
        
        //DO STATEMENT
        do{

        //GET PASSWORD INPUT FROM USER
        System.out.println("Enter Password");
        passquery = keyboard.nextLine();
        //IF STATEMENT FOR PASSWORD VERIFICATION
       if (passquery.equals(password)){

           //WELCOME MESSAGE
        System.out.println("Welcome to Bay Arenac Space Industries. The rocket is fully prepared for take off.\n");
       
       }
       //ELSE STATEMENT
       else{

           //INCORRECT PASSWORD MESSAGE
           System.out.println("Incorrect password, please try again.");
       }
    }
       //WHILE LOOP
       while(!passquery.equals(password));
    

int choice;
do
{
    // Get the user's menu choice.
    choice = getMenuChoice(keyboard);

    // Do what the user requested.
    switch(choice)
    {
        case 1 : launch(keyboard);
            break;
        case 2 : database(keyboard);
            break;
        case 3 : fuel(keyboard);
            break;
        case 4 : System.out.println("Goodbye!");
    }
        } while (choice != 4);
            }
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

static void printAndSleep(String string, int sleepTimeMs) throws InterruptedException {
    System.out.println(string);
    Thread.sleep(sleepTimeMs);
  }

public static void launch(Scanner keyboard) throws InterruptedException{
    printAndSleep("The rocket slowly prepares to take off in....",2000);
    printAndSleep("3",2000);
    printAndSleep("2",2000);
    printAndSleep("1",2000);
    printAndSleep("\nThe rocket launches off of the station releasing 1 pound of fuel per second, within 60 seconds the rocket reaches the speed of 1800 meters per second.", 3000);
    printAndSleep("By 65 seconds the rocket has reached a speed of 1950 meters per second, and traveled 64,359 meters.",3000);
    printAndSleep("The rocket leaves the atmosphere by 68 seconds having traveled 70,380 meters.\n\n",3000);
}
public static void database(Scanner keyboard) throws InterruptedException{
    String astronaut1 = ("Jenna");
    String astronaut2 = ("Name: Gabe\nDOB: 01/31/04\nID: 02\nAddress: 346 Park Ave. NY, NY\nEmail Address: AGHHHHHHOHMYGODHELP@gmail.com\nPhone #: (989)666-1337\nPay Wage: $100/hour\nWeight:  ");
    String astronaut3 = ("Kevin");
    String astronaut4 = ("Lance");
    String astronaut5 = ("");
    String astronaut6 = ("");
    String astronaut7 = ("");
    String astronaut8 = ("");
    String astronaut9 = ("");
    String astronaut10 = ("");
    printAndSleep("Astronaut 01: " + astronaut1, 1000);
    printAndSleep("Astronaut 02: " + astronaut2, 1000);
    printAndSleep("Astronaut 03: " + astronaut3, 1000);
    printAndSleep("Astronaut 04: " + astronaut4 +"\n", 1000);
    databasemenu(keyboard);
}
public static void fuel(Scanner keyboard){
    
}
public static void databasemenu(Scanner keyboard) throws InterruptedException{
    int choice2;
do
{
    // Get the user's menu choice.
    choice2 = getMenu2Choice(keyboard);

    // Do what the user requested.
    switch(choice2)
    {
        case 1 : launch(keyboard);
            break;
        case 2 : database(keyboard);
            break;
        case 3 : fuel(keyboard);
            break;
        case 4 : System.out.println("Goodbye!");
    }
        } while (choice2 != 4);
            }
    public static int getMenu2Choice(Scanner keyboard)
    {
        int choice2;


        System.out.println("1. Add Astronaut");
        System.out.println("2. Edit Astronaut");
        System.out.println("3. Delete Astronaut");
        System.out.println("4. Go Back\n");
        System.out.print("Enter your choice (1-4) : ");

choice2 = keyboard.nextInt();

if (choice2 < 1 || choice2 > 4)
{
    System.out.print("Error: Enter 1, 2, 3, or 4: ");
    choice2 = keyboard.nextInt();
}

return choice2;
}

}



  

