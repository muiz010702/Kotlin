package DasarKotlin

fun main() {
    val UTS = 75
    val UAS = 80
    val UU  = 95
    val Nilai = (UTS + UAS + UU) / 3
    println(Nilai)
    if(Nilai > 93){
        println("Anda mendapatkan predikat A")
    }else if(Nilai > 84){
        println("Anda mendapatkan predikat B")
    }else if(Nilai > 73){
        println("Anda mendapatkan predikat C")
    }else if(Nilai > 65){
        println("Anda mendapatkan predikat D")
    }else{
        println("Anda wajib mengulang di semester depan")
    }
}