/**
 * Etap 1 – podstawy Kotlina.
 * Program pokazuje dane ucznia i oblicza łączną liczbę godzin zajęć.
 */

fun obliczLiczbeGodzin(godzinyNaTydzien: Int, liczbaTygodni: Int): Int {
    require(godzinyNaTydzien >= 0) { "Liczba godzin nie może być ujemna." }
    require(liczbaTygodni >= 0) { "Liczba tygodni nie może być ujemna." }

    return godzinyNaTydzien * liczbaTygodni
}

fun main() {
    // val służy do wartości, których nie zmieniamy.
    val imie = "Alex"
    val kierunek = "Technik programista"

    // var pozwala zmienić wartość zmiennej.
    var klasa = "3TP"

    var semestr = 1
    semestr += 1

    println("=== DANE UCZNIA ===")
    println("Imię: $imie")
    println("Klasa: $klasa")
    println("Kierunek: $kierunek")
    println("Semestr: $semestr")

    println("\n=== LICZBA GODZIN ===")
    val wynikPierwszy = obliczLiczbeGodzin(
        godzinyNaTydzien = 6,
        liczbaTygodni = 4
    )
    val wynikDrugi = obliczLiczbeGodzin(
        godzinyNaTydzien = 8,
        liczbaTygodni = 5
    )

    println("6 godzin tygodniowo przez 4 tygodnie = $wynikPierwszy godzin")
    println("8 godzin tygodniowo przez 5 tygodni = $wynikDrugi godzin")
}
