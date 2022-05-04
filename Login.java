import java.util.Scanner;
public class Login
{
        public static void main(String password) throws InterruptedException{
try (//KEYBOARD
        Scanner keyboard = new Scanner(System.in)) {
                //SET PASSWORD
        
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
                menu.main();
       }
       //ELSE STATEMENT
       else{

                   ////INCORRECT PASSWORD MESSAGE
                   System.out.println("Incorrect password, please try again.");
       }
    }
       //WHILE LOOP
       while(!passquery.equals(password));
        }
        }
}