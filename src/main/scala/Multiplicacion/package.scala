package object Multiplicacion {

  def PeasantAlgorithm(a: Int, b: Int): Int = {
    if (a == 0) 0
    else if (a % 2 == 0) PeasantAlgorithm(a / 2, b + b)
    else PeasantAlgorithm(a / 2, b + b) + b
  }

  def PeasantAlgorithmIt(a: Int, b: Int): Int = {
    def helper(a: Int, b: Int, acc: Int): Int = {
      if (a == 0) acc
      else if (a == 1) acc + b
      else if (a % 2 == 0) helper(a / 2, b + b, acc)
      else helper(a / 2, b + b, acc + b)
    }
    helper(a, b, 0)
  }

  def splitMultiply(a: Int, b: Int): Int = {
    if (a < 10 && b < 10) a * b

    else{
      val m = math.max(a.toString.length, b.toString.length) / 2

      val (x, y) = (a / math.pow(10, m).toInt, a % math.pow(10, m).toInt)
      val (z, w) = (b / math.pow(10, m).toInt, b % math.pow(10, m).toInt)

      val p1 = splitMultiply(x, z)
      val p2 = splitMultiply(y, w)
      val p3 = splitMultiply(x,w) + splitMultiply(y,z)

      println(s"a=$a, b=$b, m=$m, x=$x, y=$y, z=$z, w=$w, p1=$p1, p2=$p2, p3=$p3")

      p1 * math.pow(10, 2 * m).toInt + p3 * math.pow(10, m).toInt + p2
    }
  }

  def fastMultiply(a: Int, b: Int): Int = {
    if (a < 10 && b < 10) a * b

    else {
      val m = math.max(a.toString.length, b.toString.length) / 2

      val (x, y) = (a / math.pow(10, m).toInt, a % math.pow(10, m).toInt)
      val (z, w) = (b / math.pow(10, m).toInt, b % math.pow(10, m).toInt)

      val p1 = fastMultiply(x, z)
      val p2 = fastMultiply(y, w)
      val p3 = (p1 + p2) - fastMultiply(x - y, z - w)

      println(s"a=$a, b=$b, m=$m, x=$x, y=$y, z=$z, w=$w, p1=$p1, p2=$p2, p3=$p3")

      p1 * math.pow(10, 2 * m).toInt + p3 * math.pow(10, m).toInt + p2
    }
  }

}

  
