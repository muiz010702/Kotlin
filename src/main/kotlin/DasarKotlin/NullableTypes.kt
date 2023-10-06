package DasarKotlin

fun main() {
    var A: String? = "Muhammad Nur Muiz"
    print(A)

    if(A != null && A.length > 0){
        print("\nPanjang dari variabel A adalah = ${A.length}")
    }else{
        print("Jawaban anda salah")
    }
}
