package one.digitalinnovation.digiobank

class Pessoa {
    var nome: String = "Niceu"
    var cpf: String = "123.456.789-00"
        private set

    constructor()

    fun uneNomeCpf() = "Nome $nome e CPF $cpf"
}

fun main() {
    val person = Pessoa()
    println(person.nome)
    println(person.uneNomeCpf())
}