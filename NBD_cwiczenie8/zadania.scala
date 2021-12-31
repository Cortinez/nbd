object zadania {
  def main(args: Array[String]): Unit = {
    //Zadanie1
    def weekDays(day: String): String = day match {
      case "Poniedzialek" | "Wtorek" | "Sroda" | "Czwartek" | "Piatek" => "Praca"
      case "Sobota" | "Niedziela" => "Weekend"
      case _ => "Nie ma takiego dnia."
    }

    println("Zadanie 1)")
    println(weekDays("Poniedzialek"))
    println(weekDays("Wtorek"))
    println(weekDays("Sroda"))
    println(weekDays("Czwartek"))
    println(weekDays("Piatek"))
    println(weekDays("Sobota"))
    println(weekDays("Niedziela"))
    println(weekDays("Glupotasprawdzajaca"))
    println(weekDays("Muszynianka"))
    println(weekDays("Ninja"))
    //Zadanie2
    class KontoBankowe {
      private var _stanKonta: Double = 0.0

      def this(stanKonta: Double) = {
        this()
        this._stanKonta = stanKonta
      }

      def wyswietlStanKonta = _stanKonta

      def wplata(wartosc: Double): Unit = {
        _stanKonta += wartosc
      }

      def wyplata(wartosc: Double): Unit = {
        if (_stanKonta >= wartosc) _stanKonta -= wartosc
        else println(s"Za mało pieniędzy na koncie. Nie można wykonać operacji wypłaty $wartosc.")
      }
    }
    val kontoPuste = new KontoBankowe
    val konto1 = new KontoBankowe(997)

    println("Zadanie 2)")
    println("Puste konto: " + kontoPuste.wyswietlStanKonta)
    println("Konto nr 1: " + konto1.wyswietlStanKonta)
    konto1.wplata(3)
    konto1.wyplata(2000)
    konto1.wyplata(120)
    println("Konto nr 1 po wykonanych operacjach: " + konto1.wyswietlStanKonta)
    //Zadanie3
    case class Osoba(imie: String, nazwisko: String) {
    }

    def przywitanie(osoba: Osoba): String = {
      osoba match {
        case Osoba(imie, _) if imie.contains("Michal") => "Dzien dobry Michale!"
        case Osoba(imie, _) if imie.contains("Karolina") => "Dzien dobry Karolino!"
        case Osoba(imie, _) if imie.contains("Grazyna") => "Dzien dobry Grazyno!"
        case _ => "Dzien dobry Uzytkowniku!"
      }
    }

    val osoba1 = new Osoba("Michal", "Niski")
    val osoba2 = new Osoba("Karolina", "Trabalska")
    val osoba3 = new Osoba("Grazyna", "Swiatlolubna")
    val osoba4 = new Osoba("Krzysztof", "Krawczyk")
    val osoba5 = new Osoba("Adam", "Malysz")
    val osoba6 = new Osoba("Mariusz", "Pudzianowski")
    println("Zadanie 3)")
    println(przywitanie(osoba1))
    println(przywitanie(osoba2))
    println(przywitanie(osoba3))
    println(przywitanie(osoba4))
    println(przywitanie(osoba5))
    println(przywitanie(osoba6))

    //Zadanie4
    def fx1(x: Int): Int = (x * 8) / 2

    def fx2(x: Int, fx1: Int => Int): Int = {
      var y = x
      y = fx1(y)
      y = fx1(y)
      fx1(y)
    }

    println("Zadanie 4)")
    println(fx2(4, fx1))
  }
}