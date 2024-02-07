using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UserNamespace
{
    public class Administrator : User     //derived class Administrator, inheriting from the base class User
    {
        private string admin_name; //private field to store string admin name

        public Administrator(string name, string id, string pass) : base(id, pass) //constructor for the Administrator class, accepting name, ID, and password
        {
            this.admin_name = name;
        }

        public override void updatePassword(string newPassword) //implementation of the abstract class in the User class to update password
        {
            this.user_password = newPassword;
        }

        public void updateAdminName(string name) //method to update administrator name
        {
            this.admin_name = name;
        }
    }
}
