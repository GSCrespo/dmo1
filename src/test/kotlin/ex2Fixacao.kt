fun main() {
    println("Informe 1 numero")
    val a = readln().toDouble()

    println("Informe 2 numero")
    val b = readln().toDouble()

    println("Informe 3 numero")
    val c = readln().toDouble()

    if(isTriangle(a,b,c)){
        println("É triangulo")
    }else{
        println("Não é triangulo")
    }

    if(isEquilatero(a,b,c)){
        println("É triangulo equilatero")
    }else{
        if(isIsoceles(a,b,c)){
            println("É triangulo Isóceles")
        }else{
            if(isEscaleno(a,b,c)){
                println("É triangulo Escaleno")
            }
        }
    }



}

fun isTriangle(a:Double, b:Double, c:Double): Boolean{

    if(a + b > c || b + c > a || a + c > b){
        return true
    }
    return false
}

fun isEquilatero(a:Double, b:Double, c:Double): Boolean{

    if(a == b && a == c){
        return true
    }
    return false
}

fun isIsoceles(a:Double, b:Double, c:Double): Boolean{

    if((a == b && c != a && c != b) || (a == c && b != a && b != c) ){
        return true
    }
    return false
}


fun isEscaleno(a:Double, b:Double, c:Double): Boolean{

    if((a != b && c != a && b != c)){
        return true
    }
    return false
}