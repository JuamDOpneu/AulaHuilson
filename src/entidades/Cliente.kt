package entidades

import Conta
import enumeradores.Genero
import java.math.BigDecimal

class Cliente(
    nome: String,
    idade: Int,
    cpf: String,
    genero: Genero,
    val endereco: String,
    val pedido : Array<String>,
) : Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    genero = Genero.HOMEM

)