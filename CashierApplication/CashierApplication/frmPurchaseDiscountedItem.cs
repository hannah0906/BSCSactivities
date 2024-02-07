using System;
using System.Windows.Forms;
using ItemNamespace; //allows the use the classes in ItemNamespace
using UserAccountNamespace; //allows the use of the classes in UserAccountNameSpace

namespace CashierApplication
{
    public partial class frmPurchaseDiscountedItem : Form
    {
        private frmLoginAccount login;
        private DiscountedItem dItem; //stores the DiscountedItem object

        public frmPurchaseDiscountedItem()
        {
            InitializeComponent();
        }

        private void compute_Click(object sender, EventArgs e)
        {
            string itemname1 = itemTxt.Text;

            if (string.IsNullOrWhiteSpace(itemTxt.Text)) //Validation 1
            {
                MessageBox.Show("Enter item name. Try Again.");
                return;
            }

            if (!double.TryParse(priceTxt.Text, out double price1) || price1 <= 0) //Validation 2
            {
                MessageBox.Show("Enter a valid and positive price. Try Again.");
                priceTxt.Clear();
                return;
            }

            if (!double.TryParse(discTxt.Text, out double discount1) || discount1 < 0 || discount1 > 100) //Validation 3
            {
                MessageBox.Show("Enter a valid discount between 0 and 100. Try Again.");
                discTxt.Clear();
                return;
            }

            if (!int.TryParse(quantityTxt.Text, out int quantity1) || quantity1 <= 0) //Validation 4
            {
                MessageBox.Show("Enter a valid quantity. Try Again.");
                quantityTxt.Clear();
                return;
            }

            dItem = new DiscountedItem(itemname1, price1, quantity1, discount1);  
            string totalPrice1 = dItem.getTotalPrice().ToString(); //gets total price from the discounted item
            amountLabel.Text = totalPrice1; //display total price in the label
        }

        private void submit_Click(object sender, EventArgs e)
        {
            if (!double.TryParse(payText.Text, out double payment1) || payment1 <= 0) //Validation 5
            {
                MessageBox.Show("Enter a valid payment amount. Try Again.");
                payText.Clear();
                return;
            }

            dItem.setPayment(payment1);
            string change1 = dItem.getChange().ToString(); //gets change from the discounted item
            changeTxt.Text = change1; //display change in the label

        }

        private void logoutToolStripMenuItem_Click(object sender, EventArgs e) //logs out the account
        {
            login = new frmLoginAccount();
            login.Show();
            Hide();
        }

        private void exitApplicationToolStripMenuItem_Click(object sender, EventArgs e) //exit the application
        {
            Application.Exit();
        }
    }
}
