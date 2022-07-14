package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val endereco1 = Endereco(logradouro = "Rua Vergueiro", cep = "00000-000")
    val endereco2 = Endereco(logradouro = "Rua Vergueiro", cep = "00000-000")

    println(endereco1.equals(endereco2))
    println(endereco1.hashCode())
    println(endereco2.hashCode())
}


