fun main(args: Array<String>) {
    println("\n*** Decorator Pattern Code ***\n")

    val sadHappy = HappyMap(SadMap<String, String>())

    sadHappy["one"] = "one"
    sadHappy["two"] = "two"
    sadHappy["two"] = "three"
    sadHappy["a"] = "b"
    sadHappy.remove("a")


    println(sadHappy is MutableMap<*, *>) // True
    println(sadHappy is HappyMap<*, *>) // True
    println(sadHappy is SadMap<*, *>) // False

}

class SadMap<K, V>: HashMap<K, V>() {
    override fun remove(key: K): V? {
        println("Okay...")
        return super.remove(key)
    }
}

class HappyMap<K, V>(private val map: MutableMap<K, V> = mutableMapOf()) : MutableMap<K, V> by map {
    override fun put(key: K, value: V): V? {
        return map.put(key, value).apply {
            this?.let { println("Yay! $key") }
        }
    }
}