import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String password = "F8*3&G84h%0";
        System.out.println("Password: " + password);
        System.out.println("Enter Password");
        String passquery ;
        passquery = keyboard.nextLine();
        if (passquery = password){

        }

int choice;
do
{
    // Get the user's menu choice.
    choice = getMenuChoice(keyboard);

    // Do what the user requested.
    switch(choice)
    {
        case 1 : circle(keyboard);
            break;
        case 2 : database(keyboard);
            break;
        case 3 : triangle(keyboard);
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

public static void circle(Scanner keyboard){

}
public static void database(Scanner keyboard){
    
}
public static void triangle(Scanner keyboard){
    
}



    
}
