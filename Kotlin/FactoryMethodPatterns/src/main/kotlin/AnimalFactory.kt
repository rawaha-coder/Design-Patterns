class AnimalFactory private constructor(){
    companion object{
        fun create(animalType: String, animalBreed: String): Animal {
            var counter = 0
            val dogFactory = DogFactory()
            val catFactory = CatFactory()
            return when (animalType.toLowerCase()) {
                "cat" -> catFactory.createCat(animalBreed, ++counter)
                "dog" -> dogFactory.createDog(animalBreed, ++counter)
                else -> throw RuntimeException("Unknown animal $animalType")
            }
        }
    }
}






