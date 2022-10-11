import java.util.*

fun aVeryBigSum(ar: Array<Int>) : Long {

    var sum = 0L

    for(x in ar) {
        sum += x
    }

    return sum

}

fun main(){

    val scan = Scanner(System.`in`)

    val numberOfArray = scan.nextLine().trim().toInt() //kullanıcıdan

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    println(aVeryBigSum(ar))
}



