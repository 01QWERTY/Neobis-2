 fun main(args: Array<String>) {
        var i: Float
        var j: Float
        var k = 0f
        var l: Int
        val x = 2
        i = 0f
        while (i <= 2) {
            j = 1 + k
            while (j <= 3 + k) {
                if (i.toDouble() == 0.0 || i.toDouble() == 1.0) {
                    System.out.printf("I=%.0f J=%.0f\n", i, j)
                    j++
                    continue
                }
                System.out.printf("I=%.1f J=%.1f\n", i, j)
                j++
            }
            i += 0.2f
            k += 0.2f
        }
        l = 3
        while (l <= 5) {
            System.out.printf("I=%d J=%d\n", x, l)
            l++
        }
 }