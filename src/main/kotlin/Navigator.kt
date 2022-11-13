import java.util.*


//fun navigator() {
//
//    while (true) {
//        val menuMapStart: MutableMap<Int, String> = mutableMapOf(
//            0 to "Создание архива",
//            1 to "Выбор архива",
//            2 to "Завершение программы")
//        val menuStart = Menu(menuMapStart)
//        menuStart.printMenu()
//        val choice = Scanner(System.`in`).nextInt()
//        when (choice) {
//            0 -> while (true) {
//                val menuMapCreate: MutableMap<Int, String> = mutableMapOf(
//                    0 to "Создать архив",
//                    1 to "Завершение программы")
//                val menuCreate = Menu(menuMapCreate)
//                menuCreate.printMenu()
//                val choice1 = Scanner(System.`in`).nextInt()
//                when (choice1) {
//                    0 -> {
//                        println("Введите название Архива")
//                        ArhiveStore().add(Scanner(System.`in`).next(),Archive())
//                        continue
//                    }
//                    1 -> break
//                    2 -> {
//                        println("Ошибка введите вернуь цифру")
//                        continue
//                    }
//                }
//            }
//            1 ->while (true) {
//                val menuMapArhiveSelection: MutableMap<Int, String> = mutableMapOf(
//                    0 to "Выбор архива",
//                    1 to "Вернуться назад",)
//                val menuArhiveSelection = Menu(menuMapArhiveSelection)
//                menuArhiveSelection.printMenu()
//                val choice2 = Scanner(System.`in`).nextInt()
//                when (choice2) {
//                    0 -> {
//                        while (true) {
//                            val end = ArhiveStore().archives.size+1
//                            println("Введите цифру")
//                            for (i in 0 until ArhiveStore().archives.size) {
//                                println("$i - ${ArhiveStore().archives}")
//                            }
//
//                            println("$end - Меню")                    // печатем возврат назад
//                            val choice = Scanner(System.`in`).nextInt()
//                            if (choice == end) {
//                                break
//                            } else {
//                                // добавляет в ключ выбор пользователя
//                                while (true) {
//
//                                    val menuMapNote: MutableMap<Int, String> = mutableMapOf(
//                                        0 to "Создать заметку",
//                                        1 to "Показать заметки",
//                                        2 to "Вернуться назад",
//                                    )
//                                    val menuNote = Menu(menuMapNote)
//                                    menuNote.printMenu()
//                                    when (Scanner(System.`in`).nextInt()) {
//                                        0 -> {
//                                            println("Напишите заметку")
//                                            var note =
//                                                Note(Scanner(System.`in`).next()).name
//
//                                            notesList.add(note)
//                                            arhiveNote.put(arhiveKey, notesList)
//                                            arhiveNote.forEach { entry ->
//                                                println("${entry.key} - ${entry.value}")
//                                            }
//                                            notesList.clear()
//                                            continue
//                                        }
//                                        1 -> {
//                                            println(arhiveNote.getValue(arhiveKey))
//                                            continue
//                                        }
//                                        2 -> {
//                                            break
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                    1-> break
//                }
//            }
//            2 -> break
//            else -> {
//                println("Ошибка введите верную цифру")
//                continue
//            }
//        }
//
//
//    }
//}