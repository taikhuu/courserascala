package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
      print(pascal(col, row))
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(r==0) {
      if (c == 0)
         1
      else
        0;
    }else if(r<0){
      0
    }else {
      pascal(c-1,r-1) + pascal(c, r - 1)
    }
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    var total=0;
    chars.foreach((a:Char)=>{
      if(a.equals('(')){
        total = total+1;
      }else if(a.equals(')')){
        total = total-1;
        if(total<0){
          return false;
        }
      }
    })
    println(total)
    if(total==0){
      return true;
    }else{
      return false;
    }
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money == 0) 1
    else if (money < 0) 0
    else if (coins.isEmpty) 0
    else countChange(money, coins.tail) + countChange(money - coins.head, coins)
  }
}
