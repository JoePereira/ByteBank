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

    println(contaJoe.titular)
    println(contaJoe.numero)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

}

