package DasarKotlin

fun main() {
    var nilai = 88
    when{
        nilai > 94 -> println("Anda mendapatkan rating A")
        nilai > 82 -> println("Anda mendapatkan rating B")
        nilai > 70 -> println("Anda mendapatkan rating c")
        nilai > 60 -> println("Anda mendapatkan rating d")
        else -> println("Anda wajib mengulang")
    }
}