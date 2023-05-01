package com.example.solid

interface InterfaceSegregation {
        fun run()
    }

    interface Swimming {
        fun swim()
    }

    class Person : Runnable {
        override fun run() {
            println("Person is running")
        }
    }

    class Fish : Swimming {
        override fun swim() {
            println("Fish is swimming")
        }
}