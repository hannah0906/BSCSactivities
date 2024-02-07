using System;

namespace DataTypesApp
{
    public class DataTypesProgram
    {
        public static void Main(string[] args)
        {
            Console.Write("Enter the pieces of apple: "); //ask the user to enter the apple pieces
            int pcs = Convert.ToInt32(Console.ReadLine()); //converts user-input to integer and stores the value on pcs

            Console.Write("Enter total price of " + pcs + " apple(s): "); //ask the user to enter total apple prices
            double total = Convert.ToDouble(Console.ReadLine()); //converts user-input to double and stores value on total

            Console.WriteLine("-------------------------------------");
            Console.WriteLine("The total price of " + pcs + " apple(s) is " + total); //prints total price of the entered apple pcs

            int wTotal = (int)total; //converts total price into whole number
            Console.WriteLine("The value of the original price is " + total); //prints original price
            Console.WriteLine("The value of the converted price is " + wTotal); //prints converted price
            Console.Write("Press any key to exit...");
            Console.ReadKey();

        }
    }
}
