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
