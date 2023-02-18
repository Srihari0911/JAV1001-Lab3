/*
This assignment was done in group with Jobin Koodathinkal Jose(A00250653)
and myself Sri Hari Sreenivasan(A00272180)
We both did brainstorming in developing the logic and debugging the code.
*/

class DiceGame {
    fun run() {
        // Instances for the Die class for 3 different constructors
        val d6 = Die()
        val d20 = Die(20)
        val percentile = Die(10, "Percentile")

        println("Creating the default d6..")
        println("Creating the default d20..")
        println("Creating the default Percentile die(a special d10...)")
        // displaying the name and current value after rolling each dice
        println("The current side up for ${d6.name} is ${d6.currentSideUp}")
        println("The current side up for ${d20.name} is ${d20.currentSideUp}")
        println("The current side up for ${percentile.name} is ${percentile.currentSideUp}")
        println("------------------")
        println()

        // testing the roll function and displaying the new values
        d6.roll()
        println("Testing the roll method")
        println("Rolling the d6..")
        println("The new value is ${d6.currentSideUp}")

        d20.roll()
        println("Rolling the d20..")
        if(d20.currentSideUp == 20) {// if the dice gets the max value then prints special output
            println("YAY!! Its a 20")
        }
        else{
            println("The new value for ${d20.name} is ${d20.currentSideUp}")
        }

        percentile.roll()
        println("Rolling the Percentile..")
        println("The new value for ${percentile.name} is ${percentile.currentSideUp}")
        println("------------------")
        println()

        // Choose one Die object and set it to show it's highest value
        //d6
        println("Setting the ${d6.name} to show 6...")
        d6.currentSideUp = 6
        println("The side up is now ${d6.currentSideUp}.")

        //d20
        println("Setting the ${d20.name} to show 20...")
        d20.currentSideUp = 20
        println("The side up is now ${d20.currentSideUp}.")

        //Percentile(Special d10)
        println("Setting the ${percentile.name}(d10) to show 10...")
        d20.currentSideUp = 10
        println("The side up is now ${percentile.currentSideUp}.")
        println("------------------")
        println()

        // Create 5 six-sided dice. Roll each Die in a loop until you get 5 of a kind.
        // Count and display the number of rolls.
        println("Creating 5 d6..")
        val dice = List(5) { Die() }//creating a list of objects of the Die class
        var rolls = 0// variable to count the total number of rolls
        while (true) {
            rolls++
            dice.forEach { it.roll() }//lamda fn to call roll() in all objects in the list
            //another lamda fn in the if condition below to check if all the objects in the list have the
            //same value
            if (dice.all { it.currentSideUp == dice.first().currentSideUp }) {
                println("YAHTZEE! It took $rolls rolls get all the 5 d6 with same value..")
                break
            }
        }
    }

}
