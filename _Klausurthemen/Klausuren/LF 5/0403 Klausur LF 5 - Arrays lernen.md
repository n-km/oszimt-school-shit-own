### Vereinfachte Lösung für die Aufgaben

#### Aufgabe 1: Methode `convertArrayToString`

**Aufgabenstellung:**
Schreiben Sie in der zu erstellenden Klasse `ArrayHelper` die Methode `public static String convertArrayToString(int[] zahlen)`. Die Methode soll zu dem im Parameter übergebenen Array eine mit Komma getrennte Auflistung der Werte als String zurückgeben. Testen Sie Ihre Methode in der `main`-Methode.

**Vereinfachte Beschreibung:**
Wir erstellen eine Methode, die ein Array von Ganzzahlen in einen durch Kommas getrennten String umwandelt und in der `main`-Methode getestet wird.

```java name=ArrayHelper.java
public class ArrayHelper {

    // Methode zum Konvertieren eines Arrays in einen durch Kommas getrennten String
    public static String convertArrayToString(int[] zahlen) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < zahlen.length; i++) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(zahlen[i]);
        }
        return result.toString();
    }

    // Testen der Methode in der main-Methode
    public static void main(String[] args) {
        int[] zahlen = {1, 2, 3, 4, 5};
        String result = convertArrayToString(zahlen);
        System.out.println(result); // Ausgabe: 1, 2, 3, 4, 5
    }
}
```

#### Aufgabe 2: Methode zum Umkehren eines Arrays in-place

**Aufgabenstellung:**
Schreiben Sie eine Methode, die einen Parameter erhält: ein Feld mit ganzzahligen Werten. Die Methode soll die Reihenfolge der Elemente in dem Feld umdrehen. Dabei darf kein zusätzliches Feld benutzt werden.

**Vereinfachte Beschreibung:**
Wir erstellen eine Methode, die ein Array von Ganzzahlen in-place umkehrt, ohne ein zusätzliches Array zu verwenden, und in der `main`-Methode getestet wird.

```java name=ArrayHelper.java
public class ArrayHelper {

    // Methode zum Umkehren eines Arrays in-place
    public static void reverseArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }

    // Testen der Methode in der main-Methode
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
        System.out.println(Arrays.toString(array)); // Ausgabe: [5, 4, 3, 2, 1]
    }
}
```

#### Aufgabe 3: Methode zum Umkehren eines Arrays und Speichern in ein neues Array

**Aufgabenstellung:**
Schreiben Sie wiederum eine Methode, die die Werte eines Feldes mit ganzzahligen Werten umdreht (vgl. Aufgabe 2.1). Diesmal soll jedoch das Ergebnis in ein neues Feld abgelegt werden. Dieses Feld soll Rückgabewert der Methode sein.

**Vereinfachte Beschreibung:**
Wir erstellen eine Methode, die ein neues Array erstellt und die umgekehrten Elemente des ursprünglichen Arrays darin speichert, und in der `main`-Methode getestet wird.

```java name=ArrayHelper.java
public class ArrayHelper {

    // Methode zum Umkehren eines Arrays und Speichern in einem neuen Array
    public static int[] reverseArrayToNew(int[] array) {
        int n = array.length;
        int[] reversedArray = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArray[i] = array[n - 1 - i];
        }
        return reversedArray;
    }

    // Testen der Methode in der main-Methode
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArrayToNew(array);
        System.out.println(Arrays.toString(reversedArray)); // Ausgabe: [5, 4, 3, 2, 1]
    }
}
```

#### Aufgabe 4: Methode zum Erstellen einer Temperaturtabelle

**Aufgabenstellung:**
Schreiben Sie eine Methode, die eine Tabelle mit Temperaturwerten in ein zweidimensionales Feld ablegt. In einer Zeile der Tabelle sollen zwei Werte abgelegt werden: ein Wert in Fahrenheit mit dem entsprechenden umgerechneten Wert in Celsius. Dabei soll der erste Wert in Fahrenheit der Wert 0.0 sein, der zweite Wert in Fahrenheit der Wert 10.0, ... Der Funktion soll die Anzahl der Zeilen, d.h. die Anzahl der zu berechnenden Wertepaare als Parameter übergeben werden. (Umrechnung von Fahrenheit F nach Celsius C: C = (5/9) · (F – 32)).

**Vereinfachte Beschreibung:**
Wir erstellen eine Methode, die eine zweidimensionale Tabelle mit Temperaturwerten in Fahrenheit und Celsius erstellt, und in der `main`-Methode getestet wird.

