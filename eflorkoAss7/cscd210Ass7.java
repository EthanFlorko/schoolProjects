import java.util.Scanner;

//Program takes 2 different sets oh vehicles and displays from Vehicle class
public class cscd210Ass7 {
   public static void main (String[] args) {
   int cars = 2;
   String matriculationNB;
   String mark;
   String owner;
   int manufacturingYear;
   //Create an array to hold two different vehicles

   //Import scanner
   Scanner inp = new Scanner (System.in);
   //Loop to interate through inputs, declare user input here
   for (int i=0; i<veh.length;i++) 
   {
   System.out.println("Enter matriculation number: ");
   matriculationNB = inp.next();
   
   System.out.println("Enter vehicle mark: ");
   mark = inp.next();
   
   System.out.println("Enter owner: ");
   owner = inp.next();
   
   System.out.println("Enter the manufacturing year: ");
   manufacturingYear = inp.nextInt();
   //Print out the strings of array veh
   veh[i] = new Vehicle (matriculationNB, mark, owner, manufacturingYear);
   }
   for (int i=0; i<veh.length; i++) {
   System.out.println(veh[i].toString());
   }
   for (int i = 0; i<veh.length; i++) {
      //Change vehicle owner here
      veh[i].setOwner("Ethan");
      System.out.println(veh[i].toString());
      }
}
}

   