
    class Screenes {
        val create = "Создать"
        val open = "Открыть"
        val exit = "Выход"
        val errorNumber = "Необходимо ввести номер пункта меню"
        val errorEmptyArhives = "Необходимо создать архив или выбрать существующий архив"
        val errorEmptyNote = "Создайте заметку"
        var errorTheNoteExists = "Такая заметка существует"
        var errorEnter = "Неверный ввод"

        fun ShowMenu(number: Int, menu: String, name: String){
            println("$number. $menu $name")
        }



        fun error(error:String){
            println(error)
        }

        fun textExitShow(number: Int) {
            println("3. $exit")
        }

        fun showMenuScreen(map: MutableMap<String, Archive>) {
            val map :MutableMap<String, MutableMap<String, Archive>> = mutableMapOf()
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
