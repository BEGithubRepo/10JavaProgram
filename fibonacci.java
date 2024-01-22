//Girdiğiniz sayı kadar fibonacci serisini yazan program

import java.io.IOException;
import java.util.Scanner;

public class App {

    @SuppressWarnings("empty-statement")
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner( System.in);
        System.out.println("Bir sayi giriniz(seride bulunmasini istediginiz terimden 1 fazla giriniz) :");
        int input = scan.nextInt();
        
        int s1 = 0;
        int s2 = 1;
        int toplam;
           
        System.out.println(input + "Sayisinin Fibonacci serisi :");
        
        for( int i= 1; i <= input ; i++){
            System.out.print( s1 + " , ");
            
            toplam = s1 + s2 ;
            s1 = s2 ;
            s2 = toplam;
               
        }
        
    }
    
}