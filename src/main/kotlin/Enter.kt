
import java.util.*

class Enter {

    fun enterNumber(): Int {
        var enter:Int
        try {
            enter = Scanner(System.`in`).nextInt()
            return enter
        }catch (e: InputMismatchException){
            enter =10
        }
        return enter
    }


    fun enterWord(): String{
        println("Введите текст")
        val enter = Scanner(System.`in`).nextLine()
        return enter
    }
}