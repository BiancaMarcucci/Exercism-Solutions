data class MatrixCoordinate(val row: Int, val col: Int)

class Matrix(private val matrix: List<List<Int>>) {

    private val matrixDims = listOf(matrix.size, matrix[0].size)
    private val setOfCoords = mutableSetOf<MatrixCoordinate>()

    fun saddlePoints(): MutableSet<MatrixCoordinate> {

        val transpose = transposeMatrix()

        for (i in matrix.indices) {
            for (j in 0 until matrix[0].size) {

                if (matrix[i][j] == matrix[i].max() && transpose[j][i] == transpose[j].min()) {
                    setOfCoords.add(MatrixCoordinate(i + 1, j + 1))
                }
            }
        }
        return setOfCoords

    }

    private fun transposeMatrix(): Array<IntArray> {
        val transpose = Array(matrixDims[1]) { IntArray(matrixDims[0]) }
        for (i in matrix.indices) {
            for (j in 0 until matrix[0].size) {
                transpose[j][i] = matrix[i][j]
            }
        }
        return transpose
    }
}