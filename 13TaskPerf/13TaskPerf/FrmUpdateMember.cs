using System;
using System.Data.SqlClient;
using System.Text.RegularExpressions;
using System.Windows.Forms;

namespace _13TaskPerf
{
    public partial class FrmUpdateMember : Form
    {
        private ClubRegistrationQuery clubRegistrationQuery;
        public FrmUpdateMember()
        {
            InitializeComponent();
            Populate();
        }

        private void FrmUpdateMember_Load(object sender, EventArgs e)
        {
            clubRegistrationQuery = new ClubRegistrationQuery(); 
            clubRegistrationQuery.displayID(_cbStudID);
        }

        private void _cbStudID_SelectedIndexChanged(object sender, EventArgs e)
        {
            clubRegistrationQuery.SetStudentInfo(_cbStudID.SelectedItem.ToString());
            _tbFName.Text = clubRegistrationQuery._FirstName;
            _tbMName.Text = clubRegistrationQuery._MiddleName;
            _tbLName.Text = clubRegistrationQuery._LastName;
            _tbAge.Text = clubRegistrationQuery._Age.ToString();
            _cbGender.SelectedItem = clubRegistrationQuery._Gender;
            _cbProg.SelectedItem = clubRegistrationQuery._Program;
        }

        private void buttonConfirm_Click(object sender, EventArgs e)
        {
            if (ValidateInputs())
            {
                if (clubRegistrationQuery.UpdateStudent(long.Parse(_cbStudID.SelectedItem.ToString()), _tbFName.Text, _tbLName.Text, _tbMName.Text,
                    int.Parse(_tbAge.Text), _cbGender.SelectedItem.ToString(), _cbProg.SelectedItem.ToString()))
                {
                    Close();
                }
            }
        }

        private void Populate()
        {
            string[] items = { "Female", "Male", "Others" };
            foreach (string item in items)
            {
                _cbGender.Items.Add(item);
            }

            string[] item1 = { "BS Computer Science", "BS Tourism Management", "BS Information Technology", "BS Nursing", "BS Accountancy" };
            foreach (string items1 in item1)
            {
                _cbProg.Items.Add(items1);
            }
        }

        private bool ValidateInputs()
        {
            if (string.IsNullOrWhiteSpace(_tbFName.Text) || string.IsNullOrWhiteSpace(_tbLName.Text) ||
                string.IsNullOrWhiteSpace(_tbMName.Text) || string.IsNullOrWhiteSpace(_tbAge.Text) ||
                _cbGender.SelectedItem == null || _cbProg.SelectedItem == null)
            {
                MessageBox.Show("All fields are required.");
                return false;
            }

            int Age;
            if (!int.TryParse(_tbAge.Text, out Age) || Age <= 0 || Age >= 150)
            {
                MessageBox.Show("Invalid Age. Please enter a valid positive integer.");
                return false;
            }

            if (!IsValidName(_tbFName.Text) || !IsValidName(_tbLName.Text) || !IsValidName(_tbMName.Text))
            {
                MessageBox.Show("Invalid name. Use only letters for the name fields.");
                return false;
            }
            return true;
        }

        private bool IsValidName(string name)
        {
            return !string.IsNullOrWhiteSpace(name) && Regex.IsMatch(name, @"^[a-z A-Z]+$");
        }
    }
}
