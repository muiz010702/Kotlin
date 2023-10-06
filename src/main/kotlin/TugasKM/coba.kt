package TugasKM

fun main() {
//    val setA = setOf(1,2,3,4,5)
//    val setB = setOf(1,2,4,5)
//    println(setA == setB)

    val num1 = setOf(4,4,1,6,2,7)
    val num2 = setOf(4,1,6,7,3,11)
    val num3 = setOf(8,10)

    val tampil = num2.intersect(num1)
    val gabung = num1.union(num3)

    println(tampil)
    println(gabung)
}