public class cscd210Ass6 {

//Method to return all negative integers in the origional array 
public static void negInt (int [] TNEG) {

for (int n = 0;n<TNEG.length; n++){
   if (TNEG[n]%2!=0)
      System.out.print(TNEG[n]+",");
      }
    
}
    
//Method to retunrn all positive integers in the origional array  
public static void posInt (int [] TPOS) {

for (int n=0; n<TPOS.length; n++) {
    if (TPOS[n]%2==0)
        System.out.print(+TPOS[n]+",");
      
      } 

}
    
    
public static void main(String[] args) {
//Declare variables
int n;
//Declare main array that will be transformed with maximum dimension of 50
int mainArray [] = new int [50]; //Holds 50 
    for (n=0;n<mainArray.length;n++)
        mainArray[n]=(int)(Math.random()*50); //List random integers up to 50.
//Positive returned copy array
int TPOS [] = new int [mainArray.length];

   for (n=0; n<mainArray.length; n++)
      TPOS[n]=mainArray[n];
   
//Neagtive returned copy array
int TNEG [] = new int [mainArray.length];

   for (n=0; n<mainArray.length; n++) 
      TNEG[n]=mainArray[n];
      
System.out.print("Stricly positive values: ");
posInt(TPOS);
System.out.println();
System.out.print("Strictly neagtive values: ");
negInt(TNEG);

  
   }
 }
