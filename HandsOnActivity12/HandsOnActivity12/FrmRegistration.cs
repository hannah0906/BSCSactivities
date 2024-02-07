using System;
using System.IO;
using System.Text.RegularExpressions;
using System.Windows.Forms;

namespace HandsOnActivity12
{
    public partial class FrmRegistration : Form
    {

        public FrmRegistration()
        {
            InitializeComponent();

            //initialize dropdown lists for programs and gender
            string[] programs = new string[]
            {
                "BS Information Technology", "BS Computer Science", "BS Nursing", "BS Management Accounting", "BS Accountancy"
            };

            for (int i = 0; i < programs.Length; i++)
            {
                cboxprog.Items.Add(programs[i].ToString());
            }

            string[] gender = new string[]
            {
                "Male", "Female"
            };

            for (int i = 0; i < gender.Length; i++)
            {
                cboxGender.Items.Add(gender[i].ToString());
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string mysNummber = txtstud.Text;
            string mylName = txtLname.Text;
            string mymName = txtMname.Text;
            string myfName = txtFname.Text;
            string myAge = txtAge.Text;
            string myContact = txtContact.Text;

            //Validation 1: Empty Fields
            if (string.IsNullOrWhiteSpace(mysNummber) || string.IsNullOrWhiteSpace(mylName) || string.IsNullOrWhiteSpace(mymName)
                || string.IsNullOrWhiteSpace(myfName) || string.IsNullOrWhiteSpace(myAge) || string.IsNullOrWhiteSpace(myContact))
            {
                MessageBox.Show("All fields are required.");
                return;
            }

            if (!int.TryParse(myAge, out _)) //Validation 2: Non-numeric age
            {
                MessageBox.Show("Invalid Age.");
                return;
            }
             
            if (!long.TryParse(mysNummber, out _)) //Validation 3: Non-numeric Student Number
            {
                MessageBox.Show("Invalid Student Number.");
                return;
            }

            if (!long.TryParse(myContact, out _)) //Validation 4: Non-numeric Contact Number
            {
                MessageBox.Show("Invalid Contact Number.");
                return;
            }

            if (!Regex.IsMatch(myContact, @"^\d{11}$")) //Validation 5: 11 digit contact number only
            {
                MessageBox.Show("Invalid Contact Number. It must be 11 digits.");
                return;
            }

            if (!IsValidName(myfName) || !IsValidName(mymName) || !IsValidName(mylName)) //Validation 5: Invalid Full Name
            {
                MessageBox.Show("Invalid name. Use only letters for the name fields.");
                return;
            }

            bool IsValidName(string name)
            {
                return !string.IsNullOrWhiteSpace(name) && Regex.IsMatch(name, @"^[a-z A-Z]+$");
            }

            string myBD = dateTimePicker1.Value.ToString("yyyy-MM-dd");
            string myProg = cboxprog.Text.ToString();
            string myGender = cboxGender.Text.ToString();

            if (string.IsNullOrWhiteSpace(myGender))
            {
                MessageBox.Show("Please select a gender.");
                return;
            }

            // Validation 7: Validate program selection
            if (string.IsNullOrWhiteSpace(myProg))
            {
                MessageBox.Show("Please select a program.");
                return;
            }

            string docPath = Environment.GetFolderPath(Environment.SpecialFolder.MyDocuments);
            using (StreamWriter outputFile = new StreamWriter(Path.Combine(docPath, $"{mysNummber}.txt"))) //create a text file with student number as the filename
            {
                string[] info =
                {
                    "Student No.: " +   mysNummber,
                    "\nFull Name: " + mylName + ", " + myfName + " " + mymName + ".",
                    "\nProgram: " + myProg,
                    "\nGender: " + myGender,
                    "\nAge: " + myAge,
                    "\nBirthday: " + myBD,
                    "\nContact No.: " + myContact
                };

                foreach (string all in info) //write each line of information to the file
                {
                    outputFile.WriteLine(all);
                    Close();
                }
            }
            
        }
    }
}
