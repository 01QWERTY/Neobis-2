import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    var amount = reader.nextDouble()

    print("NOTAS:\n")
    print("${(amount / 100).toInt()} nota(s) de R$ 100.00\n")
    amount = (amount % 100)

    print("${(amount / 50).toInt()} nota(s) de R$ 50.00\n")
    amount = (amount % 50)

    print("${(amount / 20 ).toInt()} nota(s) de R$ 20.00\n")
    amount = (amount % 20)

    print("${(amount / 10).toInt()} nota(s) de R$ 10.00\n")
    amount = (amount % 10)

    print("${(amount / 5).toInt()} nota(s) de R$ 5.00\n")
    amount = (amount % 5)

    print("${(amount / 2).toInt()} nota(s) de R$ 2.00\n")
    amount = (amount % 2)

    print("MOEDAS:\n")
    amount *= 100
    print("${(amount / 100).toInt()} moeda(s) de R$ 1.00\n")
    amount = (amount % 100)
    print("${(amount / 50).toInt()} moeda(s) de R$ 0.50\n")
    amount = (amount % 50)
    print("${(amount / 25).toInt()} moeda(s) de R$ 0.25\n")
    amount = (amount % 25)
    print("${(amount / 10).toInt()} moeda(s) de R$ 0.10\n")
    amount = (amount % 10)
    print("${(amount / 5).toInt()} moeda(s) de R$ 0.05\n")
    amount = (amount % 5)
    print("${(amount / 1).toInt()} moeda(s) de R$ 0.01\n")

}