using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UserNamespace
{
    public abstract class User
    {
        private string user_id;
        protected string user_password;

        public User(string id, string pass)
        {
            this.user_id = id;
            this.user_password = pass;
        }

        public bool verifyLogin(string id, string pass)
        {
            return user_id.Equals(id) && user_password.Equals(pass);
        }
        public abstract void updatePassword(string newPassword);

        public string userId
        {
            get
            {
                return this.user_id;
            }
            set
            {
                this.user_id = value;
            }
        }

        public string userPassword
        {
           get
           {
               return this.user_password;
           }

            set
            {
                this.user_password = value;
            }
        }
    }
}

