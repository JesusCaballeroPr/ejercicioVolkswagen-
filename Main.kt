import java.util.*

fun main(){
    val SCAN = Scanner(System.`in`)
    println("¿Es la versión Camper Full Equip? (s/n)")
    val respuesta = SCAN.nextLine()
    val esFullEquip = respuesta.toLowerCase() == "s"

    val km = recogidaKm("Dígame cuántos km tiene su coche: ", 0, 1000000000)
    val perdida = perdidaPorKmCalifornia("El valor de segunda mano es: ", km, esFullEquip)
    println(perdida)
}

fun recogidaKm(mensaje: String, minimo:Int, maximo:Int):Int{
    val SCAN=Scanner(System.`in`)
    var valor=0
    var dato=false
    do {
        println(mensaje)
        dato=SCAN.hasNextInt()
        if (!dato){
            println("No es un carácter válido")
        }else{
            valor=SCAN.nextInt()
            if (valor< minimo||valor>maximo){
                println("Fuera de rango")
                dato=false
            }
        }
        SCAN.nextLine()
    }while (!dato)
    return valor
}

fun perdidaPorKmCalifornia(mensaje:String,km:Int, esFullEquip: Boolean):Float{
    var VOLKSWAGEN_CALIFORNIA = 73490
    if (esFullEquip) {
        VOLKSWAGEN_CALIFORNIA += 20000
    }
    val DESGASTE:Float=0.00001f
    var resultado = VOLKSWAGEN_CALIFORNIA - (VOLKSWAGEN_CALIFORNIA * DESGASTE * km)
    return resultado
}
