fun main() {

    println("Enter Your Username!")
    val username = readLine().toString()
    val usernameRegex = "^[a-zA-Z](['_'](?!['_'])|[a-zA-Z0-9]){4,25}[a-zA-Z0-9]$"
    if (usernameRegex.toRegex().matches(username)){
        println(true)
    }else{
        println(false)
    }

}