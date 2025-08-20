package entidades

import Conta
import enumeradores.Genero
import enumeradores.Setor
import java.math.BigDecimal

class Profissional (
    nome: String,
    idade: Int,
    cpf: String,
    genero : Genero,
    val ferramentas: Boolean,
    val locomocao: Boolean,
    val salario: BigDecimal,
    val setor: Setor


) : Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    genero = genero
    )


{
    override fun receberConta(conta: Conta, aPagar : BigDecimal) {
        conta.saldo = conta.saldo.subtract(aPagar)

    }
    //Comportamentos do Profissional
    fun instalarCaixaDAgua(clt : Profissional) {
        if(clt.setor.equals(Setor.MONTAGEM)) {
            println("Proficional habilitado")
        } else{
            println("Proficional desqualificado")
        }

    }

}