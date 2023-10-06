package KotlinFungtion

//fun main() {
//    var company = Kerja("PT. Djarum")
//    println(company)
//}
//fun Kerja(Kegiatan:String):String{
//    return "Sekarang saya beklerja di $Kegiatan"
//}

//fun main() {
//    var uang = gaji(25000000)
//    println(uang)
//}
//fun gaji(Salary:Int):String{
//    return "Gaji saya mencapai $Salary"
//}

fun main() {
    var uang = tabungan(50_000_000_000)
    println(uang)
}
fun tabungan(Money:Long):String{
    return "uang tabungan saya sebanyak $Money"
}