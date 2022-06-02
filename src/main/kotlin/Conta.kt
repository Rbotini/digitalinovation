import java.math.BigDecimal

class Conta (

  val agencia:String,
  val conta: String,
  val saldo: BigDecimal = BigDecimal(2.568)


        ){

    fun deposito(valor:BigDecimal){

    }
    fun saque(valor:BigDecimal){

    }
    fun consulta(agencia:String, conta: String): BigDecimal {
        println("Seu saldo é $saldo")
        return saldo

    }
}