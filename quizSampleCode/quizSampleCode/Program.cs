using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace quizSampleCode
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
               
                Console.Write("Exception: " + " " + 25 / Convert.ToInt32());
            }

            catch (ArithmeticException ex)
            {
                Console.Write("Divide by zero error");
            }
            
            Console.ReadLine();
        }
    }
}
