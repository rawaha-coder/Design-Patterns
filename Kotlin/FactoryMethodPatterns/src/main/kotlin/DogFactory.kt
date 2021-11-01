class DogFactory {
    fun createDog(breed: String, id: Int) = when (breed.trim().toLowerCase()) {
        "beagle" -> Beagle(id)
        "bulldog" -> Bulldog(id)
        "poodle" -> Poodle(id)
        else -> throw RuntimeException("Unknown dog breed $breed")
    }
}

class Poodle(override val id: Int) : Animal {
    override val name = "Poodle Dog"
}

class Beagle(override val id: Int) : Animal {
    override val name = "Beagle Dog"
}

class Bulldog(override val id: Int) : Animal {
    override val name = "Bulldog Dog"
}