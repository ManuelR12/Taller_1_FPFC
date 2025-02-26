package object Multiplicacion {


  def PeasantAlgorithm(a: Int, b: Int): Int = {
    if (a == 0) 0
    else if (a % 2 == 0) PeasantAlgorithm(a / 2, b + b)
    else PeasantAlgorithm(a / 2, b + b) + b
  }

  def PeasantAlgorithmIt(a: Int, b: Int): Int = {
    var x = a
    var y = b
    var result = 0

    while (x > 0) {
      if (x % 2 != 0) result += y
      x /= 2
      y += y
    }
    result
  }

  def splitMultiply(a: Int, b: Int): Int = {
      val aStr = a.abs.toString
      val bStr = a.abs.toString
      var result = 0
      val m = math.max(aStr.length, bStr.length) / 2

      val divider = math.pow(10, math.max(aStr.length, bStr.length) - m).toInt

      val x = a / divider
      val y = a % divider

      val z = b / divider
      val w = b % divider
    
      x

    }
  }

  
