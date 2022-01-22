fun main() {

   tailrec fun display(value: Int) {
      println("Recursive $value")
      if (value > 0){
         display(value - 1)
      }
   }

   display(10000)


   // factorial tail recursive
   tailrec fun factorialRec(value: Int, total: Int = 1): Int{
      return when (value){
         1 -> total
         else -> factorialRec(value - 1, total * value)
      }
   }

   println(factorialRec(5))
}