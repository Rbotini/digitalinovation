fun main() {

    ContaTipo.values().forEach {
        println(it.name)
        println(it.descricao)

        val pf = ContaTipo.PF
        println("${pf.descricao}")

        val pj = ContaTipo.PJ
        println("${pj.descricao}")
    }
}