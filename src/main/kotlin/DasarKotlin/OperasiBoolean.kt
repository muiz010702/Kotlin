package DasarKotlin

fun main() {
    var nilaiUas = 88
    var nilaiUts = 60
    var nilaiAkhir = 85

    var apakahlulusUts = nilaiUts > 90
    var apakahlulusUas = nilaiUas < 50
    var apakahlulusAkhir = nilaiAkhir > 40

    var lulus = apakahlulusUas && apakahlulusUts && apakahlulusAkhir
    println(lulus)
}