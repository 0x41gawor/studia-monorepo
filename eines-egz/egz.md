## SDN

![image-20230620214428219](img/image-20230620214428219.png)

SDN protocol is the OpenFlow for example.

What implementation models exist?

![image-20230620220159340](img/image-20230620220159340.png)

And why?

![image-20230620220308553](img/image-20230620220308553.png)

1. Vendor has a product already on the market. He want to add the OpenFlow to it. But suddnely it occurs that the previous technology puts some contraints on the OpenFlow implementations
2. Vendor wants to deploy OpenFlow in the MNO network, but MNO has some legacy technologies, and cant just deploy brand new technology in the PURE form

![image-20230621000613217](img/image-20230621000613217.png)

d - no definicja control plane i controllera

b - to jest potrzebne zeby zrobić `d`

c - jak juz masz topo to to staje sie clue

![image-20230621012037402](img/image-20230621012037402.png)

Tak jest ugułem w telco przecież.

## Openstack

![image-20230620220623943](img/image-20230620220623943.png)

HEAT/HOT to orkiestracja na poziomie infrastruktury

<img src="img/image-20230620220750468.png" alt="image-20230620220750468" style="zoom:50%;" />

OpenStack jest IaaS (ten najniższy level chmury)

![image-20230620234618017](img/image-20230620234618017.png)

nowy template (mimo iż wypełniony starym contentem) to nowy stack

tu jest ze np zrobimy tak:

```yaml
host:
 OS: linux 2.3.1
 RAM: 4GB
```

no i zbudowaliśmy taki stack, a teraz cyk modyfikujemy template na taki

```yaml
host:
 OS: linux 2.8.1
 RAM: 2GB
```

I robimy apply na stack, to stack sie zmienia

no, ale my jednak ten pierwszy template skopiowaliśmy sobie i teraz do tego stacka mówimy ze ma być zrobiony wg. tego template:

no to stack znowu jest taki:

```yaml
host:
 OS: linux 2.3.1
 RAM: 4GB
```

![image-20230620235843919](img/image-20230620235843919.png)

a - no to prawda chyba wtf

b - no to nie, tu tylko infra masz

c - tenant nie definiuje tego

d - a czyli 'a' jest złe, bo na IaaS robimy cały STACK, a nie tylko VM. 

## self-service/tenant network

![image-20230621011744588](img/image-20230621011744588.png)

![image-20230621011626701](img/image-20230621011626701.png)

## iptables - p3

![image-20230620221909409](img/image-20230620221909409.png)

![image-20230620222205094](img/image-20230620222205094.png)

W EINES taktyka jest taka:

szukaj odpowiedzi które nie pasują, bo jedne są dobre, a inne są TOTALNIE Z DUPY

## REST

![image-20230620222430745](img/image-20230620222430745.png)

![image-20230620223103995](img/image-20230620223103995.png)

REST jest właśnie fasadą dla jakiejś bazy danych. Ale tu chodzi o kod apki

Bez sensu to pytanie

![image-20230620224306576](img/image-20230620224306576.png)

## dnsmasq

![image-20230620224640651](img/image-20230620224640651.png)

dnsmasq is free software providing:

- DNS caching, a 
- DHCP server, 
- router advertisement and network boot features,

intended for small computer networks.

<img src="img/image-20230620224817265.png" alt="image-20230620224817265" style="zoom:50%;" />

No i Myco pokazał jak można użyć go, żeby zrobić DHCP dla różnych network namespaces

## Devops

![image-20230620225336939](img/image-20230620225336939.png)

Devops to automatyzacja wszystkiego co jest po commicie.

<img src="img/image-20230620225421391.png" alt="image-20230620225421391" style="zoom:67%;" />

<img src="img/image-20230620225443695.png" alt="image-20230620225443695" style="zoom:67%;" />

No i też daje to że jest Developemtn and Operations team w jednym. Znają cały system na bakier od a do z. Ale ten system to bardzo malutki wycinek software, dlatego idealnie się to nadaje do microservisów.

![image-20230620225639630](img/image-20230620225639630.png)

a) - tak, bo to jest idealne dla małych systemików, bo cały tim zajmuje od specki do eksplo, wiec duzy zakres obowiazkow, ale dzieki temu szybko przepływa wiedza między etapami, a systemy są małe więc nie są takie complexy i sobie poradzą z tym chłopaki

b) - akurat automatyzacja jest nie na specyfikowaniu i pisaniu kodu, tylko na tym co sie dzieje po commicie

c) - tak, ludzi w timie są zarówno programista ale tez i musza sie znac na deployu, tez na specyfikacji i wgl

d) gdyby tylko testing przenieś na tę drugą stronę to by było idealnie. Ale no separacja polega na tym, że to co po commicie dzieje sie automatycznie wszystko

![image-20230620230344412](img/image-20230620230344412.png)

a - nie, to jest do microservices

b - tak, to co po commicie to jest kurna automatyzowane

c - tak, tez wszystkie fazy są zintegrowane, wręcz się przenikają, dzieją się króciótko, np. całość w 2 tygodnie

d - nie, tak było w waterfall, teraz jest zero formalizacji, luźna gadka w timie

![image-20230621001005290](img/image-20230621001005290.png)

**Continuous Integration** - Developers practicing continuous integration merge their changes back to the main branch as often as possible. The developer's changes are validated by creating a build and running automated tests against the build.

**Continuous delivery** is an extension of continuous integration since it automatically deploys all code changes to a testing and/or production environment after the build stage. Czyli oprócz testów na repo, idzie to na test env lub prod env i tam juz sa testy manualne.

