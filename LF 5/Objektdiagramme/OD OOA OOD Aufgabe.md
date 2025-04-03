# OOA UML Klassendiagramm für Raumschiff und Ladung

## Klasse: Raumschiff 🚀

### Attribute:
| Sichtbarkeit | Name                 | Typ             |
|--------------|----------------------|-----------------|
| -            | name                 | String          |
| -            | modell               | String          |
| -            | energieversorgung    | double          |
| -            | schilde              | double          |
| -            | ladungsverzeichnis   | List<Ladung>    |

### Methoden:
| Sichtbarkeit | Name                               | Rückgabetyp | Parameter                   | Beschreibung                                             |
|--------------|------------------------------------|-------------|-----------------------------|----------------------------------------------------------|
| +            | photonentorpedoAbschiessen()       | void        | -                           | Feuert Photonentorpedos ab                               |
| +            | trefferVermerken()                 | void        | -                           | Vermerkt Treffer auf das Raumschiff                      |
| +            | nachrichtAnAlleSenden(nachricht)   | void        | nachricht: String           | Sendet Nachricht an alle                                 |
| +            | ladungBeladen(ladung)              | void        | ladung: Ladung              | Belädt Raumschiff mit einer Ladung                       |

---

## Klasse: Ladung 📦

### Attribute:
| Sichtbarkeit | Name                | Typ             |
|--------------|---------------------|-----------------|
| -            | bezeichnung         | String          |
| -            | menge               | int             |
| -            | gewicht             | double          |

### Methoden:
*Aktuell keine Methoden definiert.*

---

## Beziehungen:
- **Aggregation**: Ein Raumschiff besitzt ("hat") mehrere Ladungen. Dies stellt eine 1-zu-n Beziehung dar.
