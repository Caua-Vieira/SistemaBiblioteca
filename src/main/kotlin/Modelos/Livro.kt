package Modelos

class Livro(
    val titulo: String,
    val autor: String,
    internal var emprestado: Boolean
) {
}