fun main(args: Array<String>) {
    // creating variables of class Employee, using Enum for position .name to convert it to a string
    var emp1 = Employee("Johnny Box O Donuts", PositionTitle.SALES.name, true, 35.00, 1)
    var emp2 = Employee("Susie Creamcheese", PositionTitle.MAINTENANCE.name, false, 21.50, 2)
    var emp3 = Employee("Joe Shmo", PositionTitle.PRODUCTION.name, false, 23.00, 3)
    // runs display and calculate functions for each employee
    emp1.display()
    emp1.calculate(45.0)
    emp2.display()
    emp2.calculate(50.0)
    emp3.display()
    emp3.calculate(35.0)
}