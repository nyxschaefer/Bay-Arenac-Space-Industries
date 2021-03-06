import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException{
    //LOGIN
   
   //Getting a randomized password.
    PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
        .useDigits(true)
        .useLower(true)
        .useUpper(true)
        .build();
String password = passwordGenerator.generate(10);
    Login.main(password);
    }
       

//Timer for the text display.
static void printAndSleep(String string, int sleepTimeMs) throws InterruptedException {
    System.out.println(string);
    Thread.sleep(sleepTimeMs);
  }
//The launching of the rocket.
public static void launch(Scanner keyboard) throws InterruptedException, IOException{
    printAndSleep("The rocket slowly prepares to take off in....",2000);
    printAndSleep("3",2000);
    printAndSleep("2",2000);
    printAndSleep("1",2000);
    printAndSleep("\nThe rocket launches off of the station releasing 1 pound of fuel per second, within 60 seconds the rocket reaches the speed of 1800 meters per second.", 3000);
    printAndSleep("By 65 seconds the rocket has reached a speed of 1950 meters per second, and traveled 64,359 meters.",3000);
    printAndSleep("The rocket leaves the atmosphere by 68 seconds having traveled 70,380 meters.\n\n",3000);
    Menu2.main();
}
//The amount of fuel in the rocket.
public static void fuel(Scanner keyboard) throws InterruptedException, IOException{
printAndSleep("You have 68 pounds of fuel on board",2000);
menu.main();
}
}

