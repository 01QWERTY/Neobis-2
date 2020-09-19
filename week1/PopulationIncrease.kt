import java.util.*

    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        val gen = scan.nextInt()
        val amount = scan.nextInt()

        for (i in 1 until amount + 1) {
            print("$i ")
            if (i % gen == 0 ) print("\n")
        }
    }