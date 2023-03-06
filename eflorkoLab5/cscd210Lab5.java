
import java.util.Scanner;

public class cscd210Lab5 {

    /**
     * @param args the command line arguments
     */
     
//THIS PROGRAM TAKES USER $ CHOICE AND DISPLAYS A MENU, WITH THE USE OF SWITCH STATEMENT
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner inp = new Scanner(System.in);   
      int choice = 1, theNum;
      
      
      //you can add more variables
       
         
      // use a while loop to ensure theNum is greater than 0
      // Your code goes below to the the do
      do
      { 
      System.out.print("Please enter a positive number: ");
      theNum = inp.nextInt(); } 
      
      while (theNum < 0);
      
            
      do
      {
      
         // use a do while loop to ensure choice is in the range of 1 - 5 inclusive
         // Your code goes below to the the switch
         System.out.println();
         System.out.println("Please choose from the following");
         System.out.println("1) Enter a new number");
         System.out.println("2) Print the sum of odd numbers between 1 and the integer (theNum inclusive)");                           
         System.out.println("3) Print the even numbers between 0 and the integer (theNum inclusive)");
         System.out.println("4) Print the prime numbers from 2 up to and possibly including theNum");
         System.out.println("5) Quit");
         System.out.print("Choice --> ");
         // read in choice here
         choice=inp.nextInt();
                         
                                             
         switch(choice)
         {
            case 1:  // read a new positive theNum
                     // Your code goes below to the break
                     System.out.println("Please enter in another positive number: ");
                     theNum = inp.nextInt();
                     while (theNum < 0) {
                     do {
                     System.out.println("The number entered in is invalid, please enter a positive number: ");
                     theNum = inp.nextInt(); }
                     while (theNum>0);
                     }
                     if (theNum>0)
                     System.out.println("The new number is: "+theNum);
                     
                     
                     break;
                    
            case 2:   // using a loop to estimate the sum of odd values 
                     // Your code goes below to the break
                     int oddSum = 0;
                     
                     for (int i=1; i<=theNum;i++)
                     {  if (i % 2 == 1)
                        { oddSum += i;
                        }
                     }
                     System.out.println("The sum of odd numbers up to "+theNum+" = "+oddSum);
                     break;  
            
            case 3:  //  using a loop to display the even values 
                     // Your code goes below to the break
                     for (int i=0; i<=theNum; i++)
                     {
                        if (i % 2 == 0)
                        {
                        
                        System.out.print(i+" ");
                        }
                     }
                     break;
            
            case 4:  // using nested for loops print the prime numbers 
                     // from 2 up to and possibly including theNum
                     // Your code goes below to the break
                     for (int n = 2; n <=theNum; n++) {
                     int flag =1;
                     for (int i = 2; i<n; i++) {
                     //Will skip if number divisibile by 1
                     if (n%i==0)
                     flag = -1;
                     
                     }
                     if (flag ==1)
                     System.out.println(n);
                     }
                     break;
                     
            default: System.out.println("Good Bye");         
         
         }// end switch
            
      }
      while(choice != 5);
    
      
          
         
         
  

}
}

