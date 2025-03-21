# 1 Uruchomienie platformy na potrzeby monitorowania sygnalizacji 5G

Spis treści:

1. Wstęp teoretyczny - Architektura sieci mobilnych
   1. Po co powstały sieci komórkowe
   2. 4G
      1. Ran
      2. Core
   3. 5G
      1. Ran
      2. Core
      3. SBA
2. Platforma 5G
   1. UERANSIM
   2. Open5GS
   3. Środowisko
   4.  Instalacja i konfiguracja UERANSIM
   5. Instalacja i konfiguracja Open5GS
   6. Uruchomienie platformy 
3. Monitorowanie sygnalizacji 5G
   1. tcpdump
   2. Wireshark
   3. Scenariusz 1 - Włączenie się UE do sieci i transfer danych
   4. Scenariusz 2 - Symulacja rozmowy między dwoma UE

## 1.1 Wstęp teoretyczny - Architektura sieci mobilnych

Celem tej sekcji by było przedstawienie co ta przygotowana platforma w rzeczywistości odzwierciedla. Omówienie infrastruktury 5G, poczynając od przedstawienia ogólnej struktury sieci komórkowej. Stopień zagłębienia się w temat wystarczający, aby zrozumieć co przedstawiają komponenty platformy. Tak, żeby czytelnik wiedział czym jest UERANSIM, czym Open5GS i tak dalej...

### 1.1.1 Po co powstały sieci komórkowe

Zaznaczenie, że sieci komórkowe są tylko dostępem do sieci stacjonarnej/pakietowej np. WAN, Internet dla urządzeń mobilnych, aby lepiej zrozumieć ich architekturę.

> Opcjonalnie można by tu też zamieścić ewolucję sieci komórkowych od GSM do 5G.

### 1.1.2 4G

4G pojawia się tylko ze względu na to, że Open5GS również implementuje EPC. Rozdział ma na celu wytłumaczenie pojęć z obszaru 4G, z którymi czytelnik spotka się podczas korzystania z Open5GS

#### 1.1.2.1 Ran

Wyjaśnienie komponentów E-UTRAN (RRH, BBU).

#### 1.1.2.1 Core

Wyjaśnienie komponentów EPC (MME, HSS, PCRF, SGW, PGW).

### 1.1.3 5G

Ta cześć będzie nieco bardziej rozbudowana od części poświęconej 4G. Zostanie też wyjaśnione CUPS (Control and User Plane Separation) oraz SBA (Service Based Architecture).

#### 1.1.3.1 Ran

Wyjaśnienie komponentów 5G RAN (RU, DU, CU)

#### 1.1.3.2 Core

Wyjaśnienie komponentów 5G Core (NRF, AMF, UPF, ....)

#### 1.1.3.3 SBA

Wyjaśnienie podejścia SBA, CUPS. Implementacji tego w REST i HTTP2.

## 1.2 Platforma 5G

Sekcja stanowiłaby wstęp do oprogramowania składającego się na platformę. Omówienie czym jest Open5GS oraz UERANSIM odwołując się do pojęć zdefiniowanych w sekcji [1.1 Wstęp teoretyczny - Architektura sieci mobilnych](#1.1-wstęp-teoretyczny---architektura-sieci-mobilnych). 

> Ewentualna wzmianka o tym, że Open5GS oraz UERANSIM są otwarto źródłowe.

Następnie przejście do przygotowania środowiska dla platformy (postawienie dwóch maszyn wirtualnych), następnie instalacja oraz konfiguracja Open5GS oraz UERANSIM. Na sam koniec test, czy platforma działa (ping z UE do Data Network (w tym przypadku Internet np. na adres `8.8.8.8`))

### 1.2.1 UERANSIM

### 1.2.2 Open5GS

### 1.2.3 Środowisko

### 1.2.4 Instalacja i konfiguracja UERANSIM

> Nie wiem jak tutaj postępować ze stopniem zagłębienia się w temat ani jak się traktuje takie sprawy w pracach dyplomowych. Chodzi mi o to, że taka dokumentacja instalacji może bardzo szybko stracić aktualność.
>
> Z konfiguracją łatwiej, bo można zaznaczyć jakie elementu należy skonfigurować, gdyż to raczej się nie zmieni. Sam sposób ustawienia odpowiednich elementów, można pozostawić czytelnikowi.

#### 1.2.4.1 Instalacja

#### 1.2.4.2 Konfiguracja

### 1.2.5 Instalacja i konfiguracja Open5GS

#### 1.2.5.1 Instalacja

#### 1.2.5.2 Konfiguracja

#### 1.2.6 Uruchomienie platformy 

Wykonanie testu walidującego działanie platformy - ping z UE do Data Network.

## 1.3 Monitorowanie sygnalizacji 5G

Sekcja opisująca jak za pomocą programów tcpdump oraz wireshark monitorować sygnalizację na przygotowanej w poprzednim rozdziale platformie.

### 1.3.1 tcpdump

Krótki opis programu tcpdump.

### 1.3.2 Wireshark

Krótki opis programu Wireshark.

### 1.3.3 Scenariusz 1 - Włączenie się UE do sieci i transfer danych

Opis jak wykonać scenariusz oraz podejrzeć sygnalizację

### 1.3.3 Scenariusz 2 - Symulacja rozmowy między dwoma UE

Opis jak wykonać scenariusz oraz podejrzeć sygnalizację

