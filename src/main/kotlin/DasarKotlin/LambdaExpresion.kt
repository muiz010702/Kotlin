package DasarKotlin

fun main() {
    val ContohLambda:(String,String) ->String = { NamaDepan: String, NamaBelakang:String ->
        val result = "$NamaDepan $NamaBelakang"
        result
    }
    val result = ContohLambda("Putri","Aliffia")
    println(result)
}