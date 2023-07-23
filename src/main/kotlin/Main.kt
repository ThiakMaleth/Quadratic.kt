import kotlin.math.sqrt

// Solve the equation x3+7x2+10x = 0

fun main() {

    // x3+7x2+10x = 0
    // I factorize x out since it's common
    // x*(x2*7x+10) 0
    // x = 0
    // x2 * 7x + 10 = 0

    val a = 1.0
    val b = 7.0
    val c = 10.0
    val discriminant = b*b-4*a*c

    if(discriminant > 0){
        val root1 = (-b+ sqrt(discriminant))/(2*a)
        val root2 =  (-b- sqrt(discriminant))/(2*a)

        println("Root 1: $root1")
        println("Root 2: $root2")
    }

    else if(discriminant == 0.0){
        val root = -b/(2*a)

        println("Root: $root")
    }

    else{
        println( "x2 * 7x + 10 = 0 doesn't have real roots so x = 0.")
    }
}

