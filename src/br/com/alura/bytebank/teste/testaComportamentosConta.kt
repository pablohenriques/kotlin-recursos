package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    val alex = Cliente(nome = "Alex", cpf = "333.333.333-33", senha = 3)
    val fran = Cliente(nome = "Alex", cpf = "444.4444.444-44", senha = 4)

    val contaAlex = ContaCorrente(titular = alex, numero = 1000)
    contaAlex.deposita(200.0)

    val contaFran = ContaPoupanca(numero = 1001, titular = fran)
    contaFran.deposita(300.0)

    println(contaFran.titular.nome)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular.nome)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("TransferĂȘncia da conta da Fran para o Alex")

    if (contaFran.transfere(destino = contaAlex, valor = 300.0)) {
        println("TransferĂȘncia sucedida")
    } else {
        println("Falha na transferĂȘncia")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}