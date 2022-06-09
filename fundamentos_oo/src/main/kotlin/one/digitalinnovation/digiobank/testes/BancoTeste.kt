package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.Bank

fun main() {
    val digiOneBank = Bank("DigiOne", 118)

    println(digiOneBank.info())

    val bank2 = digiOneBank.copy(nome = "Banco2", numero = 345)

    println(bank2.info())
}