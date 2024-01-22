// Girilen sayının asal olup olmadığını bulan program

import java.util.Scanner;

public class App {
    static boolean asalMi(int sayi) {
        if (sayi <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        System.out.println(sayi + " sayısı asal mı: " + asalMi(sayi));
    }
}
