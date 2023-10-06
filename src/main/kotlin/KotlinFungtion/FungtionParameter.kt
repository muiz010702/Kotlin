package KotlinFungtion

//fun main() {
//    var kolor = "Hijau"
//    warna(kolor)
//}
//
//fun warna(kolor:String){
//    println("ini adalah warna $kolor")
//}

//fungtion return
//fun main() {
//    var hewan = makhlukHidup("mamalia")
//    print(hewan)
//}
//fun makhlukHidup(jenis:String):String{
//    return "ini adalah hewan $jenis"
//}

////unit returning fungtion
//fun nama (orang: String){
//    println("Hallo $orang")
//}
//fun main() {
//    nama("Muhamamad Nur Muiz")
//}

//tail recursion
//fun main() {
//    println(factorial(5))
//}
//
//fun factorial(n: Int, result: Int = 1): Int{
//    var newresult = n*result
//    return if(n == 1){
//        newresult
//    } else {
//        factorial(n -1, newresult)
//    }
//}

//high order fungtion
//fun main() {
//    var result = calculator(4, 5, :: sum)
//    println( result)
//}
//fun sum(a:Int, b:Int) = a + b
//
//fun calculator(a: Int, b: Int, operation:(Int, Int) -> Int):Int{
//    return operation(a, b)
//}

//Lambda Fungtion
//fun main() {
//    var Hewan = {str:String -> str.toUpperCase()}
//
//    println(Hewan ("Ini adalah hewan"))
//}

//inline fungtion
var balance = 25_500

fun main() {
    var playthegame={
        balance -= 15_000
        println("play the game")
    }
    doTransaction(playthegame)
}

inline fun doTransaction(doplay:() -> Unit){
    println("balanace before play: $balance")

    doplay()

    println("balance after play: $balance")
}
