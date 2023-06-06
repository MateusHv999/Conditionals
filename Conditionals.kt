package com.example.variaveis

class Conditionals {
}

fun main() {
  var numero = 10 // vai retornar par por que 10/2 = 5 restando 0
    if (numero %2 == 0){ // usando if e else
        println("O número é par")

    }else{
        println("O número é impar")
    }
}

/*fun main(){
    var numero1 = 9 // vai retornar impar por que 9/2 sobra 1
    when{ // usando when e else
        numero1 %2 == 0  -> println("O número é par")
        else -> println("O ssnúmero é impar")
    }
}*/