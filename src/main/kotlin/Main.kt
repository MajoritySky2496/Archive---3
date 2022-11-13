

fun main() {
    val archive = Archive()
    val archiveStore = ArchiveStore()
    val screenes = Screenes()
    val enter = Enter()
    var archiveGot = null

    while (true) {
        screenes.ShowMenu(1, screenes.create, archiveStore.nameOfArhive)//печатем создать архив
        screenes.ShowMenu(2, screenes.open, archiveStore.nameOfArhive)//печатеам открыть архив
        screenes.textExitShow(3) //печатаем выход

        when (enter.enterNumber()) {//сканер ввода пользователя
            10 -> {
                screenes.error(screenes.errorNumber)
                continue} //если пользователь ввел string возвращаем 10

            1 -> {// создается архив
                val archiveName = enter.enterWord()
                if (archiveStore.CheckingDuplicateKeyArchives(archiveName) == false){
                    continue
                }
                archiveStore.add(archiveName, Archive()) //добавляем код
                continue
            }
            2 -> {//открыть архив

                while (true) {
                    if (archiveStore.archives.isEmpty()) {
                        screenes.error(screenes.errorEmptyArhives)
                        break
                    } else
                        archiveStore.arhiveMenu()//Печатает все архивы
                    println("${archiveStore.archives.size + 1}. ${screenes.exit}")//Печатает выход
                    val name_of_arhive = enter.enterWord() // выбираем нужный архив
                    val archiveGot = archiveStore.get(name_of_arhive)
                    if (archiveGot == null){
                        screenes.error(screenes.errorEmptyArhives)
                    break//достаем нужный нам архив
                    }
                    when (name_of_arhive) { //сканер ввода пользователя

                        "${archiveStore.archives.size + 1}" -> break //если выход то брэйк

                        else -> //иначе печатем меню создания и выбора заметок
                            while (true) {
                                screenes.ShowMenu(1, screenes.create, archive.nameOfMenu)//печатем создать заметку
                                screenes.ShowMenu(2, screenes.open, archive.nameOfMenu)//печатеам открыть заметку
                                screenes.textExitShow(3) //печатаем выход
                                when (enter.enterNumber()) {
                                    1 -> {//создаем заметки
                                        val nameOfNote = enter.enterWord()//
                                        if (archiveGot.notes.get(nameOfNote) != null){//проверяем есть ли такая же заметка
                                            screenes.error(screenes.errorTheNoteExists)
                                            continue
                                        }
                                        println("Введите заметку")
                                        val bodyofNote = enter.enterWord()

                                        archiveGot?.addNote(
                                            nameOfNote,
                                            bodyofNote
                                        ) //создаем название заметки
                                        continue
                                    }
                                    2 -> {//показать заметки
                                        while (true) {
                                            if (archiveGot.notes.isEmpty()){
                                                screenes.error(screenes.errorEmptyNote)
                                                break
                                            }else
                                            archiveGot?.printNamesofNotes()//печатаем названия заметок для выбора заметки
                                            //печатаем выход
                                            println("${archiveGot?.notes?.size?.plus(1)}. ${screenes.exit}")
                                            val gotBodyNote = enter.enterWord()
                                            when (gotBodyNote) {
                                                "${archiveGot?.notes?.size?.plus(1)}" -> break
                                                else -> {
                                                    if (archiveGot.notes.get(gotBodyNote) == null) {
                                                        println("Ошибка такой заметки не существует")
                                                        continue
                                                    }
                                                    while (true) {
                                                        println(archiveGot?.getNote(gotBodyNote))
                                                        screenes.textExitShow(1)
                                                        when (enter.enterNumber()) {
                                                            1 -> break
                                                            10 -> {
                                                                screenes.error(screenes.errorEnter)
                                                                continue}
                                                            else -> {
                                                                screenes.error(screenes.errorEnter)
                                                                break}

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }

                                    3 ->//выход из создания заметок
                                        break
                                }
                            }
                    }

                }
            }
            3 -> break//выход из программы
            else -> screenes.error(screenes.errorEnter)
        }
    }
}












