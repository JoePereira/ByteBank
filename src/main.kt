fun main() {
    println("Bem vindo ao ByteBank")
    val contaJoe = Conta()
    contaJoe.titular = "Joe"
    contaJoe.numero = 1000
    contaJoe.saldo = 200.0

    val contaJuli = Conta()
    contaJuli.titular = "Juli"
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
    contaJoe.saca(270.0)

    if(contaJuli.transfere(100.0, contaJoe)){
        println("Trnasferência concluída com sucesso")
    }else {
        println("Falha na trnasferência")
    }

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        println("Depositando na conta de ${titular}")
        this.saldo += valor
        println(saldo)
    }

    fun saca(valor: Double) {
        if(saldo >= valor){
            println("Sacando $valor da conta de ${titular}")
            this.saldo -= valor
            println(saldo)
        } else{
            println("Não foi possível sacar $valor. Saldo insuficiente")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean{
        if(saldo >= valor) {
            println("Transferência da conta de $titular para ${destino.titular}")
            saldo -= valor
            destino.saldo += valor
            println("Saldo conta $titular: $saldo")
            println("Saldo conta ${destino.titular}: ${destino.saldo}")
            return true
        }
        return false
    }


}


