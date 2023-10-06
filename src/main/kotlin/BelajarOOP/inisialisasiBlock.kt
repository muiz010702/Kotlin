package BelajarOOP

class person (var nama:String, var umur:Int, var pendidikan:String){
    //member variabel
    var name:String
    var age:Int
    var kuliah:String

    //inisialisasi block
    init {
        this.name= nama
        this.age=umur
        this.kuliah=pendidikan
        println("Nama = $name")
        println("umur = $age")
        println("Kuliah = $kuliah")

    }
}

fun main() {
    var person = person("Putri Aliffia",21,"UIN Syarif Hidayatullah")
}