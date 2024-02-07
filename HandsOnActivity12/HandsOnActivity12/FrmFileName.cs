using System;
using System.Windows.Forms;

namespace HandsOnActivity12
{
    public partial class FrmFileName : Form
    {

        public static string SetFileName;

        public FrmFileName()
        {
            InitializeComponent();
        }

        private void btnOkay_Click(object sender, EventArgs e)
        {
            string fileName = txtFileName.Text;

            if (string.IsNullOrWhiteSpace(fileName)) //Validation 1: Null File Name
            {
                MessageBox.Show("File name cannot be empty.", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }

            if (!System.Text.RegularExpressions.Regex.IsMatch(fileName, @"^[a-zA-Z0-9()\-_]+$")) //vValidation 2: Invalid File Name
            {
                MessageBox.Show("Invalid characters in the file name. Only letters, numbers, (), -, and _ are allowed.");
                return;
            }

            SetFileName = fileName + ".txt";
            Close();
        }
    }
}
