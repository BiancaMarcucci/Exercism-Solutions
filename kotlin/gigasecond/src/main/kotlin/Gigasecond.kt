
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.temporal.ChronoUnit

class Gigasecond {
    private val giga = 1_000_000_000L
    val date: LocalDateTime

    constructor(localGivenDate: LocalDate) {
        date = LocalDateTime.of(localGivenDate, LocalTime.MIN).plus(giga, ChronoUnit.SECONDS)
    }
    constructor(localGivenDateTime: LocalDateTime) {
        date = localGivenDateTime.plus(giga, ChronoUnit.SECONDS)
    }
}
