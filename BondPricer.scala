@main def run(): Unit =
 val rate = 0.05
 val faceValue = 1000.0
 val coupon = 50.0
 val maturity = 3

 val pv = presentValue(faceValue, coupon, maturity, rate)
 println(s"Present Value: $pv")
def presentValue(face: Double, coupon: Double, maturity: Int, rate: Double): Double =
 val cashflows = (1 to maturity).map: t=>
  if t < maturity then coupon
  else coupon + face

 cashflows.zipWithIndex.map: (cf, i) =>
  cf / math.pow(1 + rate, i+1) 
 .sum
