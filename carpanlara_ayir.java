// Girilen sayının çarpanlarını bulan program

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        System.out.print(sayi + " sayısının çarpanları: ");

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
