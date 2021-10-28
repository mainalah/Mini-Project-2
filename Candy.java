
import java.util.*;
 

class Candy{
 
  String name;

  //Constructor without any parameters 
  Candy(){
  name="";
  }

  //Constructor with one parameter
  Candy(String aName){
  name = aName;
  }

  //A mutator method for the name variable for the candy
  void setname(String aName){
  name = aName;
  }

  //An accessor method for the name variable for the candy.

  String getname(){
  return name;
  }
   
  //This code should print out the name of the candy. 
  
  void print(){
  System.out.println(getname());
  }
  
}