/*
This assignment was done in group with Jobin Koodathinkal Jose(A00250653)
and myself Sri Hari Sreenivasan(A00272180)
We both did brainstorming in developing the logic and debugging the code.
*/

import kotlin.random.Random

class Die {
    var name: String = "d6"
    var numSides: Int = 6
    var currentSideUp: Int = 1

    constructor() {//default constructor
        roll()
    }

    constructor(numSides: Int) {// constructor for d20
        this.numSides = numSides
        this.name = "d$numSides"
        roll()
    }

    constructor(numSides: Int, type: String) {//constructor for percenttile(d10)
        this.numSides = numSides
        this.name = type
        roll()
    }

    fun roll() {// method to generate random value for the die
        currentSideUp = Random.nextInt(1, numSides + 1)
    }
}
