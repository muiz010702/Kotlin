package DasarKotlin

fun main() {
    var Fullname: String = "Muhammad Nur Muiz"
    var Member: String = """
        Nadia Bunga
        Putri Aliffia
        Andine
    """.trimIndent()
    println("Ketua = "+Fullname)
    println(Member)
    //menggabungkan string
    var namadepan: String = "Amanda"
    var namabelakang: String ="Zahrani"
    var namalengkap: String = "$namadepan $namabelakang"
    var desc: String = "$namalengkap panjangnya adalah = ${namalengkap.length}"
    println(namalengkap)
    println(desc)
}