class CatHQ : Headquarters {
    private val buildings = mutableListOf<Building<*, Unit>>()
    override fun buildBarracks(): Building<InfantryUnits, Infantry> {
        val b = object : Building<InfantryUnits, Infantry>{
            override fun build(type: InfantryUnits): Infantry {
                return when(type){
                    InfantryUnits.RIFLEMEN -> Rifleman()
                    InfantryUnits.ROCKET_SOLDIER -> RocketSoldier()
                    InfantryUnits.GRENADIER -> Grenadiers()
                }
            }
        }
        buildings.add(b)
        return b
    }

    override fun buildVehicleFactory(): Building<VehicleUnits, Vehicle> {
        val vf = object : Building<VehicleUnits, Vehicle>{
            override fun build(type: VehicleUnits): Vehicle {
                return when(type){
                    VehicleUnits.APC -> APC()
                    VehicleUnits.TANK -> Tank()
                    VehicleUnits.HEAVY_TANK -> HeavyTanks()
                }
            }
        }
        buildings.add(vf)
        return vf
    }
}