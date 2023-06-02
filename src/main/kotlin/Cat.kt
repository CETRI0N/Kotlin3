class Cat(food:String, location:String, var cute:Int) : Animal(food, location) {
    override fun eat(){
        println("Кошка кушает")
    }
    override fun makeNoise(){
        println("Кошка говорит мяу")
    }
}