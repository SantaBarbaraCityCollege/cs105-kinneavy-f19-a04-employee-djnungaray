/**
 * CS 105 Theory and Practice I
 * CRN: [CHANGE THIS TO YOUR INFORMATION]
 * Assignment: Employee
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [DOMINIQUE NUNGARAY]
 */
package edu.sbcc.cs105;

/**
 * This class implements an emplyee which is a person with a name and a salary.
 *
 */
public class Employee {

    /**
     * Constructor that creates a new Employee with an initial name and salary.
     * 
     */
    
        private String employeeName;
        private double currentSalary;


        public Employee (String employeeName , double currentSalary){
            this.employeeName=employeeName;
            this.currentSalary=currentSalary;
         }

        
        public void raiseSalary(double byPercent) {
            double decimalPercent= byPercent/100;
            double increase=currentSalary*decimalPercent;
            currentSalary= increase + currentSalary;
        }
        public String getName () {
            return employeeName;
		
    }
        public double getSalary() {
            return currentSalary;
		
    }
       
}