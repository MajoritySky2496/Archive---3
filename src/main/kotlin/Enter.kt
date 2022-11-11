import java.util.*

class Enter {

    fun enterNumber(): Int {
        println("Введите цифру")
        val enter = Scanner(System.`in`).nextInt()
        return enter
    }
    fun enterWord(): String{
        println("Введите текст")
        val enter = Scanner(System.`in`).next()
        return enter
    }
}