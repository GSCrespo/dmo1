
fun main() {

    println("Informe 1 numero")
    val num1 = readln().toInt()

    println("Informe 2 numero")
    val num2 = readln().toInt()

    if(isQuadrado(num1,num2)){
        println("É um quadrado")
    }else{
        println("É um retangulo")
    }
}

fun isQuadrado(a:Int,b:Int): Boolean{

    if(a == b){
        return true
    }
    return false;
}