using System;
namespace CalculateTotal
{
    public class CalculateTotal1
    {
        public double totalPrice(double totalItem, double price) //first overloaded method
        {
            double total = totalItem * price;
            return total; //returns the total price in double
        }

        public int totalPrice(float total, float prices) //second overloaded method
        {
            float convert = (float) Math.Round(total * prices);
            int convertedTotal = (int)convert;
            return convertedTotal; //returns total price in int
        }

        public static void Main(string[] args)
        {
            CalculateTotal1 obj = new CalculateTotal1(); //creates new instance of the object

            Console.Write("Enter the number of items: ");
            double item = Convert.ToDouble(Console.ReadLine());

            Console.Write("Enter the price of each item: ");
            double prices = Convert.ToDouble(Console.ReadLine());

            double total1 = obj.totalPrice(item, prices); //invokes first overloaded method

            Console.WriteLine("Your total is " + $"{total1:F2}");
            Console.WriteLine("Your converted total is " + obj.totalPrice((float)item, (float)prices)); //invokes second overloaded method
            Console.WriteLine("Press any key to exit...");
            Console.ReadKey();
        }
    }
}
