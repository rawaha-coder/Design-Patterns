fun main(args: Array<String>) {
    println("\n*** Composite Pattern Code ***\n")

    val miller = Rifleman()
    val caparzo = Rifleman()
    val jackson = Sniper()
    val squad = Squad()
    squad.infantryUnits.add(miller)
    squad.infantryUnits.add(caparzo)
    squad.infantryUnits.add(jackson)
    println(squad.infantryUnits.size) // Prints 3
    println(squad.bulletsLeft()) // Prints 3

}

interface InfantryUnit : CanCountBullets

class Rifleman(initialMagazines: Int = 3) : InfantryUnit {
    private val magazines = List<Magazine>(initialMagazines) {
        Magazine(5)
    }
    override fun bulletsLeft(): Int {
        return magazines.sumBy { it.bulletsLeft() }
    }
}

class Sniper(initialBullets: Int = 50) : InfantryUnit {
    private val bullets = List(initialBullets) { Bullet() }
    override fun bulletsLeft() = bullets.size
}

class Squad(val infantryUnits: MutableList<InfantryUnit> = mutableListOf()) : CanCountBullets {
    constructor(vararg units: InfantryUnit) : this(mutableListOf()) {
        for (u in units) {
            this.infantryUnits.add(u)
        }
    }

    override fun bulletsLeft(): Int {
        return infantryUnits.sumBy { it.bulletsLeft() }
    }
}

class Bullet

class Magazine(capacity: Int) : CanCountBullets {
    private val bullets = List(capacity) { Bullet() }
    override fun bulletsLeft() = bullets.size
}

interface CanCountBullets {
    fun bulletsLeft(): Int
}