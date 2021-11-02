
fun main() {
    println("\n*** Bridge Pattern Code***\n")

    val rifleman = Soldier(Rifle(), RegularLegs())
    val grenadier = Soldier(Grenade(), RegularLegs())
    val upgradedGrenadier = Soldier(GrenadePack(), RegularLegs())
    val upgradedRifleman = Soldier(MachineGun(), RegularLegs())
    val lightRifleman = Soldier(Rifle(), AthleticLegs())
    val lightGrenadier = Soldier(Grenade(), AthleticLegs())
}