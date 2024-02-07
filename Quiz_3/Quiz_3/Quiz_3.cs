using System;

namespace Quiz_3
{
    public class Quiz_3
    {
        public static void Main(string[] args)
        {

                //A string with any message. Then, determine if the message contains the string, "hello".

                string sample = ("hello world!");
                bool doesContain = sample.Contains("hello");

                Console.WriteLine("---The result will return true if your string contains hello---");
                Console.WriteLine();
                Console.WriteLine("Your string is " + sample);
                Console.WriteLine("Result: " + doesContain);
                Console.WriteLine();
                Console.Write("Press any key to exit...");
                Console.ReadKey();

            }
        }
    }
