import java.util.*

class Archive() {
    val noteName = null
    val notes: MutableMap<String, String> = mutableMapOf()
    val nameOfMenu = "Заметки"
    val error = "Заметок нет, создайте их"



    fun addNote(name: String, body: String){
        notes.put(name, body)
    }

    fun getNote(name: String): String {
        return notes.getValue(name).toString()
    }

    fun printNamesofNotes() {
        notes.forEach { entry ->
            println(entry.key)
        }
    }


}

