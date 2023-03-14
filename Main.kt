import kotlinx.coroutines.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

suspend fun main() {
    var numberFunctions: Int;

    while (true) {
        println("Введите количество функций")
        numberFunctions = readLine()!!.toInt()

        if (numberFunctions > 0) {
            break
        }
    }

    val rec: Triangle = Triangle();

    for (i in 1..numberFunctions) {
        val a = GlobalScope.launch {
            rec.getInformationFromUser()

            println("Площадь: ${rec.getSquare()}")
            println("Периметр: ${rec.getPerimeter()}")
            delay(1500L)
        }

        println("$i треугольник")
        a.join()
    }
}

