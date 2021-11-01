fun main(args: Array<String>) {
    println("***\n Abstract Factory Code ***\n")

    val catHQ = CatHQ()
    val barracks1 = catHQ.buildBarracks()
    val barracks2 = catHQ.buildBarracks()
    val vehicleFactory1 = catHQ.buildVehicleFactory()

    val units = listOf(
        barracks1.build(InfantryUnits.RIFLEMEN),
        barracks2.build(InfantryUnits.ROCKET_SOLDIER),
        barracks2.build(InfantryUnits.GRENADIER),
        vehicleFactory1.build(VehicleUnits.TANK),
        vehicleFactory1.build(VehicleUnits.APC),
        vehicleFactory1.build(VehicleUnits.HEAVY_TANK)
    )

    for (unit in units){
        println(unit.toString())
    }
}