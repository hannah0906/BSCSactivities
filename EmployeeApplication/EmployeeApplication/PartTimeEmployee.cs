using EmployeeInterface;
using System;

namespace EmployeeNamespace
{
    public class PartTimeEmployee : IEmployee //PartTimeEmployee class under Employee namespace
    {
        private string first_name; //stores first name
        private string last_name; //stores last name
        private string department; //stores department
        private string job_title; //stores job title
        private double basic_salary; //stores basic salary

        //decalres properties in the PartTimeEmployee class, implementing the IEmployee interface
        public string FirstName
        {
            get { return first_name; }
            set { this.first_name = value; }
        }

        public string LastName
        {
            get { return last_name; }
            set { this.last_name = value; }
        }

        public string Department
        {
            get { return department; }
            set { this.department = value; }
        }

        public string JobTitle
        {
            get { return job_title; }
            set { this.job_title = value; }
        }

        public double BasicSalary
        {
            get { return basic_salary; }
            set { this.basic_salary = value; }
        }

        public PartTimeEmployee(string FName, string LName, string dept, string job) //accepts four parameters
        {
            this.first_name = FName;
            this.last_name = LName;
            this.department = dept;
            this.job_title = job;
        }

        public void computeSalary(int hoursWorked, double ratePerHour) //computes the salary that accepts two parameter
        {
            basic_salary = hoursWorked * ratePerHour;
        }

        public double getSalary() //returns basic salary
        {
            return basic_salary;
        }
    }
}
