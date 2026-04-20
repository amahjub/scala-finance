sealed trait Instrument
case class Bond(face: Double, coupon: Double, maturity: Int, rating : Option[String]) extends Instrument
case class ZeroCouponBond(face: Double, maturity: Int) extends Instrument

def presentValue(bond: Bond, rate: Double): Double =
  val cashflows = (1 to bond.maturity).map: t =>
    if t < bond.maturity then bond.coupon
    else bond.coupon + bond.face
  cashflows.zipWithIndex.map: (cf, i) =>
    cf / math.pow(1 + rate, i + 1)
  .sum

def price(inst: Instrument, rate: Double): Double = inst match
  case b: Bond => presentValue(b, rate)
  case ZeroCouponBond(face, mat) => face / math.pow(1 + rate, mat)

def duration(bond: Bond, rate: Double): Double =
  val cashflows = (1 to bond.maturity).map: t =>
    if t < bond.maturity then bond.coupon
    else bond.coupon + bond.face
  val weighted = cashflows.zipWithIndex.map: (cf, i) =>
    (i + 1) * cf / math.pow(1 + rate, i + 1)
  .sum
  weighted / price(bond, rate)
def describe(bond: Bond): String =
   val ratingStr = bond.rating.getOrElse("Unrated")
   s"${bond.face} face, ${bond.coupon} coupon, ${bond.maturity} years to maturity, rating: $ratingStr"
@main def run(): Unit =
  val rate = 0.05

  val bond = Bond(1000.0, 50.0, 3, Some("AA"))
  val zeroBond = ZeroCouponBond(1000.0, 3)
  val unratedBond = Bond(1000.0, 50.0, 3, None)

  println(s"Bond PV: ${price(bond, rate)}")
  println(s"Bond Duration: ${duration(bond, rate)}")
  println(s"Zero-Coupon PV: ${price(zeroBond, rate)}")
  println(s"Zero-Coupon Duration: ${zeroBond.maturity.toDouble}")
  println(s"Bond rating: ${describe(bond)}")
  println(s"Unrated Bond rating: ${describe(unratedBond)}")