error id: file:///C:/Users/ADMB/scala-finance/BondPricer.scala:scala/math/package.pow().
file:///C:/Users/ADMB/scala-finance/BondPricer.scala
empty definition using pc, found symbol in pc: scala/math/package.pow().
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -math/pow.
	 -math/pow#
	 -math/pow().
	 -scala/Predef.math.pow.
	 -scala/Predef.math.pow#
	 -scala/Predef.math.pow().
offset: 878
uri: file:///C:/Users/ADMB/scala-finance/BondPricer.scala
text:
```scala
@main def run(): Unit =
 val rate = 0.05
 val faceValue = 1000.0
 val coupon = 50.0
 val maturity = 3

 val pv = presentValue(faceValue, coupon, maturity, rate)
 val dur = duration(faceValue, coupon, maturity, rate)
 println(s"duration: $dur")
 println(s"Present Value: $pv")
def presentValue(face: Double, coupon: Double, maturity: Int, rate: Double): Double =
 val cashflows = (1 to maturity).map: t=>
  if t < maturity then coupon
  else coupon + face

 cashflows.zipWithIndex.map: (cf, i) =>
  cf / math.pow(1 + rate, i+1) 
 .sum

def duration(face: Double, coupon: Double, maturity: Int, rate: Double): Double =
 val cashflows = (1 to maturity).map: t=> 
    if t < maturity then coupon 
    else coupon + face  
 val price = presentValue(face, coupon, maturity, rate)     
 val weightedSum =  cashflows.zipWithIndex.map: (cf, i) =>
  cf / math.pow@@(1 + rate, i+1) 
 .sum
 weightedSum / price
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/math/package.pow().