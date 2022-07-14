package br.com.alura.bytebank
import br.com.alura.bytebank.modelo.*
import br.com.alura.bytebank.teste.testaCopiasEReferencias
import testaAutenticacao
import testaContasDiferentes


fun main() {
    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaPoupanca(titular = alex, numero = 1000)
    testaContasDiferentes()

    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)
    println("nome cliente: ${fran.nome}")
    println("Total de Contas: ${Conta.total}")
}
