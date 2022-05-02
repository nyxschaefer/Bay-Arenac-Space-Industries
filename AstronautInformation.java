import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
 public class AstronautInformation {
    public static void astro(String userName){
        Scanner scan = new Scanner(System.in); 
        int x = 0;
                    
        while(x != 4){
          System.out.printf("1.Add Astronauts to the HSI.\n2.Remove the astronauts who have left us.\n3.Return To Main Menu\n");
                int counter = scan.nextInt(); 
               
            if(counter == 1){
              add(userName);
            }
            else if(counter == 2){
              remove(userName);
            }
            else if(counter == 3){
             
            }
            else{
              System.out.println("Thank you for using our program.");
            }
          }
  }
    
    public static void add(String userName){
       Scanner scan = new Scanner(System.in);
       AstroBuilder astro = new AstroBuilder();
       System.out.println("Add an astronaut to the HSI?");
       String aws = scan.nextLine();
       if(aws.equalsIgnoreCase("Yes")){
          System.out.println("What is the name of the Astronaut joining us at the HSI?");
            String name = scan.nextLine();
       astro.setName(name);
          System.out.println("What is the age of " + astro.getName());
            int age = scan.nextInt();
       astro.setAge(age);
        System.out.printf("\nWhere does this astronaut live?");
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
              File f = new File(userName + "astroInfo.csv");
              
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
            astro(userName);
      }
        else{
          System.out.println("Please make up your mind,");
        }
      
        }
        public static void remove(String userName){
          Scanner scr = new Scanner(System.in);
          Scanner fileScan = new Scanner(userName + "astroInfo.csv");
          System.out.println("Remove an astronaut from the HSI?");
          String aws = scr.nextLine();
          if(aws.equalsIgnoreCase("Yes")){ 
          System.out.println("Please enter the name of the Astronaut you wish to remove.");
                String name = scr.nextLine();
                scr.close();
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

      }
    }