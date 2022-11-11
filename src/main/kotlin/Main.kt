

fun main() {
    val archive = Archive()
    val archiveStore = ArchiveStore()
    val screenes = Screenes()
    val enter = Enter()
    var archiveGet: Archive? = null

    while (true) {
        screenes.textCreateShow(1, archiveStore.nameOfArhive)
        screenes.textOpenShow(2, archiveStore.nameOfArhive)
        screenes.textExitShow(3)
        when (enter.enterNumber()) {
            1 -> {
                archiveStore.add(enter.enterWord(), Archive())
                continue
            }
            2 -> {
                archiveStore.arhiveMenu()
                println("${archiveStore.archives.size+1}. ${screenes.exit}")
                while (true){
                    when(enter.enterWord()){

                        "${archiveStore.archives.size+1}" -> break

                        else ->
                            while (true) {
                                screenes.textCreateShow(1,archive.nameOfMenu)
                                screenes.textOpenShow(2, archive.nameOfMenu)
                                screenes.textExitShow(3)
                                when(enter.enterNumber()) {
                                    1->{

                                        archiveGet = archiveStore.get(enter.enterWord())
                                        archiveGet?.addNote(enter.enterWord(), enter.enterWord())
                                        continue
                                    }
                                    2->{
                                        archiveGet?.printNamesofNotes()
                                        continue
                                    }
                                    3->
                                        break
                                }
                            }
                    }
                }
            }
            3 -> break
            else -> screenes.error
        }
    }
}


