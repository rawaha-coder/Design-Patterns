fun main() {
    println("\n*** Prototype Pattern Code ***\n")

    val pc = Computer()

    println(pc)

    val powerPC = pc.copy(graphicCard = "nKCF 8999ZTXX", ram = "16GB BBR6")

    println(powerPC)
}

data class Computer(
    val motherboard: String = "Terasus XZ27",
    val cpu: String = "Until Atom K500",
    val ram: String = "8GB Microcend BBR5",
    val graphicCard: String = "nKCF 8100TZ"
)