package LatihanKotlin

fun main() {
//    //ListOf
//    var Angka = listOf(1,2,3,4,5)
//    Angka[3] = (9) --> List Of objek atau indek tidak bisa di ubah kecuali di ubah di dalam index tersebut
//    println(Angka)

//    //mutablelistOf
//    var Nama = mutableListOf("Amel","Putri","Ananda")
//    Nama [2]= ("Nova")//--> index dapat diubah walaupun di luar variabel tersebut
//    println(Nama)

    //merubah index mengggunakan beberapa fitur
    var A = mutableListOf(false,100,"Berlin",10.35,'B')
    A.add(10)
    A.remove(false)
    A.set(2,14)
    println(A)
}