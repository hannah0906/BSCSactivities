using System;

namespace Quiz_2
{
    public class Quiz_2
    {
        public static void Main(string[] args)
        {
                /*A two-dimensional array with two (2) rows and three (3) columns.
                Then, initialize the array with the first six (6) letters of the alphabet as its elements. */
                char[,] letters = new char[2, 3];
                letters[0, 0] = 'A';
                letters[0, 1] = 'B';
                letters[0, 2] = 'C';
                letters[1, 0] = 'D';
                letters[1, 1] = 'E';
                letters[1, 2] = 'F';

                //testing if  the array prints the initialized value (not part of the instruction)
                foreach (char letter in letters)
                {
                    Console.Write(letter + " ");
                }
                Console.WriteLine();
                Console.WriteLine("Press any key to exit...");
                Console.ReadKey();
            }
        }
    }

