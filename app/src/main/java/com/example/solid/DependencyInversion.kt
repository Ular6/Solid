package com.example.solid

interface DependencyInversion {

        fun makeSound()
    }

    class Dog : DependencyInversion {
        override fun makeSound() {
            println("Woof!")
        }
    }

    class Cat : DependencyInversion {
        override fun makeSound() {
            println("Meow!")
        }
    }

    class AnimalSound(private val animal: DependencyInversion) {
        fun createAnimalSound() {
            animal.makeSound()
        }
}