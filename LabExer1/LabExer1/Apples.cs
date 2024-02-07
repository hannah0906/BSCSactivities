using System;

namespace LabExer1_04
{
    public class Apples
    {
        public static void Main(string[] args)
        {
            const double price = 32.50; //price of apple is constant

            Console.Write("Enter the number of apples you want to purchase: "); //ask the user to enter apple pieces
            int pcs = Convert.ToInt32(Console.ReadLine()); //converts user-input to integer and stores it to pcs

            double total = price * pcs; //formula for computing the total price
            int cTotal = (int)total; //converting the total price into a whole number
            Console.WriteLine("--------------------------------------");
            Console.WriteLine("The total price of " + pcs + " apples is " + $"{total:F2}" + "."); //displays the total price
            Console.WriteLine("The value of the converted price is " + cTotal + "."); //displays the converted total price
            Console.WriteLine();
            Console.WriteLine("Press any key to exit...");
            Console.ReadKey();




        }
    }
}
