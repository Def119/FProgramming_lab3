@main def main():Unit = {
    println(Avg(6,31))
}

def Avg(num1: Int, num2:Int):Float = {
    var average: Float = num1.toFloat + num2.toFloat;
    return BigDecimal(average/2).setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat;
}