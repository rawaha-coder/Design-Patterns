class Soldier(private val weapon: Weapon, private val legs: Legs) : Infantry {

    override fun attack(point: Long) {
        weapon.causeDamage()
    }
    override fun move(moveRight: Long, moveTop: Long) {
        legs.move()
    }
}

interface Infantry{
    fun move(moveRight: Long, moveTop: Long)
    fun attack(point: Long)
}

interface Weapon {
    fun causeDamage(): PointsOfDamage
}
interface Legs {
    fun move(): Meters
}

typealias PointsOfDamage = Long
typealias Meters = Int

class Grenade : Weapon {
    override fun causeDamage() = GRENADE_DAMAGE
}
class GrenadePack : Weapon {
    override fun causeDamage() = GRENADE_DAMAGE * 3
}
class Rifle : Weapon {
    override fun causeDamage() = RIFLE_DAMAGE
}
class MachineGun : Weapon {
    override fun causeDamage() = RIFLE_DAMAGE * 2
}

class RegularLegs : Legs {
    override fun move() = REGULAR_SPEED
}
class AthleticLegs : Legs {
    override fun move() = REGULAR_SPEED * 2
}

const val GRENADE_DAMAGE : PointsOfDamage = 5L
const val RIFLE_DAMAGE = 3L
const val REGULAR_SPEED : Meters = 1