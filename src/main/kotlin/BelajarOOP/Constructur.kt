package BelajarOOP

import data.Mobil

fun main() {
    val HRV = Mobil("Honda")
    HRV.year = 2018
    val Xenia = Mobil("Daihatsu",2023)

    println(HRV.merk)
    println(HRV.year)
    println(Xenia.merk)
    println(Xenia.year)
}