object reto{
    def main(args: Array[String]): Unit = {
        println(factorial(6))
    }
    def factorial(i:Int): Int={
        if(i==0) 1 else i*factorial(i-1)
    }
}