package org.example.ui

fun menu() {
    do {
        println("1 - Cadastrar caixa D'agua")
        println("2 - Editar Caixa D'Agua")
        println("3 - Listar caixa D'agua")
        println("4 - Deletar Caixa D'Agua")

        val opcao = readLine()!!.toInt()
        when (opcao) {
            1 -> ("1 cadastrar caixa...")
            2 -> ("2 editar Caixa...")
            3 -> ("3 listar caixa...")
            4 -> ("4 deletar caixa...")
            0 -> ("0 Sair...")
            else -> println("Opcao invalido")
        }

    } while (opcao != 0)
}