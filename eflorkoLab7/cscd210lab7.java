import java.util.Scanner;

public class cscd210lab7 {

//Create function that takes n of students 
public static void readGrades (int n, double[] classGrades) {
Scanner inp = new Scanner(System.in);
int i;
for (i=0;i<classGrades.length; i++) {
do {
System.out.println("Please enter a grade: ");
classGrades[i] = inp.nextDouble();
} 
while (classGrades[i]<-1 || classGrades[i]>20);
    
   }
}
// Returns count of students who attend exam
public static int countAttended (int n, double [] classGrades) {
int count=0;
      for (int i=0;i<classGrades.length; i++) {
         if(classGrades[i]>=0)
            count++;
         } 
return count;   
}

//Returns count of students who passed the exam x>=10
public static int countPassed (int n, double [] classGrades) {
int passed = 0;
for (int i=0;i<classGrades.length;i++) {
   if (classGrades[i]>=10)
      passed++;
}
return passed;
}

//Returns average grade of the class ONLY if they attended
public static int calculateAverage (int n, double[] classGrades) {
int students =0;
int notAttend = 0;
int graded = 0;

for (int i=0;i<classGrades.length;i++) {
   if (classGrades [i] >-1) {
      graded +=classGrades [i];
      students++;
      }
}
if (students>0) {
   int average = (graded/students);
   return average;
   }
   else
      return notAttend; 
}
//Main    
public static void main(String[] args) {
Scanner inp = new Scanner(System.in);
int n = -1;
do {
System.out.println("Please enter the number of students in the class: ");
n = inp.nextInt();
break;
}
while (n<0 || n<100);

double [] classGrades = new double [n];

readGrades(n,classGrades);
System.out.println(countAttended(n,classGrades)+" Students attended the exam.");
System.out.println(countPassed(n,classGrades)+" Students passed the exam.");
System.out.println(calculateAverage(n,classGrades)+" Was the average grade in the class.");
   }
}




