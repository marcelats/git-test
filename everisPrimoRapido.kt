import java.util.Scanner

fun main(args: Array<String>) 
{
    val input = Scanner(System.`in`)
    val n = input.nextLine().toInt()
    var num: Int
    var mod = 0F
    for (i in 1..n) 
    {
        num = input.nextInt()
        for(j in (num-1) downTo 2 step 1)
        {
          if((num%j)<1) 
            {
              mod = (num%j).toFloat()
            }
        }
        if(mod.equals(0)) println("Prime") else println("Not Prime")
    }
}
