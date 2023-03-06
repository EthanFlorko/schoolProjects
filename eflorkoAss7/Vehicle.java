import java.util.Scanner;
//Declare class and define variable 
public class Vehicle {
   private String matriculationNB;
   private String mark;
   private String owner;
   private int manufacturingYear;

//Use this. to declare local variables 
Vehicle(String MNB, String m, String o, int MY) {
   this.matriculationNB = MNB;
   this.mark = m;
   this.owner = o;
   this.manufacturingYear = MY;
}

//getters
public String getMatriculationNB()
{
return this.matriculationNB;
}

public String getMark()
{
return this.mark;
}

public String getOwner()
{
return this.owner;
}

public int getManufacturingYear()
{
return this.manufacturingYear;
}

//setters
public void setMatriculationNB(String MNB)
{
this.matriculationNB=MNB;
}

public void setMark(String m)
{
this.mark=m;
}

public void setOwner(String o)
{
this.owner=o;
}

public void setManufacturingYear(int MY)
{
this.manufacturingYear=MY;
}

//Create toString to combine variables 
public String toString() {
   return "\nMatriculation number: " + matriculationNB + "\nCar Mark: " + mark + "\nCurrent Owner: " + owner + 
"\nManufacturing Year: " + manufacturingYear;
   }
}
   
