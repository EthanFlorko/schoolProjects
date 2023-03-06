import java.util.Scanner;

public class csdc210Lab6 {

//, this program implements the "do" "while" statements in order to execute
   public static int newNum(int x) {
   Scanner inp = new Scanner(System.in);
   if (x < 0) {
        do {
         System.out.println("The number entered in is invalid, please enter a positive number: ");
         x = inp.nextInt(); 
         } 
         while (x<0);
         }
    return x; 
   }
   //Odd summation
   public static int oddSum(int x) {
 
   int i; int oddSum = 0;
   for (i=1; i<=x;i++)
   {  
      if (i % 2 != 0)
      oddSum += i;
   }
   return oddSum;
   }
  //Even numbers
  public static void evenNum(int x) {
  //change theNum to variable x
  int i;
  for (i=0; i<=x; i++)
   if (i % 2 == 0)
   {
      System.out.println(i);
   }
   }
   //Prime numbers
   public static void primeNum(int x) { 
   int i;
   for (int n = 2; n<=x; n++) {
   int flag =1;
   for (i = 2; i<n; i++) {
   //Will skip if number divisibile by 1
      if (n%i==0)
         flag = -1;
   }
      if (flag == 1)
         System.out.println(n);
   }
   }
//MAIN
public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);   
    int choice = 1, theNum, oddSum, i;

// use a while loop to ensure theNum is greater than 0
// Your code goes below to the the do

    System.out.print("Please enter a positive number: ");
    theNum = inp.nextInt(); 
    
    theNum = newNum(theNum);
      
do {

      
    do {
      
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
}
while (choice <=0 || choice >=6);

    
    
switch(choice) {

    case 1:
    //New number
    System.out.print("Please enter a positive number: ");
    theNum = inp.nextInt();
    theNum = newNum(theNum);
    break;
    
    case 2: 
    //Print the sum of odd numbers between 1 and the integer (n inclusive)
    oddSum(theNum);
    System.out.println("The sum of odd numbers up to "+theNum+" = ");
    System.out.println(oddSum(theNum));
    break;
    
    case 3: 
    //Print the even numbers between 0 and the integer (n inclusive)
    System.out.println("The even numbers between 0 and "+theNum+" are: ");
    evenNum(theNum);
    break;
   
    case 4:
    //Print the prime numbers between 2 and the integer (n inclusive)
    System.out.println("The prime numbers between 2 and "+theNum+" are: ");
    primeNum(theNum);
    break;


    default: System.out.println("Good Bye");         
         
   }// end switch
}

while(choice != 5);
}
}
