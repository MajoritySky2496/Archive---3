import java.util.*

class Archive() {
    val notes: MutableMap<String, String> = mutableMapOf()
    val nameOfMenu = "Заметки"

    fun addNote(name: String, body: String) {
        notes.put(name, body)
    }

    fun getNote(name: String): String {
        return notes.get(name).toString()
    }

    fun printNamesofNotes() {
        notes.forEach { entry ->
            println(entry.key)
        }
    }
}

