//@Anisha Mainali
//@10/27/2021


//import all functions 
import java.util.*;

class Main {
  public static void main(String[] args) {
    
    //create pillowcase object
    Pillowcase pi = new Pillowcase();
    
    //Ask for user input
    System.out.println("Happy Halloween!\nHow many houses should we trick or treat at?");
    
    Scanner s = new Scanner(System.in);
    int houses = s.nextInt();

    for(int i = 0; i < houses; i++){
      pi.getCandy();
    }

    //Print out total candies with the total percentage of the overall candies 
    System.out.println("We have " + pi.getCandyCount() + " candies, " + pi.getCandyCount()* 100 / pi.size + "% of our pillowcase.");

    pi.printNumCandies();
  }
}