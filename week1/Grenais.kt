import java.util.*

fun main(args: Array<String>) {
  val sc = Scanner(System.`in`)

  var inter = 0
  var gremio = 0
  var empates = 0
  var total = 0
  var p = 1

  do {
   if (p == 1) {
    total++
    val i: Int = sc.nextInt()
    val g: Int = sc.nextInt()
    if (i > g) {
     inter++
    } else if (g > i) {
     gremio++
    } else {
     empates++
    }
   }
   println("Novo grenal (1-sim 2-nao)")
   p = sc.nextInt()
  } while (p != 2)
  println("$total grenais")
  println("Inter:$inter")
  println("Gremio:$gremio")
  println("Empates:$empates")

  if (inter > gremio) {
   println("Inter venceu mais")
  } else if (inter < gremio) {
   println("Gremio venceu mais")
  } else {
   println("Nao houve vencedor")
  }
 }