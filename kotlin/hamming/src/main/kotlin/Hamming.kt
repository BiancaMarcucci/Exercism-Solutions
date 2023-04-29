object Hamming {
    fun compute(leftStrand: String, rightStrand: String): Int {
        var counter = 0
        if (leftStrand.length != rightStrand.length) {
            throw IllegalArgumentException("left and right strands must be of equal length")
        } else {
            if ((leftStrand == "") && (rightStrand == "")) {
                return 0
            }

            for (i in leftStrand.indices) {
                if (leftStrand[i] != rightStrand[i]) { counter++ }
            }
        }
        return counter
    }
}
