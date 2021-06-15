trait Nauczyciel extends Osoba2 with Pracownik{
  override def podatek = super.pensja*0.1
}
