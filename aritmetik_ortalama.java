// Aritmetik ortalama hesaplama

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Toplam eleman sayısını girin: ");
        int n = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı girin: ");
            toplam += scanner.nextInt();
        }

        double ortalama = (double) toplam / n;
        System.out.println("Aritmetik ortalama: " + ortalama);
    }
}
