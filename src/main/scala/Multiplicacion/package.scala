package object Multiplicacion {


  def PeasantAlgorithm(a: Int, b: Int): Int = {
    if (a == 0) 0
    else if (a % 2 == 0) PeasantAlgorithm(a / 2, b + b)
    else PeasantAlgorithm(a / 2, b + b) + b
  }

  def PeasantAlgorithmIt(a: Int, b: Int, count: Int): Int = {
    if (a == 0) count
    else if (a % 2 == 0) PeasantAlgorithmIt(a / 2, b + b, count)
    else PeasantAlgorithmIt(a / 2, b + b, count + b)
  }

  def PeasantItCall(a: Int, b: Int): Int = { PeasantAlgorithmIt(a, b, 0)}

  def splitMultiply(a: Int, b: Int): Int = {
    if (a < 10 || b < 10) a * b

    else{
      val m = (math.max(a.toString.length, b.toString.length) + 1) / 2
      val divider = math.pow(10, m).toInt

      val (x, y) = (a / divider, a % divider)
      val (z, w) = (b / divider, b % divider)

      val p1 = splitMultiply(x, z)
      val p2 = splitMultiply(y, w)

      val p3 = splitMultiply(x,w) + splitMultiply(y,z)

      println(s"a=$a, b=$b, m=$m, x=$x, y=$y, z=$z, w=$w, p1=$p1, p2=$p2, p3=$p3")

      p1 * math.pow(10, 2 * m).toInt + p3 * math.pow(10, m).toInt + p2
    }
  }
}

  
