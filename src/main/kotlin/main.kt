fun main() {
    val answer1 = "Piggy"
    val answer2 = "Ralph"
    val answer3 = "Jack"
    val answer4 = "Simon"
    val answer5 = "Roger"

    var answer:String
    var numCorrect:Int = 0

    println("What character is fat and wears glasses")
    answer = readln()
    if (answer.compareTo(answer1, true) == 0){
        numCorrect +=1
        println("Correct!")
    }
    else
        println("incorrect...")
    println("What character is considered the 'chief' of the children")
    answer = readln()
    if (answer.compareTo(answer2, true) == 0){
        numCorrect +=1
        println("Correct!")
    }
    else
        println("incorrect...")
    println("What character leads the choir")
    answer = readln()
    if (answer.compareTo(answer3, true) == 0){
        numCorrect +=1
        println("Correct!")
    }
    else
        println("incorrect...")
    println("What character faints in chapter one")
    answer = readln()
    if (answer.compareTo(answer4, true) == 0){
        numCorrect +=1
        println("Correct!")
    }
    else
        println("incorrect...")
    println("What character is know for being shy and introverted")
    answer = readln()
    if (answer.compareTo(answer5, true) == 0){
        numCorrect +=1
        println("Correct!")
    }
    else
        println("incorrect...")

    println("You got $numCorrect/5 right!")
}