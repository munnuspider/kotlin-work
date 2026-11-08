// COMP2850 Portfolio: Week 5
// BankAccount class

package comp2850.banking

class StudentAccount(holder: String) : BankAccount(holder) {
    var iverdraft: Int = 0
        set(value) {
            require(value in 0..100) { "Overdraft must be between 0 and 100" }
            field = value
        }

    fun withdrawalsAllowed(): Boolean {
        return balance > -overdraft
    }

    override fun withdraw(amount: Int) {
        require(amount > 0) { "Withdrawal amount must be greater than 0" }
        require(balance - amount >= -overdraft) { "Insufficient funds for withdrawal" }
        balance -= amount
    }

    overrie fun toString(): String {
        return "StudentAccount(holder='$holder', balance=$balance, overdraft=$overdraft)"
    }
}
