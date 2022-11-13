class ArchiveStore {
    val archives: MutableMap<String, Archive> = mutableMapOf()
    val nameOfArhive = "Aрхивы"

    fun add(name: String, archive: Archive) {
        archives.put(name, archive)
    }

    fun get(name: String): Archive? {
        var arhive = archives.get(name)
        return arhive
    }
    fun arhiveMenu() {
        archives.forEach { entry ->
            println(entry.key)
        }
    }
    fun CheckingDuplicateKeyArchives(key: String):Boolean{
        if (archives.get(key) == null) {
            return true
        }
            else
                println("Ошибка такой архив уже существует")
                return false
    }
}