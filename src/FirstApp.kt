fun main (args:Array<String>){
    println("----------------Math Calculator------------------")
    println("enter your 1st integer")
    var x:Float = readLine()!!.toFloat()

    println("Enter your 2nd integer")
    var y:Float = readLine()!!.toFloat()

    var sum:Float?
    sum = x+y!!.toInt()
    println("Your Sum is " +sum)

    var sub:Float?
    sub = x-y!!.toInt()
    println("Your Subtraction is " +sub)

    var mul:Float?
    mul = x*y!!.toInt()
    println("Your multiplication is " +mul)

    var div:Double?
    div = x/y!!.toDouble()
    println("Your Div is " +div)


}