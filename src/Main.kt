import entidades.Profissional
import entidades.Servico
import enumeradores.Genero
import enumeradores.Setor

fun main() {

    val instalacao : Servico = Servico(
        "100".toBigDecimal(),
        true,
        "05/10/2025",
        Profissional(
            "Sergio",
            30,
            "123.456.789-10",
            genero = Genero.HOMEM,
            true,
            true,
            "100".toBigDecimal(),
            setor = Setor.MONTAGEM
            )

        )

}