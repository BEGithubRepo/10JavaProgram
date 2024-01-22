// Girilen kelime palidrom kontrolü yapan program

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        String tersKelime = new StringBuilder(kelime).reverse().toString();

        if (kelime.equals(tersKelime)) {
            System.out.println("Girilen kelime bir palindromdur.");
        } else {
            System.out.println("Girilen kelime bir palindrom değildir.");
        }
    }
}
