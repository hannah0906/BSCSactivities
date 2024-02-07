using System;

namespace UserAccountNamespace
{
    public abstract class UserAccount
    {
        private string full_name; //stores cashier's full name
        protected string user_name; //stores username
        protected string user_password; //stores password

        public UserAccount(string name, string uName, string password) //constructor for UserAccount class
        {
            this.full_name = name;
            this.user_name = uName;
            this.user_password = password;
        }

        public abstract bool validateLogin(string uName, string password); //abstract class for validating login credentials

        public string getFullname() //displays full name
        {
            return this.full_name;
        }

        public string UserName //properties for accessing username
        {
            get { return this.user_name; }
            set { this.user_name = value; }
        }

        public string UserPassword //properties for accessing password
        {
            get { return this.user_password; }
            set { this.user_password = value; }
        }
    }
}
