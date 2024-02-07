using System;
using System.Windows.Forms;
using System.Text.RegularExpressions;


namespace _13TaskPerf
{
    public partial class FrmClubRegistration : Form
    {
        private ClubRegistrationQuery clubRegistrationQuery;
        private int ID, Age;
        private int count = 0;
        private string FirstName, MiddleName, LastName, Gender, Program;
        private long StudentId;

        public FrmClubRegistration()
        {
            InitializeComponent();
            PopulateComboBox();
        }

        private void buttonReg_Click(object sender, EventArgs e)
        {
            ID = RegistrationID();
            FirstName = tbFName.Text;
            MiddleName = tbMName.Text;
            LastName = tbLName.Text;

            // Validate Student ID
            if (!long.TryParse(tbStudID.Text, out StudentId) || StudentId <= 0)
            {
                MessageBox.Show("Invalid Student ID. Please enter a valid positive integer.");
                return;
            }

            // Validate Gender
            if (cbGender.SelectedIndex == -1)
            {
                MessageBox.Show("Please select a gender.");
                return;
            }
            else
            {
                Gender = cbGender.SelectedItem.ToString();
            }

            // Validate Program
            if (cbProg.SelectedIndex == -1)
            {
                MessageBox.Show("Please select a program.");
                return;
            }
            else
            {
                Program = cbProg.SelectedItem.ToString();
            }

            // Validate Age
            if (!int.TryParse(tbAge.Text, out Age) || Age <= 0 || Age >= 150)
            {
                MessageBox.Show("Invalid Age. Please enter a valid positive integer.");
                return;
            }

            // Validate Names
            if (String.IsNullOrWhiteSpace(FirstName) || String.IsNullOrWhiteSpace(MiddleName) || String.IsNullOrWhiteSpace(LastName))
            {
                MessageBox.Show("Please fill out all the name fields.");
                return;
            }

            if (!IsValidName(FirstName) || !IsValidName(MiddleName) || !IsValidName(LastName))
            {
                MessageBox.Show("Invalid name. Use only letters for the name fields.");
                return;
            }

            clubRegistrationQuery.RegisterStudent(ID, StudentId, FirstName, MiddleName, LastName, Age, Gender, Program);
        }

        private bool IsValidName(string name)
        {
            return !string.IsNullOrWhiteSpace(name) && Regex.IsMatch(name, @"^[a-z A-Z]+$");
        }

        private void buttonUpd_Click(object sender, EventArgs e)
        {
            FrmUpdateMember upd = new FrmUpdateMember();
            upd.Show();
        }

        private void buttonRef_Click(object sender, EventArgs e)
        {
            RefreshListOfClubMembers();
        }


        private void FrmClubRegistration_Load(object sender, EventArgs e)
        {
            clubRegistrationQuery = new ClubRegistrationQuery();
            RefreshListOfClubMembers();
        }

        public void RefreshListOfClubMembers()
        {
            clubRegistrationQuery.DisplayList();
            dataGridView1.DataSource = clubRegistrationQuery.bindingSource;
        }

        public int RegistrationID()
        {
            return count++;
        }

        private void PopulateComboBox()
        {
            string[] items = { "Female", "Male", "Others" };
            foreach (string item in items)
            {
                cbGender.Items.Add(item);
            }

            string[] item1 = { "BS Computer Science", "BS Tourism Management", "BS Information Technology", "BS Nursing", "BS Accountancy" };
            foreach (string items1 in item1)
            {
                cbProg.Items.Add(items1);
            }
        }
    }
}
