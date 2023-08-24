import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Eure Aufgabe ist es, gemeinsam ein Java-Programm zu entwickeln, das eine Funktion zur Berechnung der sogenannten 'n-ten Fibonacci-Zahl' implementiert.
// Die Fibonacci-Zahlen sind eine Reihe von Zahlen, in der jede Zahl die Summe der beiden vorherigen Zahlen ist.
// Die Fibonacci-Sequenz beginnt mit den Zahlen 0 und 1, und die nächsten Zahlen sind 1, 2, 3, 5, 8, 13, 21, usw.
//
//Schreibt zuerst einen Testfall für die Fibonacci-Funktion und stellt sicher, dass dieser fehlschlägt
// (da die Funktion noch nicht implementiert ist). Implementiert dann die Funktion schrittweise, um den Test erfolgreich zu bestehen.
// Schreibt weitere Tests, um sicherzustellen, dass die Funktion korrekt funktioniert.
//
//Am Ende sollte die Fibonacci-Funktion vollständig durch Tests abgedeckt sein.


public class FibonacciTest {

    //Schreibe den ersten Testfall für die Fibonacci-Funktion (z.B. Teste die Fibonacci-Zahl für n=0 oder n=1).

    //Implementiere die Fibonacci-Funktion, sodass der erste Test erfolgreich ist.

    //Schreibe weitere Tests, um verschiedene Fälle der Fibonacci-Funktion zu überprüfen.

    //Verbessere die Implementierung der Fibonacci-Funktion, um alle Tests erfolgreich zu machen.

    @Test
    void return0_givenPosition1 () {

        //GIVEN
        int position = 1;

        //WHEN
        int actual = Fibonacci.fibonacci(position);

        //THEN
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void return1_givenPosition2 () {

        //GIVEN
        int position = 2;

        //WHEN
        int actual = Fibonacci.fibonacci(position);

        //THEN
        int expected = 1;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void return3_givenPosition5 () {

        //GIVEN
        int position = 5;

        //WHEN
        int actual = Fibonacci.fibonacci(position);

        //THEN
        int expected = 3;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void returnMinus1_givenPosition0 () {

        //GIVEN
        int position = 0;

        //WHEN
        int actual = Fibonacci.fibonacci(position);

        //THEN
        int expected = -1;
        Assertions.assertEquals(expected, actual);

    }

}
