package BelajarOOP

fun main() {
    var programmer:Human = object : Human{
        override fun think(){
            print("saya pasti sukses dan menjadi orang kaya")
        }
    }
    programmer.think()
}interface Human{
    fun think()
}