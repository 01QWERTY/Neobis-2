import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    var amount:Int = scan.nextInt()
    while (amount > 0) {
        var one:Float = scan.nextFloat()
        var two:Float = scan.nextFloat()
        var three:Float = scan.nextFloat()

        var out:Float= (one*2 + two*3 + three*5 ) / 10
        print("%.1f\n".format(out))
        amount--
    }
}