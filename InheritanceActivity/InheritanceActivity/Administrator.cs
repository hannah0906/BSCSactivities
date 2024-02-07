using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UserNamespace
{
    public class Administrator : User
    {
        private string admin_name;


        public Administrator(string name, string id, string pass) : base(id, pass)
        {
            this.admin_name = name;
        }

        public override void updatePassword(string newPassword)
        {
            user_password = newPassword;
        }

        public void updateName (string name)
        {
            this.admin_name = name;
        }

        public string adminName
        {
            get
            {
                return this.admin_name;
            }
            set
            {
                this.admin_name = value;
            }
        }
    }
}
  