# Das ist eine Wiederholung der objektorientierten Konzepte.

Bitte versuche als Übung alles in Markdown zu beantworten. Hier ist ein [Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

1. Was ist das Ziel der Objektorientierung?
 * Dieser Programmierstil ist unserem menschlichen Denken sehr ähnlich und daher intuitiv verwendbar. 
   Jeder Teil der im Programm existiert, wird durch sogenannte Objekte abgebildet. Objekte sind alle
   physisch vorstellbaren Dinge. Zb.: Autos, Bäume, ...

2. Gibt es OOP nur in Java?
 * Nein, es gibt auch z.B Phyton, C++, Ruby, usw

3. Was ist der Unterschied zwischen Objekt und Klasse?
 * +Die Klasse legt die Struktur eines Objektes fest. Sozusagen der Bauplan.
   +Das Objekt ist die Instanz einer Klasse und wird meist in Variablen gespeichert.
   
4. Wie erzeuge ich eine neue Instanz? (Welches Schlüsselwort gibt es dafür)
 * Man erzeugt eine neue Instanz mit dem Schlüsselwort new, also meinAuto = new meinAuto();

5. Was bedeutet das Schlüsselwort `static` und wo kann es überall verwendet werden?
 * Static kann man auf Variablen, Methoden, Blöcken und verschachtelten Klassen anwenden.
   Wenn ein Feld mit static deklariert wird, gibt es eine Kopie davon und wird für alle Objekte einer oder einer
   anderen Klasse gemeinsam genutzt. Auf static-Felder kann ohne Objektinitialisierung zugegriffen werden.
   Static-Methoden werden oft angewandt, wenn der Code von allen Instanzen dieser Klasse gemeinsam genutzt werden sollen.
   Bei static-Methoden gibt es keine this oder super Schlüsselwörter.
   
6. Wozu dient die Vererbung?
 * Es wird zwischen Super- und Subklasse unterschieden. Eine Superklasse vererbt an die Subklasse. Man vererbt mit dem Schlüsselwort extends um Beispiel
   Methoden und Variablen (außer mit dem Schlüsselwort private). 
   
7. Kann in Java von mehreren Klassen geerbt werden? Wenn ja wie?
 * In Java gibt es eingentlich nur Einfachvererbung, Eine Klasse kann maximal von einer
   anderen Klasse abgeleitet werden.
   Mit Hilfe von Interfaces wurde eine restriktive Art der Mehrfachvererbung geschaffen.
   
8. Welche Vererbungshierarchien kennst du? (Ein Bild reicht aus)
  * 
9. Was bedeuted Casten und wie ist die Syntax in Java dafür?
  * Casten bedeutet eine Typumwandlung von Datentypen (Typecast). Es können niedere
    Datentypen in höherwertige umgewandelt werden, aber auch umgekehrt, wobei auch mit Genauigkeitsverlust
    gerechnet werden muss. Boolean-Werte können nicht umgewandelt werden.
    
10. Was ist der Unterschied zwischen explizieten und implizieten Typecasting?
 *  + explizite Typumwandlung ist mit cast-Obperator:
      double myDouble = 9.78;
      int myInt = (int) myDouble;
    + implizite Typumwandlung ist ohne cast-Operator:
      int myInt = 9;
      double myDouble = myInt;
      
11. Erkläre die folgenden Schlüsselwörter: `super`, `this`
 *  + Schlüsselwort `super`: man verwendet diesen, um Konstruktoren aus der Oberklasse
      zu verwenden und um die Methode der Oberklasse aufzurufen.
    + Schlüsselwort `this`: dient dazu, dass sich ein Objekt in einer Methode selbst ansprechen kann. 
      Wenn z.B. parameter und lokale Variablen den selben Namen haben.
      
12. Für was dient der `instanceof` Operator. Gib ein sinnvolles Beispiel.
 *  Bestimmung von Instanzenen auf ihren Typ während der Laufzeit, da z.B. durch typcasting die 
    genauere Information verloren gegangen ist (true/false Wert)
    
 ---
 Eclipse bietet auch Markdown unterstützung inklusive Preview. Für die Verwendung muss kein Plugin installiert werden.
