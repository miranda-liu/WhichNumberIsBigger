package com.example.whichnumberisbigger2

//in Java, when you had a class that had no Android functionality, it was called a POJO
//POJO = Plain Old Java Object

class BiggerNumberGame(val lowerLimit: Int, val upperLimit: Int) {
    var leftNumber = 0
    var rightNumber = 0
    var score = 0

    //init block gets run once when object first gets constructed
    //usually used for complex calculations to set the initial state of the object
    init{
        generateRandomNumbers()
    }

    //need a function to generate random numbers
    fun generateRandomNumbers() {
        //give two unique numbers for leftNumber and rightNumber between upper and lower limits inclusive
        leftNumber = (Math.random() * 100 + 1).toInt()
        rightNumber = (Math.random() * 100 + 1).toInt()
        while(leftNumber == rightNumber){
            leftNumber = (Math.random() * 100 + 1).toInt()
        }
    }

    //need a function to check the answer, update the scores, and return a message
    //fun methodName(paramVar : paramType) : returnType
    fun checkAnswer(answer: Int) : String {
        //decide if answer was bigger or not
        //adjust score accordingly
        //return a message for MainActivity to Toast
        if(answer == leftNumber){
            return if(answer > rightNumber){
                score ++
                generateRandomNumbers()
                "Good job :)"
            } else{
                score --
                generateRandomNumbers()
                "Wrong choice :("
            }
        }
        else{
            return if(answer > leftNumber){
                score ++
                generateRandomNumbers()
                "Good job :)"
            } else{
                score --
                generateRandomNumbers()
                "Wrong choice :("
            }
        }
    }
}