object HandshakeCalculator {

    fun calculateHandshake(number: Int): List<Signal> {
        val listOfSignals = Signal.values().filter { sign -> ((number shr sign.ordinal and 1)==1)}
        if (number shr 4 and 1==1){
            return listOfSignals.reversed()
        }
        return listOfSignals
    }
}