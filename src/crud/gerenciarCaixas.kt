package crud

import entidades.CaixaDAgua
import enumeradores.Material

fun cadastrarCaixas(){
    /*
    val capacidade: Int,
    val cor: String,
    val altura: Double,

    val largura: Double,
    val peso: Double,
    val tampa: Boolean,
    val material: Material,
    val modelo: String,
    FIBRA, PVC, POLIESTILENO,PLASTICO
     */
    println("escolha o material da qual a caixa é composta")
    println("1 - Plastico")
    println("2 - PVC")
    println("3 - Polietileno")
    val opcao = readLine()!!.toInt()
    var material : Material
    when (opcao) {

        1 -> material = Material.PVC
        2 -> material = Material.FIBRA
        3 -> material = Material.POLIESTILENO
        4 -> material = Material.PLASTICO
        else -> material = Material.PLASTICO
    }
    println("Capacidade da Caixa em Litros")
    val capacidade = readLine()!!.toInt()

    println("Qual a cor da Caixa?")
    val cor = readLine()!!.toString()

    println("Qual a Altura da Caixa")
    val altura = readLine()!!.toDouble()

    println("Qual a Largura da Caixa?")
    val largura = readLine()!!.toDouble()

    println("Qual o Peso da Caixa")
    val peso = readLine()!!.toDouble()



    //salvar as variaves dentro da classe
    CaixaDAgua(
        material = material,
        capacidade = capacidade,
        cor = cor,
        altura = altura,
        largura = largura,
        peso = peso,
    )


}
fun editarCaixas(){

}
fun listarCaixas(){}