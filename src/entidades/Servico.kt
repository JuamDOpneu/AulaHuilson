package entidades

import java.math.BigDecimal

class Servico (
    val valorServico : BigDecimal,
    val materiais : Boolean,
    val diaInstal : String,
    val profissional : Profissional,
){
}