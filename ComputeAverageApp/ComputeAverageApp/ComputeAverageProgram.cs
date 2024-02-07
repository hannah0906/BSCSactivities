using System;
namespace ComputerAverageApp
{
    public class ComputeAverageProgram
    {
        public static void Main(string[] args)
        {
            double sum = 0;
            int[] grades = new int[5]; //array tostore the grades
            Console.WriteLine("Enter 5 grades separateed by new line: "); //ask user to enter 5 grades

            for (int gIndex = 0; gIndex < 5; gIndex++) 
            {
                grades[gIndex] = Convert.ToInt32(Console.ReadLine()); //if condition is true, each user input is read
                sum += grades[gIndex]; //each grades is added and the result is stored to sum
            }

            double average = sum / grades.Length; //formula for the average
            double rounded = Math.Round(average, 0); //method from Math Class for rounding off

            Console.WriteLine("The average is " + $"{average:F2}" + " and round off to " + rounded); //displays average & rounded off average
            Console.WriteLine("Press any key to exit... ");
            Console.ReadKey();
        }
    }
}