class CatFactory {
    fun createCat(breed: String, id: Int) = when (breed.trim().toLowerCase()) {
        "persian" -> Persian(id)
        "russian blue" -> RussianBlue(id)
        "siamese" -> Siamese(id)
        else -> throw RuntimeException("Unknown dog breed $breed")
    }
}

class Persian(override val id: Int) : Animal {
    override val name = "Persian Cat"
}

class RussianBlue(override val id: Int) : Animal {
    override val name = "RussianBlue Cat"
}

class Siamese(override val id: Int) : Animal {
    override val name = "Siamese Cat"
}
