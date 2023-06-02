open class Animal(var food:String, var location:String) {
    open fun makeNoise(){}
    open fun eat(){}
    fun sleep(){
        println("Это животное спит")
    }
}