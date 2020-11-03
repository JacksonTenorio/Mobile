/* 1. Desenvolva um algoritmo que armazene seu nome em uma varável e imprima a 
mensagem "Olá, [nome]" utilizando a concatenação ou template string */
fun main(){
    var nome = "Jackson"
    var sobreNome = "Tenorio"
    val nomeCompleto = nome + " " + sobreNome
    println("Olá, $nomeCompleto")
}
/* 2. Desenvolva um  algoritmo com duas variáveis do tipo Double e imprima a soma das
mesma*/
fun main(){
    val A: Double = 45.69
    val B: Double = 32.01
    println( A+ B)
}
// 3. Desenvolva um algoritmo que imprima o dobro dele mesmo.
fun main (){
    var num = 4
    println (num * num)
}
// 4. Desenvolva um algoritmo que imprima o dobro de um número.
fun main(){
    var num = 8
    var multi = num * 2
    println("O dobro de $num é $multi".)
}

/* 5. Desenvolva um algoritmo que utilize os operadores aritméticos e imprima o antecessor e o sucessor de um número */
fun main(){
    var num = 4
    var ant = num - 1
    var suc = num + 1
    println("O antecessor de $num é $ant e o seu sucessor é $suc.)
}
/* 6.Desenvolva um algoritmo que calcule e imprima o total de dias em 7 meses, considerando que cada mês tem 30 dias.*/ 
fun main(){
    var qntmeses = 7
    var totaldias = qntmeses * 30
    println("Sete meses tem um total de $totaldias dias.)
}
// 6. Desenvolva um algoritmo que calcule e imprima a média das cinco notas de um aluno. 
fun main(){
    val port = 7
    val mat = 8
    val geo = 6
    val hist = 6.5
    val bio = 8.5
    var med = (port + mat + geo + hist + bio) / 5
    println("A média das notas do aluno é $med.")
}