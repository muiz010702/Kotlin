package DasarKotlin
//mengenal Tipe data range
/*
    macam macam fitur yg dapat digunakan dalam menentukan tipe data range
    1. count digunakan untuk mendapatkan total data dari range
    2. contains(value) digunakan untuk mengecek apakah terdapat value
    3. first digunakan untuk mendpaatkan nilai awal
    4. last digunakan untuk mendapatkan nilai akhir
    5. step digunakan untuk mendapatkan nilai tiap kenaikan
*/
//contoh range naik menggunakan .. , sedangkan range turun menggunakan fitur down to
fun main() {
    //range naik
    val range=0..999
    println(range.count())
    println(range.contains(78))
    println(range.first)
    println(range.last)
    println(range.step)
    println("==========================")
    //range turun
    val Turun=400 downTo 1
    println(Turun.count())
    println(Turun.contains(78))
    println(Turun.first)
    println(Turun.last)
    println(Turun.step)
}