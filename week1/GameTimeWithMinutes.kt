import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    val a:Int = scan.nextInt()
    val b:Int = scan.nextInt()
    var c:Int = scan.nextInt()
    val d:Int = scan.nextInt()


    if (a >= c && b >= d) c += 24
    val hours:Int = abs((c * 60 + d)-(a * 60 + b)) / 60
    val minutes:Int = abs((c * 60 + d)-(a * 60 + b)) % 60

    print("O JOGO DUROU $hours HORA(S) E $minutes MINUTO(S)\n")

}