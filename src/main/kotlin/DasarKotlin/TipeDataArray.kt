package DasarKotlin

fun main() {
    //layihan string 1
    val nama: Array<String> = arrayOf("Muiz","Ikbal","Kuncup")
    nama[0] = "Rayhan"//merubah index array ke 0 menjadi rayhan
    println(nama[0])
    //latihan string 2
    var nilai: Array<Byte> = arrayOf(57,87,100)
    println(nilai[2])//mencetak index array 2
    nilai[2] = 70//merubah indes ke 3 menjadi 70
    println(nilai[2])//mencetak index array ke 2
    var Hewan:Array<String> = arrayOf("Kucing","Hiu","Kelinci")
    println(Hewan[0])
    Hewan.set(1,"Harimau")//merubah index array ke 1 menjadi harimau dengan fungsi set
    print(Hewan[2])
}