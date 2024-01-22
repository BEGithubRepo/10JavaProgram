//Girilen sayının faktöriyel hesabı yapan program

import java.util.Scanner;


public class App {

       public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in);
        int n;
        System.out.print("n:");
        n = input.nextInt();
        
        int sonuc=1;
        for(int i=1 ; i <= n ; i++){
            sonuc= sonuc*i;
        }
        System.out.println(sonuc);
		
    }
}    