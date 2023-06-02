fun main(){
    var ce = arrayOf(Cat("криветки", "дом", 10), Dog("мясо", "будка", "верная"), Horse("овес", "загон" , true))
    var veter = Vet()
    for (anim in ce){
        veter.treatAnimal(anim)
    }
}