import java.util.Scanner;

public class umrechnung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Umrechnungsarten:");
        System.out.println("1 - Hexadezimal zu Binär");
        System.out.println("2 - Binär zu Hexadezimal");
        System.out.println("3 - Dezimal zu Hexadezimal");
        System.out.println("4 - Hexadezimal zu Dezimal");
        System.out.print("Auswahl eingeben: ");

        int auswahl = scanner.nextInt();
        scanner.nextLine();  // Konsumiert Zeilenende

        switch(auswahl) {
            case 1:
                System.out.print("Hexadezimale Zahl eingeben: ");
                String hex1 = scanner.nextLine();
                System.out.println("Binär: " + hexZuBinaer(hex1));
                break;
            case 2:
                System.out.print("Binäre Zahl eingeben: ");
                String bin = scanner.nextLine();
                System.out.println("Hexadezimal: " + binaerZuHex(bin));
                break;
            case 3:
                System.out.print("Dezimale Zahl eingeben: ");
                int dez = scanner.nextInt();
                System.out.println("Hexadezimal: " + dezZuHex(dez));
                break;
            case 4:
                System.out.print("Hexadezimale Zahl eingeben: ");
                String hex2 = scanner.nextLine();
                System.out.println("Dezimal: " + hexZuDez(hex2));
                break;
            default:
                System.out.println("Ungültige Auswahl.");
        }
        scanner.close();
    }

    // Hexadezimal zu Binär Umrechnung
    public static String hexZuBinaer(String hex) {
        int dezimal = Integer.parseInt(hex, 16);
        return Integer.toBinaryString(dezimal);
    }

    // Binär zu Hexadezimal Umrechnung
    public static String binaerZuHex(String bin) {
        int dezimal = Integer.parseInt(bin, 2);
        return Integer.toHexString(dezimal).toUpperCase();
    }

    // Dezimal zu Hexadezimal Umrechnung
    public static String dezZuHex(int dez) {
        return Integer.toHexString(dez).toUpperCase();
    }

    // Hexadezimal zu Dezimal Umrechnung
    public static int hexZuDez(String hex) {
        return Integer.parseInt(hex, 16);
    }

}