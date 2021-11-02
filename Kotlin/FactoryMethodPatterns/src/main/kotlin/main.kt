fun main(args: Array<String>) {
    println("\n*** Factory Method Code ***\n")

    val animalTypes = listOf(
        "dog" to "bulldog",
        "dog" to "beagle",
        "cat" to "persian",
        "dog" to "poodle",
        "cat" to "russian blue",
        "cat" to "siamese"
    )

    for ((type, breed) in animalTypes) {
        val c = AnimalFactory.create(type, breed)
        println("${c.id} - ${c.name}")
    }

}





