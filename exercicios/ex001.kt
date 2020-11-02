/* 1. Desenvolva um algoritmo que armazene seu nome em uma varável e imprima a 
mensagem "Olá, [nome]" utilizando a concatenação ou template string */
fun main(){
    var nome = "Jackson"
    var sobreNome = "Tenorio"
    val nomeCompleto = nome + " " + sobreNome
    println("Olá, $nomeCompleto")
}