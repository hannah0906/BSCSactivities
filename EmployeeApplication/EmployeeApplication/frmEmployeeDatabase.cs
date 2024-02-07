using System;
using System.Linq;
using System.Windows.Forms;
using EmployeeNamespace; //imports EmployeeNamespace to use the Employee class

namespace EmployeeApplication {
    public partial class frmEmployeeDatabase : Form {
        public frmEmployeeDatabase() {
            InitializeComponent(); }

        private void button1_Click(object sender, EventArgs e) {
            string first = fnameTxt.Text;
            string last = lnameTxt.Text;
            string posi = posTxt.Text;
            long id;

            if (!long.TryParse(idTxt.Text, out id)) {
                MessageBox.Show("Enter an ID number.");
                return; } //validation 1: no employee ID entered

            if (string.IsNullOrWhiteSpace(fnameTxt.Text) || string.IsNullOrWhiteSpace(lnameTxt.Text)) {
                MessageBox.Show("Enter your name.");
                return; } // validation 2: no name entered

            if (string.IsNullOrWhiteSpace(posTxt.Text)) {
                MessageBox.Show("Enter your position");
                return; } //validation 3: no position entered

            if (!IsAlphabetic(posTxt.Text)) {
                MessageBox.Show("Position can only contain alphabetic characters.");
                return; } //validation 4: incalid position entered

            Employee employ = new Employee(); //instance of Employee class
            Employee employ1 = new Employee(id); //instance of Employee class (overloaded constructor 1)
            Employee employ2 = new Employee(first, last, posi); //instance of Employee class (overloaded constructor 2)

            dataGridView.Rows.Add(employ1.eId, employ2.firstName, employ2.lastName, employ2.posiTion); //accesses the public members of EmployeeNamespace and display it on the dataGridView
            posTxt.Clear(); //clears position textbox
            lnameTxt.Clear(); //clears last name text box
            fnameTxt.Clear(); //clears first name text box
            idTxt.Clear(); } //clears employee id textbox 
        private bool IsAlphabetic(string input) {
            return input.All(char.IsLetter); 
        } //check if all characters in the input string are letters
    }
}
