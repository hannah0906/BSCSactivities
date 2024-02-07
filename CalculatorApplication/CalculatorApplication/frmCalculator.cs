using System;
using System.Windows.Forms;

namespace CalculatorApplication
{
    public partial class FrmCalculator : Form
    {
        CalculatorClass cal; //instance of calculator class
        private double num1, num2; //variables to store inputs
        private Formula<double> method;

        public FrmCalculator()
        {
            InitializeComponent();
            cal = new CalculatorClass(); //initialization of the calculator class instance
        }

        private void frmCalculator_Load(object sender, EventArgs e)
        { 
            char[] Operations = new char[] //array of operations for the combo box
            {
                '+', '-', '*', '/'
            };

            foreach (char opt in Operations) //add items to the combo box
            {
                cbOperator.Items.Add(opt);
            }
        }

        private void btnEqual_Click(object sender, EventArgs e)
        {

            if (double.TryParse(txtBoxInput1.Text, out num1) && double.TryParse(txtBoxInput2.Text, out num2))
            { //input is valid, proceed with calculations

                switch (cbOperator.SelectedItem?.ToString())
                {
                    case "+":
                        method = cal.GetSum;
                        break;

                    case "-":
                        method = cal.GetDifference;
                        break;

                    case "*":
                        method = cal.GetProduct;
                        break;

                    case "/":
                        if (num2 != 0) //check for division by zero
                        {
                            method = cal.GetQuotient;
                        }

                        else
                        {
                            MessageBox.Show("Cannot divide by zero.");
                            txtBoxInput1.Clear();
                            txtBoxInput2.Clear();
                            return;
                        }

                        break;

                    default: //invalid operator
                        MessageBox.Show("Please select a valid operator.");
                        txtBoxInput1.Clear();
                        txtBoxInput2.Clear();
                        return;
                }

                try
                {
                    cal.CalculateEvent += new Formula<double>(method);  //subscribe to the calculation event
                    lblDisplayTotal.Text = cal.formula(num1, num2).ToString(); //display the result in the label
                    MessageBox.Show(CalculatorClass.showMessageAdd);

                    cal.CalculateEvent -= new Formula<double>(method); //unsubscribe from the calculation event
                    MessageBox.Show(CalculatorClass.showMessageRemove);
                    lblDisplayTotal.Text = cal.formula(num1, num2).ToString(); //proves that delegate is removed

                }

                catch (Exception ex)
                {
                    lblDisplayTotal.Text = ex.Message;
                }
            }

            else //invalid input
            {
                MessageBox.Show("Invalid input. Please enter numeric values.");
                txtBoxInput1.Clear();
                txtBoxInput2.Clear();
            }
            }
        }
    }
