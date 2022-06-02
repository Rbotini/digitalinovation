class Pessoa {

    var nome : String = "Renato"

    var idade: Int = 38

    var cpf:String = "35583337800"
    private  set
}

fun main() {

    var pessoa = Pessoa()
    println("Seu nome é ${pessoa.nome} sua idade: ${pessoa.idade}")
    println(pessoa.cpf)

    var conta = Conta("255", "00102030")

    conta.consulta("255","01020305060")




}