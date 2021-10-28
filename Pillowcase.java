
import java.util.*;

class Pillowcase{
  private ArrayList<Candy> candies;
  private int number;
  
  //Total candies that pillowcase could hold. 
  public double size = 1000;
  

  //Pillowcase arryList without any parameter.
  //Initialize the candies ArrayList and set the variable to 0.

  Pillowcase(){
    candies = new ArrayList<Candy>();
    number = 0;  
  }

  //Access method for the number variable.
  public int getCandyCount(){
    return number;
  }


  
  //Create one new Candy object.
  void getCandy(){

    //System.out.println("Trick or Treat!");

    Candy theCandy = new Candy();

    // Generate a new Random number. 
    Random r = new Random();

    //Assigned a range to each candy.

    double randomNum = r.nextInt(100) + 1;

    //Assigned M&M probability of 10%. 
    if(randomNum <= 10){
      theCandy.setname("M&Ms");
    }
    
    //Assigned Pink Startburst probability of 20%. 
    else if(randomNum > 10 && randomNum <= 30){
      theCandy.setname("Pink Starburst");
    }

    //Assigned Hershey's Bat probability of 15 %. 
    else if(randomNum > 30 && randomNum <= 45){
      theCandy.setname("Hershey's Bar");
    }
    //Assigned Milky Way probability of 10%. 
    else if(randomNum > 45 && randomNum <= 55){
      theCandy.setname("Milky Way");
    }
    //Assigned Twix probability of 15%. 
    else if(randomNum > 55 && randomNum <= 70){
      theCandy.setname("Twix");
    }
    //Assigned Reese's probability of 25%. 
    else if(randomNum > 70 && randomNum <= 95){
      theCandy.setname("Reese's");
    }
    //Assigned Kit Kat probability of 5%
    else if(randomNum > 95){
      theCandy.setname("Kit Kat");
    }
  
    System.out.println("Trick or Treat! We got " + theCandy.getname());

    candies.add(theCandy);
    number++;
  }

  public void printNumCandies(){
    int numCandies[] = new int [7];

    numCandies[0] = 0;
    numCandies[1] = 0;
    numCandies[2] = 0;
    numCandies[3] = 0;
    numCandies[4] = 0;
    numCandies[5] = 0;
    numCandies[6] = 0;

    for(int i = 0; i < candies.size(); i++){

      if(candies.get(i).getname().equals("M&Ms")){
        numCandies[0] ++;
      }

      else if(candies.get(i).getname().equals("Pink Starburst")){
        numCandies[1] ++;
      }

      else if(candies.get(i).getname().equals("Hershey's Bar")){
        numCandies[2] ++;
      }

      else if(candies.get(i).getname().equals("Milky Way")){
        numCandies[3] ++;
      }

      else if(candies.get(i).getname().equals("Twix")){
        numCandies[4] ++;
      }

      else if(candies.get(i).getname().equals("Reese's")){
        numCandies[5] ++;
      }

      else if(candies.get(i).getname().equals("Kit Kat")){
        numCandies[6] ++;
      }
    }

   
    System.out.println("We got...");
    if(numCandies[0] > 0){
     System.out.println(numCandies[0] + " M&Ms");
    }

    if (numCandies[1] > 0){
     System.out.println(numCandies[1] + " Pink Starburst");
    }

   if (numCandies[2] > 0){
     System.out.println(numCandies[2] + " Hershey's Bar");
    }

   if (numCandies[3] > 0){
     System.out.println(numCandies[3] + " Milky Way");
    }

   if (numCandies[4] > 0){
     System.out.println(numCandies[4] + " Twix");
    }

   if (numCandies[5] > 0){
     System.out.println(numCandies[5] + " Reese's");
    }

   if (numCandies[6] > 0){
     System.out.println(numCandies[6] + " Kit Kat");
    }
  }
  
}