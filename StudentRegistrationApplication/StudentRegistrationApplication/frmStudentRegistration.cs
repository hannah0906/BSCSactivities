using System;
using System.Windows.Forms;

namespace StudentRegistrationApplication
{
    public partial class frmStudentRegistration : Form
    {
        public frmStudentRegistration()
        {
            InitializeComponent();

            openFileDialog1.Filter = "Image Files|*.jpg;*.jpeg;*.png;"; //filters the type of file you can insert on the picture box

            for (int i = 1; i <= 31; i++) //for loop for the no. of days to be added
            {
                dayCombo.Items.Add(i); //adds items on the combo box for days
            }

            string[] monthNames = { //provides an array of month names
                "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"
            };

            // Add month names to the combo box
            foreach (string months in monthNames)
            {
                monthCombo.Items.Add(months);
            }

            string[] coursesName = { //array or courses
                "Bachelor of Science in Computer Science", "Bachelor of Science in Information Technology", 
                "Bachelor of Science in Education", "Bachelor of Science in Business Administration", "Bachelor of Science in Tourism Management"
            };

            // Add course names to the combo box
            foreach (string courses in coursesName)
            {
                programCombo.Items.Add(courses);
            }
        

            for (int i = 1900; i <= DateTime.Now.Year; i++) //for loop for the years to be added
            {
                yearCombo.Items.Add(i); //adds items on the combo box for years
            }
        }

        private void StudentInformation (string name1, string gender1, string date1, string program1) //1st overloaded method
        {
            // prints the name, gender, birthday, and program on the message box
            string message1 = $"Name: {name1} \n" + $"Gender: {gender1}\n" +  $"Date of Birth: {date1}\n" + $"Program: {program1}";
            MessageBox.Show(message1);
        }

        private void StudentInformation(string name2, string program2) //2nd overloaded method
        {
            // prints the name and program on the message box
            string message2 = $"Name: {name2} \n" + $"Program: {program2}";
            MessageBox.Show(message2);
        }

        private void StudentInformation(string name3, string gender3, string date3) //3rd overloaded method
        {
            // prints the name, gender, and birthday on the message box
            string message3 = $"Name: {name3} \n" + $"Gender: {gender3}\n" + $"Date of Birth: {date3}";
            MessageBox.Show(message3);
        }

        private void registerButton_Click(object sender, EventArgs e)
        {

            frmStudentRegistration obj = new frmStudentRegistration(); //creates a new instance of the object

    // name
            string fname = fNameTxtBox.Text;
            string mname = mNameTxtBox.Text;
            string lname = lNameTxtBox.Text;

            //concatenate the first name, middle name, and last name
            string fullname = $"{fNameTxtBox.Text} {mNameTxtBox.Text} {lNameTxtBox.Text}";

            //check for empty or null values in the name
            if (string.IsNullOrEmpty(fNameTxtBox.Text) || string.IsNullOrEmpty(mNameTxtBox.Text) || string.IsNullOrEmpty(lNameTxtBox.Text))
            {
                MessageBox.Show("Please enter your complete name."); //displays when name is null
                return;
            }

    // gender

            string gender;

            if (maleRadio.Checked)
            {
                gender = "Male"; //puts the string value "male" too variable gender if maleRadio is checked
            }

            else if (femaleRadio.Checked)
            {
                gender = "Female"; //puts the string value "female" too variable gender if maleRadio is checked
            }

            else
            {
                MessageBox.Show("Please choose your gender."); //displays message if you did not enter a gender
                return;
            }

    // birthday

            string date = $"{dayCombo.Text}/{monthCombo.Text}/{yearCombo.Text}"; //concatenate the month, day, and year

            //question mark is used to check if combobox is null withouth throwing an exception
            string day = dayCombo.SelectedItem?.ToString(); //gets the selected day from the dayCombo ComboBox;
            string month = monthCombo.SelectedItem?.ToString(); //gets the selected day from the monthCombo ComboBox
            string year = yearCombo.SelectedItem?.ToString(); //gets the selected day from the yearCombo ComboBox

            if (string.IsNullOrEmpty(day) || string.IsNullOrEmpty(month) || string.IsNullOrEmpty(year))
            {
                MessageBox.Show("Please enter your birthdate."); //returns if one element of date of birth is null
                return;
            }

    // program

            string program = programCombo.SelectedItem?.ToString(); //gets the selected program from the programCombo ComboBox

            if (string.IsNullOrEmpty(program))
            {
                MessageBox.Show("Please choose a program"); //returns if program is empty
                return;
            }

    // invokes the methods
            obj.StudentInformation(fullname, gender, date, program); //invokes method 1
            obj.StudentInformation(fullname, program); //invokes method 2
            obj.StudentInformation(fullname, gender, date); //invokes method 3

        }
        private void button1_Click(object sender, EventArgs e)
        {
            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {
                pictureBox.ImageLocation = openFileDialog1.FileName;
            };

        }
    }
}