**Continuous deployment** goes one step further than continuous delivery. With this practice, every change that passes all stages of your production pipeline is released to your customers. There's no human intervention, and only a failed test will prevent a new change to be deployed to production. Czyli już totalnie wszystko idzie aż na produkcje. Ale wiesz że nie odwali się lipa na prodzie, bo te checki wszystkie wcześniej są gitem.

**integration to oznacza ze programisci integrują swój kod, delivery, to że ten kod od razu jest zamieniany na apke i trafia na środowisko dla testerów manualnych, deployment to ze po prostu automatycznie software leci non-stop do klientów aż**

## OpenFlow

![image-20230620230552938](img/image-20230620230552938.png)

Mamy dwa opposite tryby:

- reaktywny - zaczynam dbac o zdrowie gdy jest lipa
- proaktywny - zaczynam dbac o zdrowie duzo wczesniej zeby nigdy lipy nie było

W openflow to się przekłada tak:

![image-20230620230739627](img/image-20230620230739627.png)

Reactive - controller reaguje na PACKET_IN od switcha

Proactive - contoller instaluje jakieś już flow entry do switcha zanim ten wgl cokolwiek dostanie, a skąd ma controller wiedzieć co mu wysłać za konfig? To już my ludzie wiemy, wiemy będzie to na Northbound interface w arch. poniżej:

<img src="img/image-20230620230924312.png" alt="image-20230620230924312" style="zoom:67%;" />



![image-20230621002926952](img/image-20230621002926952.png)

Coś przyszło do switcha, no to on cyk odpowiada, to jest REACTIVE

![image-20230621003036919](img/image-20230621003036919.png)

Coś przyszło do switcha, to on może tak, albo ma flow entry, to robi forward na odpowiedni port, albo ma zapisane, w action, żeby zrobić drop, albo nie zna tego pakietu i musi do wysłać do Controllera w PacketIn.

![image-20230621003214464](img/image-20230621003214464.png)

## Orchestration 

![image-20230620233326849](img/image-20230620233326849.png)

![image-20230620233736673](img/image-20230620233736673.png)

Subset

no i wiadomo automatyzacja czyli eliminacja ludzi

![image-20230620234951556](img/image-20230620234951556.png)

Czyli tylko mówisz intenty a wszystko samo sie robi i naprawia



## VNF

![image-20230620234007663](img/image-20230620234007663.png)

Computing power virtualization - czyli wirtualiacja RAM&CPU

a - to jest nieprawda

b - tak, kiedyś właśnie problemem było to, że serwery były zwymiarowane na max load, wiec averagae byly obciążone np. na 20%

c - z powyższego teraz zamiast 5 serwerów mozna mieć jeden

d - no teraz jeden serwer jest mocniej uzywany wiec tak

## Cloud deployment models

![image-20230620234249342](img/image-20230620234249342.png)

d - pasuje jak ulał

![image-20230620234508571](img/image-20230620234508571.png)

## Cloud usage architectures

![image-20230621011105554](img/image-20230621011105554.png)

![image-20230621011356199](img/image-20230621011356199.png)

## microservices vs monolith

![image-20230620235116059](img/image-20230620235116059.png)

a - kiedys był software po prostu robiony na zwykły komp, zwykłą wirtualke, nie ma tu żadnej różnicy

b - mikroserwisy totalnie łatwiej się skalują

c - tigher - nie, małe komponenty, to jest luźno połączone

d - testy jednostkowe są mega izi

![image-20230620235324703](img/image-20230620235324703.png)

a - małe rzeczy potem łączysz więc izi development

b - 

c - małe komponenty luźno połączone

d - Poszczególne funkcje jest izi przetestować bo są mikroserwisami.

## VLAN - networking

![image-20230621001736109](img/image-20230621001736109.png)

a - moze tez być w WAN

b - tak, bo po prostu zrobimy sobie boradcast domain i nie bedzie az tyle tych ramek 

c - prawda, dodajemy ten Vlan Tag i mozna miec izolowanie na jego podstawie

d - i wlasnie ten VLAN Tag w DC jest stosowaned



![image-20230621001726896](img/image-20230621001726896.png)

![image-20230621001830378](img/image-20230621001830378.png)

![image-20230621002125905](img/image-20230621002125905.png)

## Linux Bridge

![image-20230621002020763](img/image-20230621002020763.png)

c - ma najwiecej sensu

![image-20230621002713996](img/image-20230621002713996.png)

Switch się uczy to znaczy zapisuje sobie na jakich portach jakie mu się adresy MAC odezwały.

Pytanie jest formułowane w czasue gdy przyszedł pakiet stąd confusion.



## declarative vs imperative

![image-20230621003302073](img/image-20230621003302073.png)

a - źle

b - nie pasuje -> źle

c - to je dobre, yaml nie musisz znac specyfiki tego co piszesz skrypt i taki yaml mozesz wykorzystac wiele razy jak vendor ma odpowiednie api skryptowe popisane

d - każe zaznaczać all odpowiedzi, a przecież a i b jest źle

## openvswitch

![image-20230621012235804](img/image-20230621012235804.png)

![image-20230621012303956](img/image-20230621012303956.png)

![image-20230621012321157](img/image-20230621012321157.png)

## Gitlab

![image-20230621012527880](img/image-20230621012527880.png)

a - jest managed bo to tu jest skrypt Ci/CD i to Gitlab jest od tego

b - no te moduły skompilowane to już są na jakiej innej maszynie deydkowanej do tego

c - tu jest centrum zarządzania, ale te akcje wykonywane są gdzie indziej,  na innych maszynach

d - no toć git jest od tego wlasnie primarly 