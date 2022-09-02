/**
 * @author chadrobbins - cerobbins@dmacc.edu
 * CIS 175 - Spring 2022
 * Sep 2, 2022
 */
package model;

/**
 * @author Chad Robbins - cerobbins
 * CIS175 - Fall 2021
 * Sep 2, 2022
 */
public class EmpBusinessLogic {

	public double calculateYearlySalary(Employee employee) {
        double yearlySalary = 0;
        yearlySalary = employee.getMonthlySalary() * 12;
        return yearlySalary;
	}	
   public double calculateAppraisal(Employee employee) {
        double appraisal = 0;
        if (employee.getMonthlySalary() < 10000) {
             appraisal = 500;
        } else {
             appraisal = 1000;
        }
        return appraisal;
   	}
   
   	public boolean isRetirementAge(Employee employee) {
   		if (employee.getAge() > 65) {
   			return true;
   		}
   		else return false;
   	}
   
}
