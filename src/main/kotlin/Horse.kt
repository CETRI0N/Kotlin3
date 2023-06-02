class Horse(food:String, location:String, var isWild:Boolean) : Animal(food, location) {
    override fun eat(){
        println("Лошадь кушает")
    }
    override fun makeNoise(){
        println("Лошадь фыркает")
    }

}