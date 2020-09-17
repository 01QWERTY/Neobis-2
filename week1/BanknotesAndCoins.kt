import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    val arr = arrayOf<Int>(100, 50, 20, 10, 5, 2, 1)
    var integer:Int = reader.nextInt()
    print("$integer\n")
    for (i in 0..arr.size - 1) {
        println("${integer / arr[i]} nota(s) de R$ ${arr[i]},00")
        integer -= (integer / arr[i]) * arr[i]
    }

}