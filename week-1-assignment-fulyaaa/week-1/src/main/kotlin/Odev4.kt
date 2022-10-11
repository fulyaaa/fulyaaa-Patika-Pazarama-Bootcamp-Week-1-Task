import java.util.Scanner

private fun questionMarks(str: String) : String {
        var questionMarksCount = 0
        var lastDigit = -1
        var results = "false"

        for (i in str) {
                if (i.isDigit()) {
                        val digit = i.toString().toIntOrNull()
                        if (digit != null) {
                                val sum = digit + lastDigit
                                lastDigit = digit

                                if (sum != 10) {
                                        questionMarksCount = 0
                                        continue
                                }
                                results = if (questionMarksCount == 3)
                                        "true"
                                else
                                        "false"
                                questionMarksCount = 0
                        }
                } else if (i.toString() == "?") questionMarksCount++
        }
        return results
}
fun main(){
        println("QuestionsMarks: " + questionMarks("dft3???ll7d??23"))
}

