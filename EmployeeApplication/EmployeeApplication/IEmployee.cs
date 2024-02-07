using System;

namespace EmployeeInterface
{
    public interface IEmployee //IEmployee interface under Employee Interface
    {
        string FirstName { get; set; } //declare string property for first name
        string LastName { get; set; }   //declare string property for last name
        string Department { get; set; } //declare string property for department
        string JobTitle {  get; set; } //declare string property for job title
        double BasicSalary { get; set; } //declare string property for basic salary

        void computeSalary(int hoursWorked, double ratePerHour); //method for compute salary that takes two parameters
    }
}
