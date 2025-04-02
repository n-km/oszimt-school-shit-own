import java.util.Random;
import java.util.Scanner;

public class UmrechnungsLernprogramm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Willkommen beim Umrechnungs-Lernprogramm!");
        boolean weiter = true;

        while (weiter) {
            int typ = rand.nextInt(4);  // zufällige Wahl der Aufgabenart

            switch (typ) {
                case 0 -> hexNachBinaer(scanner, rand);
                case 1 -> binaerNachHex(scanner, rand);
                case 2 -> dezimalNachHex(scanner, rand);
                case 3 -> hexNachDezimal(scanner, rand);
            }

            System.out.print("Noch eine Aufgabe? (j/n): ");
            weiter = scanner.next().trim().equalsIgnoreCase("j");
            System.out.println();
        }

        System.out.println("Vielen Dank fürs Üben! Bis zum nächsten Mal!");
        scanner.close();
    }

    private static void hexNachBinaer(Scanner scanner, Random rand) {
        String hex = Integer.toHexString(rand.nextInt(256)).toUpperCase(); // Maximal FF
        System.out.printf("Rechne HEX %s in BINÄR um: ", hex);
        String antwort = scanner.next().trim();

        String korrekt = String.format("%8s", Integer.toBinaryString(Integer.parseInt(hex, 16)))
                .replace(' ', '0'); // immer 8-stellige Binärzahl

        pruefeAntwort(antwort, korrekt);
    }

    private static void binaerNachHex(Scanner scanner, Random rand) {
        String binaer = Integer.toBinaryString(rand.nextInt(256));
        binaer = String.format("%8s", binaer).replace(' ', '0'); // immer 8-stellige Binärzahl
        System.out.printf("Rechne BINÄR %s in HEXADEZIMAL um: ", binaer);
        String antwort = scanner.next().trim().toUpperCase();

        String korrekt = Integer.toHexString(Integer.parseInt(binaer, 2)).toUpperCase();

        pruefeAntwort(antwort, korrekt);
    }

    private static void dezimalNachHex(Scanner scanner, Random rand) {
        int dez = rand.nextInt(256); // Dezimal maximal 255
        System.out.printf("Rechne DEZIMAL %d in HEXADEZIMAL um: ", dez);
        String antwort = scanner.next().trim().toUpperCase();

        String korrekt = Integer.toHexString(dez).toUpperCase();

        pruefeAntwort(antwort, korrekt);
    }

    private static void hexNachDezimal(Scanner scanner, Random rand) {
        String hex = Integer.toHexString(rand.nextInt(256)).toUpperCase(); // Hex maximal FF
        System.out.printf("Rechne HEX %s in DEZIMAL um: ", hex);
        String antwort = scanner.next().trim();

        String korrekt = Integer.toString(Integer.parseInt(hex, 16));

        pruefeAntwort(antwort, korrekt);
    }

    private static void pruefeAntwort(String antwort, String korrekt) {
        if (antwort.equals(korrekt)) {
            System.out.println("✅ Richtig!\n");
        } else {
            System.out.println("❌ Falsch!");
            System.out.printf("Korrekte Antwort: %s%n%n", korrekt);
        }
    }
}