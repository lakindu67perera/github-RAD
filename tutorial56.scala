object main extends App{
def fibonacci(n: Int): Unit = {
  def fibonacciHelper(n: Int, a: Int, b: Int): Unit = {
    if (n > 0) {
      print(a + " ")
      fibonacciHelper(n - 1, b, a + b)
    }
  }

  fibonacciHelper(n, 0, 1)
}
fibonacci(10)
}