trait Pracownik extends Osoba2 {
 private var _pensja:Double=0
 def pensja = _pensja
 def pensja_(value: Double){
  _pensja= value
 }
 override def podatek = pensja*0.2
}
