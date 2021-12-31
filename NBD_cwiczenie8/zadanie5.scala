object zadanie5 {

  class Osoba(val imie: String, val nazwisko: String, private var _podatek: Double) {
    def podatek: Double = _podatek
  }

  trait Student extends Osoba {
    override def podatek = 0.0
  }

  trait Pracownik extends Osoba {
    private var _pensja = 0.0

    def pensja: Double = _pensja

    def pensja_=(wartosc: Double): Unit = _pensja = wartosc

    override def podatek = 0.2 * _pensja
  }

  trait Nauczyciel extends Pracownik {
    override def podatek = 0.1 * pensja
  }

  def main(args: Array[String]): Unit = {
    println("Zadanie 5)")
    val student = new Osoba("Marek", "Menge", 520.0) with Student
    println("Student:")
    println("Podatek studenta wynosi: " + student.podatek)
    val pracownik = new Osoba("Arek", "Klimat", 40.0) with Pracownik
    println("Pracownik:")
    pracownik.pensja = 2400.0
    println("Pensja pracownika wynosi: " + pracownik.pensja)
    println("Podatek, który płaci pracownik wynosi: " + pracownik.podatek)
    val nauczyciel = new Osoba("Skorpion", "Krul", 70.0) with Nauczyciel
    println("Nauczyciel:")
    nauczyciel.pensja = 3600
    println("Pensja nauczyciela wynosi: " + nauczyciel.pensja)
    println("Podatek, który płaci nauczyciel wynosi: " + nauczyciel.podatek)
    val studentwithpracownik = new Osoba("Paweł", "Witej", 10.0) with Student with Pracownik
    println("Student with Pracownik:")
    studentwithpracownik.pensja = 4800
    println("Pensja Student with Pracownik wynosi: " + studentwithpracownik.pensja)
    println("Podatek, który płaci Student with Pracownik wynosi: " + studentwithpracownik.podatek)
    val pracownikwithstudent = new Osoba("Damianek", "PRG", 420.0) with Pracownik with Student
    println("Pracownik with Student:")
    pracownikwithstudent.pensja = 1600
    println("Pensja Pracownik with Student wynosi: " + pracownikwithstudent.pensja)
    println("Podatek, który płaci Pracownik with Student wynosi: " + pracownikwithstudent.podatek)
  }
}