using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UserNamespace
{
    public abstract class User //user abstract class
    {
        private string user_id; //private field to store string user id
        protected string user_password; //protected field to store string user password

        public User(string id, string pass) //constructor that initializes user id and password
        {
            this.user_id = id;
            this.user_password = pass;
        }
        public bool verifyLogin(string id, string pass) //method to verify id user id & password match
        {
            return user_id.Equals(id) && user_password.Equals(pass);
        }
        public abstract void updatePassword(string newPassword); //abstract method for updating the password

        public string userId //property to get and set user id
        {
            get { return this.user_id; }
            set { this.user_id = value; }
        }

        public string userPassword //property to get and set user password
        {
            get { return this.user_password; }
            set { this.user_password = value; }
        }
    }
}

