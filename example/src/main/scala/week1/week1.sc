
def abs(x: Double): Double = if(x < 0) -x else x

def isGoodEnough(guess: Double, x: Double): Boolean = {
  abs(guess * guess - x) < 0.0001
}

def improve(guess: Double, x: Double): Double = {
  (guess + x / guess) / 2
}
def sqrtIter(guess: Double, x: Double): Double = {
  if(isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)

}


def sqrt(x: Double) = sqrtIter(1.0, x)


sqrt(1e-7)