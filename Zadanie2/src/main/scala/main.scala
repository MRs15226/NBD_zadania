import scala.math.pow

object Main {

  def fun1(day: String): Any = {
    day match{
      case "Poniedzialek"=>"Praca"
      case "Wtorek"=>"Praca"
      case "Sroda"=>"Praca"
      case "Czwartek"=>"Praca"
      case "Piatek"=>"Praca"
      case "Sobota"=>"Weekend"
      case "Niedziela"=>"Weekend"
      case _ => "Nie ma takiego dnia"
    }
  }

  case class Osoba(imie:String,nazwisko:String)

  def fun3(osoba: Osoba): Any = {


    osoba match{
      case Osoba("Jan","Kowalski")=>"Cześć, Janek"
      case Osoba("Piotr","Nowak")=>"Cześć, Piotrek"
      case Osoba(imie,nazwisko) => s"Witaj, $imie $nazwisko"
    }

  }


  def fun4(a: Int) :Int = a*a

  def calculate(a:Int,b:Int) = a*b

  def main(args: Array[String]): Unit = {
    println(fun1("Poniedzialek"))
    var osoba1= new Osoba("Jan","Kowalski")
    var osoba2= new Osoba("Piotr","Nowak")
    var osoba3= new Osoba("Zbigniew","Biały")
    println(fun3(osoba1))
    println(fun3(osoba2))
    println(fun3(osoba3))

    val c = calculate(5,_:Int)
    println(c(fun4(4)))

    var o1 = new Osoba2("Maciej","Rogowski",100) with Pracownik
    o1.pensja_(1000)
    
    var o2 = new Osoba2("Maciej","Rogowski",100) with Student
    
    var o3 = new Osoba2("Maciej","Rogowski",100) with Nauczyciel
    o3.pensja_(1000)
    
    println(o1.podatek)
    println(o2.podatek)
    println(o3.podatek)

  }
}