import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    var a:Double = scan.nextDouble()
    var b:Double = scan.nextDouble()
    var c:Double = scan.nextDouble()
    var temp:Double
    if (a < b) {
        temp = a;
        a = b;
        b = temp;
    }
    if (b < c) {
        temp = b;
        b = c;
        c = temp;
    }
    if (a < b) {
        temp = a;
        a = b;
        b = temp;
    }
    
    if (a >= b + c) {
        print("NAO FORMA TRIANGULO\n");
    }
    else if (a * a == b * b + c * c) {
        print("TRIANGULO RETANGULO\n");
    }
    else if (a * a > b * b + c * c) {
        print("TRIANGULO OBTUSANGULO\n");
    }
    else if (a * a < b * b + c * c) {
        print("TRIANGULO ACUTANGULO\n");
    }

    if (a == b && b == c) {
        print("TRIANGULO EQUILATERO\n");
    }
    else if (a == b || b == c) {
        print("TRIANGULO ISOSCELES\n");
    }
}