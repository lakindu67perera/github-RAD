object main extends App{
def sumEven(n: Int): Int = {
  if (n <= 0) {
    0
  } else {
    val currentSum = if (n % 2 == 0) n else 0
    currentSum + sumEven(n - 1)
  }
}
println(sumEven(5))
}