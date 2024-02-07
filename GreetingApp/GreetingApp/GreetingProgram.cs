using System;
namespace GreetingApp
{
    public class GreetingProgram 
    {
       public static void Main(string[] args)
        {
            Console.Write("Enter your name: "); //asks the user to enter a name
            string name = Console.ReadLine(); //reads input and stores it to the variable named name

            Console.Write("Enter the total number of your enrolled courses: "); //asks the user to enter number of enrolled courses
            int course = Convert.ToInt32(Console.ReadLine()); //converts input to 32- bit integer and stores it to var named course

            Console.Write("Enter the price of your favorite book: "); //asks the user to enter price of fav books
            double price = Convert.ToDouble(Console.ReadLine()); //converts input to a double data type and stores it to var named price

            Console.WriteLine("-----------------------------------------");
            Console.WriteLine("Name: " + name); //displays the name
            Console.WriteLine("Total Enrolled Courses: " + course); //displays the total no. of enrolled courses
            Console.WriteLine("Price of your favorite book: " + price); //displays price of book

            Console.WriteLine();
            Console.Write("Press any key to exit...");
            Console.ReadKey();
        }
    }
}
