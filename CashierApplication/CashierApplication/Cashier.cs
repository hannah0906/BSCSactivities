using System;

namespace UserAccountNamespace
{
    public class Cashier : UserAccount
    {
        private string department; //stores the department

        public Cashier(string name, string department, string uName, string password) : base(name, uName, password) //constructor for the cashier class
        {
            this.department = department;
        }

        public override bool validateLogin(string uName, string password) //overidden method for validating login credentials
        {
            return UserName.Equals(uName) && UserPassword.Equals(password);
        }

        public string getDepartment() //displays department
        {
            return department;
        }
    }
}
