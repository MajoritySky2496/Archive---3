
    class Screenes {
        val create = "Создать "
        val open = "Открыть"
        val exit = "Выход"
        val error = "Ошибка, необходимо ввести номер пункта меню"

        fun textCreateShow(number: Int, name: String) {
            println("$number. $create $name")
        }



        fun textOpenShow(number:Int, name: String) {
            println("$number. $open $name")
        }

        fun textExitShow(number: Int) {
            println("3. $exit")
        }

        fun showMenuScreen(map: MutableMap<String, Archive>) {
            for (i in 0 until map.size) {
                map.forEach { entry ->
                    println("$i - ${entry.key} ")
                }
            }
        }

        fun shoeNoteScreen(map: MutableMap<String, String>) {
            for (i in 0 until map.size) {
                map.forEach { entry ->
                    println("i - ${entry.key} ")
                }
            }
        }
    }
