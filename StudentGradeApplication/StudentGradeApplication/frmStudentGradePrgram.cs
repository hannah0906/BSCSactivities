using System;
using System.Windows.Forms;

namespace StudentGradeApplication
{
    public partial class frmStudentGradeProgram : Form
    {
        public frmStudentGradeProgram()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrWhiteSpace(T_Name.Text)) //validation 1: No name is entered
            {
                MessageBox.Show("Please enter a name."); //prints if no name is entered
                return;
            }
            else //executes if a name is entered
            {
                if (!Valid(T_English.Text) || !Valid(T_Math.Text) || !Valid(T_Science.Text) || !Valid(T_Filipino.Text) || !Valid(T_History.Text))
                {
                    MessageBox.Show("Please enter valid grades between 0 and 100."); //validation 2: user entered an invalid grade
                    return;
                }

                //convert input grades to double
                double grade1 = Convert.ToDouble(T_English.Text);
                double grade2 = Convert.ToDouble(T_Math.Text);
                double grade3 = Convert.ToDouble(T_Science.Text);
                double grade4 = Convert.ToDouble(T_Filipino.Text);
                double grade5 = Convert.ToDouble(T_History.Text);

                double sum = grade1 + grade2 + grade3 + grade4 + grade5; //calculates the sum
                double average = sum / 5; //calculates the average

                L_pORf.Text = (average >= 75) ? "The student passed." : "The student failed."; //ternary condition for the passing or failing
                L_ave.Text = "The general average of " + T_Name.Text + " is " + $"{average:F2}"; //prints average & name
            }

            bool Valid(string input) //function to validate grade input
            {
                return double.TryParse(input, out double grade) && grade >= 0 && grade <= 100; 
            }
        }
    }
}

