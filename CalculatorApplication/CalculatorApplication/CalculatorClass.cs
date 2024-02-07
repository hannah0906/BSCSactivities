using System;
using System.Windows.Forms;

namespace CalculatorApplication
{
    public delegate X Formula<X>(X num1, X num2);

    class CalculatorClass
    {
        public static string showMessageAdd = "";
        public static string showMessageRemove = "";
        public Formula<double> formula;

        public double GetSum(double num1, double num2) //method 1: addition
        {
            return num1 + num2;
        }

        public double GetDifference(double num1, double num2) //method 2: subtraction
        {
            return num1 - num2;
        }

        public event Formula<double> CalculateEvent //event accessor with add & remove
        {
            add
            {
                showMessageAdd = "Added the delgate.";
                formula += value;
            }

            remove
            {
                showMessageRemove = "Removed the delegate.";
                formula -= value;
            }
        }
        public double GetProduct(double num1, double num2) //method 3: multiplication
        {
            return num1 * num2;
        }

        public double GetQuotient(double num1, double num2) //method 4: division
        {
            return num1 / num2;
        }
    }
}
