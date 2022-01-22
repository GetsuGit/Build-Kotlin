fun main() {

   // val range = 1..100
   val range = 100 downTo 1
   val range1 = 500 downTo 1 step 2

   println("Range : " + range)
   println("Range 1 : " + range1)
   println("Range count 1 : " + range1.count())

   println(range.count())
   println(range.contains(50))
   println(range.contains(200))
   println(range.first)
   println(range.last)
   println(range.step)

}