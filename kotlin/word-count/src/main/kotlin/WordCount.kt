import java.util.Collections

object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        val lowerPhraseWords =
            phrase.lowercase().replace(Regex("[^\\w']"), " ").trim().split(Regex("\\s+")).map { it -> it.trim('\'') }
        val frequencyMap = mutableMapOf<String, Int>()
        lowerPhraseWords.forEach { word ->
            if (word.isNotBlank()) {
                frequencyMap[word] =
                    Collections.frequency(lowerPhraseWords, word)
            }
        }
        return frequencyMap
    }
}