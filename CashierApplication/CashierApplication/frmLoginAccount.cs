using System;
using System.Windows.Forms;
using UserAccountNamespace; //allows the use of the classes in the UserAccountNamespace
namespace CashierApplication {
    public partial class frmLoginAccount : Form {
        private frmPurchaseDiscountedItem itempurch;
        Cashier[] cashier;

        public frmLoginAccount()
        {
            InitializeComponent();
            cashier = new Cashier[] { //array of possible cashier credentials
            new Cashier("Hannah Mae Paulino", "IT Department", "hannah_22", "hannahbanana1"),
            new Cashier("Luke Hiroaki", "IT Department", "lucas_0603", "moon12"),
            new Cashier("Halo RIviere", "Culinary Department", "lethalocook", "cook_cashier1"),
            };
        }

        private void login_Click(object sender, EventArgs e)  {
            string user1 = usernameTxt.Text; 
            string pass1 = pwTxt.Text;
            bool found = false;

            pwTxt.PasswordChar = '•';

            if (!string.IsNullOrWhiteSpace(user1) || string.IsNullOrWhiteSpace(pass1)) { //Validation 1
                for (int i = 0; i < cashier.Length; i++) {
                    if (cashier[i].validateLogin(user1, pass1)) { //validates username and password if it match any of the elements in the array
                        MessageBox.Show("Welcome, " + cashier[i].getFullname() + " of " + cashier[i].getDepartment());
                        Hide(); //hides login form
                        itempurch = new frmPurchaseDiscountedItem();
                        itempurch.Show(); //shows discount form

                        found = true;
                    }
                }

                if (!found) { //Validation 2
                    MessageBox.Show("Invalid username or password.");
                    usernameTxt.Clear();
                    pwTxt.Clear();
                    return; }
            }

            else { //Validation 3
                MessageBox.Show("Enter your username or password.");
                return; }
        }
    }
}


