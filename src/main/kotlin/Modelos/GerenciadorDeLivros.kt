package Modelos

class GerenciadorDeLivros {
    private val Livros: MutableList<Livro> = mutableListOf()

    fun adicionarLivro(livro: Livro) {
        Livros.add(livro)
        println("Livro adicionado com sucesso!")
    }

    fun visualizarLivros() {
        val livrosDisponiveis = Livros.filter { !it.emprestado }
        if (livrosDisponiveis.isNotEmpty()) {
            println("Livros Disponíveis:")
            for (livro in livrosDisponiveis) {
                println("Título: ${livro.titulo}")
                println("Autor: ${livro.autor}")
                println("-------------------------")
            }
        } else {
            println("Não existem livros disponíveis")
        }
    }

    fun realizarEmprestimo(titulo: String) {
        val livro = encontrarLivro(titulo)
        if (livro != null) {
            if (!livro.emprestado) {
                println("Empréstimo realizado com sucesso")
                livro.emprestado = true
            } else {
                println("O livro já está emprestado")
            }
        } else {
            println("Livro não encontrado em nossa biblioteca")
        }
    }

    fun realizarDevolucao(titulo: String) {
        val livro = encontrarLivro(titulo)
        if (livro != null) {
            if (livro.emprestado) {
                println("Livro devolvido com sucesso")
            } else {
                println("O livro não está emprestado")
            }
        } else {
            println("Livro não encontrado")
        }
    }

    private fun encontrarLivro(titulo: String): Livro? {
        return Livros.find { it.titulo.equals(titulo, ignoreCase = true) }
    }
}