```java name=ArrayHelper.java
public class ArrayHelper {

    // Methode zum Erstellen einer Temperaturtabelle
    public static double[][] createTemperatureTable(int rows) {
        double[][] table = new double[rows][2];
        for (int i = 0; i < rows; i++) {
            double fahrenheit = i * 10.0;
            double celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
            table[i][0] = fahrenheit;
            table[i][1] = celsius;
        }
        return table;
    }

    // Testen der Methode in der main-Methode
    public static void main(String[] args) {
        double[][] temperatureTable = createTemperatureTable(5);
        for (double[] row : temperatureTable) {
            System.out.println(Arrays.toString(row));
        }
        // Ausgabe: 
        // [0.0, -17.77777777777778]
        // [10.0, -12.222222222222221]
        // [20.0, -6.666666666666667]
        // [30.0, -1.1111111111111112]
        // [40.0, 4.444444444444445]
    }
}
```

#### Aufgabe 5: Methode zum Einlesen von Werten in eine n x m Matrix

**Aufgabenstellung:**
Schreiben Sie eine Methode zum Einlesen von Werten in eine n x m Matrix mit ganzen Zahlen (realisiert als ein zweidimensionales Array). Die Werte für n und m sollen der Methode als Parameter übergeben werden. Die eingelesene n x m Matrix soll Rückgabewert der Methode sein. Testen Sie Ihre Methode in einem Hauptprogramm.

**Vereinfachte Beschreibung:**
Wir erstellen eine Methode, die Werte in eine n x m Matrix einliest und in der `main`-Methode getestet wird.

```java name=ArrayHelper.java
import java.util.Scanner;

public class ArrayHelper {

    // Methode zum Einlesen von Werten in eine n x m Matrix
    public static int[][] readMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Enter value for matrix[%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Testen der Methode in der main-Methode
    public static void main(String[] args) {
        int[][] matrix = readMatrix(2, 3);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        // Beispielinput/-ausgabe:
        // Enter value for matrix[0][0]: 1
        // Enter value for matrix[0][1]: 2
        // Enter value for matrix[0][2]: 3
        // Enter value for matrix[1][0]: 4
        // Enter value for matrix[1][1]: 5
        // Enter value for matrix[1][2]: 6
        // [1, 2, 3]
        // [4, 5, 6]
    }
}
```

#### Aufgabe 6: Methode zum Überprüfen, ob eine Matrix selbsttransponiert ist

**Aufgabenstellung:**
Schreiben Sie eine Methode, die zu einer n x n Matrix überprüft, ob sie zu sich selber transponiert ist. Hinweis: eine n x n Matrix A ist zu sich selber transponiert, wenn für jedes Paar (i,j) gilt: aij = aji. Testen Sie Ihre Methode in einem Hauptprogramm.

**Vereinfachte Beschreibung:**
Wir erstellen eine Methode, die überprüft, ob eine n x n Matrix selbsttransponiert ist, und in der `main`-Methode getestet wird.

```java name=ArrayHelper.java
public class ArrayHelper {

    // Methode zum Überprüfen, ob eine Matrix selbsttransponiert ist
    public static boolean isSelfTranspose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Testen der Methode in der main-Methode
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        boolean result = isSelfTranspose(matrix);
        System.out.println(result); // Ausgabe: true
    }
}
```

### Lernen 02

```java
public class HobbyListe {
    public static void main(String[] args) {
        // Eine Beispielliste von Hobbys
        String[] hobbys = {"Lesen", "Schwimmen", "Kochen", "Wandern"};
        
        // Rufe unsere Methode auf
        String ergebnis = formatiereHobbys(hobbys);
        
        // Gib das Ergebnis aus
        System.out.println("Meine Hobbys sind: " + ergebnis);
    }
    
    // Diese Methode wandelt ein Array von Strings in einen formatierten String um
    public static String formatiereHobbys(String[] hobbys) {
        // Sonderfall: leeres Array
        if (hobbys.length == 0) {
            return "keine";
        }
        
        // Sonderfall: nur ein Hobby
        if (hobbys.length == 1) {
            return hobbys[0];
        }
        
        // Für mehrere Hobbys bauen wir den String auf
        StringBuilder ergebnis = new StringBuilder();
        
        // Füge alle Hobbys außer dem letzten mit Komma hinzu
        for (int i = 0; i < hobbys.length - 1; i++) {
            // Wenn es nicht das erste Element ist, füge ein Komma hinzu
            if (i > 0) {
                ergebnis.append(", ");
            }
            ergebnis.append(hobbys[i]);
        }
        
        // Füge das letzte Hobby mit "und" hinzu
        if (hobbys.length > 1) {
            ergebnis.append(" und ").append(hobbys[hobbys.length - 1]);
        }
        
        return ergebnis.toString();
    }
}
```