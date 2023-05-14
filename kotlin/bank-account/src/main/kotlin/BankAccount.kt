class BankAccount {
    private var isOpened: Boolean = true
    private val lock = Any()
    var balance: Long? = 0
        get() {
            if (isOpened) {
                return field
            } else {
                throw IllegalStateException()
            }
        }

    fun adjustBalance(amount: Long) {
        synchronized(lock) {
            balance = this.balance?.plus(amount) ?: throw IllegalStateException()
        }
    }

    fun close() {
        synchronized(lock) {
            this.balance = null
            this.isOpened = false
        }
    }
}
