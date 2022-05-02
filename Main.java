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
    System.out.println("Welcome to Bay Arenac Space Industries.");
       
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
printAndSleep("\n\nThe rocket launches off of the station at 30 meters per second, within 90 seconds the rocket reaches the speed of 2700 meters \nper second.", 2000);
printAndSleep("At this point the engines turn off and within 275 seconds the rockets speed decreases by 2697.75, leaving the speed at 2.25 \nmeters per second.", 2000);
printAndSleep("The rocket engines turn back on slowly, incresing the speed by 3.75 meters per second, within 5 seconds the rocket reaches 21 \nmeters per second.", 2000);
printAndSleep("The engines turn back on fully and within 90 seconds the rocket is acelerating at 2721 meters per second.\n", 2000);
}
public static void database(Scanner keyboard) throws InterruptedException{
    String astronaut1 = ("Jenna");
    String astronaut2 = ("Gabe");
    String astronaut3 = ("Kevin");
    String astronaut4 = ("Lance");
    String astronaut5 = ("");
    String astronaut6 = ("");
    String astronaut7 = ("");
    String astronaut8 = ("");
    String astronaut9 = ("");
    String astronaut10 = ("");
    printAndSleep("Astronaut 01: " + astronaut1, 2000);
    printAndSleep("Astronaut 02: " + astronaut2, 2000);
    printAndSleep("Astronaut 03: " + astronaut3, 2000);
    printAndSleep("Astronaut 04: " + astronaut4, 2000);
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



  

