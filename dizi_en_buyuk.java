// Girilen dizi içerisindeki en büyük sayıyı bul

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz? ");
        int n = scanner.nextInt();

        int[] sayilar = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            sayilar[i] = scanner.nextInt();
        }

        int enBuyuk = sayilar[0];

        for (int sayi : sayilar) {
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
        }

        System.out.println("Girilen sayıların en büyüğü: " + enBuyuk);
    }
}
