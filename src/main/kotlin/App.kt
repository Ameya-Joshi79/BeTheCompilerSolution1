fun main(args:Array<String>){


    val ints = listOf(1, 2, 3, 4, 5)

    val pizzas = listOf(Pizza("Sunny Chicken", 4.5, 4),
    Pizza("Goat and Nut", 4.0, 1),
    Pizza("Tropical", 3.0, 2),
    Pizza("The Garden", 3.5, 3))


    /*
    This won't compile. Didn't find a value property for an Int Object
    val minInt = ints.minBy {
        it.value
    }
*/

    val minInt2 = ints.minBy({
        int:Int -> int
    })

    println("Minimum value is $minInt2")

    val sumInts = ints.sum()

    println("Sum of All Ints in this collection = $sumInts")


    val sumInts2 = ints.sumOf { it }

    println("Sum of All Ints in this collection using the sumOf Higher Order Function = $sumInts")

//    This won't compile since the sumOf function expects an Int parameter and not a Double
//    val sumInts3 = ints.sumOf({
//        number:Double -> number
//    })

    val sumInts4 = ints.sumOf { int:Int ->
        val x =int.toDouble()
        x
    }

    println("Sum of All Ints converted to Double in this collection using the sumOf -> Double Higher Order Function = $sumInts4")


    



}