public class Employee { // Class definition for Employee
    public static void main(String[] args) { // Main method where the program starts execution
        
        // Variable declarations and initializations
        int age = 29; // Employee's age
        boolean isManager = true; // Boolean indicating if the employee is a manager
        double yearsOfService = 2.5; // Number of years the employee has worked
        int baseSalary = 3000; // Employee's base monthly salary
        int overtimePayment = 49; // Extra payment for overtime work
        
        // Calculate total payment by adding base salary and overtime payment
        int totalPayment = baseSalary + overtimePayment;

        // Output the values to the console
        System.out.println(age); // Print the employee's age
        System.out.println(isManager); // Print whether the employee is a manager (true/false)
        System.out.println(yearsOfService); // Print the number of years the employee has worked
        System.out.println(totalPayment); // Print the total payment (base salary + overtime)
    }
}
