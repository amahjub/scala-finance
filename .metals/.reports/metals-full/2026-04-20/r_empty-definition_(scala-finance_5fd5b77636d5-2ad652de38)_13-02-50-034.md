error id: file:///C:/Users/ADMB/scala-finance/BondPricer.scala:local4
file:///C:/Users/ADMB/scala-finance/BondPricer.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -pv.
	 -pv#
	 -pv().
	 -scala/Predef.pv.
	 -scala/Predef.pv#
	 -scala/Predef.pv().
offset: 354
uri: file:///C:/Users/ADMB/scala-finance/BondPricer.scala
text:
```scala
class Bond(face: Double, Coupon:Double, maturity: Int, rate: Double):
@main def run(): Unit =
 val rate = 0.05
 val faceValue = 1000.0
 val coupon = 50.0
 val maturity = 3
 val myBond = Bond(1000.0, 50.0, 3, 0.05)
 val pv = presentValue(myBond, rate)
 val dur = duration(myBond, rate)
 println(s"duration1: $dur")
 println(s"Present Value1: $pv@@")
 
def presentValue(bond: Bond, rate: Double): Double =
 val cashflows = (1 to maturity).map: t=>
  if t < maturity then coupon
  else coupon + face

 cashflows.zipWithIndex.map: (cf, i) =>
  cf / math.pow(1 + rate, i+1) 
 .sum

def duration(bond: Bond, rate: Double): Double =
 val cashflows = (1 to maturity).map: t=> 
    if t < maturity then coupon 
    else coupon + face  
 val price = presentValue(face, coupon, maturity, rate)     
 val weightedSum =  cashflows.zipWithIndex.map: (cf, i) =>
  (i+1) * cf / math.pow(1 + rate, i+1) 
 .sum

 weightedSum / price
```


#### Short summary: 

empty definition using pc, found symbol in pc: 