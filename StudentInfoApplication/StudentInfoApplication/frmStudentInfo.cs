using System;
using System.Windows.Forms;
using StudentNamespace; //imports the StudentNamespace to use the StudentInfo class

namespace StudentInfoApplication
{
    public partial class frmStudentInfo : Form
    {
        public frmStudentInfo()
        {
            InitializeComponent();
        }
        private void button1_Click(object sender, EventArgs e)
        {
            string fname = fNameText.Text; string lname = lNameText.Text;
            int idNum;
            if (!int.TryParse(studIDText.Text, out idNum))
            {
                MessageBox.Show("Enter a student number.");
                return;
            } //validation if no student number is entered

            if (string.IsNullOrWhiteSpace(fNameText.Text) || string.IsNullOrWhiteSpace(lNameText.Text))
            {
                MessageBox.Show("Enter your name.");
                return;
            } //validation if no name is entered

            StudentInfo info = new StudentInfo(); //instance of StudentInfo class
            StudentInfo student = new StudentInfo(fname, lname); //instance of StudentInfo class
            StudentInfo student1 = new StudentInfo(idNum); //instance of StudentInfo class

            //accesses the public members of StudentNamespace
            listBox1.Items.Add(student1.studentNumber); //adds student id to the listbox
            studIDText.Clear(); //clears student id textbox

            listBox2.Items.Add(student.lastName); //adds last name to the listbox
            lNameText.Clear(); //clears student id textbox

            listBox3.Items.Add(student.firstName); //adds first name to the listbox
            fNameText.Clear(); //clears student id textbox
        }
    }
}