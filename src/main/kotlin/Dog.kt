class Dog(food:String, location:String, var loyalty:String) : Animal(food, location) {
    override fun eat(){
        println("Собака кушает")
    }
    override fun makeNoise(){
        println("Собака говорит гав")
    }
}