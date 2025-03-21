# Technologie komórkowe

GSM - Global System for Mobile communication

GPRS - General Packet Radio Service

EDGE - Enchanced Data rates for GSM Evolution

- Taki poprawiony GPRS

UMTS - Universal Mobile Telecommunications System

HSPA - High Speed Packet Access

LTE - Long Term Evolution

## 2G

### RAN

MS- Mobile Station - terminal usera

BTS - Base Transceiver Station -  *wireless* komunikacja pomiędzy MS, a siecią -  "komórka"

BSC - Base Station Controller - *handling traffic* i sygnalizacja pomiędzy terminalem i *network switching subsystem'em*, szafa komutacyjna

PCU - Packet Control Unit - dodany wraz z GPRS, wyręcza BSS w taskach związanych z pakietówką



FDD - Frequency Division Duplex, komórka używa dwóch zakresów częstotliwości, jeden do up-link, drugi do down-link

### CORE

MSC - Mobile Switching Centre - szafa komutacyjna po stronie core network

VLR - dołączony do MSC rejest abonentów w zasięgu BTS, którym MSC się opiekuje. Dane o dokładnym położeniu termianala itd.

GMSC - Gateway Mobile Switching Centre - szafa komutacyjna, ale łącząca Core z siecią zewnętrzną ISDN lub PSTN

SGSN - Serving GPRS Supporting Node - dodany wraz z GPRS, rola jak z MSC, ale obsługuje pakiety, jest w stanie łączyć się z szkieletem IP

GGSN - Gateway GPRS Support Node - dodany wraz z GPRS, rola jak GMSC, ale łączy core z siecią zewnętrzną Internet.



HLR - Home Location Register - rejestr abonentów macierzystych

AuC - Authentication Center

EIR - Equipment Identity Register 



## 3G

UTRAN - UMTS Terrestial Radio Acces Network - w UMTS RAN zmienił nazwę.

UE - User Equipment - w UMTS MS zmienił nazwę

RNC - Radio Network Controller - w UMTS BSC zmienił nazwę

BS - Base Station lub NodeB - w UMTS BTS zmienił nazwę.

GERAN - GSM and EDGE Radio Access Network - pojawiło się w Release 4 w UMTS, sieć radiowa dla GSM i EDGE.



WCDMA - Wideband Code-Division Multiple Access - technika wielodostępu terminali do BS

WiMAX - jakaś oddzielna technologia sieci komórkowych, która mogła zastąpić UMTS, GSM, GPRS, ale tego nie zrobiła

## LTE

Evolved RAN - RAN wprowadzony w LTE

MME - Mobility Management Entity - element na stykuja Core Network, do niego podłączony jest Evolver RAN, ale i też UTRAN oraz GERAN (za pośrednictwem SGSN w corze 3G)

EPS - Evolved Packet System

SAE - System Architecture Evolution - nowa architektura sieci wprowadzaona w LTE. Upraszcza i spłaszcza sieci podobnie jak sieci IP.

IMS - IP Multimedia System - framework architektoniczny do dostarczania *IP multimedia services*

PSS - Packet-switched Streaming Service - dodana usługa w LTE

PCRF - Policy and Charging Rules Function

HSS - Home Subscriber Server



ICIC - Inter-Cell Interference Coordination - technika koordynująca interferencje między komórkami.

MIMO - Multi-Input Multi-Output - technika kształtowania wiązki (że nie kulista, tylko celuje w terminale), multipleksacja

LTE4dvanced - inkrementacja LTE.

