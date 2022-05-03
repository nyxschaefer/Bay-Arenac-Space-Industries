public class AstroBuilder
{
    private String name;       // A person's name
    private int age;           // A person's age
    private String address;    // A person's address
    private String phone;      // A person's phone number
   // private String dateBirth; // A person's date of birth
   // private int payRate;     // How much the glorious astronauts of BASI are paid
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
/*
    public void setBirth(String b){
       dateBirth = b;
    } */
    /**
      @param p The astornauts payRate
     */
/*
    public void setPay(int p){
        payRate = p;
    }*/
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
   /* public String getBirth(){
        return dateBirth;
    } 
    public double getPay(){
        return payRate;
    }*/
    public int getWeight(){
        return weight;
    }
    public String nextKin(){
        return nextOfKin;
    }
}
