package BelajarOOP

fun main() {
    var obj = Nongsa().infinite()

    print(obj.welcome())
}class Nongsa{
    private  var selamatdatang:String="Selamat datang di kampus merdeka"
    inner class infinite{
        fun welcome() = selamatdatang
    }
}