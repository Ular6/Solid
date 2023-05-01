package com.example.solid

open class LiskovSubstitution {
    open fun makeSound() {
        println("Generate animal sound")
    }

    class Dog : LiskovSubstitution() {
        override fun makeSound() {
            println("Woof woof")
        }
    }

    class Cat : LiskovSubstitution() {
        override fun makeSound() {
            println("Meow meow")
        }
    }

    fun animalSound(animal: LiskovSubstitution) {
        animal.makeSound()
    }
}