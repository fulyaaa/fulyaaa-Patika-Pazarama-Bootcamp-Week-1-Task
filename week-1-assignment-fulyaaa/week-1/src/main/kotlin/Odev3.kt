import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val num : Long = scanner.nextLong()
    if (num in 1..18){
        println(firstFactorial(num))
    }else println("Please Enter Number Between 1...18 ")

}

private fun firstFactorial(num: Long) : Long{

    return if (num == 0L) {
        1
    }
    else {
        num * firstFactorial(num - 1)
    }
}