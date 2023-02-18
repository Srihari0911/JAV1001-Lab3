/*
This assignment was done in group with Jobin Koodathinkal Jose(A00250653)
and myself Sri Hari Sreenivasan(A00272180)
We both did brainstorming in developing the logic and debugging the code.
*/

fun main() {
    do {
        val diceGame = DiceGame()
        diceGame.run()
        var repeat : String = "y"
        print("Do you want to continue (y/n)?")
        repeat = readln()
        println()
    }while (repeat != "n")
}
