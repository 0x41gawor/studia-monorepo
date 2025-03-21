# Lab1 - totalna porazka
## Story
Zainstalowałem ryu https://github.com/faucetsdn/ryu. Okazuje się, że nie działa. Marcin mnie uprzedzał, że trzeba mieć python 3.9, ale nie zrobiłem tego w ciemno. Po prostu sam chciałeś napotkać ten błąd.
Napotkałem, Chat-GPT mówi, że problem z libkami bo python za duza wersja. Miałem czyste Ubuntu 22.04 z Pythonem 3.10. Chat-GPT podpowiedział mi downgrade pythona i z racji, że Marcin mówił to samo to poszedłem w to. 
Spytałem czat jak, on ostrzegł, że to może być risky shit, ale pomyślałem "ok, ok, będe ostrożny sratata". Tak, więc wypytałem go o kroki jak zrobić downgrade na 3.9. Wypisał. 
Wklejałem na pałe komendy. W końcu jakiś błąd, więc kopiuje do chata, fixuje i wracam do głównego wątku. W końcu doszedłem aż do 3 poziomu zagłębienia threada. 
No i jeb. Deadlock, solvem na coś jest zrobienie `sudo apt update` a mi XDDD nie działa ta komenda, bo coś jest popsute w skrypcie `apt_pkg`, ale zeby naprawić ten skrypt to musze pobrać jakąś nową paczkę, której nie mam lokalnie, ALE PRZECIEZ APT MI NIEDZIAŁA, WIĘC NIE ZROBIE TEGO.
Brawo debilu, popsułeś sobie apta. Próbowałem to naprawić ale nie da się. Jedyne co to reinstall ubuntu. Jakieś tam live recovery mode nie rozważam. 

No więc siedzę tak sobie na tej labce z godzine bezczynnie. Najbardziej to mi szkoda innych grup. Oni zaczęli od minineta i nie sprawdzili nawet, że Ryu im nie działa. Teraz męcza się z nim z topologią sieci a jak wrócą do domu okaże się, że to na nic XD

Nie mogę zrobić reinstall Ubuntu, bo nie mam ze sobą bootwalnego pendrive, z którego robilem install. 

## Nauczka
Nie robić nigdy nic na host OS. Niech on będzie serio tylko HOST. Wszystko co robisz w ramach "lab" rób na maszynach wirtualnych - jak coś spierdolisz stawiasz od nowa i elo. Nie zabijasz swojego systemu host.
Solvem na moje issue dzisiejsze jest Ubuntu z Pythonem 3.8. To co zrobiło mi fuckup z apt'em to było to, że musiałem sam podlinkować jakieś repo, bo Ubuntu już wycofało python3.8 z default repositories.
Gdybym miał teraz virtualbox, bo bym sobie szybko pobrał .iso z odpowiednio starym ubuntu. (Takie, które wspiera Python3.8 to jest Ubuntu 20.04 LTS)
ALE NO NIE MAM VMBOX BO SOBIE POPSUŁEM APTA I NIE ZAINSTALUJE GO XDDDD

A może w sumie wystarczy tylko eventlet zmienić wersje https://github.com/faucetsdn/ryu/pull/166 na mniejszą niż 0.30.3.

## Wnioski
Po chuju jest wgl zajmowac się projektami, które są deprecated. A nawet jeśli to prowadzący powinien przede wszystkim samemu być w stanie zainstalować to gówno a studentom stworzyć odpowiednią instrukcję.

## Co teraz będe robił
Wbijam na chatę robie sobie Ubntu Server 20.04 LTS i na nim robię te labkę.
Mocne issue solving będzie.
Kurwa a teraz się skapnąłem, że gadałem cały czas z chatem-gpt w wersji 3.5 NO BEZ SENSU
A no i musze jeszcze zrobić reinstall ubuntu na tym lapku.
Ciekawe z czego bedzie next lab.
