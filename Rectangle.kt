class Triangle() {
    var weight: Double = 1.0
    var height: Double = 1.0

    fun getInformationFromUser() {
        while (true) {
            println("Введите высоту равнобедренного треугольника")
            weight = readLine()!!.toDouble()

            if (weight > 0) {
                break
            }
        }

        while (true) {
            println("Введите основание равнобедренного треугольника")
            height = readLine()!!.toDouble()

            if (height > 0) {
                break
            }
        }
    }

    fun getSquare(): Double {
        return 0.5 * weight * height
    }

    fun getPerimeter(): Double {
        val c: Double = Math.sqrt(Math.pow((height / 2), 2.0) + Math.pow(weight, 2.0))
        return c + c + height
    }
}