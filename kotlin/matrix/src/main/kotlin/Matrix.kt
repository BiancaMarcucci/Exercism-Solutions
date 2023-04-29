class Matrix(private val matrixAsString: String) {
     private val rows = matrixAsString.split("\n")
    fun column(colNr: Int=1):List<Int> {
        return rows.map{ row-> row.split(" ")[colNr-1].toInt()}
    }
    fun row(rowNr: Int=1): List<Int>{
        val row = rows[rowNr-1]
        return row.split(" ").map { str-> str.toInt() }
    }
}