package BelajarOOP

fun main() {
    var perusahaan = Bank.BRI()

    print(perusahaan.welcome())
}class Bank{
    class BRI{
        fun welcome() = "selamat bekerja di bank BRI"
    }
}