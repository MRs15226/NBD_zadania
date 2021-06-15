import scala.annotation.tailrec

object Main {

  def fun1a(list: List[String]): String = {
    var result:String=""
    for(item <- list){
      result+=item+", "
    }
    result.substring(0,result.length-2)
  }

  def fun1b(list: List[String]): String = {
    var result:String=""
    for(item <- list.filter(_.startsWith("P"))){
      result+=item+", "
    }
    result.substring(0,result.length-2)
  }

  def fun1c(list: List[String]): String = {
    var result:String=""
    var it = list.iterator
    while(it.hasNext){
      result+=it.next()+", "
    }
    result.substring(0,result.length-2)
  }

  def fun2a(list: List[String]): String = {
    if(list.isEmpty) ""
    else
      if(list.size>1) list.head+", "+fun2a(list.tail) else list.head
  }

  def fun2b(list: List[String]): String = {

    def rec(list: List[String]): String = {
      if(list.isEmpty) ""
      else
        if(list.size>1) list.head+", "+rec(list.tail) else list.head
    }
    rec(list.reverse)
  }

  @tailrec
  def fun3(list: List[String],result:String=""): String = {
    if(list.isEmpty) result.substring(0,result.length-2)
    else
      fun3(list.tail,result+list.head+", ")
  }

  def fun4a(list: List[String]): String = {
    list.foldLeft(List[String]()) { (acc, elem) => acc :+ elem
    }.mkString(",")
  }

  def fun4b(list: List[String]): String = {
    list.reverse.foldRight(List[String]()) { (elem, acc) => acc :+ elem
    }.mkString(",")
  }

  def fun4c(list: List[String]): String = {
    list.filter(_.startsWith("P")).foldLeft(List[String]()) { (acc, elem) => acc :+ elem
    }.mkString(",")
  }

  def fun5(products: Map[String, Double]): Map[String, Double] ={
    products.map { case (k, v) => k -> 0.9 * v }
  }

  def fun6(tuple: (Any, Any, Any)): String = {
    tuple._1+","+tuple._2+","+tuple._3
  }

  def fun8(list: List[Int]): List[Int] = {
    if(list.isEmpty) list
    else
     if(list.head!=0)
       list.head::fun8(list.tail)
     else
      fun8(list.tail)
  }

  def fun9(list: List[Int]): List[Int] = {
    list.map(v=>v+1)
  }

  def fun10(list: List[Int]): List[Int] = {
    list.filter(i=>i>=(-5) && i<=12).map(i=>i.abs)
  }

  def main(args: Array[String]): Unit = {
    val days = List[String]("Poniedziałek","Wtorek","Sroda","Czwartek","Piatek")
    println("Zadanie1")
    println("1a:"+fun1a(days))
    println("1b:"+fun1b(days))
    println("1c:"+fun1c(days))
    /////////////////////////////////////////////
    println("Zadanie2")
    println("2a:"+fun2a(days))
    println("2b:"+fun2b(days))
    /////////////////////////////////////////////
    println("Zadanie3")
    println("3:"+fun3(days))
    /////////////////////////////////////////////
    println("Zadanie4")
    println("4a:"+fun4a(days))
    println("4b:"+fun4b(days))
    println("4c:"+fun4c(days))
    /////////////////////////////////////////////
    println("Zadanie5")
    val products = Map("Woda"->2.00,"Cola"->6.00,"Herbata"->3.00)
    println("Przed zmianą: "+products)
    println("Po obniżce: "+fun5(products))
    /////////////////////////////////////////////
    println("Zadanie6")
    println(fun6(Tuple3("Abc",100,2.0)))
    /////////////////////////////////////////////
    println("Zadanie7")
    println(products.getOrElse("Sok",0))
    /////////////////////////////////////////////
    println("Zadanie8")
    val numbers = List(0,2,3,4,0,5,6,0,7,0,8,0,9)
    println("Lista przed: "+numbers)
    println("Lista po zmianie: "+fun8(numbers))
    /////////////////////////////////////////////
    println("Zadanie9")
    println("Lista przed: "+numbers)
    println("Lista po zmianie: "+fun9(numbers))
    /////////////////////////////////////////////
    println("Zadanie10")
    val numbers2 = List(-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17)
    println("Lista przed: "+numbers2)
    println("Lista po zmianie: "+fun10(numbers2))
  }
}