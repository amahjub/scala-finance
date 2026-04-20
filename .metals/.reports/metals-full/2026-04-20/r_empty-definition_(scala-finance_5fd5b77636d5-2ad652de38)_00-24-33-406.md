error id: file:///C:/Users/ADMB/scala-finance/BondPricer.scala:scala/collection/IndexedSeqOps#map().
file:///C:/Users/ADMB/scala-finance/BondPricer.scala
empty definition using pc, found symbol in pc: scala/collection/IndexedSeqOps#map().
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -cashflows/zipWithIndex/map.
	 -cashflows/zipWithIndex/map#
	 -cashflows/zipWithIndex/map().
	 -scala/Predef.cashflows.zipWithIndex.map.
	 -scala/Predef.cashflows.zipWithIndex.map#
	 -scala/Predef.cashflows.zipWithIndex.map().
offset: 846
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
 val weightedSum = cashflows.zipWithIndex.m@@ap: (cf, i) =>
(i+1) * cf / math.pow(1 + rate, i+1)  // time × discounted cashflow
 .sum
 weightedSum / price
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/collection/IndexedSeqOps#map().