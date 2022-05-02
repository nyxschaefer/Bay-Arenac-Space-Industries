import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;

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
        case 2 : astro(keyboard);
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
public static void fuel(Scanner keyboard){
}

    public static void astro(Scanner keyboard){
        try (Scanner scan = new Scanner(System.in)) {
          int x = 0;
                      
          while(x != 4){
            System.out.printf("1.Add Astronauts to BASI.\n2.Remove the astronauts who have left us.\n3.Return To Main Menu\n");
                  int counter3 = scan.nextInt(); 
                 
              if(counter3 == 1){
                add(keyboard);
              }
              else if(counter3 == 2){
                remove(keyboard);
              }
              else if(counter3 == 3){
               
              }
              else{
                System.out.println("Thank you for using our program.");
              }
            }
        }
  }
    
    public static void add(Scanner keyboard){
       Scanner scan = new Scanner(System.in);
       AstroBuilder astro = new AstroBuilder();
       System.out.println("Add an astronaut to BASI?");
       String aws = scan.nextLine();
       if(aws.equalsIgnoreCase("Yes")){
          System.out.println("What is the name of the Astronaut joining us at BASI?");
            String name = scan.nextLine();
       astro.setName(name);
          System.out.println("What is the age of " + astro.getName());
            int age = scan.nextInt();
       astro.setAge(age);
        System.out.printf("Where does this astronaut live?\n");
           String address = scan.nextLine();
            address = scan.nextLine();
          astro.setAddress(address);
        System.out.println("Alright, and what is " + astro.getName() + "'s phone number");
             String number = scan.nextLine();
             astro.setPhone(number);
            System.out.println("And how much does this astronaut weigh?");
           int weight = scan.nextInt();  
           astro.setWeight(weight);
                if(weight >= 420){
                  System.out.println("Having an overweight astronaut is dangerous, and more importantly bad for our reputation, tell " + astro.getName() + " to go on a diet");
                       }     
        System.out.println("This astronaut, does he have any next of kin? P.S seperate with commas.");
            String kin = scan.nextLine();
            kin = scan.nextLine();
            astro.setKin(kin);
            scan.close();
            try{
              File f = new File(keyboard + "astroInfo.csv");
              
                FileWriter pw = new FileWriter(f, true);
                pw.append(astro.getName() + ", ");
                pw.append(astro.getAge() + ", ");
                pw.append(astro.getAddress() + ", ");
                pw.append(astro.getPhone() + ", ");
                pw.append(astro.getBirth() + ", ");
                pw.append(astro.getPay() + ", ");
                pw.append(astro.getWeight() + ", ");
                pw.append(astro.nextKin() + ", ");
                pw.append("\n");
                pw.close();
            System.out.println("Congrats, Astronaut Successfully Created.");
            scan.close();
            }
            catch(Exception e){
              System.out.println(e.getMessage());
            }
            astro(keyboard);
      }
        else{
          System.out.println("Please make up your mind,");
        }
      
        }
        public static void remove(Scanner keyboard){
          Scanner scr = new Scanner(System.in);
          Scanner fileScan = new Scanner(keyboard + "astroInfo.csv");
          System.out.println("Remove an astronaut from BASI?");
          String aws = scr.nextLine();
          if(aws.equalsIgnoreCase("Yes")){ 
          System.out.println("Please enter the name of the Astronaut you wish to remove.");
                String name = scr.nextLine();
               // scr.close();
                while (fileScan.hasNextLine()) {
                  String line = fileScan.nextLine();
                  boolean bool;
                  bool = line.contains(name);
                  if(bool == true){
                    System.out.println("Success");
                  }
                  else{
                    System.out.println("Failure");
                  }
                  fileScan.close();
          }
        }
          else{
            System.out.println("Please make up your mind.");
          }    
          }
    public static void edit(){
        class AstroBuilder
        {
            private String name;       // A person's name
            private int age;           // A person's age
            private String address;    // A person's address
            private String phone;      // A person's phone number
            private String dateBirth; // A person's date of birth
            private int payRate;     // How much the glorious astronauts of BASI are paid
            private int weight;       // Weight of the breathtaking astronauts of BASI
            private String nextOfKin; // Lucky family of the astronauts of BASI.
        
            /**
             The setName method sets  the person's name.
             @param n The person's name.
             */
        public void setName(String n){
                  name = n;    
                
            }    
            /**
             The setAge method sets the person's age.
             @param a The person's age.
             */
        
             public void setAge(int a){
                  age = a;
             }
        
            /** 
             The setAddress method sets the person's address.
             @param a The person's address.
             */
        
             public void setAddress(String a){ 
                address = a;
                }
            /**
             The setPhone method sets the person's phone number.
             @param p The person's phone number.
             */
        
             public void setPhone(String p){
                 phone = p;
             }
        /** 
             @param b The astronauts date of birth
             */
        
            public void setBirth(String b){
               dateBirth = b;
            }
            /**
              @param p The astornauts payRate
             */
        
            public void setPay(int p){
                payRate = p;
            }
            /**@param w The astornauts weight
            */
        
           public void setWeight(int w){
               weight = w;
           }
          /**
           @param k The astornauts Next of Kin
           */
        
          public void setKin(String k){
              nextOfKin = k;
          }
            /**
             The getName method returns the person's name.
             @return The person's name.
             */
        
             public String getName(){
                 return name;
             }
        
            /**
             The getAge method returns the person's age.
             @return The person's age.
             */
        
             public int getAge(){
                 return age;
             }
        
            /**
             The getAdress method returns the person's address.
             @return The person's address.
             */
             public String getAddress(){
                 return address;
             }
        
            /**
             The getPhone method returns the person's phone number.
             @return The person's phone number.
             */
             public String getPhone(){
                 return phone;
                }
            public String getBirth(){
                return dateBirth;
            } 
            public double getPay(){
                return payRate;
            }
            public int getWeight(){
                return weight;
            }
            public String nextKin(){
                return nextOfKin;
            }
        }
        
      }
    }





  

