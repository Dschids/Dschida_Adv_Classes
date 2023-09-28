import java.text.DecimalFormat
// Employee class accepts a name, position, salary, payrate, and shift
class Employee(var name: String,
               var position: String,
               var salary: Boolean,
               var payRate: Double,
               var shift: Int){
    // set formatting for dollars with 2 decimal places
    val dollarFormat = DecimalFormat("$###,###.00")
    // display name, position, salary, payrate(formatted), and shift
    fun display(){
        println("Name: $name")
        println("Position: $position")
        println("Is Salary: $salary")
        println("Payrate: " + dollarFormat.format(payRate) + "/hour")
        println("Shift: $shift")
    }
    // accepts a double and calculates weekly pay
    fun calculate(hoursIn: Double){
        var weeklyPay = 0.00
        // check if employee is salary if true multiply payrate by 40 instead of hoursIn
        if (salary){
            weeklyPay = payRate * 40
        }
        // check if hoursIn is more than 40, if yes double all calculations for OT
        else if (hoursIn > 40){
            var oT = (hoursIn - 40) * 1.5
            var normaltime = 40
            // increases pay by 0, 5 or 10 percent based on shift
            when (shift){
                1 -> weeklyPay = payRate * normaltime
                2 -> weeklyPay = payRate * (normaltime + oT) * 1.05
                3 -> weeklyPay = payRate * (normaltime + oT) * 1.1
            }
        }
        // non salary under 40 hours pay calculation
        else {
            // increases pay by 0, 5 or 10 percent based on shift
            when (shift) {
                1 -> weeklyPay = payRate * hoursIn
                2 -> weeklyPay = payRate * hoursIn * 1.05
                3 -> weeklyPay = payRate * hoursIn * 1.1
            }
        }
        // prints out weeklypay(formatted)
        println("Weekly Pay: " + dollarFormat.format(weeklyPay) + "\n")

    }
}