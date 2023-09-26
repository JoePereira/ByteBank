fun main() {
    println("Bem vindo ao ByteBank")
    val contaJoe = Conta()
    contaJoe.titular = "Joe"
    contaJoe.numero = 1000
    contaJoe.saldo = 200.0

    val contaJuli = Conta()
    contaJuli.titular = "Jujuba"
    contaJuli.numero = 1001
    contaJuli.saldo = 300.0

    println(contaJuli.titular)
    println(contaJuli.numero)
    println(contaJuli.saldo)
    contaJuli.deposita(50.0)

    println(contaJoe.titular)
    println(contaJoe.numero)
    println(contaJoe.saldo)
    contaJoe.deposita(70.0)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        println("Depositando na conta do ${titular}")
        this.saldo += valor
        println(saldo)
    }

}


