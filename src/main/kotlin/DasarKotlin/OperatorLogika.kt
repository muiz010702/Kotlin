package DasarKotlin

fun main() {
    print("Operator AND\n")
    print("============\n")
    var A = 5
    var B = 7
    var Hasil = (A == 5) && (B == 7)
    println("Hasilnya adalah $Hasil")
    var Hasil2 = (A == 2) && (B == 7)
    println("Hasilnya adalah $Hasil2")
    print("==================\n")
    print("Operator OR\n")
    var Nama1 ="Muiz"
    var Nama2 = "muiz"
    var Nama = (Nama1 == "mUiz") || (Nama2 == "MuIz")
    println("Hasilnya adalah $Nama")
}