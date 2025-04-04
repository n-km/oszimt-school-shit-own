
## Begriffe

| **Begriff**             | **Beschreibung**                                                                                                                            |
| ----------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| **(Legacy-) BIOS**      | Basic Input Output System, steuert den PC-Startvorgang, initialisiert Hardware                                                              |
| **UEFI**                | Unified Extensible Firmware Interface, grafischer Nachfolger vom BIOS                                                                       |
| **Partition**           | Logischer Abschnitt auf einem Datenträger (Festplatte, SSD, etc.)                                                                           |
| **EFI-Systempartition** | Spezielle Partition mit UEFI-Treibern und Bootloader                                                                                        |
| **POST**                | Power-On-Self-Test, Hardwaretest beim Start                                                                                                 |
| **Kaltstart**           | Vollständiger Start inklusive Netzteil                                                                                                      |
| **CMOS-RAM**            | Speicher für die, über UEFI eingestellten Werte, wie Zeit und Datum, benötigt eine Batterie, weil das RAM den Inhalt ohne Spannung verliert |
| **MBR**                 | Master-Boot-Record, enthält Partitionstabelle                                                                                               |
| **Partitionstabelle**   | Partitionen mit Start- und Endadressen, Dateisystem-Code, Bootstrap                                                                         |
| **GPT**                 | "Partitionstabelle" bei UEFI                                                                                                                |
| **Bootstrap**           | Ausführbarer Startcode                                                                                                                      |
| **Bootmanager**         | Software, die den Startvorgang steuert                                                                                                      |
| **Bootmenü**            | Ein Auswahlmenü mit mehreren Betriebssystemen                                                                                               |
| **Multi-Boot-System**   | System mit mehreren installierten Betriebssystemen                                                                                          |
| **Beep-Codes**          | Audiosignale, die Fehler codieren, weil beim Startvorgang eventuell noch keine Grafik funktioniert.                                         |

## Der Vorgang

![[Pasted image 20250404095431.png]]

```mermaid
flowchart TD
    subgraph BIOS_Phase
        direction TB
        A[PC Power ON] --> B[POST (Power-on Self Test)]
        B --> C[Search Boot device]
        C --> D[Load MBR into memory from the first sector of the drive]
        D --> E[Bootstrap Code of MBR search Partition Table to find active partition, then run Bootstrap Code of PBR (Partition Boot Record)]
        E --> F[Search and run bootmgr]
    end

    subgraph UEFI_Phase
        direction TB
        G[PC Power ON] --> H[POST (Power-on Self Test)]
        H --> I[Launch UEFI Firmware]
        I --> J[Get boot information from SRAM (NVRAM or CMOS)]
        J --> K[Boot entry, Boot order etc]
    end

    subgraph Boot_Loader_Phase
        direction TB
        F --> L[Launch Windows Boot Manager]
        K --> M[Launch Windows Boot Manager]
        L --> N[Read the BCD file]
        M --> O[Read the BCD file]
        N --> P[Launch Windows Boot Loader]
        O --> Q[Launch Windows Boot Loader]
        P --> R[Load OS Kernel into memory]
        Q --> R[Load OS Kernel into memory]
    end

    subgraph Kernel_Phase
        direction TB
        R --> S[Launch Windows NT OS Kernel]
        S --> T[H/W enumeration, Load drivers, create device node, Launch smss.exe]
        T --> U[Initialize Subsystem (load win32k.sys), Create user session processes, Launch Services, etc.]
    end

    style A fill:#f9f,stroke:#333,stroke-width:2px
    style B fill:#bbf,stroke:#333,stroke-width:2px
    style C fill:#bbf,stroke:#333,stroke-width:2px
    style D fill:#bbf,stroke:#333,stroke-width:2px
    style E fill:#bbf,stroke:#333,stroke-width:2px
    style F fill:#ff9,stroke:#333,stroke-width:2px
    style G fill:#f9f,stroke:#333,stroke-width:2px
    style H fill:#bbf,stroke:#333,stroke-width:2px
    style I fill:#bbf,stroke:#333,stroke-width:2px
    style J fill:#bbf,stroke:#333,stroke-width:2px
    style K fill:#bbf,stroke:#333,stroke-width:2px
    style L fill:#ff9,stroke:#333,stroke-width:2px
    style M fill:#ff9,stroke:#333,stroke-width:2px
    style N fill:#bbf,stroke:#333,stroke-width:2px
    style O fill:#bbf,stroke:#333,stroke-width:2px
    style P fill:#ff9,stroke:#333,stroke-width:2px
    style Q fill:#ff9,stroke:#333,stroke-width:2px
    style R fill:#bbf,stroke:#333,stroke-width:2px
    style S fill:#bbf,stroke:#333,stroke-width:2px
    style T fill:#bbf,stroke:#333,stroke-width:2px
    style U fill:#bbf,stroke:#333,stroke-width:2px
```


