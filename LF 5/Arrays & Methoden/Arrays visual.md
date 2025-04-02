# Visualisierung des Aufbaus eines Arrays in Java

Ein Array kannst du dir ganz einfach wie eine Reihe von Boxen vorstellen, die hintereinander aufgereiht sind. Jede Box ("Element") enthält genau einen Wert, und jede Box hat eine Nummer ("Index"), die bei 0 anfängt.

## Beispiel-Array:

In Java erzeugt man ein Array folgendermaßen:

```java
int[] zahlen = {3, 6, 9, 12};
```

### Visuelle Darstellung des Arrays:

| Index | Wert |
|-------|------|
| 0     | 3    |
| 1     | 6    |
| 2     | 9    |
| 3     | 12   |

**Erklärung:**

- Das Array `zahlen` besitzt 4 Elemente.
- Die Indizes starten **immer** bei `0` und gehen bis `Länge - 1`.
- Für unser Beispiel-Array gilt also:
  - `zahlen[0]` ist `3`
  - `zahlen[1]` ist `6`
  - `zahlen[2]` ist `9`
  - `zahlen[3]` ist `12`

### Zugriff auf ein Element:

Der Zugriff erfolgt anhand des Array-Namens und des gewünschten Index in eckigen Klammern.

Beispiel:

```java
System.out.println(zahlen[2]);
```

Gibt folgende Ausgabe:
