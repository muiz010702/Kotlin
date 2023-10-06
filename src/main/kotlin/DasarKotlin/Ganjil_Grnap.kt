package DasarKotlin

fun main() {
    var A = 1
    print("Bilangan : ")
    while(A <= 20){
        print("$A ")
        A++
    }
    var B = 1
    print("\nBilangan Genap : ")
    while(B <= 20){
        if (B % 2 ==0){
            print("$B ")
        }
        B++
    }
    var C = 1
    print("\nBilangan Ganjil : ")
    while(C <= 20){
        if (C % 2 == 1){
            print("$C ")
        }
        C++
    }
}