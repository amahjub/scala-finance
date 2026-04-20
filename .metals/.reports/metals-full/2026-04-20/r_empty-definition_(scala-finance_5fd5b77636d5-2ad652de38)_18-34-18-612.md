error id: file:///C:/Users/ADMB/scala-finance/BondPricer.scala:scala/Predef.println(+1).
file:///C:/Users/ADMB/scala-finance/BondPricer.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -println.
	 -println#
	 -println().
	 -scala/Predef.println.
	 -scala/Predef.println#
	 -scala/Predef.println().
offset: 291
uri: file:///C:/Users/ADMB/scala-finance/BondPricer.scala
text:
```scala

@main def run(): Unit =
 val rate = 0.05
 val myBond = Bond(1000.0, 50.0, 3)
 val ZeroBond = ZeroCouponBond(1000.0, 3)  
 val pv = price(myBond, rate)
 val dur = duration(myBond, rate)
 val pv2 = price(ZeroBond, rate)
 val dur2 = duration(ZeroBond.maturity.toDouble, rate)
 println@@(s"duration1: $dur")
 println(s"Present Value1: $pv")
 println(s"duration2: $dur2")
 println(s"Present Value2: $pv2")
sealed trait Instrument
case class Bond(face: Double, coupon:Double, maturity: Int) extends Instrument
case class ZeroCouponBond(face: Double, maturity: Int) extends Instrument
def presentValue(bond: Bond, rate: Double): Double =
 val cashflows = (1 to bond.maturity).map: t=>
  if t < bond.maturity then bond.coupon
  else bond.coupon + bond.face

 cashflows.zipWithIndex.map: (cf, i) =>
  cf / math.pow(1 + rate, i+1) 
 .sum
def price(inst: Instrument, rate: Double): Double = inst match
  case Bond(face, coupon, maturity) => 
    presentValue(Bond(face, coupon, maturity), rate)
  case ZeroCouponBond(face, maturity) => 
    face / math.pow(1 + rate, maturity)
def duration(bond: Bond, rate: Double): Double =
 val cashflows = (1 to bond.maturity).map: t=> 
    if t < bond.maturity then bond.coupon 
    else bond.coupon + bond.face  
 val weightedSum =  cashflows.zipWithIndex.map: (cf, i) =>
  (i+1) * cf / math.pow(1 + rate, i+1) 
 .sum

 weightedSum / price(bond, rate)
```


#### Short summary: 

empty definition using pc, found symbol in pc: 