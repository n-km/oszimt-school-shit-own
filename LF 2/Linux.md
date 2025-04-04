
## 1. Grundlegende Unterschiede zu Windows
Im Gegensatz zu Windows ist Linux:
- **Open-Source**: Der Quellcode von Linux ist offen und kann von jedem eingesehen, verändert und weiterverbreitet werden.
- **Vielzahl an Distributionen**: Linux gibt es in vielen verschiedenen Versionen, z.B. Ubuntu, Redhat, Knoppix, Kali, Debian, etc.
- **Communities**: Diese Distributionen werden weltweit von Communities weiterentwickelt.
- **Derivate**: Jede Distribution kann verschiedene Derivate haben, z.B. Kubuntu, Edubuntu, Lubuntu.

(ChatGPT - ▼)

- Sicherheit: Linux ist bekannt für seine hohe Sicherheit und ist weniger anfällig für Viren und Malware im Vergleich zu Windows.
- Anpassbarkeit: Benutzer können das System und dessen Oberfläche nach ihren Bedürfnissen und Vorlieben anpassen.
- Stabilität: Linux-Systeme sind in der Regel sehr stabil und erfordern weniger Neustarts, selbst nach wichtigen Systemupdates.
- Ressourcenschonend: Linux kann auf älterer Hardware effizienter laufen als Windows, wodurch es eine gute Wahl für ältere Computer ist.

## 2. Mehrbenutzersystem
- Linux ist ein **Mehrbenutzersystem**, d.h., es gibt verschiedene Benutzer (user), die in Gruppen (groups) organisiert sind.
- **Zugriffsrechte** werden durch den Administrator (root) gesteuert.

## 3. Sicherheits- und Zugriffsrechte
- Linux unterscheidet bei den Zugriffsrechten zwischen:
  - **Besitzer** (User)
  - **Gruppe** (Group)
  - **Andere** (Other)
  
  Die Zugriffsrechte werden mit den Buchstaben **r** (lesen), **w** (schreiben), **x** (ausführen) definiert. Rechte können mit der **chmod**-Befehl vergeben werden.

- Es gibt auch ein **root**-Konto, der Superuser, der vollständige Administrationsrechte hat.

### Beispiel für chmod:
```bash
chmod u+x datei.txt   # Fügt dem Besitzer Ausführungsrechte hinzu
chmod 755 datei.txt    # Besitzer: rwx, Gruppe: r-x, Andere: r-x
```


4. Besonderheiten bei der Benennung
    Case-sensitive: Linux unterscheidet zwischen Groß- und Kleinschreibung, z.B. "Kramer" ist nicht gleich "kramer".

5. Keine Laufwerksbuchstaben
    Anders als Windows verwendet Linux keine Laufwerksbuchstaben (z.B. C: oder D:), sondern eine einzige Verzeichnisstruktur, die mit dem Wurzelverzeichnis / beginnt.


### Zugriffsrechtetabelle:
| Wert | Recht |
| ---- | ----- |
| `0`  | Keine |
| `1`  | x     |
| `2`  | w     |
| `3`  | w+x   |
| `4`  | r     |
| `5`  | r+x   |
| `6`  | r+w   |
| `7`  | r+w+x |


---

## Wichtige Linux-Verzeichnisse

| Verzeichnis | Beschreibung                                                 |
| ----------- | ------------------------------------------------------------ |
| /root       | Admin- bzw. Superuser-Verzeichnis                            |
| /proc       | Für Prozess- und Systemverwaltung                            |
| /lost+found | Enthält Dateifragmente nach Dateisystem-Wiederherstellung    |
| /bin        | Essentielle Programme, z.B. shutdown                         |
| /dev        | Geräte-Treiber                                               |
| /etc        | Konfigurationsdateien, z.B. Passwortdatei                    |
| /boot       | Enthält Startdatei und Kernel                                |
| /home       | Benutzerverzeichnisse, z.B. von Frau Kramer oder Herrn Meier |
| /server     | Verzeichnis für Dienste (z.B. Webserver)                     |
| /src        | Häufig für Quellcode, nicht direkt zugeordnet                |
| /lib        | Wichtige Bibliotheken und Befehle für alle, z.B. ls          |
| /mnt        | Zum Einhängen (Mounten) von Geräten                          |
| /usr        | Enthält Desktopumgebungen und weitere Systemprogramme        |
| /tmp        | Temporäre Dateien, wird beim Booten geleert                  |
| /sbin       | Wichtige Systembefehle für alle, z.B. ls, shutdown           |

---

## Weitere wichtige Konzepte
1. Paketverwaltung
In Linux erfolgt die Installation und Verwaltung von Software durch Paketmanager wie apt (Ubuntu/Debian), yum (CentOS/Redhat) oder pacman (Arch Linux). Diese Tools ermöglichen es, Software einfach zu installieren, zu aktualisieren oder zu entfernen.

2. Benutzer- und Gruppenverwaltung
Benutzer werden in Gruppen organisiert. Die Benutzerrechte werden durch die Dateiberechtigungen und die Zugriffssteuerung (ACL) für Dateien und Verzeichnisse definiert.

3. Prozesse und Systemverwaltung
Linux ist ein Mehrbenutzersystem, das eine starke Prozessverwaltung bietet. Jeder Prozess hat eine eindeutige Prozess-ID (PID), und du kannst Prozesse mit Tools wie ps, top und kill überwachen und steuern.

---
## Wichtige Linux-Kommandos

| Kommando       | Funktion                                                                     |
| -------------- | ---------------------------------------------------------------------------- |
| su root        | Wechselt zum Benutzer "root" und fordert die Eingabe des Root-Passworts.     |
| adduser        | Erstellt einen neuen Benutzer.                                               |
| passwd         | Ändert das Passwort eines Benutzers.                                         |
| mkdir          | Erstellt ein neues Verzeichnis.                                              |
| rmdir          | Löscht ein Verzeichnis.                                                      |
| cd             | Wechselt in ein Verzeichnis.                                                 |
| cd ..          | Wechselt in das übergeordnete Verzeichnis.                                   |
| ls             | Zeigt den Inhalt eines Verzeichnisses an.                                    |
| ls -R          | Zeigt die komplette Ordnerstruktur rekursiv an.                              |
| ls -l          | Zeigt Details wie Ordner-/Dateityp und Zugriffsrechte an.                    |
| dir            | Zeigt den Inhalt eines Verzeichnisses an.                                    |
| groupadd       | Erstellt eine neue Gruppe.                                                   |
| usermod        | Ordnet einem Benutzer eine Gruppe zu.                                        |
| chmod          | Ändert die Zugriffsrechte von Dateien und Verzeichnissen.                    |
| touch          | Erstellt eine neue Datei.                                                    |
| cat            | Zeigt den Inhalt einer Datei an.                                             |
| cat /etc/group | Zeigt die im System angelegten Gruppen und Benutzer an (als root ausführen). |

---
## Fazit

Linux bietet eine hohe Flexibilität und Sicherheit durch die Trennung von Benutzerrechten und der Open-Source-Natur. Das Verständnis der Verzeichnisstruktur, Zugriffsrechte und Systemverwaltung ist entscheidend für die Arbeit mit Linux, besonders bei administrativen Aufgaben.
