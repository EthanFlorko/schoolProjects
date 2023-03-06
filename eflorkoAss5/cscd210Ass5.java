import java.util.Scanner;

public class cscd210Ass5 {
//Program to get the product of even numbers between x and y
//Min of x and y
public static int min(int x, int y) {
if (x<y)
   return x;
else
   return y;
}
//Max of x and y
public static int max(int x, int y) {
if (x>y)
   return x;
else
   return y;
}

//Product of even numbers including x and y
public static int prodEven (int x,int y) {

//Assign the product variable
int min=min(x,y);
int max=max(x,y);
int product = 1;

for (int i=min;i<=max;i++) {      
         if (i%2==0) //If number is even
         product=product*i; //Multiply that number for every even number
         }
 return product;
 }

public static void main(String[] args) {
   
   Scanner inp = new Scanner (System.in);
   
   //Get user input
   System.out.print("Please give me the first integer: ");
   int num1 = inp.nextInt();
   
   System.out.print("Please give me the second integer: ");
   int num2 = inp.nextInt();
   
   //Product of divsors of 2 between num1 and num2
   int result = prodEven(num1,num2);
   System.out.println("The product of even numbers between "+num1+" and "+num2+" is "+result);
   
}
    }
    
    
    