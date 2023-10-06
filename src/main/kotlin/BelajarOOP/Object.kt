package BelajarOOP

import data.Anggota

fun main() {
    val Muiz = Anggota()
    Muiz.Fisrtname = "Muhammad"
    Muiz.middlename = "Nur"
    Muiz.Lastname = "Muiz"
    val ival = Anggota()
    ival.Fisrtname = "Ivallazi"
    ival.Lastname = "Valrazi"
    val Manto = Anggota()
    Manto.Fisrtname = "Manto"
    Manto.Lastname = "Ariyansyah"

    print(Muiz.Fisrtname)
    print( Muiz.middlename)
    println( Muiz.Lastname)
    print(ival.Fisrtname)
    println(ival.Lastname)
    print(Manto.Fisrtname)
    print(Manto.Lastname)
}