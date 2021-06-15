class KontoBankowe(var wplata:Double,var wyplata:Double,val saldo:Double) {
  def this(wplata:Double,wyplata:Double){
    this(wplata,wyplata,0.00)
  }
}
