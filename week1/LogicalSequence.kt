import java.util.*

    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        val firstInput = scan.nextInt()
        for (i in 0 until firstInput) {
            var cityOne = scan.nextInt()
            var cityTwo = scan.nextInt()
            val procentOne = scan.nextDouble()
            val procentTwo = scan.nextDouble()
            var check = 0
            scan.nextLine()
            while (cityOne <= cityTwo) {
                cityOne = (cityOne * (procentOne / 100.0 + 1.0)).toInt()
                cityTwo = (cityTwo * (procentTwo / 100.0 + 1.0)).toInt()
                if (check > 100) {
                    print("Mais de 1 seculo.\n")
                    break
                }
                check++
            }
            if (check <= 100) print("$check anos.\n")
        }
    }