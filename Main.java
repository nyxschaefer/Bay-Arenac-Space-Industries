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
    
      // printAndSleep("'On your left you will see our trusted personnel loading up the rocket.'\n", 2000);
    //   printAndSleep("'And on your right you will see the astronauts preparing to enter the rocket.'\n", 2000);
     //  printAndSleep("'And thats it for the tour! I hope you all had fun, and remember that if you stick around long enough you will get to see the rocket take off with your own eyes, so feel free to look around until then!'\n", 6000);
      // printAndSleep("The tour guide leaves and the group disperses, you look around for awhile until you come to a door that said 'Personnel only'\n", 2000);
      // printAndSleep("The door was unlocked so you enter just because and find your self in a room with a bunch of astronaut suits, you put one on for no aparent reason and \nleave the room.\n", 4000);
      // printAndSleep("Upon leaving the room you see a group of other people in astronaut suits and decide to follow them, on the way you see a man being arrested for \nimpersonating an astronuat and think about how crazy he was to think no one would notice.\n", 8000);
      // printAndSleep("The astronauts all enter the rocket ship and strap in, with you doing your best to copy them.\n", 2000);
      // printAndSleep("There is a console in front of you, and you fiddle with it until enventually they are ready for lift off, they ask everyone individually if they are good to go until they get to you, are you ready?\n\n", 6000);


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
        case 4 : System.out.println("They all look at you for a moment, then they take off your helmet and realize that the person who was impersonating an astronaut earlier was autually their co-worker. \nThey escort you off the rocket and you go home with no reprocusions.");
    }
        } while (choice != 4);
            }
    public static int getMenuChoice(Scanner keyboard)
    {
        int choice;


        System.out.println("1. I was born ready!");
        System.out.println("2. Check astronaut information");
        System.out.println("3. Check fuel left in tank");
        System.out.println("4. Confess you have no idea why you're there.\n");
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
printAndSleep("\n\nThe rocket launches off of the station at 30 meters per second, within 90 seconds the rocket reaches the speed of 2700 meters per second.", 2000);
printAndSleep("At this point the engines turn off and within 275 seconds the rockets speed decreases by 2697.75, leaving the speed at 2.25 meters per second.", 2000);
printAndSleep("The rocket engines turn back on slowly, incresing the speed by 3.75 meters per second, within 5 seconds the rocket reaches 21 meters per second.", 2000);
printAndSleep("The engines turn back on fully and within 90 seconds the rocket is acelerating at 2721 meters per second.\n", 2000);
}
public static void database(Scanner keyboard){
    
}
public static void fuel(Scanner keyboard){
    
}




  
}
