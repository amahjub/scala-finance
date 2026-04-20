error id: file:///C:/Users/ADMB/scala-finance/BondPricer.scala:scala/collection/IterableOnceOps#sum().
file:///C:/Users/ADMB/scala-finance/BondPricer.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -scala/Predef.
	 -scala/Predef#
	 -scala/Predef().
offset: 464
uri: file:///C:/Users/ADMB/scala-finance/BondPricer.scala
text:
```scala
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
 .su@@m

def duration(face: Double, coupon: Double, maturity: Int, rate: Double): Double =
 val cashflows = ???  // same cashflow logic as presentValue
 val price = ???      // call presentValue here
 val weightedSum = cashflows.zipWithIndex.map: (cf, i) =>
  ???  // (i+1) * discounted cashflow
 .sum
 weightedSum / price
```


#### Short summary: 

empty definition using pc, found symbol in pc: 