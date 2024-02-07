using System;

namespace Quiz_1
{
    public class Quiz_1
    {
        public static void Main(string[] args)
        {
            //A one-dimensional array that contains six (6) names of your classmates. Then, print the names using a foreach loop.

            string[] classmates = { "Sean Beltran", "JM Trinidad", "Catherine Galang", "Angela Salvador", "Sheera Magnaye", "Rinoa Jimenez" };

            foreach (string name in classmates)
            {
                Console.WriteLine(name);
            }


            Console.WriteLine();
            Console.Write("Press any key to exit...");
            Console.ReadKey();
        }
    }
}
