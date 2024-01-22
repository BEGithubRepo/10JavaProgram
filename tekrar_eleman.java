// Girilen dizi içerisinde en çok tekrar eden elemanı bulan program.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet eleman gireceksiniz? ");
        int n = scanner.nextInt();

        int[] dizi = new int[n];

        System.out.println("Diziyi girin:");
        for (int i = 0; i < n; i++) {
            dizi[i] = scanner.nextInt();
        }

        Map<Integer, Integer> elemanSayilari = new HashMap<>();

        for (int eleman : dizi) {
            if (elemanSayilari.containsKey(eleman)) {
                elemanSayilari.put(eleman, elemanSayilari.get(eleman) + 1);
            } else {
                elemanSayilari.put(eleman, 1);
            }
        }

        int enCokTekrarEdenEleman = -1;
        int enCokTekrarSayisi = 0;

        for (Map.Entry<Integer, Integer> entry : elemanSayilari.entrySet()) {
            int tekrarSayisi = entry.getValue();
            if (tekrarSayisi > enCokTekrarSayisi) {
                enCokTekrarSayisi = tekrarSayisi;
                enCokTekrarEdenEleman = entry.getKey();
            }
        }

        if (enCokTekrarSayisi > 1) {
            System.out.println("En çok tekrar eden eleman: " + enCokTekrarEdenEleman +
                    ", Tekrar Sayısı: " + enCokTekrarSayisi);
        } else {
            System.out.println("Dizide tekrar eden bir eleman bulunmamaktadır.");
        }
    }
}
