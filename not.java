// Girilen nota göre harf notu çıktısı veren program

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String harfNotu, sonuc;
        double not;

        System.out.println("Sınav notunu (0-100) giriniz: ");
        not = input.nextDouble();

        if (not >= 85 && not <= 100) {
            harfNotu = "AA";
        } else if (not >= 60 && not < 85) {
            harfNotu = "BB";
        } else if (not >= 50 && not < 60) {
            harfNotu = "CC";
        } else if (not >= 40 && not < 50) {
            harfNotu = "DD";
        } else if (not >= 0 && not < 40) {
            harfNotu = "FF";
        } else {
            harfNotu = "Geçersiz";
        }

        sonuc = not >= 50 ? "Başarılı" : "Başarısız";

        System.out.println("Harf Notu: " + harfNotu);
        System.out.println("Sonuç: " + sonuc);
    }
}