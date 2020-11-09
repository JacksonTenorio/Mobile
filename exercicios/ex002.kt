// 1.Crie funções para as 4 operações aritméticas básicas.
fun somar(valor1: int, valor2:int){
    println(valor1 + valor2)
}
fun subtrair(valor: int - valor2){
    println(valor1 - valor2)
}
fun multiplicar(valor1 * valor2){
    println(valor1 * valor2)
}
fun dividir(valor1 / valor2){
    println(valor1 / valor2)
}
somar(1, 1)
subtrair(2, 4)
multiplicar(10, 2)
dividir(10, 2)
/* 2.Utilizando a estrutura condicional, desenvolva um algoritmo que determine se uma pessoa é maior ou menor de idade. */
fun main(){
    val idade = 33
    if(idade >= 18){
        println("Você é de maior idade")
    }else{
        println("Você é de menor idade")
    }
}
/* 3. Utilizandoa estrutura condicional e operadores relacionais, desenvolva um algoritmo que identifica se um determinado número inteiro é par ou ímpar.*/
fun main(){
    val num = 3
    if(num % 2 == 0){
        println("O número $num é par.")
    }else{
        println("O número $num é ímpar.")
    }
}
/* 4. Utilizando a estrutura condicional e operadores lógicos, desenvolva um algoritmo que simule um sistema de login.*/
fun main(){
    val login = "jacksontenori"
    val senha = "12345678"
    if(login == "jacksontenori" && senha == "12345678"){
        println("Acesso permitido!")
    }else{
        println("Acesso negado!")
    }
}
// 5. Desenvolva uma função que calcula o IMC de uma pessoa, imprimir o valor do IMC e sua classificação.
fun main(){
    var peso = 75.3
    var altura = 1.87
    val imc = peso / (altura * altura)
    println("Seu imc é : $imc")
    if(imc < 18.5){
        println("Abaixo do peso.")
    }else if(imc >= 18.5 && imc < 25.0){
        println("Peso normal.")
    }else{
        println("Acima do peso")
    }
}
// 6.Utilizando o loop de repetição for, desenvolva um algoritmo que imprima qualquer tabuada.
fun main(){
    var tabuada = 5
    for(n in 0..10){
        println("$tabuada X $n = ${tabuada * n}")
    }
}