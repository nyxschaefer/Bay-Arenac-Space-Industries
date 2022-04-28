import java.util.Scanner;

public class Verification
{
        public static void main(String[] args)
        {
           //Keyboard scanner for input.
           Scanner keyboard = new Scanner (System.in);
           //String variable for choice selection.
           String Verify;
           
           
           //The output asking the user for their choice.
           System.out.println("Please use y or n to confirm your decision.");
           
           //The input equals the string variable.
           Verify = keyboard.next();
          
           //The input received outputs what the user selected.
           if (Verify.equals ("y")){
                   System.out.println("Decision confirmed.");
                    
           }
           if (Verify.equals ("n")){
                System.out.println("Decision denied.");
        }

        //somting wong:(
        
          
           
           keyboard.close();
            

        }
}
