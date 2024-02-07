using System;
using System.Text.RegularExpressions;
using System.Windows.Forms;

namespace Inventory
{
    public partial class frmAddProduct : Form
    {
        private string _ProductName, _Category, _MfgDate, _ExpDate, _Description;
        private double _SellPrice;
        private int _Quantity;
        private BindingSource showProductList;

        public frmAddProduct()
        {
            InitializeComponent();
            showProductList = new BindingSource();
        }

        private void btnAddProduct_Click(object sender, EventArgs e)
        {

            if (string.IsNullOrWhiteSpace(richTxtDescription.Text)) //Validation 1: Description is empty
            {
                MessageBox.Show("Do not leave an empty field.");
                return;
            }

            string cat = cbCategory.SelectedItem?.ToString();
            if (string.IsNullOrEmpty(cat)) //Validation 2: No chosen category
            {
                MessageBox.Show("Please choose a category.");
                return;
            }

            try //try
                { //given code
                    _ProductName = Product_Name(txtProductName.Text);
                    _Category = cbCategory.Text;
                    _MfgDate = dtPickerMfgDate.Value.ToString("yyyy-MM-dd");
                    _ExpDate = dtPickerExpDate.Value.ToString("yyyy-MM-dd");
                    _Description = richTxtDescription.Text;
                    _Quantity = Quantity(txtQuantity.Text);
                    _SellPrice = SellingPrice(txtSellPrice.Text);
                    showProductList.Add(new ProductClass(_ProductName, _Category, _MfgDate, _ExpDate, _SellPrice, _Quantity, _Description));
                    gridViewProductList.AutoSizeColumnsMode = DataGridViewAutoSizeColumnsMode.Fill;
                    gridViewProductList.DataSource = showProductList;
                }

                catch (NumberFormatException nf) //displays error message when NumberFormatException occurs
                {
                    MessageBox.Show("Message: " + nf.Message);
                }

                catch (StringFormatException sf) //displays error message when StringFormatException occurs
                {
                    MessageBox.Show("Message: " + sf.Message);
                }

                catch (CurrencyFormatException cf) //displays error message when CurrencyFormatException occurs
                {
                    MessageBox.Show("Message: " + cf.Message);
                }

                finally
                {
                    txtProductName.Clear();
                    txtQuantity.Clear();
                    txtSellPrice.Clear();
                    richTxtDescription.Clear();
                }
        }

        private void frmAddProduct_Load(object sender, EventArgs e)
        {
            string[] ListOfProductCategory = new string[] //arraylist that contains the contents of the category combo box
            {
                "Beverages", "Bread/Bakery", "Canned/Jarred Goods", "Dairy", "Frozen Foods", "Meat", "Personal Care", "Other"
            };

            foreach (string category in ListOfProductCategory)
            {
                cbCategory.Items.Add(category);
            }
        }

        public string Product_Name(string name)
        {
            if (!Regex.IsMatch(name, @"^[a-zA-Z]+$"))
                throw new StringFormatException("Invalid Name. Only enter letters."); //exception 1: letters only are allowed
            return name;
        }

        public int Quantity(string qty)
        {
            if (!Regex.IsMatch(qty, @"^[0-9]+$"))
                throw new NumberFormatException("Invalid Quantity. Only enter numbers."); //exception 2: numbers only are allowed
            return Convert.ToInt32(qty);
        }

        public double SellingPrice(string price)
        {
            if (!Regex.IsMatch(price.ToString(), @"^(\d*\.)?\d+$"))
                throw new CurrencyFormatException("Invalid Price. Hint: Try this format 000.00"); //exception 3: only specified currency format is allowed
            return Convert.ToDouble(price);
        }

    class NumberFormatException : Exception //NumberFormatException
        {
            public NumberFormatException(string message) : base(message) { }
        }

        class StringFormatException : Exception //StringFormatException
        {
            public StringFormatException(string message) : base(message) { }
        }

        class CurrencyFormatException : Exception //CurrencyFormatException
        {
            public CurrencyFormatException(string message) : base(message) { }
        }
    }
}
