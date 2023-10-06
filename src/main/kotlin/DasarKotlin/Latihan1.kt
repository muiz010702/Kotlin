package DasarKotlin

fun main() {
    var dateOut: String? = null
    var Status: String = "Booked"

    Status = "Checkout"

    if (Status.equals("Checkout")){
        dateOut = "22-09-2022 13:08:25 serta memiliki panjang string = ${Status.length}"
    }
    println(dateOut)
}