interface Unit

interface Building<in UnitType, out ProducedUnit>
        where UnitType : Enum<*>, ProducedUnit : Unit {
    fun build(type: UnitType): ProducedUnit
}

interface Headquarters {
    fun buildBarracks(): Building<InfantryUnits, Infantry>
    fun buildVehicleFactory(): Building<VehicleUnits, Vehicle>
}

interface Infantry : Unit
class Rifleman : Infantry{
    override fun toString(): String {
        return this.javaClass.simpleName
    }
}
class RocketSoldier : Infantry{
    override fun toString(): String {
        return this.javaClass.simpleName
    }
}
class Grenadiers : Infantry{
    override fun toString(): String {
        return this.javaClass.simpleName
    }
}
enum class InfantryUnits {
    RIFLEMEN,
    ROCKET_SOLDIER,
    GRENADIER
}

interface Vehicle : Unit

class APC : Vehicle { //APC: Armored Personnel Carriers
    override fun toString(): String {
        return this.javaClass.simpleName
    }
}
class Tank : Vehicle{
    override fun toString(): String {
        return this.javaClass.simpleName
    }
}
class HeavyTanks : Vehicle{
    override fun toString(): String {
        return this.javaClass.simpleName
    }
}
enum class VehicleUnits {
    APC,
    TANK,
    HEAVY_TANK
}