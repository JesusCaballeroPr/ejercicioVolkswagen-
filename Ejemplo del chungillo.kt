fun main() {
    val PRIMERANY = 2018
    val acc_2018 = Array(12){(200..700).random()}
    val acc_2019 = Array(12){(200..700).random()}
    val acc_2020 = Array(12){(200..700).random()}
    val acc_2021 = Array(12){(200..700).random()}
    val acc_2022 = Array(12){(200..700).random()}

    val acc_2018_2022 = arrayOf(acc_2018, acc_2019, acc_2020, acc_2021, acc_2022)

    val accTotals = arrayOf(acc_2018.sum(), acc_2019.sum(), acc_2020.sum(), acc_2021.sum(), acc_2022.sum())

    println(acc_2018.contentToString())
    println(acc_2019.contentToString())
    println(acc_2020.contentToString())
    println(acc_2021.contentToString())
    println(acc_2022.contentToString())

/*    // opció 1: jugant amb els mètodes de la classe Array
    var total2018 = acc_2018.sum()
    var mitja2018 = acc_2018.average()
    println("Número total d'accidents any 2018: $total2018")
    println("Mitja d'accidents any 2018: $mitja2018")*/

    // opció 2: 'a mano'
/*  // GESTIONEM CADASCUN DELS ANYS DE FORMA INDIVIDUAL
    var totalAcc1822 = 0
    //2018
    var totalAcc2018 = 0
    for(accMes in acc_2018){
        totalAcc2018+=accMes
    }
    println("Total d'accidents de l'any 2018: $totalAcc2018")
    var mitjaAcc2018 = totalAcc2018/12.0
    println("Mitja d'accidents de l'any 2018: $mitjaAcc2018")

    //2019
    var totalAcc2019 = 0
    for(accMes in acc_2019){
        totalAcc2019+=accMes
    }
    println("Total d'accidents de l'any 2019: $totalAcc2019")
    var mitjaAcc2019 = totalAcc2019/12.0
    println("Mitja d'accidents de l'any 2019: $mitjaAcc2019")

    //2020
    var totalAcc2020 = 0
    for(accMes in acc_2020){
        totalAcc2020+=accMes
    }
    println("Total d'accidents de l'any 2020: $totalAcc2020")
    var mitjaAcc2020 = totalAcc2020/12.0
    println("Mitja d'accidents de l'any 2020: $mitjaAcc2020")

    totalAcc1822 = totalAcc2018 + totalAcc2019 + totalAcc2020
    var mitjaAcc1822 = totalAcc1822/36.0
    println("El total d'accidents entre els anys 2018 i 2020 és: $totalAcc1822")
    println("La mitja d'accidents entre els anys 2018 i 2020 és: $mitjaAcc1822")*/

/*    // com recòrrer l'estructura d'un array on a cada posició hi ha l'array d'un any: acc_2018, acc_2019...
    for(any in acc_2018_2022){
        for(mes in any){
            print("$mes ")
        }
        println()
    }*/

    var any=2018
    for(totalAccAny in accTotals) {
        println("Total accidents any $any: $totalAccAny")
        any++
    }

    var numAccidentsAnyAmbMesAccidents = accTotals.max()
    var posicioArrayNumAccidentsAnyAmbMesAccidents = accTotals.indexOf(numAccidentsAnyAmbMesAccidents)
    var anyAmbMesAccidents = PRIMERANY + posicioArrayNumAccidentsAnyAmbMesAccidents

    println("Any amb més accidents: $anyAmbMesAccidents, amb $numAccidentsAnyAmbMesAccidents")

    println("Any amb la mitja d'accidents més elevada va ser: $anyAmbMesAccidents, amb una mitja de ${numAccidentsAnyAmbMesAccidents/12.0}")

    /*    val arrDeArr = Array(4){Array(4){(0..10).random()} }

    for(i in arrDeArr){
        for(j in i){
            print("$j ")
        }
        println()
    }*/

}













