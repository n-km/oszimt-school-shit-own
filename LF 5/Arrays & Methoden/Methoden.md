
````java
public class Neu {
	// String-Rückgabe
	public static String einText(String x) {
		x = "Hallo";
		return x; // Rückgabe vom Text
	}
	// Int-Rückgabe
	public static int eineZahl(int y) {
		y = 815;
		return y; // Rückgabe der Zahl
	}
	public static void main (String[]args) {
		String x = einText(""); // Muss initialisiert sein
		System.out.println(x); // Ausgabe vom Text
		int y = eineZahl(0); // Muss initialisiert sein
		System.out.println(y); // Ausgabe der Zahl
	}
}
````

### Output:
```
Hallo
815
```


Funktionen, die abgerufen werden können.