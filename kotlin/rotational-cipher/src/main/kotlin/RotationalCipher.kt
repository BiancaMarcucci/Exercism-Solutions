class RotationalCipher(private val key: Int) {

    private val uppers = CharRange('A', 'Z').toList()
    private val lowers = CharRange('a', 'z').toList()
    fun encode(text: String): String {
        val newText = ""
        return text.mapNotNull { char ->
            when (char.code) {
                in (97..122) -> newText + lowers[(lowers.indexOf(char) + key) % 26]
                in (65..90) -> newText + uppers[(uppers.indexOf(char) + key) % 26]
                else -> newText + char
            }
        }.joinToString("")
    }
}
