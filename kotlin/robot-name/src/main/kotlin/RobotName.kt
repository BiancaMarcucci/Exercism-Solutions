import com.mifmif.common.regex.Generex

val alreadyTakenNames = mutableListOf<String>()

class Robot {

    private val generator = Generex("[A-Z]{2}\\d{3}")

    private var rName: String = generateName()
    val name: String
        get() = rName

    tailrec fun generateName(): String {
        val genName = generator.random().toString()
        if (!alreadyTakenNames.contains(genName)) {
            return when {
                alreadyTakenNames.add(genName) -> genName
                else -> generateName()
            }
        }
        return generateName()
    }

    fun reset() {
        this.rName = generator.random().toString()
    }

}
