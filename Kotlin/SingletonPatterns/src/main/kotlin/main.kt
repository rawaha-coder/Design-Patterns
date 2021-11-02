object Singleton{

    init {
        println("Singleton class invoked.")
    }
    var variableName = "I am Var"
    fun printVarName(){
        println(variableName)
    }

}

fun main(args: Array<String>) {
    Singleton.printVarName()
    Singleton.variableName = "New Name"

    var a = A()
}

class A {

    init {
        println("Class init method. Singleton variableName property : ${Singleton.variableName}")
        Singleton.printVarName()
    }
}