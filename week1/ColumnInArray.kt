import java.util.*

 fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)
  val matrix = Array(12) { DoubleArray(12) }
  val column: Int = sc.nextInt()
  sc.nextLine()
  val operation: String = sc.next()
  var result = 0.0
  for (row in matrix.indices) {
   for (col in matrix.indices) {
    matrix[row][col] = sc.nextDouble()
    if (col == column) {
     result += matrix[row][column]
    }
   }
  }
  if (operation == "M") {
   result /= 12.0
  }
  System.out.printf("%.1f%n", result)
 }