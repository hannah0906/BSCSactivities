using System;
using System.Text.RegularExpressions;
using System.Windows.Forms;
using EmployeeNamespace;
namespace EmployeeApplication
{
    public partial class frmComputeSalary : Form
    {
        public frmComputeSalary()
        {
            InitializeComponent();
        }

        private void compute_Click(object sender, EventArgs e)
        {
            string first = fnameTxt.Text;
            string last = lnameTxt.Text;
            string depart = deptTxt.Text;
            string jobT = jobTxt.Text;

            // Validation: Empty Fields
            if (string.IsNullOrWhiteSpace(first) || string.IsNullOrWhiteSpace(last) || string.IsNullOrWhiteSpace(depart)
                || string.IsNullOrWhiteSpace(jobT) || string.IsNullOrWhiteSpace(hrsTxt.Text))
            {
                MessageBox.Show("Fill out all the fields.");
                return;
            }

            // Validation: Check for Alphanumeric Department and Job Title with White Spaces
            if (!IsAlphanumericWithSpaces(depart) || !IsAlphanumericWithSpaces(jobT))
            {
                MessageBox.Show("Department and job title can only contain letters, numbers, and white spaces.");
                return;
            }

            if (int.TryParse(hrsTxt.Text, out int hours))
            {
                if (hours < 0) // Validation: Hours worked is negative
                {
                    MessageBox.Show("Hours worked cannot be less than zero.");
                    return;
                }
            }

            else
            {
                MessageBox.Show("Only enter whole numbers for hours worked.");
                return;
            }

            if (double.TryParse(rateTxt.Text, out double rph))
            {
                if (rph < 0) // Validation: Rate per hour is negative
                {
                    MessageBox.Show("Rate per hour cannot be less than zero.");
                    return;
                }
            }

            else
            {
                MessageBox.Show("Enter valid rate per hour. Try Again.");
                return;
            }

            PartTimeEmployee employ = new PartTimeEmployee(first, last, depart, jobT); //creates an instance of the PartTimeEmployee class
            employ.computeSalary(hours, rph); //calls the compute salary method
            fnameL.Text = employ.FirstName; //displays first name on the label
            lnameL.Text = employ.LastName; //displays last name on the label
            salaryL.Text = employ.getSalary().ToString("0.00"); //displays basic salary on the label
        }

        // Custom validation method using a regular expression to allow alphanumeric characters and white spaces
        private bool IsAlphanumericWithSpaces(string input)
        {
            // Regular expression to allow letters, numbers, and white spaces
            string pattern = "^[a-zA-Z0-9\\s]+$";
            return Regex.IsMatch(input, pattern);
        }
    }
}
