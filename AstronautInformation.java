import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
public class AstronautInformation {
    public static void astro(String userName) throws InterruptedException, IOException{
        try (Scanner scan = new Scanner(System.in)) {
          int x = 0;
               //How the menu options can be selected.       
          while(x != 5){
            System.out.printf("1.View Astronauts\n2.Add Astronauts to BASI.\n3.Remove the astronauts who have left us.\n4.Return To Main Menu\n");
                  int counter = scan.nextInt(); 
                 
              if(counter == 1){
                CsvReader.main(null);
              }
              else if(counter == 2){
                add(userName);
              }
              else if(counter == 3){
                remove(userName);
              }
              else if(counter == 4){
                menu.main();
              }
              else{
                System.out.println("Thank you for using our program.");
              }
            }
        }
  }
    //How new astronauts are created
    public static void add(String userName) throws InterruptedException, IOException{
       try (Scanner scan = new Scanner(System.in)) {
        AstroBuilder astro = new AstroBuilder();
         System.out.println("Add an astronaut to BASI?");
         String aws = scan.nextLine();
         if(aws.equalsIgnoreCase("Yes")){
          System.out.println("What is the ID Number of the Astronaut?");
          int id = scan.nextInt();
          astro.setID(id);
            System.out.println("What is the name of the Astronaut joining us at BASI?");
              String name = scan.nextLine();
         astro.setName(name);
            System.out.println("What is the Age of " + astro.getName());
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
              try{
                File f = new File(userName + "astroInfo.csv");
                
                  try (FileWriter pw = new FileWriter(f, true)) {
                    pw.append(astro.getID() + ", ");
                    pw.append(astro.getName() + ", ");
                    pw.append(astro.getAge() + ", ");
                    pw.append(astro.getAddress() + ", ");
                    pw.append(astro.getPhone() + ", ");
                    /*pw.append(astro.getBirth() + ", ");
                    pw.append(astro.getPay() + ", ");*/
                    pw.append(astro.getWeight() + ", ");
                    pw.append(astro.nextKin() + ", ");
                    pw.append("\n");
                  }
                  System.out.println("Congrats, Astronaut Successfully Created.");
              
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
      
        }
        //The removal of astronauts.
        public static void remove(String userName) throws InterruptedException, IOException{
          try (Scanner scr = new Scanner(System.in)) {
            try (Scanner fileScan = new Scanner(userName + "astroInfo.csv")) {
              System.out.println("Remove an astronaut from BASI?");
              String aws = scr.nextLine();
              if(aws.equalsIgnoreCase("Yes")){ 
              System.out.println("Please enter the ID of the Astronaut you wish to remove.");
                    String rowNumber = scr.nextLine();
                    while (fileScan.hasNextLine()) {
                      String line = fileScan.nextLine();
                      boolean bool;
                      bool = line.contains(rowNumber);
                      if(bool == true){
                        System.out.println("Success");
                        CSVReader reader2 = new CSVReader(new FileReader("astroInfo.csv"));
                        List<String[]> allElements = reader2.readAll();
                        allElements.remove(rowNumber);
                        FileWriter sw = new FileWriter("astroInfo.csv");
                        CSVWriter writer = new CSVWriter(sw);
                        writer.writeAll(allElements);
                        writer.close();
                        AstronautInformation.astro(userName);
                      }
                      else{
                        System.out.println("Failure");
                        AstronautInformation.astro(userName);
                      }
                      
              }
  }
              else{
                System.out.println("Please make up your mind.");
                AstronautInformation.astro(userName);

              }
            }
          }    
          }
          
      
    }
  