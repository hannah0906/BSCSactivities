using System;
namespace Greetings
{
    public class Greetings1
    {
        public string displayGreetName (string first, string last) //first overloaded method
        {
            string fullName = first + " " + last; //formats full name (concatenated first and last name)
            return fullName; //returns full name
        }

        public string displayGreetName (string greetings) //second overloaded method
        {
            return greetings; //returns greeting
        }
        public static void Main(string[] args)
        {
            Greetings1 act = new Greetings1(); //creates new instance of the object

            Console.Write("Enter first name: ");
            string fname = Console.ReadLine();

            Console.Write("Enter last name: ");
            string lname = Console.ReadLine();

            string name = act.displayGreetName(fname, lname); //invokes first overloaded method
            string greet = act.displayGreetName("Hello! " + "Have a nice day, "); //invokes second overloaded method

            Console.WriteLine(greet + name + "!"); //prints the greeting with the entered name
            Console.WriteLine();
            Console.WriteLine("Press any key to exit...");
            Console.ReadKey();
        }
    }
}
