class Squares(private val upperLimit: Int) {
    private val listOfNumbers = (1..upperLimit).toList()
    fun sumOfSquares(): Int {
       return listOfNumbers.sumOf { num -> num * num }
    }

    fun squareOfSum(): Int{
        return listOfNumbers.sum()*listOfNumbers.sum()
    }

    fun difference(): Int{
       return this.squareOfSum()-this.sumOfSquares()
    }
}
