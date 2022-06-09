package one.digitalinnovation.digiobank

data class Bank(
    val nome: String,
    val numero: Int
) {
    fun info() = "$nome - $numero"
}
