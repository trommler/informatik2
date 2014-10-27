//This program helps SportsWorld estimate costs
//for pool covers and pool fencing by computing
//the area or circumference of a circle
//with a given radius.
//Any number of circles can be processed.
//Uses class Math for PI
//Written by M. Phelps, 10/05/13
import java.util.*; 

public class SportsWorld { 
  public static void main(String[] args) {
  double radius = 0.0; //radius of a pool - 
//given 
  double circumference = 0.0; //pool circumference - 
//computed 
  double area = 0.0; //pool area - computed 
  String response = " "; //user’s response 
  char taskToDo = 'C'; //holds user choice to 
                       //compute circumference
                      //or area 
  char more = 'Y'; //controls loop for
  //processing //more pools 
  Scanner inp = new Scanner(System.in);
  System.out.print("Do you want to process " 
                     + "a pool? (Y or N): ");
  response = inp.next(); 
  more = response.charAt(0);
  // Exercise 14 b
  // replace while(more == 'Y')
  while(more == 'Y' || more == 'y') //more circles to process 
  { System.out.println(); 
    System.out.print("Enter the value of the " + "radius of the pool: ");
    radius = inp.nextDouble();
    //See what user wants to compute
    System.out.println("Enter your choice of task."); 
    System.out.print("C to compute circumference, "
                       + "A to compute area: ");
    response = inp.next();
    taskToDo = response.charAt(0);
    System.out.println();
    // Exercise 14 a
    // replace if (taskToDo == 'C')
    if (taskToDo == 'C' || taskToDo == 'c') //compute circumference 
    { circumference = 2*Math.PI*radius;
      System.out.println("The circumference for a "
                           + "pool of radius " + radius
                           + " is " + circumference); 
    } else //compute area 
    { area = Math.PI * radius * radius;
      System.out.println("The area for a pool" 
                           + " of radius " 
                           + radius + " is " + area); 
    } 
    System.out.println();
    System.out.print("Do you want to process " 
                       + "more pools? (Y or N): "); 
    response = inp.next(); 
    more = response.charAt(0);
  } //end of while loop 
//finish up 
  System.out.println("Program will now terminate."); 
} //end of main method 
} //end of class SportsWorld