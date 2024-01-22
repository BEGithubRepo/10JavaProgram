// ax^2 + bx + c = 0 şeklindeki ikinci dereceden bir denklemin kökünü bulma

import java.util.Scanner;
public class App {

    public static void main(String[] args) { 
        Scanner input = new Scanner (System.in);
        double a,b,c,x1,x2,delta;
        
        System.out.println("a: ");
        a= input.nextDouble();
        
        System.out.println("b: ");
        b= input.nextDouble();
        
        System.out.println("c: ");
        c= input.nextDouble();
        
        delta= b*b-4*a*c;
         if (delta < 0){
             System.out.println("Reel Kok Yoktur.");
         }
         else if (delta == 0){
             x1= -b/(2*a);
             System.out.println("x1=x2="+x1);
         }
         else {
             x1 = (-b + Math.sqrt(delta))/(2*a);
             x2 = (-b - Math.sqrt(delta))/(2*a);
             
             System.out.println("x1="+x1);
             System.out.println("x2="+x2);
         }
         
    }
    
}