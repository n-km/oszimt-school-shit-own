## Hexadezimal, Binär und Dezimal ohne Taschenrechner umrechnen

## Inhaltsverzeichnis

- [Hexadezimal ↔ Binär](#hexadezimal--binaer)
- [Dezimal → Hexadezimal](#dezimal--hexadezimal)
- [Hexadezimal → Dezimal](#hexadezimal--dezimal)

---

## Hexadezimal ↔ Binär

**Schritt 1: Wandle jeden Hex-Wert einzeln in 4-stellige Binärzahlen um (Hex → Binär)**  
Nutze hierfür diese Tabelle:

| Hex | Binär | Dezimal |
| --- | ----- | ------- |
| 0   | 0000  | 0       |
| 1   | 0001  | 1       |
| 2   | 0010  | 2       |
| 3   | 0011  | 3       |
| 4   | 0100  | 4       |
| 5   | 0101  | 5       |
| 6   | 0110  | 6       |
| 7   | 0111  | 7       |
| 8   | 1000  | 8       |
| 9   | 1001  | 9       |
| A   | 1010  | 10      |
| B   | 1011  | 11      |
| C   | 1100  | 12      |
| D   | 1101  | 13      |
| E   | 1110  | 14      |
| F   | 1111  | 15      |

### Beispiel: Hex zu Binär

Hex: 3A7  
3 → 0011  
A → 1010  
7 → 0111  
  
3A7 Hex = 0011 1010 0111 Binär

### Beispiel: Binär zu Hex

Gruppiere die Binärzahl **von rechts nach links** jeweils in 4-er Gruppen und nutze die Tabelle:

Binärzahl: 110101101 (auffüllen mit führenden Nullen links)  
binär → 0001 1010 1101  
0001 → 1  
1010 → A  
1101 → D  
  
110101101 Binär = 1AD Hex

---

## Dezimal → Hexadezimal

Teile die Dezimalzahl wiederholt durch 16 und notiere den Rest:

### Beispiel: Dezimal (7562) → Hexadezimal:

7562 : 16 = 472 Rest 10 (A)  
472  : 16 = 29  Rest 8  
29   : 16 = 1   Rest 13 (D)  
1    : 16 = 0   Rest 1  
  
Reste von unten nach oben lesen ergibt 1D8A Hex.

Hex-Ziffern über 9: 

| Dezimal | Hex |
| :------ | :-- |
| 10      | A   |
| 11      | B   |
| 12      | C   |
| 13      | D   |
| 14      | E   |
| 15      | F   |

---

## Hexadezimal → Dezimal

Multipliziere jede Hexadezimalziffer mit 16 hoch der jeweiligen Stelle und summiere diese Ergebnisse.

### Beispiel: Hexadezimal (1D8A) → Dezimal:

Hex:  1    D     8    A  
      |    |     |    |  
      v    v     v    v  
      1×16³ + D×16² + 8×16¹ + A×16⁰  
    = 1×4096 + 13×256 + 8×16 + 10×1  
    = 4096 + 3328 + 128 + 10  
    = 7562 Dezimal

Nutze diese Tabelle zur schnellen Orientierung:

|Potenz|Basis 16|Wert|
|---|---|---|
|16⁰|1|1|
|16¹|16|16|
|16²|16×16|256|
|16³|16×16×16|4096|
|16⁴|16×16×16×16|65536|

---

## Zusammenfassung Umrechnungen:

|Umrechnung|Methode|
|---|---|
|**Hex → Binär**|Einzelne Hex-Ziffern in Binär (4-stellig) übersetzen.|
|**Binär → Hex**|Binärzahl von rechts in Vierergruppen teilen und übersetzen.|
|**Dezimal → Hexadezimal**|Dezimalzahl mehrfach durch 16 teilen, Reste von unten notieren.|
|**Hexadezimal → Dezimal**|Stellenweise multiplizieren (mit 16ⁿ beginnend bei 0 von rechts), addieren.|

---
## Tabelle

| 128 | 64  | 32  | 16  | 8   | 4   | 2   | 1   |           | Ergebnis |
| :-- | --- | --- | --- | --- | --- | --- | --- | --------- | -------- |
| x   | x   | x   | x   | x   | x   | x   | x   | 1111 1111 | 255      |
| x   | x   | x   | -   | -   | -   | -   | -   | 1110 0000 | 224      |
128 + 64 = 192
192 + 32 = 224

#umrechnung-HexDezBin