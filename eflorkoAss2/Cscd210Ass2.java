*/
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
import java.util.Scanner;
package com.mycompany.cscd210ass2;

/**
 *
 * @author ethan
 */
public class Cscd210Ass2 {

    public static void main(String[] args) {
    Scanner inp = new Scanner (System.in);
    System.out.println("The number of weekly hours: ");
    int hour = inp.nextInt("The rate of an hour: ");
    float rate = inp.nextFloat();
    int aK=(hour);
    int bK=(hour-39);
    if (bK > 5)
        bK = 5;
    int cK = (hour-44);
    if (cK>5)
        cK = 5;
    int dK = (hour-49);
    if (dK>6)
        dK = 6;
    if (aK>40)
        aK = 39;
    if (0>bK)
        bK = 0;
    if (0>cK)
        cK=0;
    if (0>dK)
        dK=0;
    
    if (hour <= 39){
        double sal = (aK*1*rate);
        System.out.printf("Salary= %d*1*.0f + 0*1.2*%.0f + 0*1.5*%.0f + 0*1.8* %.0f = %.2f$",aK,rate,rate,rate,rate);
    else if (39<hour&&hour<=44)
            double sal2=(aK*1*rate)+(bK*1.2*rate);
            System.out.printf("Salary= %d*1*%.0f + %d*1.2*%.0f + 0*1.5*%.0f + 0*1.8*0f = %.2f$",aK,rate,bK,rate,rate);
    else if (44<hour&&<=49) }
    
        
        
        
        
        
    }
}
