object ScrabbleScore {

    fun scoreLetter(c: Char): Int {
        val scoreLetterMap = mapOf(1 to "AEIOULNRST", 2 to "DG", 3 to "BCMP", 4 to "FHVWY", 5 to "K", 8 to "JX", 10 to "QZ")
        return scoreLetterMap.keys.forEach { score -> if (scoreLetterMap[score]?.contains(c.uppercaseChar()) == true) {return score} }.toString().toInt()
    }

    fun scoreWord(word: String): Int {
        var wordScore = 0
        word.forEach {character -> wordScore += scoreLetter(character)}
        return wordScore
    }
}
