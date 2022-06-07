import java.math.BigDecimal

fun main() {

    val pessoa = Funcionario(nome = "Renato Botini", cpf = "35583337800", BigDecimal.valueOf(2000.50))

    println(pessoa.nome)
    println(pessoa.cpf)
    println(pessoa.salario)
}