object condicionales {

  def main(args: Array[String]): Unit = {
  
    val n = 5
    val m = 5

    if (n == 5) {
      println("Sí, n vale 5")
        if (m == n) {
            println("n y m son iguales y valen: "+n)
        }
        
    } else if (n == 6) {
        println("Vale 6")
    } else {
        println("Tiene otro valor")
    }
    
  }
  
}