package Main

import Modelos.GerenciadorDeLivros
import Modelos.Livro

fun main() {

    val livro = Livro(titulo = "Memórias Póstumas de Brás Cubas", autor = "Machado de Assis", emprestado = false)
    val livro2 = Livro(titulo = "Como ser cristão", autor = "CS.Lewis", emprestado = false)
    val livro3 = Livro(titulo = "Mayombe", autor = "Pepetela", emprestado = false)

    val sistema = GerenciadorDeLivros()

    sistema.adicionarLivro(livro)
    sistema.adicionarLivro(livro2)
    sistema.adicionarLivro(livro3)
    println("-----------------------\n")

    sistema.visualizarLivros()
    sistema.realizarEmprestimo("Como ser cristão")
    println("-----------------------\n")
    sistema.realizarDevolucao("Como ser cristão")
    sistema.realizarDevolucao("Mayombe")
}